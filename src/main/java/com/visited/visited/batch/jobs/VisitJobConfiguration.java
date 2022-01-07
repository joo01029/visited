package com.visited.visited.batch.jobs;

import com.visited.visited.mapper.VisitMapper;
import com.visited.visited.model.entity.Visit;
import com.visited.visited.model.repository.VisitRedisRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.JobScope;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.repeat.RepeatStatus;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@RequiredArgsConstructor
@Configuration
public class VisitJobConfiguration {

	private final JobBuilderFactory jobBuilderFactory;
	private final StepBuilderFactory stepBuilderFactory;
	private final VisitMapper visitMapper;
	private final VisitRedisRepository visitRedisRepository;
	@Bean
	public Job saveVisitedJob(){
		return jobBuilderFactory.get("saveVisitedJob")
				.start(saveVisitStep())
				.build();
	}

	@Bean
	public Step saveVisitStep(){
		return stepBuilderFactory.get("saveVisitStep")
				.tasklet(((contribution, chunkContext) -> {
					try{
						Iterable<Visit> visits  = visitRedisRepository.findAll();


						for (Visit visit : visits){
							if(visit != null && visit.getBoardId() != null) {
								System.out.println(visit.toString());
								visitMapper.saveVisit(visit);
							}
						}
						visitRedisRepository.deleteAll();
						return RepeatStatus.FINISHED;
					}catch (Exception e){
						e.printStackTrace();
						throw new IllegalArgumentException("step 실패");
					}

				})).build();
	}
}

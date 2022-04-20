package com.visited.visited.batch.scheduler;

import lombok.RequiredArgsConstructor;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecutionException;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@RequiredArgsConstructor
public class VisitScheduler {
	private final Job saveVisitedJob;
	private final JobLauncher jobLauncher;

	@Scheduled(fixedDelay = 1*60*1000L)
	public void executeSaveVisitedJob(){
		try{
			JobParameters taskStartedTime = new JobParametersBuilder()
					.addString("dateTime", LocalDateTime.now().toString())
					.toJobParameters();
			jobLauncher.run(saveVisitedJob, taskStartedTime);
		}catch (JobExecutionException e){
			e.printStackTrace();
		}
	}
}

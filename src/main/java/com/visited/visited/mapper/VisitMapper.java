package com.visited.visited.mapper;

import com.visited.visited.model.entity.Visit;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface VisitMapper {
	void saveVisit(Visit visit);
}

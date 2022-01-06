package com.visited.visited.model.repository;

import com.visited.visited.model.entity.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRedisRepository extends CrudRepository<Visit, String> {

}

package com.example.springwebfluxmysql.Repository;

import com.example.springwebfluxmysql.model.Info;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface InfoRep extends ReactiveCrudRepository<Info,Integer> {
}

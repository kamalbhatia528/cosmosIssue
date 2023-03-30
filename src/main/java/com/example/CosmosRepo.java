package com.example;

import io.micronaut.data.cosmos.annotation.CosmosRepository;
import io.micronaut.data.repository.CrudRepository;

@CosmosRepository
public interface CosmosRepo extends CrudRepository<CosmosEntity, String> {

}

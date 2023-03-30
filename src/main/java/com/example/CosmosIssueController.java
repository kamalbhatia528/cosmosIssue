package com.example;

import io.micronaut.data.cosmos.annotation.CosmosRepository;
import io.micronaut.http.annotation.*;
import io.micronaut.http.annotation.Produces;
import io.micronaut.http.MediaType;
import io.micronaut.core.annotation.Introspected;
import lombok.AllArgsConstructor;

import java.util.List;

@AllArgsConstructor
@Controller("/cosmosIssue")
public class CosmosIssueController {
    private CosmosRepo cosmosRepo;
    @Get
    public Iterable<CosmosEntity> index() {
        return cosmosRepo.findAll();
    }


}

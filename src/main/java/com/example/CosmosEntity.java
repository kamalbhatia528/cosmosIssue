package com.example;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.cosmos.annotation.PartitionKey;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Introspected
@NoArgsConstructor
@Data
@MappedEntity
public class CosmosEntity {
    @Id
    @GeneratedValue
    private String id;

    private String test;
}

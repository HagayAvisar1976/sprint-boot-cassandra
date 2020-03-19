package com.example.working.with.cassandra.sprintbootcassandra.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;

@Table("Users")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @PrimaryKey
    private UUID id;
    private String name;
    private String address;
    private int age;


}

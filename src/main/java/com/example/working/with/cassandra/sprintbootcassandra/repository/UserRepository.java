package com.example.working.with.cassandra.sprintbootcassandra.repository;

import com.datastax.driver.core.utils.UUIDs;
import com.example.working.with.cassandra.sprintbootcassandra.model.User;
import org.springframework.data.cassandra.repository.AllowFiltering;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.List;

public interface UserRepository extends CassandraRepository <User, UUIDs> {
    @AllowFiltering
    List<User> findByAge(int age);
}

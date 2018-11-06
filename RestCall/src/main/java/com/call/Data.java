package com.call;


import org.springframework.data.mongodb.repository.MongoRepository;

public interface Data extends MongoRepository<Student, Integer> {

}

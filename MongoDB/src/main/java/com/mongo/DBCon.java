package com.mongo;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DBCon extends MongoRepository<Student,Long> {

}

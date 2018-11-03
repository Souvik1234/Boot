package com.prac;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface DBPush  extends MongoRepository<DBEntry, Integer>{

	
	
}

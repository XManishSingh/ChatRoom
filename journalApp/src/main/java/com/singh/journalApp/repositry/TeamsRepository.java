package com.singh.journalApp.repositry;

import com.singh.journalApp.entity.Teams;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeamsRepository extends MongoRepository<Teams, ObjectId> {

}

package com.singh.journalApp.repositry;

import com.singh.journalApp.entity.Players;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PlayersRepository extends MongoRepository<Players, ObjectId> {

}

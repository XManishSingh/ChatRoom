package com.singh.journalApp.service;

import com.singh.journalApp.entity.Teams;
import com.singh.journalApp.repositry.TeamsRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TeamsServices {
    @Autowired
    private TeamsRepository teamsRepository;
    public Optional<Teams> getTeamsInfo(ObjectId teamId){
        return teamsRepository.findById(teamId);
    }
}

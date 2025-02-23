package com.singh.journalApp.controller;

import com.singh.journalApp.entity.Teams;
import com.singh.journalApp.service.TeamsServices;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/teams")
public class TeamsController {
    @Autowired
    private TeamsServices teamsServices;
    @PostMapping("/create-team")
    public void createTeam(@RequestBody Teams teamDetails){

    }

    @PutMapping("/update-team")
    public void updateTeam(@RequestBody Teams teamDetails){
    }

    @GetMapping("/get-TeamsInfo/{myId}")
    public Optional<Teams> getTeamsInfo(@PathVariable ObjectId teamId){
        return teamsServices.getTeamsInfo(teamId);
    }
}

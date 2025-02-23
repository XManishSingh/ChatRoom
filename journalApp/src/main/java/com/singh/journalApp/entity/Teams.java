package com.singh.journalApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "Teams")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Teams {
    @Id
    private ObjectId id;
    private String teamName;
    private double budget;
    private double remainingBudget;
    @DBRef
    private List<Players> players;
}

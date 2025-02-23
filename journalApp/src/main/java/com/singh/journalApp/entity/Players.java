package com.singh.journalApp.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "players")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Players {
    private ObjectId id;
    private String name;
    private Integer basePrice;
    private Integer finalPrice;
    @DBRef
    private Teams team;
}

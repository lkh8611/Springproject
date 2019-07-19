package com.example.demo.repository;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long biUSN;
    private String szUserID;
    private long biGold;
    private long biRuby;
    private long dtCreateTime;
}

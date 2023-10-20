package com.uthec.therealdeal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Publishers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int publisherID;
    private String company_name;
    private Boolean copyright;
}


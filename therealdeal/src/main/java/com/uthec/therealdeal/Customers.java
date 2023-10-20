package com.uthec.therealdeal;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Date;

@Entity
public class Customers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerID;
    private String forename;
    private String surname;
    private String address;
    private Date dob;
    private String phone_number;
    private String email;
}

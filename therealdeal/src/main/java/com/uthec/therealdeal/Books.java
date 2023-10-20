package com.uthec.therealdeal;
import javax.persistence.*;

@Entity
public class Books {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookID;
    private String title;
    @OneToMany
    private Authors author;
    @ManyToOne
    private Genres genre;
    @ManyToOne
    private Publishers publisher;
    private String ISBN;
    private Boolean hardcover;
    private int quantity;
    private float price;


}

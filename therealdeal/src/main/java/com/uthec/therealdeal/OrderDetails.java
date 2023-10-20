package com.uthec.therealdeal;
import javax.persistence.*;
import java.util.Date;

@Entity
public class OrderDetails {

    @OneToMany
    private Orders order;
    private Books book;
    private int quantity;
    private float price_per_book;

}

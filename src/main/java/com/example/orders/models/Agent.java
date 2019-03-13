package com.example.orders.models;

import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="agents") // Here, we're putting a table of agent into our table.
public class Agent {
    // Now we are creating the columns in our table.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // This tells java that we want this to be a primary key.
    @Column(nullable = false)
    private long agentcode;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agent")
    private Set<Customer> customers;

    @OneToMany(cascade = CascadeType.REMOVE, mappedBy = "agent")
    private Set<Order> orders;

    private String agentname;
    private String workingarea;
    private double commission;
    private String phone;
    private String country;



    public Agent() {

    }
}

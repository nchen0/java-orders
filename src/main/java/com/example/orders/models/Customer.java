package com.example.orders.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@Table(name="customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private long custcode;

    @Column(nullable = false)
    private String custname;

    private String custcity;
    private String workingarea;
    private String custcountry;
    private String grade;
    private double openingamt;
    private double receiveamt;
    private double paymentamt;
    private double outstandingamt;
    private String phone;

    @ManyToOne
    @JoinColumn(name="agentcode", nullable = false)
    @JsonIgnore
    private Agent agent;

    @OneToMany(cascade = CascadeType.DETACH, mappedBy = "customer")
    @JsonIgnore
    private Set<Order> orders;

    public Customer() {

    }
}

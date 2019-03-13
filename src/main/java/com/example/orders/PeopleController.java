package com.example.orders;

import com.example.orders.models.Agent;
import com.example.orders.models.Customer;
import com.example.orders.models.Order;
import com.example.orders.repository.AgentRepository;
import com.example.orders.repository.CustomerRepository;
import com.example.orders.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {}, produces = MediaType.APPLICATION_JSON_VALUE)
public class PeopleController {
    // In the past, we've instantiated the object, and we've created a local variable for it. It was specifically tied to this layout. We want to let spring let all the messy details of how we want this stuff is created.
    @Autowired // Spring, in our case, will take and create the field and populate the field for us.
    AgentRepository agentrepos;

    @Autowired
    CustomerRepository customerrepos;

    @Autowired
    OrderRepository orderrepos;

    @GetMapping("/customers")
    public List<Customer> findCustomers() {
        return customerrepos.findAll();
    }

    @GetMapping("/orders")
    public List<Order> findOrders() {
        return orderrepos.findAll();
    }

    // customer/order - Returns all customers with their orders
    @GetMapping("/customer/order")
    public List<Object []> getCustomerOrders() {
        return customerrepos.findCustomerOrders();
    }

    // agents - Returns all agents with their customers
    @GetMapping("/agents")
    public List<Agent> getAllAgents() {
        return agentrepos.findAll();
    }

    // agents/orders - Return a list with the agents name and associated order number and order description
    @GetMapping("/agents/orders")
    public List<Object []> getAgentOrders() {
        return agentrepos.findAgentOrders();
    }

}

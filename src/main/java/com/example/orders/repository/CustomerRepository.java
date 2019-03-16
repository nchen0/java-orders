package com.example.orders.repository;

import com.example.orders.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
    /*@Query(value = "select customers.custcode, customers.custcity, orders.ordamount, orders.ordnum from customers join orders on customers.custcode = orders.custcode order by customers.custcode", nativeQuery = true)
    List<Object[]> findCustomerOrders();

    @Query(value = "select customers.custname, customers.custcode, customers.custcity, orders.ordamount, orders.ordnum from customers join orders on customers.custcode = orders.custcode where  customers.custname = :name", nativeQuery = true)
    List<Object[]> findCustomerOrder(@Param("name") String name);*/
}

package com.example.orders.repository;

import com.example.orders.models.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Long> {
    /*@Query(value ="select agents.agentcode, agents.agentname, ordnum from agents inner join orders on agents.agentcode = orders.agentcode", nativeQuery = true)
    List<Object[]> findAgentOrders();*/
}

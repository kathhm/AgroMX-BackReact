package com.AgroMX.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.AgroMX.app.model.Order;

/**
 * @author
 * @Bohorquezjael
 */

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {}
package com.BillyCode.orderservice.Repository;

import com.BillyCode.orderservice.Model.OrderLineItems;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLineItemsRepository extends JpaRepository<OrderLineItems,Long> {
}

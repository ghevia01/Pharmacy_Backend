package com.orderapp.pharmacy.service;

import java.util.List;

import com.orderapp.pharmacy.data.model.Order;

public interface OrderService {
    public Order createItem(Order item, String customer, String employee);
    public List<Order> getItems();
}

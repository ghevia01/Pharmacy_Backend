package com.orderapp.pharmacy.service;

import java.util.List;

import com.orderapp.pharmacy.data.model.Item;

public interface ItemService {
    public Item createItem(Item item);
    public List<Item> getItems();
}

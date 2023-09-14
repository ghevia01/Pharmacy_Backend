package com.orderapp.pharmacy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderapp.pharmacy.data.model.Item;
import com.orderapp.pharmacy.repository.ItemRepo;

@Service
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepo itemRepo;

    @Override
    public Item createItem(Item item) {
        return this.itemRepo.save(item);
    }

    @Override
    public List<Item> getItems() {
        return this.itemRepo.findAll();
    }
    
}

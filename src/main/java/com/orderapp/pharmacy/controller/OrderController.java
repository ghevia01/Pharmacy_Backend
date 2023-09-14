package com.orderapp.pharmacy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.orderapp.pharmacy.data.model.Order;
import com.orderapp.pharmacy.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/order")
@RequiredArgsConstructor
public class OrderController {

    @Autowired
    private OrderService itemService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Order> save(final @RequestBody Order item) {
        return ResponseEntity.ok(this.itemService.createItem(item, "cmoreno","cmoreno"));
    }

    @GetMapping("/all")
    public ResponseEntity<List<Order>> getAllItems() {
        return ResponseEntity.ok(this.itemService.getItems());
    }

}

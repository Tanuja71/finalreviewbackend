package com.klu.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.klu.entity.Orders;
import com.klu.service.OrderService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/orders")
@RequiredArgsConstructor
@CrossOrigin(origins = { "http://localhost:5173", "app.cors.allowed-origin=https://finalreviewfrontend-5.onrender.com" })
public class OrderController {

    private final OrderService orderService;

    @PostMapping("/place/{customerId}")
    public ResponseEntity<Orders> placeOrder(@PathVariable Long customerId) {
        return ResponseEntity.ok(orderService.placeOrder(customerId));
    }

    @GetMapping("/customer/{customerId}")
    public ResponseEntity<List<Orders>> getOrders(@PathVariable Long customerId) {
        return ResponseEntity.ok(orderService.getOrdersByCustomer(customerId));
    }
}
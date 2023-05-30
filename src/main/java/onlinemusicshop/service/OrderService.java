package onlinemusicshop.service;

import onlinemusicshop.model.Order;

import java.util.List;

public interface OrderService {
    List<Order> findAllByUserEmail(String email);
    List<Order>findAll();
}

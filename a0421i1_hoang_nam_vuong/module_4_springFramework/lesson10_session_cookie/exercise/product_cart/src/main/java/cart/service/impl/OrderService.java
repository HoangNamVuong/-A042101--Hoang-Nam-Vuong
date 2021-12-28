package cart.service.impl;

import cart.model.Order;
import cart.reposirory.IOrderRepository;
import cart.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderService implements IOrderService {
    @Autowired
    IOrderRepository orderRepository;

    @Override
    public Order save(Order order) {
        return orderRepository.save(order);
    }
}

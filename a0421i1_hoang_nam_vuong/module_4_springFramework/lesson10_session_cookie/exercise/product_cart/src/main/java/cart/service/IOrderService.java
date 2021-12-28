package cart.service;

import cart.model.Order;
import org.springframework.stereotype.Service;

@Service
public interface IOrderService {
    Order save(Order order);
}

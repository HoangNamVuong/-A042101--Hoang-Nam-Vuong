package cart.service;

import cart.model.OrderDetail;
import org.springframework.stereotype.Service;

@Service
public interface IOrderDetailService {
    void save(OrderDetail orderDetail);
}

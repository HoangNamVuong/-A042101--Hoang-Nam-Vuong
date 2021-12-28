package cart.service.impl;

import cart.model.OrderDetail;
import cart.reposirory.IOrderDetailRepository;
import cart.service.IOrderDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailService implements IOrderDetailService {
    @Autowired
    IOrderDetailRepository orderDetailRepository;

    @Override
    public void save(OrderDetail orderDetail) {
        orderDetailRepository.save(orderDetail);
    }
}

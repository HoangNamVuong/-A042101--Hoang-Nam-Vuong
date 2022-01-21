package furama.service.service.impl;

import furama.model.service.RentalType;
import furama.repository.service.IRentalTypeRepository;
import furama.service.service.IRentalTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class RentalTypeService implements IRentalTypeService {

    @Autowired
    IRentalTypeRepository rentalTypeRepository;
    @Override
    public Iterable<RentalType> findAll() {
        return rentalTypeRepository.findAll();
    }

    @Override
    public Optional< RentalType > findById(Integer id) {
        return rentalTypeRepository.findById(id);
    }

    @Override
    public void save(RentalType rentalType) {
        rentalTypeRepository.save(rentalType);
    }

    @Override
    public void remove(Integer id) {
        rentalTypeRepository.deleteById(id);
    }
}

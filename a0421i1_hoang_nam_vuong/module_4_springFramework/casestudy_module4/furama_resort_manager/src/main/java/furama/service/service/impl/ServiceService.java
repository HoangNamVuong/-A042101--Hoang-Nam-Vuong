package furama.service.service.impl;

import furama.model.service.Services;
import furama.repository.service.IServiceRepository;
import furama.service.service.IServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ServiceService implements IServiceService {
    @Autowired
    IServiceRepository serviceRepository;

    @Override
    public Iterable<Services> findAll() {
        return serviceRepository.findAll();
    }

    @Override
    public Optional<Services> findById(Integer id) {
        return serviceRepository.findById(String.valueOf(id));
    }

    @Override
    public void save(Services services) {
        serviceRepository.save(services);
    }

    @Override
    public void remove(Integer id) {
        serviceRepository.deleteById(String.valueOf(id));
    }

    @Override
    public Optional<Services> findById(String id) {
        return serviceRepository.findById(String.valueOf(Integer.valueOf(id)));
    }

    @Override
    public Page<Services> findAll(Pageable pageable) {
        return serviceRepository.findAll(pageable);
    }

    @Override
    public Page<Services> searchByName(String name, Pageable pageable) {
        return serviceRepository.searchByName(name, pageable);
    }
}

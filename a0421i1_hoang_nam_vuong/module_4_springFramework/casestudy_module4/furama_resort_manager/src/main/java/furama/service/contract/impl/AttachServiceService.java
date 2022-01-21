package furama.service.contract.impl;

import furama.model.contract.AttachService;
import furama.repository.contract.IAttachServiceRepository;
import furama.service.contract.IAttachServiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AttachServiceService implements IAttachServiceService {

    @Autowired
    IAttachServiceRepository attachServiceRepository;
    @Override
    public Iterable<AttachService> findAll() {
        return attachServiceRepository.findAll();
    }

    @Override
    public Optional< AttachService > findById(Integer id) {
        return attachServiceRepository.findById(id);
    }

    @Override
    public void save(AttachService attachService) {
        attachServiceRepository.save(attachService);
    }

    @Override
    public void remove(Integer id) {
        attachServiceRepository.deleteById(id);
    }
}

package library.service.Impl;

import library.model.Status;
import library.repository.IStatusRepository;
import library.service.IStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StatusService implements IStatusService {

    @Autowired
    IStatusRepository statusRepository;

    @Override
    public void createStatus() {
        statusRepository.save(new Status(1L, "available"));
        statusRepository.save(new Status(2L, "used"));
    }
}

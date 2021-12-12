package blog.service.Impl;

import blog.entity.Bloger;
import blog.repository.IBlogerRepository;
import blog.service.IBlogerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogerService implements IBlogerService {
    @Autowired
    private IBlogerRepository blogerRepository;

    @Override
    public List<Bloger> findAll() {
        return blogerRepository.findAll();
    }

    @Override
    public Bloger findById(Long id) {
        return blogerRepository.findById(id);
    }

    @Override
    public void save(Bloger bloger) {
        blogerRepository.save(bloger);
    }

    @Override
    public void remove(Long id) {
        blogerRepository.remove(id);
    }
}

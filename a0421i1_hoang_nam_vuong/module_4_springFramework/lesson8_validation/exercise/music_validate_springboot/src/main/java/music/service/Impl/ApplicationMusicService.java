package music.service.Impl;

import music.entity.ApplicationMusic;
import music.repository.IApplicationMusicRepository;
import music.service.IApplicationMusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ApplicationMusicService implements IApplicationMusicService {
    @Autowired
    private IApplicationMusicRepository applicationMusicRepository;

    @Override
    public List<ApplicationMusic> findAll() {
        return applicationMusicRepository.findAll();
    }

    @Override
    public ApplicationMusic findById(Long id) {
        return applicationMusicRepository.findById(id);
    }

    @Override
    public void save(ApplicationMusic applicationMusic) {
        applicationMusicRepository.save(applicationMusic);
    }

    @Override
    public void remove(Long id) {
        applicationMusicRepository.remove(id);
    }
}

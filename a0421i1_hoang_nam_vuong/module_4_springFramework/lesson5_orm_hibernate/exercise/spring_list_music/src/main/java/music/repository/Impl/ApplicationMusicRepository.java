package music.repository.Impl;

import music.entity.ApplicationMusic;
import music.repository.IApplicationMusicRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class ApplicationMusicRepository implements IApplicationMusicRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<ApplicationMusic> findAll() {
        TypedQuery<ApplicationMusic> query = em.createQuery("select c from ApplicationMusic c", ApplicationMusic.class);
        return query.getResultList();
    }

    @Override
    public ApplicationMusic findById(Long id) {
        TypedQuery<ApplicationMusic> query = em.createQuery("select c from ApplicationMusic c where c.id=:id", ApplicationMusic.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(ApplicationMusic model) {
        if (model.getId() != null) {
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        ApplicationMusic applicationMusic = findById(id);
        if (applicationMusic != null) {
            em.remove(applicationMusic);
        }
    }
}

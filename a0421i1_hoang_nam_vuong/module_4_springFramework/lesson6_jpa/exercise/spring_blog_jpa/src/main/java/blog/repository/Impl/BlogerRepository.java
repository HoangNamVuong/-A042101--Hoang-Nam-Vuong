package blog.repository.Impl;

import blog.entity.Bloger;
import blog.repository.IBlogerRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class BlogerRepository implements IBlogerRepository {

    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Bloger> findAll() {
        TypedQuery<Bloger> query = em.createQuery("select c from Bloger c", Bloger.class);
        return query.getResultList();
    }

    @Override
    public Bloger findById(Long id) {
        TypedQuery<Bloger> query = em.createQuery("select c from Bloger c where c.id=:id", Bloger.class);
        query.setParameter("id", id);
        return query.getSingleResult();
    }

    @Override
    public void save(Bloger model) {
        if (model.getId() != null) {
            em.merge(model);
        } else {
            em.persist(model);
        }
    }

    @Override
    public void remove(Long id) {
        Bloger bloger = findById(id);
        if (bloger != null) {
            em.remove(bloger);
        }
    }
}

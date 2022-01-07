package customer_manager.repository;

import customer_manager.model.Customer;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class CustomerRepositoryImpl implements CustomerRepository{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Customer> findAll() {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT cus from Customer as cus", Customer.class);
        return query.getResultList();
    }

    @Override
    public Customer findById(int id) {
        return entityManager.find(Customer.class, id);
    }

    @Override
    public void save(Customer customer) {
        entityManager.persist(customer);
    }

    @Override
    public void remove(Customer customer) {
        entityManager.remove(entityManager.merge(customer));
    }

    @Override
    public void update(Customer customer) {
        entityManager.merge(customer);
    }

    @Override
    public List<Customer> searchByFirstname(String kq) {
        TypedQuery<Customer> query = entityManager.createQuery("SELECT cus from Customer as cus where cus.firstName like :keyword", Customer.class);
        query.setParameter("keyword", kq + "%");
        return query.getResultList();
    }
}

package furama.repository.customer;

import furama.model.customer.Customer;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICustomerRepository extends JpaRepository<Customer, String> {
    @Override
    Page< Customer > findAll(Pageable pageable);
    // Search by name
    @Query(value = "select * \n" +
            " from customer c\n" +
            " where c.name like concat('%',:name, '%')", nativeQuery = true)
    Page< Customer > searchByName(@Param("name") String name, Pageable pageable);
}

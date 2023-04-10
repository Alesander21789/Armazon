package es.storeapp.business.repositories;

import es.storeapp.business.entities.Order;
import java.text.MessageFormat;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class OrderRepository extends AbstractRepository<Order> {
    private static final String FIND_BY_USER_QUERY =
            "SELECT o FROM Order o WHERE o.user.id = :id1 ORDER BY o.timestamp DESC";

    public List<Order> findByUserId(Long userId) {
        Query query = entityManager.createQuery(FIND_BY_USER_QUERY);
        query.setParameter("id1",userId);
        return query.getResultList();
    }

}

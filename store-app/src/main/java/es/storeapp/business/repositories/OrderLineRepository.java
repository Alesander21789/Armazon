package es.storeapp.business.repositories;

import es.storeapp.business.entities.*;
import java.text.MessageFormat;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;


@Repository
public class OrderLineRepository extends AbstractRepository<OrderLine>{

    private static final String FIND_BY_USER_AND_PRODUCT_QUERY =
            "SELECT COUNT(*) FROM OrderLine o WHERE " +
                    "o.order.state = es.storeapp.business.entities.OrderState.COMPLETED " +
                    "AND o.order.user.id = :id1 AND o.product.id = :id2";

    public boolean findIfUserBuyProduct(Long userId, Long productId) {
        Query query = entityManager.createQuery(FIND_BY_USER_AND_PRODUCT_QUERY);
        query.setParameter("id1",userId);
        query.setParameter("id2",productId);
        return ((Long) query.getSingleResult()) > 0;
    }

}
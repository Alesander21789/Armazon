package es.storeapp.business.repositories;

import es.storeapp.business.entities.Product;
import java.text.MessageFormat;
import java.util.List;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository extends AbstractRepository<Product> {
    
    private static final String FIND_BY_CATEGORY_QUERY = 
            "SELECT p FROM Product p WHERE p.category.name = ''{0}'' ORDER BY p.:order";
    
    public List<Product> findByCategory(String category, String orderColumn) {
        Query query = entityManager.createQuery(FIND_BY_CATEGORY_QUERY);
        query.setParameter("category",category);
        query.setParameter("orderColumn",orderColumn);
        return query.getResultList();
    }
    
}

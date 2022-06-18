package springframework.services;

import org.springframework.stereotype.Service;
import springframework.domain.Product;

import java.util.List;

public interface ProductService extends CRUDService<Product> {
}

package telran.vending.frontend.productservice;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductsRepository extends JpaRepository<ProductJpa, Integer>{

}

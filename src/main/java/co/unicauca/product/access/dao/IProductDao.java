package co.unicauca.product.access.dao;

import org.springframework.data.repository.CrudRepository;
import co.unicauca.product.domain.entity.Product;
/**
* Interfaces DAO de productos
* @author wpantoja, ahurtado
*
*/

public interface IProductDao extends CrudRepository<Product, Long> {

}

package co.unicauca.product.domain.service;

import java.util.List;
import co.unicauca.product.domain.entity.Product;
//import co.unicauca.product.presentation.rest.exceptions.ResourceNotFoundException;
//import co.unicauca.product.presentation.rest.exceptions.ProductDomainException;
/**
* Interfaz de operaciones de la bd de productos
*
* @author wpantoja, ahurtado
*
*/

public interface IProductService {

	public List<Product> findAll();
	public Product findById(Long id);
	public Product create(Product product);
	public Product update(Long id, Product product);
	public void deleteById(Long id);


}

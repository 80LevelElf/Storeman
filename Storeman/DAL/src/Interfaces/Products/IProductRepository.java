package Interfaces.Products;

import Entities.Product;
import Interfaces.IReadRepository;
import Interfaces.IWriteRepository;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public interface IProductRepository extends IReadRepository<Product>, IWriteRepository<Product> {
}

package DAL.Products;

import Model.Entities.Product;
import DAL.Interfaces.IReadRepository;
import DAL.Interfaces.IWriteRepository;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public interface IProductRepository extends IReadRepository<Product>, IWriteRepository<Product> {
}

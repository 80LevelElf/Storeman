package DAL.Testing.Products;

import Model.Entities.Product;
import DAL.Testing.ATestRepository;

import java.util.ArrayList;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public class TestProductRepository extends ATestRepository<Product> {

    public TestProductRepository() {
        TestProductTypeRepository productTypeRepository = new TestProductTypeRepository();

        _dataList = new ArrayList<Product>() {{
            add(new Product(1) {{
                setCount(3);
                setPrice(120);
                setProductType(productTypeRepository.getRandom());
                setName("Car 1");
            }});

            add(new Product(2) {{
                setCount(5);
                setPrice(1205);
                setProductType(productTypeRepository.getRandom());
                setName("Car 2");
            }});

            add(new Product(3) {{
                setCount(3000);
                setPrice(1);
                setProductType(productTypeRepository.getRandom());
                setName("Car 1");
            }});

            add(new Product(4) {{
                setCount(5);
                setPrice(1.2);
                setProductType(productTypeRepository.getRandom());
                setName("Car 2");
            }});
        }};
    }
}
package DAL.Testing.Products;

import Model.Entities.Product;
import Model.Entities.ProductType;
import DAL.Testing.ATestRepository;

import java.util.ArrayList;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public class TestProductRepository extends ATestRepository<Product> {

    public TestProductRepository() {
        ProductType carProductType = new ProductType() {{
            setName("Cars");
            setMeasureUnits("PCs.");
        }};
        ProductType penProductType = new ProductType() {{
            setName("Pens");
            setMeasureUnits("PCs.");
        }};

        _dataList = new ArrayList<Product>() {{

            //Car product group
            add(new Product(1) {{
                setCount(3);
                setPrice(120);
                setProductType(carProductType);
                setName("Car 1");
            }});

            add(new Product(2) {{
                setCount(5);
                setPrice(1205);
                setProductType(carProductType);
                setName("Car 2");
            }});

            //Pen product group
            add(new Product(3) {{
                setCount(3000);
                setPrice(1);
                setProductType(penProductType);
                setName("Car 1");
            }});

            add(new Product(4) {{
                setCount(5);
                setPrice(1.2);
                setProductType(penProductType);
                setName("Car 2");
            }});
        }};
    }
}
package DAL.Testing.Products;

import DAL.Testing.ATestRepository;
import Model.Entities.ProductType;

import java.util.ArrayList;

/**
 * Created by Rustam Salakhutdinov on 26.04.2016.
 */
public class TestProductTypeRepository extends ATestRepository<ProductType> {
    public TestProductTypeRepository()
    {
        _dataList = new ArrayList<>();
        _dataList.add(new ProductType() {{
            setName("Cars");
            setMeasureUnits("PCs.");
        }});

        _dataList.add(new ProductType() {{
            setName("Pens");
            setMeasureUnits("PCs.");
        }});
    }
}

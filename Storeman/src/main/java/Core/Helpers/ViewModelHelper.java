package Core.Helpers;

import Model.Entities.ProductType;
import ViewModel.ProductTypeViewItem;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Rustam on 03.05.2016.
 */
public final class ViewModelHelper {
    public static ObservableList<ProductTypeViewItem> getProductTypeViewList(List<ProductType> productTypeList)
    {
        return getObservableList(productTypeList.stream().map(ViewModelHelper::getProductTypeViewItem));
    }

    public static ProductTypeViewItem getProductTypeViewItem(ProductType productType)
    {
        return new ProductTypeViewItem(productType);
    }

    private static <T> ObservableList<T> getObservableList(Stream<T> stream)
    {
        return FXCollections.observableList(stream.collect(Collectors.toList()));
    }
}

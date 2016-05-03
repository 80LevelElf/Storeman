package ViewModel.Abstract;

import Core.Helpers.MapperHelper;
import Model.Abstract.AStorable;

/**
 * Created by Rustam on 02.05.2016.
 */
public class AViewItem<T> extends AStorable {
    private T sourceObject;

    public AViewItem(T sourceObject)
    {
        this.sourceObject = sourceObject;
    }

    public T getSourceObject()
    {
        MapperHelper.map(this, sourceObject);
        return sourceObject;
    }

    protected void map(T sourceObject)
    {
        MapperHelper.map(sourceObject, this);
    }
}

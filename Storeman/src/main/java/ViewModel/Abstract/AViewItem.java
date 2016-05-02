package ViewModel.Abstract;

import Core.Mapper;
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
        Mapper.map(this, sourceObject);
        return sourceObject;
    }

    protected void map(T sourceObject)
    {
        Mapper.map(sourceObject, this);
    }
}

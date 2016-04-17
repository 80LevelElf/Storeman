package Entities.Abstract;

import Entities.Interfaces.IStorable;

/**
 * Created by Rustam Salakhutdinov on 02.04.2016.
 */
public abstract class AStorable implements IStorable{
    private Long id;

    /**
     * Get unique identification number of object. Id is unique within the class
     */
    @Override
    public long getId() {
        if (!isStored())
            throw new NullPointerException("Object hasn't id, because it wasn't stored!");

        return id;
    }

    public boolean isStored()
    {
        return (id != null);
    }

    public AStorable()
    {
        id = null;
    }

    public AStorable(long id)
    {
        this.id = id;
    }
}

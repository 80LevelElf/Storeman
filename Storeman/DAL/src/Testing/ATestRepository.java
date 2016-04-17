package Testing;

import Entities.Interfaces.IStorable;
import Interfaces.IReadRepository;
import Interfaces.IWriteRepository;

import java.util.ArrayList;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public class ATestRepository<T extends IStorable> implements IWriteRepository<T>, IReadRepository<T> {
    protected ArrayList<T> _dataList = null;

    public long getNextId()
    {
        return _dataList.get(_dataList.size() - 1).getId() + 1;
    }

    @Override
    public ArrayList<T> GetList()
    {
        return new ArrayList<>(_dataList);
    }

    @Override
    public T GetById(long id)
    {
        for (T item : _dataList)
        {
            if (item.getId() == id)
                return item;
        }

        return null;
    }

    @Override
    public long Create(T newInstance)
    {
        _dataList.add(newInstance);
        return newInstance.getId();
    }

    @Override
    public void Update(long id, T instance)
    {
        for (int i = 0; i < _dataList.size(); i++)
        {
            if (_dataList.get(i).getId() == id)
            {
                _dataList.set(i, instance);
                return;
            }
        }
    }

    @Override
    public void Delete(long id)
    {
        for (int i = 0; i < _dataList.size(); i++)
        {
            if (_dataList.get(i).getId() == id)
            {
                _dataList.remove(i);
                return;
            }
        }
    }
}

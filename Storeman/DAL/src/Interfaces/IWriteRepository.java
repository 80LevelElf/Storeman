package Interfaces;

import Entities.Interfaces.IStorable;

/**
 * Created by Rustam Salakhutdinov on 17.04.2016.
 */
public interface IWriteRepository<T extends IStorable> {
    public long Create(T newInstance);
    public void Update(long id, T instance);
    public void Delete(long id);
}

package Interfaces;

import Entities.Interfaces.IStorable;

import java.util.ArrayList;

/**
 * Created by Rustam Salakhutdinov on 09.04.2016.
 */
public interface IReadRepository<T extends IStorable> {
    ArrayList<T> GetList();

    T GetById(long id);
}

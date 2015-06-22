
package com.logic.admin;

import java.io.Serializable;
import java.util.List;
/**
 *
 * @author Rayzzy
 */
public interface IDataAccess<T> extends Serializable {
   public void insert(T obj);
   public void update(T obj);
   public void delete(T obj);
   public List<T> getAll();
   public T getById(int id);
   public T getById(String id);
   public List<T> getByProperty(String name, Object value);
   public List<T> search(String name, Object value);
}

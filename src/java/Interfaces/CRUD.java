/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.List;

/**
 *
 * @author duvan
 */
public interface CRUD<T> {
      public List<T> list();

    public <E> T read(E obj);

    public boolean create(T obj);

    public boolean update(List<T> list, T obj);

    public boolean delete(List<T> list, T obj);
}

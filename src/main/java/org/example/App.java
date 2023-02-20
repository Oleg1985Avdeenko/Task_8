package org.example;

import org.example.bean.Animal;
import org.example.dao.DAOImpl;
import org.example.dao.Dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        System.out.println("Hello World!");
        Animal animal = new Animal(null,14,"cat", "baton");
        Animal animal1 = new Animal(null, 10, "cat", "Tesla");
        Dao dao = new DAOImpl();
        dao.insert(animal);
        dao.insert(animal1);
       // dao.update(animal, new Animal(null, 15, "dog", "max"));
       // dao.delete(animal);
    }
}

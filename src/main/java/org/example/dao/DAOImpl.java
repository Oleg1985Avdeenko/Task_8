package org.example.dao;

import org.example.bean.Animal;
import org.example.utils.HibernateUtil;
import org.hibernate.Session;

import javax.persistence.EntityManager;

public class DAOImpl implements AnimalDao{

   // Session session = entityManager.unwrap(Session.class);
    @Override
    public void insert(Animal animal) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.persist(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public Animal select(Animal animal) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.refresh(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
        return animal;
    }

    @Override
    public void update(Animal animal, Animal animal1) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        animal.setWeight(animal1.getWeight());
        animal.setName(animal1.getName());
        animal.setType(animal1.getType());
        entityManager.merge(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

    @Override
    public void delete(Animal animal) {
        EntityManager entityManager = HibernateUtil.getEntityManager();
        entityManager.getTransaction().begin();
        entityManager.remove(animal);
        entityManager.getTransaction().commit();
        entityManager.close();
    }

}

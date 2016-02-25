/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Forum;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class ForumDAOJpaImpl implements ForumDAOInterface {

    @Override
    public void ajouter(Forum f) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(f);
        em.getTransaction().commit();
    }

    @Override
    public void supprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Forum f WHERE f.id =" + id).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public void modifier(Forum f) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(f);
        em.getTransaction().commit();
    }

    @Override
    public Forum rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();

        return em.find(Forum.class, id);
    }

    @Override
    public List<Forum> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        return em.createQuery("SELECT f FROM Forum f").getResultList();

    }
}
    

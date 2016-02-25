/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Utilisateur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import org.springframework.stereotype.Repository;

/**
 *
 * @author admin
 */
@Repository
public class UtilisateurDAOImpl implements UtilisateurDAOInterface{
    
    @Override
    public void ajouter(Utilisateur u) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.persist(u);
        em.getTransaction().commit();
    }

    @Override
    public void supprimer(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.createQuery("DELETE FROM Utilisateur u WHERE u.id =" + id).executeUpdate();
        em.getTransaction().commit();
    }

    @Override
    public void modifier(Utilisateur u) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        em.getTransaction().begin();
        em.merge(u);
        em.getTransaction().commit();
    }

    @Override
    public Utilisateur rechercherParId(Long id) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();

        return em.find(Utilisateur.class, id);
    }
    
    @Override
    public Utilisateur rechercherParMail(String mail) {
        
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();

//        List<Utilisateur> listU = em.createQuery("SELECT u FROM Utilisateur u WHERE u.email ='" + mail + "'").getResultList();
//
//        if(listU.isEmpty())
//            return null;
//        else
//            return listU.get(0);
        
        try{
            Utilisateur u = (Utilisateur)em.createQuery("SELECT u FROM Utilisateur u WHERE u.email ='" + mail + "'").getSingleResult();
            return u;
        }catch(Exception e){
            return null;
        }
    }
    
        
    @Override
    public Utilisateur rechercherParLogin(String login) {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        
        //Utilisateur u = (Utilisateur)em.createQuery("SELECT u FROM Utilisateur u WHERE u.login ='"+login+"'").getSingleResult();

        //return u;
        
        List<Utilisateur> listU = em.createQuery("SELECT u FROM Utilisateur u WHERE u.login ='" + login + "'").getResultList();

        if(listU.isEmpty())
            return null;
        else
            return listU.get(0);
    }

    @Override
    public List<Utilisateur> listerTous() {
        EntityManager em = Persistence.createEntityManagerFactory("ForumPU").createEntityManager();
        return em.createQuery("SELECT u FROM Utilisateur u").getResultList();

    }
    
}

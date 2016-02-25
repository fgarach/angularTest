/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Utilisateur;
import java.util.List;

/**
 *
 * @author admin
 */
public interface IUtilisateurDAO {

    public void ajouter(Utilisateur u);

    public void supprimer(Long id);

    public void modifier(Utilisateur u);

    public Utilisateur rechercherParId(Long id);

    public Utilisateur rechercherParMail(String mail);

    public Utilisateur rechercherParLogin(String login);

    public List<Utilisateur> listerTous();
}

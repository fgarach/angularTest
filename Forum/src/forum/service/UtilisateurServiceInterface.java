/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Utilisateur;
import forum.exception.LoginDejaPrisException;
import forum.exception.LoginNonExistant;
import forum.exception.MotDePasseIncorrect;
import forum.exception.UtilisateurDejaInscritException;
import forum.exception.UtilisateurInscriptionNonValide;
import java.util.List;

/**
 *
 * @author admin
 */
public interface UtilisateurServiceInterface {
    public void ajouter(Utilisateur u) ;
    public void supprimer(Long id) ;
    public void modifier(Utilisateur u) ;
    public Utilisateur rechercherParId(Long id) ;
    public Utilisateur rechercherParMail(String mail) ;
    public Utilisateur rechercherParLogin(String login) ;
    public List<Utilisateur> listerTous() ;
    public void inscriptionUtilisateur(Utilisateur u) throws LoginDejaPrisException, UtilisateurDejaInscritException ;
    public void validationInscription(Long id);
    public void loginConnection(String login, String mdp) throws LoginNonExistant, MotDePasseIncorrect, UtilisateurInscriptionNonValide;
    
}

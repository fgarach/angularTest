/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.IUtilisateurDAO;
import forum.entity.Utilisateur;
import forum.exception.LoginDejaPrisException;
import forum.exception.LoginNonExistant;
import forum.exception.MotDePasseIncorrect;
import forum.exception.UtilisateurDejaInscritException;
import forum.exception.UtilisateurInscriptionNonValide;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class UtilisateurServiceImpl implements UtilisateurService{

    @Autowired
    private IUtilisateurDAO uDao ;
    @Autowired
    private IMailService mserv ;

    @Override
    public void ajouter(Utilisateur u) {
        uDao.ajouter(u);
    }

    @Override
    public void supprimer(Long id) {
        uDao.supprimer(id);

    }

    @Override
    public void modifier(Utilisateur u) {
        uDao.modifier(u);

    }

    @Override
    public Utilisateur rechercherParId(Long id) {
        return uDao.rechercherParId(id);

    }

    @Override
    public Utilisateur rechercherParMail(String mail) {
        return uDao.rechercherParMail(mail);

    }

    @Override
    public Utilisateur rechercherParLogin(String login) {
        return uDao.rechercherParLogin(login);

    }

    @Override
    public List<Utilisateur> listerTous() {
        return uDao.listerTous();

    }

    @Override
    public void inscriptionUtilisateur(Utilisateur u) throws LoginDejaPrisException, UtilisateurDejaInscritException {

        //Utilisateur tmp = rechercherParLogin(u.getLogin());
        //Utilisateur tmp = rechercherParLogin(u.getLogin());
        if (rechercherParMail(u.getEmail()) != null) {
            throw new UtilisateurDejaInscritException();
        }
        else if (rechercherParLogin(u.getLogin())!=null){    
            throw new LoginDejaPrisException();
        }
        else{
            uDao.ajouter(u);
            mserv.envoyerMail(u, "Inscription au forum", "Veuillez valider sur le lien");
        }    
        
    }
    
    @Override
    public void validationInscription(Long id){
        
        Utilisateur u = rechercherParId(id);
        u.setInscrit(true);
        uDao.modifier(u);
    }
    
    @Override
    public void loginConnection(String login, String mdp) throws LoginNonExistant, MotDePasseIncorrect, UtilisateurInscriptionNonValide{
        Utilisateur u = rechercherParLogin(login);

        if (u==null){
            throw new LoginNonExistant();
        }
        else if (!u.isInscrit()){
            throw new UtilisateurInscriptionNonValide();
        }
        else if (!u.getMdp().equals(mdp)){
            throw new MotDePasseIncorrect();
        }
 
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Utilisateur;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class MailServiceImpl implements MailServiceInterface{
    
    
    @Override
    public void envoyerMail(Utilisateur dest, String titre, String message){
        System.out.println("email envoyé");
    }
    
}

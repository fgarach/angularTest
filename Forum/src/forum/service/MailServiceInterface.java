/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Utilisateur;

/**
 *
 * @author admin
 */
public interface MailServiceInterface {
        public void envoyerMail(Utilisateur dest, String titre, String message);
}

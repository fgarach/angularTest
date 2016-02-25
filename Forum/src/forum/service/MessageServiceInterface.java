/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Message;
import java.util.List;

/**
 *
 * @author admin
 */
public interface MessageServiceInterface {
    
    public void ajouter(Message m);

    public void supprimer(Long id);

    public void modifier(Message m);

    public Message rechercherParId(Long id);

    public List<Message> listerTous();

    
}

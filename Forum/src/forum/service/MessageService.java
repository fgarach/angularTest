/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.MessageDAO;
import forum.entity.Message;
import java.util.List;

/**
 *
 * @author admin
 */
public class MessageService {
    
    private MessageDAO mDao = new MessageDAO();

    public void ajouter(Message m) {
        mDao.ajouter(m);
    }

    public void supprimer(Long id) {
        mDao.supprimer(id);

    }

    public void modifier(Message m) {
        mDao.modifier(m);

    }

    public Message rechercherParId(Long id) {
        return mDao.rechercherParId(id);

    }

    public List<Message> listerTous() {
        return mDao.listerTous();

    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Message;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import forum.dao.MessageDAOInterface;

/**
 *
 * @author admin
 */
@Service
public class MessageServiceImpl implements MessageServiceInterface{
    
    @Autowired
    private MessageDAOInterface mDao ;

    @Override
    public void ajouter(Message m) {
        mDao.ajouter(m);
    }

    @Override
    public void supprimer(Long id) {
        mDao.supprimer(id);

    }

    @Override
    public void modifier(Message m) {
        mDao.modifier(m);

    }

    @Override
    public Message rechercherParId(Long id) {
        return mDao.rechercherParId(id);
    }

    @Override
    public List<Message> listerTous() {
        return mDao.listerTous();

    }
    
    
}

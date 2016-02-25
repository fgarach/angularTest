/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;


import forum.dao.IForumDAO;
import forum.entity.Forum;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class ForumServiceImpl implements IForumService {

    @Autowired
    private IForumDAO fDao;

    @Override
    public void ajouter(Forum f) {
        fDao.ajouter(f);
    }

    @Override
    public void supprimer(Long id) {
        fDao.supprimer(id);

    }

    @Override
    public void modifier(Forum f) {
        fDao.modifier(f);

    }

    @Override
    public Forum rechercherParId(Long id) {
        return fDao.rechercherParId(id);

    }

    @Override
    public List<Forum> listerTous() {
        return fDao.listerTous();

    }
}

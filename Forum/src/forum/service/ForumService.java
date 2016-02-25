/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.ForumDAO;
import forum.entity.Forum;
import java.util.List;

/**
 *
 * @author admin
 */
public class ForumService {

    private ForumDAO fDao = new ForumDAO();

    public void ajouter(Forum f) {
        fDao.ajouter(f);
    }

    public void supprimer(Long id) {
        fDao.supprimer(id);

    }

    public void modifier(Forum f) {
        fDao.modifier(f);

    }

    public Forum rechercherParId(Long id) {
        return fDao.rechercherParId(id);

    }

    public List<Forum> listerTous() {
        return fDao.listerTous();

    }
}

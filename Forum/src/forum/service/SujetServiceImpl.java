/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.dao.SujetDAO;
import forum.entity.Sujet;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author admin
 */
@Service
public class SujetServiceImpl implements ISujetService{
    
    @Autowired
    private SujetDAO sDao;

    @Override
    public void ajouter(Sujet s) {
        sDao.ajouter(s);
    }

    @Override
    public void supprimer(Long id) {
        sDao.supprimer(id);

    }

    @Override
    public void modifier(Sujet s) {
        sDao.modifier(s);

    }

    @Override
    public Sujet rechercherParId(Long id) {
        return sDao.rechercherParId(id);

    }

    @Override
    public List<Sujet> listerTous() {
        return sDao.listerTous();

    }
    
}
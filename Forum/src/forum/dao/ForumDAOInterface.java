/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.dao;

import forum.entity.Forum;
import java.util.List;

/**
 *
 * @author admin
 */
public interface ForumDAOInterface {

    public void ajouter(Forum f);

    public void supprimer(Long id);

    public void modifier(Forum f);

    public Forum rechercherParId(Long id);

    public List<Forum> listerTous();
}

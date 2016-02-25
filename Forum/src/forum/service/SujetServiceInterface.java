/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forum.service;

import forum.entity.Sujet;
import java.util.List;

/**
 *
 * @author admin
 */

public interface SujetServiceInterface {

    public void ajouter(Sujet s);

    public void supprimer(Long id);

    public void modifier(Sujet s);

    public Sujet rechercherParId(Long id);

    public List<Sujet> listerTous();
}

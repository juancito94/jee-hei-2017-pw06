package service;

import entity.Evenement;

import java.util.List;

/**
 * Created by Juan on 14/02/2017.
 */
public interface EvenementService {

    List<Evenement> findByTitle(String title);

    void saveEvenement(Evenement evn);

    List<Evenement> findById(Long id);

    List<Evenement> findAll();

    void deleteEvenement(long idEvenement);
}

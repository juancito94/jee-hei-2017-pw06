package dao;

import entity.Evenement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


/**
 * Created by Juan on 14/02/2017.
 */
public interface EvenementDAO extends JpaRepository<Evenement, Long> {

    List<Evenement> findByTitle(String title);

    void saveEvenement(Evenement evn);

    List<Evenement> findById(Long id);

    List<Evenement> findAll();

    void deleteEvenement(long idEvenement);



}

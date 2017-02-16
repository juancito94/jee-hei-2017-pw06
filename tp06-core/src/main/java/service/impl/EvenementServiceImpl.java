package service.impl;

import dao.EvenementDAO;
import entity.Evenement;
import org.springframework.transaction.annotation.Transactional;
import service.EvenementService;

import javax.inject.Inject;
import javax.inject.Named;
import java.util.List;

/**
 * Created by Juan on 14/02/2017.
 */

@Named
@Transactional
public class EvenementServiceImpl implements EvenementService {

    @Inject
    private EvenementDAO evenementDAO;

    public List<Evenement> findById(Long id) {
        return evenementDAO.findById(id);
    }

    public List<Evenement> findByTitle(String title) {
        return evenementDAO.findByTitle(title);
    }

    public void saveEvenement(Evenement evn) {
        evenementDAO.save(evn);
    }

    public List<Evenement> findAll() {
        return evenementDAO.findAll();
    }

    public void deleteEvenement(long idEvenement) {
        evenementDAO.delete(idEvenement);
    }
}

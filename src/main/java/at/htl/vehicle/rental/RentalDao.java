package at.htl.vehicle.rental;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import java.util.List;

@ApplicationScoped
public class RentalDao implements PanacheRepository<Rental> {

//    @Inject
//    EntityManager em;
//
//    public List<Rental> findAll() {
//        var stmt = "select r from Rental r";
//        var query = em.createQuery(stmt, Rental.class);
//        return query.getResultList();
//    }
}

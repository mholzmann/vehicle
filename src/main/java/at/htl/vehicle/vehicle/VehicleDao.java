package at.htl.vehicle.vehicle;

import at.htl.vehicle.person.Person;
import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NamedQuery;
import java.util.List;

@ApplicationScoped
public class VehicleDao implements PanacheRepository<Vehicle> {

//    @Inject
//    EntityManager em;
//
//    public Vehicle findById(long id) {
//        return em.find(Vehicle.class, id);
//    }

//    public List<Vehicle> findAll() {
//        var stmt = "select v from Vehicle v";
//        var query = em.createQuery(stmt, Vehicle.class);
//        return query.getResultList();
//    }

}

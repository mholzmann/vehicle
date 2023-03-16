package at.htl.vehicle.person;

import io.quarkus.hibernate.orm.panache.PanacheRepository;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;

@ApplicationScoped
public class PersonDao implements PanacheRepository<Person> {

//    @Inject
//    EntityManager em;
//
//    public Person findById(long id) {
//        return em.find(Person.class, id);
//    }
}

package at.htl.vehicle.rental;

import at.htl.vehicle.person.Person;
import at.htl.vehicle.vehicle.Vehicle;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
public class Rental {

    @Id
    @GeneratedValue
    private Long id;

    private LocalDateTime startDateTime;

    private LocalDateTime endDateTime;

    private BigDecimal discount;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(nullable = false)
    private Person person;

    //region Constructors
    public Rental() {
    }

    public Rental(LocalDateTime startDateTime, LocalDateTime endDateTime, BigDecimal discount, Vehicle vehicle, Person person) {
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
        this.discount = discount;
        this.vehicle = vehicle;
        this.person = person;
    }
    //endregion

    //region Getter / Setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(LocalDateTime startDateTime) {
        this.startDateTime = startDateTime;
    }

    public LocalDateTime getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(LocalDateTime endDateTime) {
        this.endDateTime = endDateTime;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
    //endregion
}

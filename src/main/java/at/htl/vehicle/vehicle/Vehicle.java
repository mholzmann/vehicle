package at.htl.vehicle.vehicle;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Vehicle {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String model;

    @Column(nullable = false)
    private String brand;

    @Column(name = "price_per_day")
    private BigDecimal pricePerDay;

    //region Constructors
    public Vehicle() {
    }

    public Vehicle(String model, String brand, BigDecimal pricePerDay) {
        this.model = model;
        this.brand = brand;
        this.pricePerDay = pricePerDay;
    }
    //endregion

    //region Getters / Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public BigDecimal getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(BigDecimal pricePerDay) {
        this.pricePerDay = pricePerDay;
    }
    //endregion
}

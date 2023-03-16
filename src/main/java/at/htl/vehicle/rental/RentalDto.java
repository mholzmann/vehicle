package at.htl.vehicle.rental;

import at.htl.vehicle.vehicle.Vehicle;
import at.htl.vehicle.vehicle.VehicleDto;

import java.time.LocalDateTime;

public record RentalDto(Long id, long startDateTime, long endDateTime, double discount, VehicleDto vehicle, long personId) {
}

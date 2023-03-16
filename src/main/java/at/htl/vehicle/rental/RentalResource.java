package at.htl.vehicle.rental;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/rentals")
public class RentalResource {

    @Inject
    RentalDao rentalDao;

    @Inject
    RentalMapper rentalMapper;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAllRentals() {
        var rentals =  rentalDao
                .streamAll()
                .map(rentalMapper::fromEntity)
                .toList();
        return Response.ok().entity(rentals).build();
    }
}

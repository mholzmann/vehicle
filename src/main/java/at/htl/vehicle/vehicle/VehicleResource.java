package at.htl.vehicle.vehicle;

import javax.inject.Inject;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Path("/vehicles")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class VehicleResource {

    @Inject
    VehicleDao vehicleDao;

    @Inject
    VehicleMapper vehicleMapper;

    @GET
    @Path("/{id: [1-9][0-9]*}")
    public VehicleDto getVehicle(@PathParam("id") Long id) {
        return vehicleMapper.fromEntity(vehicleDao.findById(id));
    }

    @GET
    public List<VehicleDto> getAllVehicles() {
        return vehicleDao
                .streamAll()
                .map(vehicleMapper::fromEntity)
                .toList();
    }

}

package withDesignPatterns;

import java.util.List;

public abstract class VehicleIterator {

    private VehicleListSingleton vehicles = null;


    public VehicleIterator(VehicleListSingleton vehicles) {
        this.vehicles = vehicles;

    }

    public abstract Vehicle first();
    public abstract Vehicle hasNext();
}


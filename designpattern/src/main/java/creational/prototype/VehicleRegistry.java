package creational.prototype;

import java.util.HashMap;
import java.util.Map;

public class VehicleRegistry {

    private static Map<String ,Vehicle> map= new HashMap<>();

    static {
        map.put("Two",new TwoWheelerVehicle("petrol", "2020", 5000,false));
        map.put("Four",new FourWheelerVehicle("petrol", "2020", 5000,false,false));
    }

    public Vehicle getVehicle(String vehicle) throws CloneNotSupportedException{
      return map.get(vehicle).clone();
    }
}

import java.util.ArrayList;

public class VehicleDealer {
    private ArrayList<Vehicle> vehicles;
    private ArrayList<Dealer> dealers;

    public void addElements(Vehicle vehicles, Dealer dealers){
        vehicles.add(vehicles);
        dealers.add(dealers);
    }
    public void returnInfo(ArrayList<VehicleDealer> VehicleDealers) {
        for (VehicleDealer vd:VehicleDealers) {
            System.out.println(vd.toString());
        }
    }
}

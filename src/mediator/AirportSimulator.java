package src.mediator;

public class AirportSimulator {
    public static void main(String[] args) {
        ControlTower tower = new ControlTower();

        Aircraft plane1 = new PassengerPlane("Plane 1");
        Aircraft plane2 = new CargoPlane("Cargo 1");
        Aircraft plane3 = new EmergencyAircraft("Emergency 1");

        plane1.send("Requesting landing", tower);
        plane2.send("Requesting landing", tower);
        plane3.send("MAYDAY! Requesting immediate landing", tower);

        tower.requestRunway(plane1);
        tower.requestRunway(plane2);
        tower.requestRunway(plane3);

        tower.clearRunway();
    }
}

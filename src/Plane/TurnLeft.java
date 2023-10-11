package Plane;

public class TurnLeft extends Turn implements IFlightOperations{

    @Override
    public void turn() {
        setDirection(getDirection()-getAngle());
    }
}

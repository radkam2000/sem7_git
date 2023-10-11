package Plane;

public class TurnRight extends Turn implements IFlightOperations{

    @Override
    public void turn() {
        setDirection(getDirection()+getAngle());
    }
}

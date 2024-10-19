package Exercise3;

public class PrinterHotEnd {
    // I dati di seguito rappresentano la condizione di accensione di una stampante 3D cartesiana in cui l'hotend(ugello:
    // - Ugello posizionato nello zero del piano di stampa
    // - Ugello a temperatura ambiente
    private double hotEndXPosition = 0.0;
    private double hotEndYPosition = 0.0;
    private double hotEndZPosition = 0.0;
    private double hotEndTemperature = 18;
    private boolean endStopX = true;
    private boolean endStopY = true;
    private boolean endStopZ = true;

    public double[] getPosition() {
        double[] position = {hotEndXPosition, hotEndYPosition, hotEndZPosition};
        return position;
    }

    public void setPosition(double x, double y, double z) {
        hotEndXPosition = x;
        hotEndYPosition = y;
        hotEndZPosition = z;
    }

    public double getTemperature() {
        return hotEndTemperature;
    }

    public void setTemperature(double t) {
        hotEndTemperature = t;
    }

    public boolean[] getEndStopsState() {
        boolean[] endStopStates = {endStopX, endStopY, endStopZ};
        return endStopStates;
    }
}

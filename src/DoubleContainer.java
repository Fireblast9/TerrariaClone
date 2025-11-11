package src;

public class DoubleContainer {
    private final double[] doubles;

    public DoubleContainer(double[] doubles) {
        this.doubles = (doubles != null) ? doubles.clone() : null;
    }

    public double[] getDoubles() {
        return (doubles != null) ? doubles.clone() : null;
    }
}

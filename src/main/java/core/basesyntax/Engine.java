package core.basesyntax;

public class Engine implements Cloneable {

    private int pistons;
    private int power;
    private double volume;
    private int serial;
    private String type;

    public Engine() { //please don't remove this constructor!
    }

    public Engine(int pistons, int power, double volume, int serial, String type) {
        this.pistons = pistons;
        this.power = power;
        this.volume = volume;
        this.serial = serial;
        this.type = type;
    }

    //write your code here

    public int getPistons() {
        return pistons;
    }

    public void setPistons(int pistons) {
        this.pistons = pistons;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public int getSerial() {
        return serial;
    }

    public void setSerial(int serial) {
        this.serial = serial;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Engine engine = (Engine) o;

        if (pistons != engine.pistons) return false;
        if (power != engine.power) return false;
        if (Double.compare(engine.volume, volume) != 0) return false;
        if (serial != engine.serial) return false;
        return type.equals(engine.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = pistons;
        result = 31 * result + power;
        temp = Double.doubleToLongBits(volume);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + serial;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    protected Engine clone() throws CloneNotSupportedException {
        return new Engine(this.pistons, this.power, this.volume, this.serial, new String(this.type));
    }
}

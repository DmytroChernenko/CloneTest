package core.basesyntax;

public class Car implements Cloneable {
    private Engine engine;
    private int maxSpeed;
    private int doors;
    private int seats;
    private String color;

    public Car() { //please don't remove this constructor!
    }

    public Car(Engine engine, int maxSpeed, int doors, int seats, String color) {
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.doors = doors;
        this.seats = seats;
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public Car clone() throws CloneNotSupportedException {
        return new Car(engine.clone(), this.maxSpeed, this.doors, this.seats, this.color);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        if (maxSpeed != car.maxSpeed) return false;
        if (doors != car.doors) return false;
        if (seats != car.seats) return false;
        if (!engine.equals(car.engine)) return false;
        return color.equals(car.color);
    }

    @Override
    public int hashCode() {
        int result = engine.hashCode();
        result = 31 * result + maxSpeed;
        result = 31 * result + doors;
        result = 31 * result + seats;
        result = 31 * result + color.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engine=" + engine +
                ", maxSpeed=" + maxSpeed +
                ", doors=" + doors +
                ", seats=" + seats +
                ", color='" + color + '\'' +
                '}';
    }

    //write your code here
}

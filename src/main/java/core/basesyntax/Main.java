package core.basesyntax;



public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Engine e = new Engine(1, 1, 1.0, 1, "1");
        Car first = new Car(e, 1, 1, 1, "1");
        Car second = first.clone();
        System.out.println(first);
        System.out.println(second);
        System.out.println(first == second);
        System.out.println(first.getEngine() == second.getEngine());
        System.out.println(first.equals(second));
        System.out.println(first.getEngine().equals(second.getEngine()));
    }
}

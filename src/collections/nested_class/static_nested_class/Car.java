package collections.nested_class.static_nested_class;

public class Car {
    String color;
    String doorcount;
    Engine engine;
    static int a;

    public Car(String color, String doorcount, Engine engine) {
        this.color = color;
        this.doorcount = doorcount;
        this.engine = engine;
    }
    void method(){
        System.out.println(Engine.countOfObject);
        Engine e = new Engine(200);
        System.out.println(e);
    }

    @Override
    public String toString() {
        return "My car: {" +
                "color='" + color + '\'' +
                ", doorcount='" + doorcount + '\'' +
                ", engine=" + engine +
                '}';
    }
    interface i{

    }
    public static class Engine {
        private int horsePower;
        static int countOfObject;


        public Engine(int horsePower) {
            System.out.println(a);
            this.horsePower = horsePower;
            countOfObject++;
        }

        @Override
        public String toString() {
            return "My Engine: {" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {
        Car.Engine engine = new Car.Engine(256);
        System.out.println(engine);
        Car car = new Car("blue","four",engine);
        System.out.println(engine);
    }
}
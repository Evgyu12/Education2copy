package generics;

public class parametrizedClass2 {
    public static void main(String[] args) {

        Pare <String, Integer> pare1 = new Pare<>("1asd",12);
        System.out.println("Znachenie 1 value =" + pare1.getFirstValue() + "  Znahenie 2 value = " + pare1.getSecondValue());
        Pare <Integer, Double> pare2 = new Pare <> (12,3.14);
        System.out.println("Znachenie 1 value =" + pare2.getFirstValue() + "  Znahenie 2 value = " + pare2.getSecondValue());
        OtherPare <String> otherPare = new OtherPare<>("Privet","Poka");
    }
}
class Pare <V1,V2> {
    private V1 value1;
    private V2 value2;

    public Pare(V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public V1 getFirstValue() {
        return value1;
    }

    public V2 getSecondValue() {
        return value2;
    }
}
    class OtherPare <V> {
        private V value1;
        private V value2;

        public V abc(V value){
            return value;
        }

        public OtherPare(V value1, V value2) {
            this.value1 = value1;
            this.value2 = value2;
        }

        public V getFirstValue() {
            return value1;
        }

        public V getSecondValue() {
            return value2;
        }
    }


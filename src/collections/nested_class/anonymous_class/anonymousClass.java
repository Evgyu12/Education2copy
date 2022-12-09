package collections.nested_class.anonymous_class;

public class anonymousClass {
    private int x = 5;
    public static void main(String[] args) {
        Math2 m = new Math2(){
            int c = 10;
            void abc (){}
            @Override
            public int doOperation(int a, int b){
                anonymousClass ac = new anonymousClass();
                return a+b+ac.x;
            }
        };
        Math2 m2 = new Math2(){
            int c = 10;
            void abc (){}
            @Override
            public int doOperation(int a, int b){
                return a*b;
            }
        };
        System.out.println(m.doOperation(3,5));
        System.out.println(m2.doOperation(5,2));
    }



}

interface Math2{
    int doOperation(int a, int b);

}

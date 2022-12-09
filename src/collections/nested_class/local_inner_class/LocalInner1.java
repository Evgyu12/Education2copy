package collections.nested_class.local_inner_class;

public class LocalInner1 {
    public static void main(String[] args) {
        Math math = new Math();
        math.getResult(21,4);
    }

}
class Math{
    private int a = 10;
    public void getResult(int Delimoe, int Delitel){
//        int Delimoe = 21;
        class Delenie{
       //     private int Delimoe;
//            private int Delitel;

//            public int getDelimoe() {
//                return Delimoe;
//            }
//
//            public void setDelimoe(int delimoe) {
//                Delimoe = delimoe;
//            }

//            public int getDelitel() {
//                return Delitel;
//            }
//
//            public void setDelitel(int delitel) {
//                Delitel = delitel;
//            }
            public int getChastnoe(){
                return Delimoe/Delitel;
            }
            public int getOstatoc (){
                System.out.println(a);
                return Delimoe%Delitel;
            }
        }
        Delenie delenie = new Delenie();
//        delenie.setDelimoe(21);
    //    delenie.(4);
      //  System.out.println("Delimoe = " + delenie.getDelimoe());
        System.out.println("Delimoe = " + Delimoe);
        System.out.println("Delitel= " + Delitel);
        System.out.println("Chastnoe = " + delenie.getChastnoe());
        System.out.println("Ostatoc = " + delenie.getOstatoc());
    }
}

public class Main {
    public static void main(String[] args) {
      //  method(12, 3, 4, 5, 87, 4);
        method2(new String[]{"Ainura","Aisuluu","Rai"});
    }

    static int method(int... a) {
        int summa = 0;
        for (int j : a) {
            summa = summa + j;
            System.out.println(summa);

        }
        return summa;

        }

     static void method2(String[]name){
         for (String soz : name){
             System.out.println("men senu jakshy korom "+soz);
         }


        }
    }

    

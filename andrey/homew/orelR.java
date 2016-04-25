
// Орел и решка     НЕВИГРУЖАЭТЬСЯ
public class orelR {
    public static void main(String[] args) {
        for(int a=0; a< 100; a++){
            int n=0; int d=0;
            //int randNum = (int) (Math.random() * 100);
             //c =randNum ;
            for(int c=0;c<100;c++){
                int randNum = (int) (Math.random() * 100);
                if( randNum%2==1){ n++; }
                else{ d++;   }

                }
            if  (n >60||d>60){
                System.out.println("Решка"+" "+n );
                System.out.println("Орел"+" "+d );
            }
        }
    }
}

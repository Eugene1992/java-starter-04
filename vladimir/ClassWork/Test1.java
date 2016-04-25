
public class Test1 {
    public static void main(String[] args) {


        for (int j = 0; j <100 ; j++) {

        int a=0, b=0;
        for (int i = 0; i < 100; i++) {

            int randNum = (int) (Math.random() * 100);
            if (randNum%2==1){

                a=a+1;
            }else
                b=b+1;
        }
        if(a>60||b>60){
        System.out.print("Орел "+a);
        System.out.println(" Решка "+b);
    }}
}
}
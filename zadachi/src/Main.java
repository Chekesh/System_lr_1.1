import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] sp = new int[1000];
        for (int i=0; i<sp.length; i++){
            sp[i]=new Random().nextInt(10000);
        }
        int max = 0;
        int max14 = 0;
        int max2 = 0;
        int max7 = 0;
        for (int i : sp){
            if (i>max){
                max = i;
            }
            if (i>max14 && i%14==0){
                max14 = i;
            }
            if (i>max2 && i%2==0){
                max2 = i;
            }
            if (i>max7 && i%7==0){
                max7 = i;
            }
        }
        max = max*max14;
        max2 = max2 * max7;
        if (max==0 && max2==0){
            System.out.println("-1");
        }
        else if (max>max2){
            System.out.println(max);
        }
        else{
            System.out.println(max2);
        }
    }
}
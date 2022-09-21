import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int k=scanner.nextInt();
        double mean=0;
        int a=0;
        for(int i=0;i<=k;i++){
            if (i%3==0 && i%4==0){


                mean=mean+i;

                a=a+1;
            }
        }
        System.out.println(mean/a);
    }
}

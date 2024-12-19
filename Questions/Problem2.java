import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        int tax=0;
        if(amount <=250000){
            tax=0;
        }
        else if(amount <=500000){
            tax+= (0.05)*(amount-250000);
        }
        else if(amount<=1000000){
            tax+=(500000*(0.05))+((amount-250000-500000)*(0.10));
        }
        else if(amount<=1500000){
            tax+=(500000*(0.05))+(1000000*(0.10))+((amount-250000-500000-1000000)*(0.20));
        }
        else{ tax+=(500000*(0.05))+(1000000*(0.10))+(1500000*(0.20))+((amount-250000-500000-1000000-1500000)*(0.30));

        }
        System.out.println("Tax:"+tax);

    }
}

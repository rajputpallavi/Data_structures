import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        int m;
        Scanner sc=new Scanner(System.in);
        m=sc.nextInt();
        switch(m){
            case 11:
            case 12:
            case 1:
            case 2:
            System.out.println("Winter");
            break;
            case 3:
            case 4:
            case 5:
            case 6:
            System.out.println("Summer");
            break;
            case 7:
            case 8:
            case 9:
            case 10:
            System.out.println("Rainy");  
            break;
            default:
            System.out.println("Invalid input");          
        }
    }
}

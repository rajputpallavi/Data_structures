import java.util.Scanner;
public class Problem1{
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            float sum=0;
            String grd;
            int[] arr=new int[5];
            System.out.print("Enter the marks of five subjects: ");
            for(int i=0;i<5;i++){
                   arr[i]=sc.nextInt();
                   sum+=arr[i];
            }
           // System.out.println(sum);
            float p=((sum/500)*100);
            System.out.println("Percentage: "+p+" %");
            if(p>=80){
                grd="A";
            }
           else if(p>=70){   
            grd="B";            
            }
            else if(p>=60){
                grd="C";
            }
            else if(p>=50){
               grd="D";
            }
            else{
              grd="F";
              }
              System.out.println("Grade: "+grd);
            
        }
}
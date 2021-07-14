import java.util.Scanner;

class PerfectNumber{
        public static void main(String[] args){
                Scanner sc = new Scanner(System.in);

                int num, sum;
                System.out.println("Enter a number : ");
                num = sc.nextInt();

                for (int i = 0; i <= num/2; i++){
                    if (num%i == 0){
                    sum += i;
                }
        }
        if (sum==num){
            System.out.println("The number you entered is a perfect number");
        }
        else System.out.println("The number you entered is not a perfect number");
}
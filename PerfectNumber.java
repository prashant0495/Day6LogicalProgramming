package Day6;
import java.util.Scanner;
public class PerfectNumber {
    public static void main(String[] args) {
        long n, Sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        n=sc.nextLong();
        int i=1;
//executes until the condition becomes false
        while(i <= n/2)
        {
            if(n % i == 0)
            {
//calculates the sum of factors
            Sum= Sum + i;
            } //end of if
//after each iteration, increments the value of variable i by 1
            i++;
        } //end of while
//compares sum with the number
        //prints if sum and n are equal
        //end of if
        if(Sum==n)
            System.out.println(n + " is a perfect number.");
        else
//prints if sum and n are not equal
            System.out.println(n+" is not a perfect number.");
    }
}

import java.util.Scanner;
import java.util.Arrays;
public class TestScores {

        public static void main(String[] args)
        {
            int num,sum = 0,max = 0,min = 0,min2=0;
            Scanner input = new Scanner(System.in);
            System.out.print("Enter no. of grades you have: ");
            num = input.nextInt();
            int numList[] = new int[num];
            System.out.println("Enter in all your grades:");
            for(int i = 0; i < num; i++)
            {
                numList[i] = input.nextInt();
                sum = sum + numList[i];
                min2 = numList[i];
                if(numList[i]>max)
                    max=numList[i];

                if(numList[i]<min)
                    min=numList[i];
                else
                    min=numList[i];
            }
            int average = sum/num;
            System.out.println("The highest score is: "+max);
            System.out.println("The lowest score is: "+min);
            System.out.println("The highest score is: "+average);
            System.out.println("All your grades are: "+Arrays.toString(numList));

        }
    }


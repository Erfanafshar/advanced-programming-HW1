// add library
import java.util.Scanner;

// main class
public class NumberThree {
        public static void main(String[] args) {

            // get input
            Scanner input = new Scanner (System.in);
            String vorodi =input.nextLine();

            // Convert  input string to final string
            StringBuilder temp = new StringBuilder() ;
            char c = vorodi.charAt(0);
            char[] c_arr = vorodi.toCharArray();
            temp.insert(0,c_arr[0]);
            temp.insert(1,c_arr[1]);
            int res=Integer.parseInt(String.valueOf(temp));

            // build answer array
            int [] aedad ;
            aedad = new int[res];

            // assign numbers to array
            for(int i=0 ; i<res ; i++)
            {
                aedad[i]=i*(i+1)/2;
            }

            // print answer
            for(int i=0 ; i<res ; i++)
            {
                System.out.print(aedad[i]);
                System.out.print(',');
            }
        }
    }

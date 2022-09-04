/* Java Datatypes
Java has 8 Primitive Data Types; they are char, boolean, byte, short, int, long, float, and double.
In this problem we are only concerned about integer datatypes used to hold integer values (byte, short, int, long). Let's take a closer look at them:
byte data type is an 8-bit signed integer.
short data type is an 16-bit signed integer.
int data type is an 32-bit signed integer.
long data type is an 64-bit signed integer.
(Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html)
Given an integer number, you have to determine which of these datatypes you can use to store that number. 
If there are multiple suitable datatypes, list them all in the order above.


Input Format
The first line will contain an integer T, which denotes the number of inputs that will follow. 
Each of the next T lines will contain an integer n. The number can be arbitrarily large or small!


Output Format
For each n, list all the datatypes it can be fitted into ordered by the size of the datatype.

If it can't be fitted into any of these datatypes, 
print "n can't be fitted anywhere." 

Sample Input
-------------------------------------
5
-150
150000
1500000000
213333333333333333333333333333333333
-100000000000000
--------------------------------------

Sample Output
-------------------------------------------------------------
-150 can be fitted in:
* short
* int
* long
150000 can be fitted in:
* int
* long
1500000000 can be fitted in:
* int
* long
213333333333333333333333333333333333 can't be fitted anywhere.
-100000000000000 can be fitted in:
* long
--------------------------------------------------------------

*/

import java.util.*;
import java.io.*;
public class Datatype{
    public static void main(String []args)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");

                if(x>=-128 && x<=127)System.out.println("* byte");


                if(x>=-32768 && x<=32767)System.out.println("* short");


                if(x>=-2147483648 && x<= 2147483647)System.out.println("* int");


                if(x>=-9223372036854775808L && x<= 9223372036854775807L)System.out.println("* long");
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}

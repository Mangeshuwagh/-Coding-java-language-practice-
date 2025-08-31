/*Q2. WAP to print the following pattern?
	 
a
AB
abc
ABCD
abcde*/

public class Pattern{
	
	public static void main(String []args)

	{
		char start = 'a';

for(int i=0;i<5;i++)
{
	
	for(int j=0;j<=i;j++)
	{
		if(i%2==0)
		{
			System.out.print((char)(start+j));
		}
		else{
			System.out.print((char)(start+j-32));
			
			
		}
	}

System.out.print("\n");}	
		
		
		}

}
/*
public class PatternPrinter {
    public static void main(String[] args) {
        char start = 'a'; // Starting character

        for (int i = 0; i < 5; i++) { // 5 rows
            for (int j = 0; j <= i; j++) {
                if (i % 2 == 0) { // If row number is even
                    System.out.print((char)(start + j));
                } else { // If row number is odd
                    System.out.print((char)(start + j - 32)); // Convert to uppercase
                }
            }
            System.out.println(); // New line after each row
        }
    }
}
*/
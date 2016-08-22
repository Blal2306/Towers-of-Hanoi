package javaapplication2;

import javax.swing.JOptionPane;

public class JavaApplication2 
{
static int ctr=0;
    public static void main(String[] args) 
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog("ENTER THE NUMBER OF DISCS TO MOVE: "));
        // Call a recursive method to print out directions to solve the problem
        th(n, 'a', 'b', 'c');
    }
    public static void th(int n, char a, char b, char c)
    // a = Source "S", b = Work "W", c = Destination "D"
    {
	// check the base case
	if (n == 1)
        {
            ctr++;
            System.out.println("MOVE # " +ctr+ " : FROM " +a+ " TO " +c);
        }
	else 
	{
            // if not base case we have three steps to do 
		
            th(n-1, a, b, c); // first move the top n-1 disks to the work area
            th(1, a, c, b); // move the remaining one from source to destination
            th(n-1, b, a, c); //lastly move n-1 from work to final destination
	}
    }
    
}

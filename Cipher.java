
/**
 * Write a description of class Cipher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cipher
{
    // instance variables - replace the example below with your own
    private String input;
    private int shift;

    /**
     * Constructor for objects of class Cipher
     */
    public Cipher(String theInput, int theShift)
    {
        // initialise instance variables
        input = theInput;
        shift = theShift;
        for(int i=0; i<input.length(); i++)
        {
            int num = (int)(input.charAt(i));
            num = num + shift;
            char c = (char)(num);
            System.out.print(c);
        }
        
}}

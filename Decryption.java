
/**
 * Write a description of class Decryption here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Decryption
{
    // instance variables - replace the example below with your own
    private String decryptionInput;
    private int shift;

    /**
     * Constructor for objects of class Decryption
     */
    public Decryption(String theDecryptionInput, int theShift)
    {
        // initialise instance variables
        decryptionInput = theDecryptionInput;
        shift = theShift;
        for(int i=0; i<decryptionInput.length(); i++)
        {
            int num = (int)(decryptionInput.charAt(i));
            num = num - shift;
            char c = (char)(num);
            System.out.print(c);
        }
    }
}

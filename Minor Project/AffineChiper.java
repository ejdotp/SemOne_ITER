import java.util.Scanner;

class AffineChiper
{

    public static String encrypt(String plaintext, int mulkey, int addkey) 
    {
        char[] ptextArr = plaintext.toCharArray();
        int size = 26;
        for (int i = 0; i < ptextArr.length; i++)
        {
            if (Character.isLetter(ptextArr[i])) 
            {
                int newChar = (mulkey * (Character.toLowerCase(ptextArr[i]) - 'a') + addkey) % size;
                ptextArr[i] = (char) (newChar + 'a');
            }
        }
        return new String(ptextArr);
    }
   
    public static String decrypt(String ciphertext, int mulkey, int addkey) 
    {
        char[] ctextArr = ciphertext.toCharArray();
        int inverse = -1, size = 26;
        for (int i = 0; i < size; i++) 
        {
            if ((mulkey * i) % size == 1) 
            {
                inverse = i;
                break;
            }
        }
        for (int i = 0; i < ctextArr.length; i++) 
        {
            if (Character.isLetter(ctextArr[i])) 
            {
                int newChar = (inverse * ((Character.toLowerCase(ctextArr[i]) - 'a') - addkey + size)) % size;
                ctextArr[i] = (char) (newChar + 'a');
            }
        }
        return new String(ctextArr);
    }
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Text to be Encrypted(Avoid Spaces): ");
        String text = sc.nextLine();

        System.out.print("Enter multiplicative key: ");
        int mulkey = sc.nextInt();
        
        System.out.print("Enter additive key: ");
        int addkey = sc.nextInt();
       
        String ciphertext = encrypt(text, mulkey, addkey);
        System.out.println("Ciphertext: " + ciphertext);
       
        String decrypted = decrypt(ciphertext, mulkey, addkey);
        System.out.println("Decrypted message: " + decrypted);
    }
}

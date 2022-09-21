package cipher1;

class MonoalphabeticSubstitution2 extends Subtitution{
	
	public class MonoalphabeticCipher
	{
	    public char p[]  = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
	            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v',
	            'w', 'x', 'y', 'z' };
	    public char ch[] = { 'Q', 'W', 'E', 'R', 'T', 'Y', 'U', 'I', 'O',
	            'P', 'A', 'S', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'Z', 'X', 'C',
	            'V', 'B', 'N', 'M' };
	 
	    public  String encrypt(String s)
	    {
	        char c[] = new char[(s.length())];
	        for (int i = 0; i < s.length(); i++)
	        {
	            for (int j = 0; j < 26; j++)
	            {
	                if (p[j] == s.charAt(i))
	                {
	                    c[i] = ch[j];
	                    break;
	                }
	            }
	        }
	        return (new String(c));
	    }
	 
	    public  String decrypt(String s)
	    {
	        char p1[] = new char[(s.length())];
	        for (int i = 0; i < s.length(); i++)
	        {
	            for (int j = 0; j < 26; j++)
	            {
	                if (ch[j] == s.charAt(i))
	                {
	                    p1[i] = p[j];
	                    break;
	                }
	            }
	        }
	        return (new String(p1));
	    }
	}
    public static void main(String args[]){
    	String plain="my name is ayo";
        MonoalphabeticSubstitution2 monoalphabeticsubstitution=new MonoalphabeticSubstitution2();
    	String secret = monoalphabeticsubstitution.encrypt(plain);
    	String real =monoalphabeticsubstitution.decrypt(secret);
    	
    	System.out.println(" ********* monoalphabeticsubstitution Cipher Encryption *********");
    	System.out.println("PlainText: " + plain);  
    	System.out.println("Encrypted: " + secret);   
    	System.out.println("Decrypted: " + real); 
    	}
    }

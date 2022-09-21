package cipher1;


class Caesar2 extends MonoalphabeticSubstitution2{

    public static StringBuffer encrypt(String text, int shift) {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < text.length(); i++) {
            if (Character.isUpperCase(text.charAt(i))) {
                char ch = (char) (((int) text.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) text.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    // Decrypts cipher using shift
    public static StringBuffer decrypt(String cipher, int shift) {
        StringBuffer result = new StringBuffer();
 
        for (int i = 0; i < cipher.length(); i++) {
            if (Character.isUpperCase(cipher.charAt(i))) {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 65) % 26 + 65);
                result.append(ch);
            } else {
                char ch = (char) (((int) cipher.charAt(i) +
                        shift - 97) % 26 + 97);
                result.append(ch);
            }
        }
        return result;
    }
 
    public static void main(String[] args) {
    	String plain = "Secrattext";
        int shift = 1;
    	String secret = Caesar2.encrypt(plain,shift).toString();
    	System.out.println(" ********* Caesar Cipher Encryption *********");
    	System.out.println("PlainText: " + plain);             // Display the results   
    	System.out.println("Encrypted: " + secret);   
    	System.out.println("Decrypted: " + Caesar2.decrypt(secret, 26 - shift).toString());
    }
}
package cipher1;

class VigenereCipher2 extends Subtitution{
static String generateKey(String str, String key){
    int x = str.length();
  
    for (int i = 0; ; i++){
        if (x == i)
            i = 0;
        if (key.length() == str.length())
            break;
        key+=(key.charAt(i));
    }
    return key;
}


static String encript(String str, String key){
    String cipher_text="";
  
    for (int i = 0; i < str.length(); i++){
        int x = (str.charAt(i) + key.charAt(i)) %26;
        x += 'A';
  
        cipher_text+=(char)(x);
    }
    return cipher_text;
}
static String decript(String cipher_text, String key){
    String orig_text="";
  
    for (int i = 0 ; i < cipher_text.length() && i < key.length(); i++){
        int x = (cipher_text.charAt(i) - 
                    key.charAt(i) + 26) %26;
        x += 'A';
        orig_text+=(char)(x);
    }
    return orig_text;
}


public static void main(String[] args) {
    String plain = "THISISASECRATMESSAGE";
    String keyword = "CIPHERTEXT"; 
    String key = generateKey(plain, keyword);
    System.out.println(" ********* Vigenere Cipher Encryption *********");
    String cipher_text = encript(plain, key);
    System.out.println("PlainText: " + plain);  
    System.out.println("encript : " + cipher_text);
    System.out.println("Decrypted Text : "+ decript(cipher_text, key));
    }
}
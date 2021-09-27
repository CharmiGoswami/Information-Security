import java.util.Scanner;
 
public class CaesarCipher
 {
  public static void main(String args[]){
    String str_message, encrypted_Message = "", decrypted_Message = "";
    int key;
    char ch;
    Scanner scan = new Scanner(System.in);
    
    System.out.println("Enter a message:  ");
    str_message = scan.nextLine();
    
    System.out.println("Enter the key: ");
    key = scan.nextInt();
 
    for(int i = 0; i < str_message.length(); ++i){
      ch = str_message.charAt(i);
      
      if(ch >= 'a' && ch <= 'z'){
              ch = (char)(ch + key);
              
              if(ch > 'z'){
                  ch = (char)(ch - 'z' + 'a' - 1);
              }
              
              encrypted_Message += ch;
          }
          else if(ch >= 'A' && ch <= 'Z'){
              ch = (char)(ch + key);
              
              if(ch > 'Z'){
                  ch = (char)(ch - 'Z' + 'A' - 1);
              }
              
              encrypted_Message += ch;
          }
          else {
          	encrypted_Message += ch;
          }
    }
    
for(int i = 0; i < encrypted_Message.length(); ++i){
      ch = encrypted_Message.charAt(i);
      
      if(ch >= 'a' && ch <= 'z'){
              ch = (char)(ch - key);
              
              if(ch < 'a'){
                  ch = (char)(ch + 'z' - 'a' + 1);
              }
              
              decrypted_Message += ch;
          }
          else if(ch >= 'A' && ch <= 'Z'){
              ch = (char)(ch - key);
              
              if(ch < 'A'){
                  ch = (char)(ch + 'Z' - 'A' + 1);
              }
              
              decrypted_Message += ch;
          }
          else {
          	decrypted_Message += ch;
          }
    }


    System.out.println("Encrypted Message is : = " + encrypted_Message);
    System.out.println("Decrypted Message is : = " + decrypted_Message);
  }
}
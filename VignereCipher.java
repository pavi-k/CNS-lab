import java.util.Scanner;
public class VignereCipher{
	public static void main(String args[]){
		Scanner scan=new Scanner(System.in);
		

		
		System.out.println("Enter the message");
		String message=scan.nextLine();

		System.out.println("Enter the key");
		String secret=scan.nextLine();

		char msg[] = message.toCharArray();
		char key[] = secret.toCharArray();
		int msgLen = msg.length, i, j;

		
		
		char newKey[] = new char[msgLen];
		char encryptedMsg[] = new char[msgLen];
		char decryptedMsg[] = new char[msgLen];
		
		//generate new key in cyclic manner equal to the length of original message
		for(i = 0, j = 0; i < msgLen; ++i, ++j){
			if(j == key.length)
				j = 0;
			
			newKey[i] = key[j];
		}

		int c=0;
		while(c!=3)
		{
			System.out.println("1.Encryption\n2.Decryption\n3.Exit\nEnter choice:");
			c=scan.nextInt();
			if(c==1)
			{
			//encryption
			for(i = 0; i < msgLen; ++i)
				encryptedMsg[i] = (char)(((msg[i]-'a' + newKey[i]-'a') % 26) + 'a');
			System.out.println("Encrypted String: "+String.valueOf(encryptedMsg));
			}
			else if(c==2)
			{
			//decryption
			for(i = 0; i < msgLen; ++i)
				decryptedMsg[i] = (char)((((encryptedMsg[i]-'a' - (newKey[i]-'a')) + 26) % 26) + 'a');
			System.out.println("Decrypted String: "+String.valueOf(decryptedMsg));
		

			}
			else
			{
				break;
			}
		
		

		}
		
	
		
		
		
	}
}
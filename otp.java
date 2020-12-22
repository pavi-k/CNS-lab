import java.util.*;
class otp
{
	public static void main(String[] args)
	{
	int choice;
	do
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the choice 1)Encrypt 2)Decrypt 3)Exit:");
		choice=sc.nextInt();
		switch(choice)
		{
			case 1:
			{
				encryption();
				break;
			}
			case 2:
			{
				decryption();
				break;
			}
		}
	}while(choice!=3);
	}
	static void encryption()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the plain Text");
	String text=scan.nextLine();
	char[] stringToCharArray = text.toCharArray();
	int i;
	String output="";
	for(i=0;i<text.length();i++)
	{
		int value=(int)stringToCharArray[i];
		String binary=Integer.toBinaryString(value);
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the key for letter "+ (i+1));
		//int bin1=sc.nextInt();
		String binarykey=sc.nextLine();
		StringBuffer sb=new StringBuffer();
        for (int j = 0; j < binary.length(); j++) {
            sb.append(binarykey.charAt(j)^binary.charAt(j));
        }
		output+=sb;
		output+=" ";
	}
	System.out.println("Cipher Text is "+output);
	}
	static void decryption()
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the cipher Text length");
	int textlen=scan.nextInt();
	//char[] stringToCharArray = text.toCharArray();
	int i;
	String output="";
	for(i=0;i<textlen;i++)
	{
		System.out.println("Enter the cipher Text for letter "+ (i+1));
		//int value=(int)stringToCharArray[i];
		//String binary=Integer.toBinaryString(value);
		Scanner sc=new Scanner(System.in);
		String binary=sc.nextLine();
		System.out.println("Enter the key for letter "+ (i+1));
		//int bin1=sc.nextInt();
		String binarykey=sc.nextLine();
		StringBuffer sb=new StringBuffer();
        
        for (int j = 0; j < binary.length(); j++) {
            
            sb.append(binarykey.charAt(j)^binary.charAt(j));
            
        }
        String check="";
        check+=sb;
        int value=Integer.parseInt(check,2);
		output+=(char)value;
	}
	System.out.println("plain Text is "+output);
	}
}

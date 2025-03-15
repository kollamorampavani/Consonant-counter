package strings;

import java.util.Scanner;

public class No_of_consonants {
	public static int consonants(String s) {
    	int vc=0,cc=0; //vc is vowel character,cc is consonant character
    	for(int i=0;i<s.length();i++) {
    		char ch=s.charAt(i);
    		if((ch>='A' && ch<='Z')||(ch>='a' && ch<='z')){
    		if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'
    				||ch=='E'||ch=='I'||ch=='O'||ch=='U'))
    		{
    			cc++;
    		}
    		else {
    			vc++;
    		}
    		}
    	}
    	return cc;  //if we want count of vowels return vc
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
	     System.out.println("enter string");
	     String s=scan.next();
	     int res=consonants(s);
	     System.out.println(res);
	}

}

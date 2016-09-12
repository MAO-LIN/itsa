import java.util.Scanner;
public class Itsa46_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		String a =scn.nextLine();
		int sum=0;
		String[] val=a.split("");
		for(int i=1;i<=a.length();i++){
			if((int)val[i-1].charAt(0)>=97&&(int)val[i-1].charAt(0)<=122){sum=sum+1;}
			else{sum=0;}
			if(sum==3){
				val[i-3]="C";
				val[i-2]="C";
				val[i-1]="P";
				sum=0;}
			}
		for(int i=1;i<=a.length();i++)
		{
			System.out.print(val[i-1]);
		}
			System.out.println("");
	}

}

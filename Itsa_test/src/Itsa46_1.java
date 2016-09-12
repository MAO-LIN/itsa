import java.util.Scanner;
import java.util.ArrayList;
public class Itsa46_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		ArrayList <Integer> rub =new ArrayList<Integer>();
		rub.add(3);
		for(int i=1;i<=a;i++){
			for(int j=0;j<rub.size();j++){
				rub.set(j,rub.get(j)-1);
			if(rub.get(j)==0){rub.add(3);rub.set(j,1);}
			}

		}
			System.out.println(rub.size());
	}

}

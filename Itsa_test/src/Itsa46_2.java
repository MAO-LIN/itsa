import java.util.*;
public class Itsa46_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int a =scn.nextInt();
		int data[]=new int[4];
		String an[]=new String[a];
//		boolean flag=false;
		for(int j=1;j<=a;j++)
		{
			for(int i=1;i<=4;i++)
			{
				data[i-1]=scn.nextInt();
			}
			if(data[0]==data[1]&&data[0]==data[2]&&data[0]==data[3]){
				an[j-1]="WIN";
			}else if(
					data[0]==data[1]&&data[0]==data[2]||
					data[1]==data[2]&&data[1]==data[3]||
					data[0]==data[2]&&data[0]==data[3]||
					data[0]==data[1]&&data[0]==data[3]
					){an[j-1]="R";
			}else if(
					data[0]!=data[1]&data[0]!=data[2]&data[0]!=data[3]&
					data[1]!=data[2]&data[1]!=data[3]
					){
				an[j-1]="R";
			}else{
				if(data[0]==data[1]){
					if(data[2]==data[3]){
						if(data[1]>data[2]){an[j-1]=Integer.toString(data[1]*2);}
					  else{an[j-1]=Integer.toString(data[0]*2);}
					}else{
						an[j-1]=Integer.toString(data[2]+data[3]);
					}
				}
				else if(data[0]==data[2]){
					if(data[1]==data[3]){
						if(data[0]>data[1]){an[j-1]=Integer.toString(data[0]*2);}
					  else{an[j-1]=Integer.toString(data[1]*2);}
					}else{
						an[j-1]=Integer.toString(data[1]+data[3]);
					}
				}
				else if(data[0]==data[3]){
					if(data[1]==data[2]){
						if(data[0]>data[1]){an[j-1]=Integer.toString(data[0]*2);}
					  else{an[j-1]=Integer.toString(data[1]*2);}
					}else{
						an[j-1]=Integer.toString(data[1]+data[2]);
					}
				}
				else if(data[1]==data[2]){
					if(data[0]==data[3]){
						if(data[1]>data[0]){an[j-1]=Integer.toString(data[1]*2);}
					  else{an[j-1]=Integer.toString(data[0]*2);}
					}else{
						an[j-1]=Integer.toString(data[0]+data[3]);
					}
				}
				else if(data[1]==data[3]){
					if(data[0]==data[2]){
						if(data[1]>data[0]){an[j-1]=Integer.toString(data[1]*2);}
					  else{an[j-1]=Integer.toString(data[0]*2);}
					}else{
						an[j-1]=Integer.toString(data[0]+data[2]);
					}
				}
				else if(data[2]==data[3]){
					if(data[0]==data[1]){
						if(data[2]>data[0]){an[j-1]=Integer.toString(data[2]*2);}
					  else{an[j-1]=Integer.toString(data[0]*2);}
					}else{
						an[j-1]=Integer.toString(data[2]+data[1]);
					}
				}
			}
//				if(data[0]==data[2]){an[j-1]=Integer.toString(data[1]+data[3]);}
//				if(data[0]==data[3]){an[j-1]=Integer.toString(data[1]+data[2]);}
//				if(data[1]==data[2]){an[j-1]=Integer.toString(data[0]+data[3]);}
//				if(data[1]==data[3]){an[j-1]=Integer.toString(data[0]+data[2]);}
//				if(data[2]==data[3]){an[j-1]=Integer.toString(data[0]+data[1]);}			
		}
		for(int i=1;i<=a;i++){
			System.out.println(an[i-1]);
		}
	}

}

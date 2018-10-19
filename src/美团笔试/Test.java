package √¿Õ≈±  ‘;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<Integer> list=new ArrayList<Integer>();
        String s="";
        int N=0;
        while (in.hasNext()) {
            s=in.nextLine();
            String[] str1=s.split(",");  
            String[] str=str1[0].split(" ");  
            int[] a=new int[str.length];
            N=Integer.parseInt(str1[1]);
            for(int i=0;i<str.length;i++){
            	
                a[i]=Integer.parseInt(str[i]);
            }
            Random ran=new Random();
            
            if (ran.nextInt(10)>5) {
            	System.out.println("True");
			}else{
				System.out.println("False");
			}
            
        }
       
	}

}

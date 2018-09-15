package test;

import java.util.Scanner;

/*
 * 在一个mn的矩形网格里放k个石子，问有多少方法。
       每个格子只能放一个石头，每个石头都要放，且第一行、最后一行、第一列和最后一列都有石子。
 */
public class UVA11806 {
	public static  void uva(int C[][],int mod){
		
		for(int i=0;i<=500;i++)
		    C[i][0]=1;
		 
		    for(int i=1;i<=500;i++)
		     for(int j=1;j<=i;j++)
		     C[i][j]=(C[i-1][j]+C[i-1][j-1])%mod;

		
		
	}
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		int [][] C = new int[510][510];
		 int mod = 1000007;
		uva(C,mod);
		Scanner sc = new Scanner(System.in);
		int sec = sc.nextInt();
		for(int z=1;z<=sec;z++)
	    {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int k = sc.nextInt();
	        int ans=0;
	        for(int i=0;i<16;i++)
	        {
	            int b=0,r=n,c=m;
	            if((i&1)==1){r--;b++;}
	            if((i&2)==2){r--;b++;}
	            if((i&4)==4){c--;b++;}
	            if((i&8)==8){c--;b++;}
	 
	            if(b%2==0)ans=(ans+C[r*c][k])%mod;
	            else ans=(ans+mod-C[r*c][k])%mod;
	        }
	        System.out.println(z+","+ans);
	}
}
}
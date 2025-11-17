import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),t=0;
        int[] a=new int[n];

        for(int i=0;i<n;i++){a[i]=sc.nextInt();t+=a[i];}

        int l=0,idx=-1,d=Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            l+=a[i];t-=a[i];
            if(d>Math.abs(t-l)){idx=i;d=Math.abs(t-l);}
        }
        System.out.println(idx);
    }
}

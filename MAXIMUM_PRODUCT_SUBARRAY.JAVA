import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++) a[i]=sc.nextInt();

        int maxp=a[0],minp=a[0],ans=a[0];

        for(int i=1;i<n;i++){
            if(a[i]<0){
                int t=maxp; maxp=minp; minp=t;
            }
            maxp=Math.max(maxp*a[i],a[i]);
            minp=Math.min(minp*a[i],a[i]);
            ans=Math.max(ans,maxp);
        }
        System.out.println(ans);
    }
}

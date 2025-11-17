import java.util.*;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int k=sc.nextInt();
        for(int i=0;i<s.length();i++){
            int sum=0;
            for(int j=i;j<s.length();j++){
                sum+=s.charAt(j)-'a'+1;
                if(sum>=k)System.out.println(s.substring(i,j+1));
            }
        }
        sc.close();
    }
}

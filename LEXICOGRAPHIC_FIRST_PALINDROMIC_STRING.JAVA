import java.util.*;
class Main {
    static List<String> lst=new ArrayList<>();
    public static void create(String s,String ans){
        if(s.length()==0){
            lst.add(ans);
            return;
        }
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            String right=s.substring(i+1);
            String left=s.substring(0,i);
            String res=left+right;
            create(res,ans+c);
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        create(s,"");
        Collections.sort(lst);
        for(int i=0;i<lst.size();i++){
            if(palin(lst.get(i))){
                System.out.println(lst.get(i));
                break;
            }
        }
    }
    public static boolean palin(String s){
        int l=0;int r=s.length()-1;
        while(l<r){
            if(s.charAt(l)!=s.charAt(r))return false;
            l++;r--;
        }
        return true;
    }
}
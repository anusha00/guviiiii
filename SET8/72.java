import java.util.*;
class vowel
{
    public static void main(String hj[])
    {
        Scanner sc=new Scanner(System.in);
        String a=in.next();
        int c=1;
        for(int i=a.length()-1;i>=0;i--)
        {
           if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u')
           c++;
        }
        if(c!=2)
            System.out.println("yes");
            else
            System.out.println("no");
}
}

import java.util.*;
class Starprogram
{
    public static void main(String hj[])
    {
        Scanner sc=new Scanner(System.in);
        String a=in.next();
        int n=a.length();
        if(n%2==0)
        {
            for(int i=0;i<n;i++)
            {
                if(i==n/2 || i==(n/2)-1)
                System.out.println("*");
                else
                System.out.println(a.charAt(i));
            }
        }
        else
        {
        for(int i=0;i<n;i++)
            {
                if(i==n/2)
                System.out.println("*");
                else
                System.out.println(a.charAt(i));
            }
        }
}
}

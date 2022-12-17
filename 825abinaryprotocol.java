import java.util.Scanner;
 
public class 825abinaryprotocol {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
    int k=0;
    String s1="";
    int n = sc.nextInt();
    String s=sc.next();
    for(int i=0;i<n;i++)
    {
        if(s.charAt(i)=='1')
            k++;
        else
        {
            s1+=k; 
            k=0;
        }
    }
    s1+=k;
    System.out.println(s1);
}
}

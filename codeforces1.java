import java.util.Scanner;

public class codeforces1{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int array[] = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] =sc.nextInt();
            if(array[i]==1){ array[i]=2;
        }
        else if(array[i]==2){
            array[i]=1;
        }
        else if(array[i]%3==0) array[i]=(array[i]/3);
        else array[i] =((array[i]/3+1));
        }
        sc.close();

        for (int i = 0; i < n; i++){
            System.out.println(array[i]);
        }
    }
}
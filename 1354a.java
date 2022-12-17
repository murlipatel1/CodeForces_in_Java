import java.util.Scanner;
 
public class alarmclock {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        while (tc-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d = sc.nextLong();
 
            int flag = 1;
            long sleepTime = 0;
            if (b >= a) {
                sleepTime = b;
            } else {
                long diff = a - b;
                if (c > d) {
                    long div = c - d;
                    long times = diff / div;
 
                    if (diff % div != 0) {
                        times++;
                    }
                    sleepTime = b+ (times * c);
                } else {
                    flag = 0;
                }
            }
            if (flag == 1) {
                System.out.println(sleepTime);
            } else {
                System.out.println(-1);
            }
        }
    }
}

import java.util.*;
public class T2_min_conv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the no. of minutes : ");
        long minutes = sc.nextLong();

        int years = (int)(minutes / (365*24*60));
        int days = (int)((minutes % (365*24*60) / (24*60)));
        System.out.println(minutes + " minutes = " + years + " years and approx." + days + " days");
    }
}

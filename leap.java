import java.util.*;
public static void main (String[] args){
public class leap{
    Scanner scn=new Scanner(System.in);
    int year=scn.nextInt();

    if(year%4==0 , year%400==0 , year%100==0){
        System.out.println("year is leap year");
    }
    else{
        System.out.println("not a leap year");
    }

}
}
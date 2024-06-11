import java.util.*;
public class Modulus{
  public static int modulus(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int modulo = a % b;
    System.out.println(modulo);
    return 0;
  }
}
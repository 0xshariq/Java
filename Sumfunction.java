import java.util.*;
public class Sumfunction{
  public static int sum(int a, int b) {
    int add = a + b;
    return add;
  }
  public static int main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int add = sum(a,b);
    System.out.println(add);
    return 0;
  }
}
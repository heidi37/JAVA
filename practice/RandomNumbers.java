package practice;
public class RandomNumbers {
  public static void main(String[] args) {
    int N = Integer.parseInt(args[0]);
    double r = Math.random();
    int t = (int) (r * N) + 1;
    System.out.println(r);
    System.out.println(N);
    System.out.println("answer " + t);
  }
}

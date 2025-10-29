package practice;
public class ThreeSort {
  public static void main(String[] args) {
    int min = Math.min(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    min = Math.min(min, Integer.parseInt(args[2]));
    int max = Math.max(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    max = Math.max(max, Integer.parseInt(args[2]));
    int notMaxOrMin = (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])) - (min + max);
    System.out.println(min + " " + notMaxOrMin + " " + max);
  }
}
public class RightTriangle {
  public static void main(String[] args) {
    int min = Math.min(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    min = Math.min(min, Integer.parseInt(args[2]));
    int max = Math.max(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
    max = Math.max(max, Integer.parseInt(args[2]));
    int mid = (Integer.parseInt(args[0]) + Integer.parseInt(args[1]) + Integer.parseInt(args[2])) - (min + max);
    boolean arePositive = min > 0 && mid > 0 && max > 0;
    boolean isRightTriangle = (min * min) + (mid * mid) == (max * max);
    System.out.println(isRightTriangle && arePositive);
  }
}

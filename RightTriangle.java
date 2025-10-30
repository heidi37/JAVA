public class RightTriangle {
  public static void main(String[] args) {
    int num1 = Integer.parseInt(args[0]);
    int num2 = Integer.parseInt(args[1]);
    int num3 = Integer.parseInt(args[2]);
    int min = Math.min(num1, num2);
    min = Math.min(min, num3);
    int max = Math.max(num1, num2);
    max = Math.max(max, num3);
    int mid = (num1 + num2 + num3) - (min + max);
    boolean arePositive = min > 0 && mid > 0 && max > 0;
    boolean isRightTriangle = (min * min) + (mid * mid) == (max * max);
    System.out.println(isRightTriangle && arePositive);
  }
}

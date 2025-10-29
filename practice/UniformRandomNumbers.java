package practice;
public class UniformRandomNumbers {
  public static void main(String[] args){
    double r1 = Math.random();
    double r2 = Math.random();
    double r3 = Math.random();
    double r4 = Math.random();
    double r5 = Math.random();
    double avg = (r1 + r2 + r3 + r4 + r5) / 5;
    double min = Math.min(r1, r2);
    min = Math.min(min, r3);
    min = Math.min(min, r4);
    min = Math.min(min, r5);
    double max = Math.min(r1, r2);
    max = Math.max(max, r3);
    max = Math.max(max, r4);
    max = Math.max(max, r5);
    System.out.println("value 1: " + r1);
    System.out.println("value 1: " + r2);
    System.out.println("value 1: " + r3);
    System.out.println("value 1: " + r4);
    System.out.println("value 1: " + r5);
    System.out.println("average value: " + avg );
    System.out.println("minimum value: " + min);
    System.out.println("maximum value: " + max);
  }
}

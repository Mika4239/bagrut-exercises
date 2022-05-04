package bagtut_ex.bagrut2020.Ex2;

import java.util.Scanner;

public class Main {

  public static Scanner reader = new Scanner(System.in);

  public static void main(String[] args) {
    AllWeights allWeights;
    Weight[] weights;
    Weight weight1, weight2, weight3, weight4;

    weight1 = new Weight();
    weight2 = new Weight(2, 43);
    weight3 = new Weight(4321);
    weight4 = new Weight(1, 325);

    weight1.add(weight2);
    System.out.println(
      "new weight 1: kilo - " +
      weight1.getKilo() +
      ", gram - " +
      weight1.getGram()
    );

    System.out.println("weight is less than other: " + weight3.less(weight4));

    System.out.println("Enter the array length: ");
    weights = new Weight[reader.nextInt()];
    for (int i = 0; i < weights.length; i++) {
      System.out.println("\nEnter kilo and gram for weight " + i + ": ");
      weights[i] = new Weight(reader.nextInt(), reader.nextInt());
    }

    allWeights = new AllWeights(weights);
    Weight weight = allWeights.sum();
    System.out.println(
      "Weight sum: kilo - " + weight.getKilo() + ", gram - " + weight.getGram()
    );
  }
}

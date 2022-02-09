import java.util.*;

public class InMemory {

  public static void main(String [] args) {
    if ("io".equals(args[0])) {
      for (int i = 1; i < args.length; i++) {
        long t1 = System.currentTimeMillis();
        sortExperiment(args[i]);
        long t2 = System.currentTimeMillis();
        System.out.println((t2-t1));
      }
    } else {
      for (int i = 1; i < args.length; i++) {
        int size = Integer.parseInt(args[i]);
        sortExperiment(size);
      }
    }

  }

  private static void sortExperiment(String path) {
  }

  private static void sortExperiment(int size) {
    List<Integer> toSort = new ArrayList<>(size);
    Random random = new Random(0);
    for (int i = 0; i< size; i++) {
      toSort.add(random.nextInt());
    }
    long t1 = System.currentTimeMillis();
    sortExperiment(toSort);
    long t2 = System.currentTimeMillis();
    System.out.println((t2-t1));
  }

  private static void sortExperiment(List<Integer> numbers) {
    Collections.sort(numbers);
  }
}

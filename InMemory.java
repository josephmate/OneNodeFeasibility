import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class InMemory {

  public static void main(String [] args) throws Exception {
    int size = Integer.parseInt(args[1]);
    if ("io".equals(args[0])) {
      long t1 = System.currentTimeMillis();
      sortExperiment(size, args[2]);
      long t2 = System.currentTimeMillis();
      System.out.println((t2-t1));
    } else {
      sortExperiment(size);
    }

  }

  private static void sortExperiment(int size, String path) throws Exception {
    List<Long> values = new ArrayList<>(size);
    try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
      int lineCount = 0;
      String line;
      while (lineCount < size && (line = reader.readLine()) != null) {
        values.add(Long.parseLong(line));
      }
      if (lineCount < size) {
        throw new IllegalArgumentException(path + " did not contain " + size + " lines. only had " + lineCount);
      }
    }
    sortExperiment(values);
  }

  private static void sortExperiment(int size) {
    List<Long> toSort = new ArrayList<>(size);
    Random random = new Random(0);
    for (int i = 0; i< size; i++) {
      toSort.add(random.nextLong());
    }
    long t1 = System.currentTimeMillis();
    sortExperiment(toSort);
    long t2 = System.currentTimeMillis();
    System.out.println((t2-t1));
  }

  private static void sortExperiment(List<Long> numbers) {
    Collections.sort(numbers);
  }
}

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.Random;

public class GenerateRandom {
  public static void main(String[] args) throws Exception {
    final long size = Long.parseLong(args[0]);

    final long seed;
    if (args.length > 1) {
      seed = Long.parseLong(args[1]);
    } else {
      seed = 0;
    }

    final Random random = new Random(seed);
    try (BufferedWriter writer = new BufferedWriter(new FileWriter("to_sort_" + size + ".txt"))) {
      for (long i = 0; i < size; i++) {
        writer.write(String.valueOf(random.nextLong()));
        writer.write("\n");
      }
    }
  }
}

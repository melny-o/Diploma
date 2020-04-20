import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Reader {

    public int[][] readFromFile(File file) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
            int[][] matrix = null;
            String line;
            int size = 0;
            int row = 0;
            while ((line = br.readLine()) != null) {
                String[] val = line.trim().split("   ");
                if (matrix == null) {
                    size = val.length;
                    matrix = new int[size][size];
                }
                for (int col = 0; col < size; col++) {
                    matrix[row][col] = Integer.parseInt(val[col]);
                }
                row++;
            }
            return matrix;
    }

}

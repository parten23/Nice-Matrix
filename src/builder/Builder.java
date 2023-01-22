package builder;

import java.util.Arrays;
  /**
   * @author parten23
   * <br>
  * The class {@code Builder} includes methods to build a matrix.
   * <br>
  * The {@code matrixBuilder} method builds a matrix from rows and columns
  * supplied to it as arguments.
   * <br>
  * The {@code format} method from {@link FormatFactory} class formats the whole matrix.
  */
public final class Builder {

    private static final FormatFactory formatFactory = new FormatFactory();

    private Builder() {
    }

    public static void matrixBuilder(int rows, int columns){
        String[][] matrix = new String[rows][columns];
        int number = 1 ;
        int max = rows * columns;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                switch (Integer.toString(max).length()) {
                    case (1) -> {
                        matrix[i][j] = Integer.toString(number);
                        number++;
                    }
                    case (2) -> {
                        if (number < 10) {
                            matrix[i][j] = "  " + number;
                        } else {
                            matrix[i][j] = " " + number;
                        }
                        number++;
                    }
                    case (3) -> {
                        if (number < 10) {
                            matrix[i][j] = "   " + number;
                        } else if (number < 100) {
                            matrix[i][j] = "  " + number;
                        } else {
                            matrix[i][j] = " " + number;
                        }
                        number++;
                    }
                    case (4) -> {
                        if (number < 10) {
                            matrix[i][j] = "   " + number;
                        } else if (number < 100) {
                            matrix[i][j] = "  " + number;
                        } else if (number < 1000) {
                            matrix[i][j] = " " + number;
                        } else {
                            matrix[i][j] = "" + number;
                        }
                        number++;
                    }
                }
            }
        }
        formatFactory.format(matrix);
    }

    public static void oldRepresentation(int rows, int columns){
        String[][] matrix = new String[rows][columns];
        int number = 1;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = Integer.toString(number);
                number++;
            }
        }
        System.out.println(Arrays.deepToString(matrix));
    }

}

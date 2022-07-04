import java.util.Scanner;

import static builder.Builder.matrixBuilder;
import static builder.Builder.oldRepresentation;

/**
 * @author 10gun
 */
public class Main {
    public static void main(String[] args) {
        System.out.print("|\\\t| |  /=== |===\t  |\\\t/|\t/\\\t=====|==\\ o \\ /\n| \\\t| | |\t  |=== -- |\t\\  / | /==\\\t  |\t |==/ |\t |\n|  \\| |  \\=== |===\t  |\t \\/\t |/\t   \\  |\t |\t\\ | / \\\n");
        System.out.println("V alpha\t\t\t\t\t\t\t\t\t   By 10gun");
        System.out.println("A comprehensible representation of matrices (2D arrays) in Java.\nTry yourself...");
        System.out.println();
        System.out.println("Enter number of rows for the matrix");
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns for the matrix");
        Scanner scanner2 = new Scanner(System.in);
        int columns = scanner2.nextInt();
        System.out.println("Not This");
        oldRepresentation(rows, columns);
        System.out.println();
        System.out.println("But This...");
        matrixBuilder(rows, columns);
        System.out.println("\n\t  WALLAH!");
    }
}

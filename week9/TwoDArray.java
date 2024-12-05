package week9;

public class TwoDArray {
    public static void main(String[] args) {
        // 2D Arrays
        // A 2D array is an array of arrays
        // It is a matrix of rows and columns
        System.out.println("2D Arrays");
        // {1, 2, 3} is an array
        // {{1, 2, 3}, {4, 5, 6}} is a 2D array
        // {1, 2, 3}
        // {4, 5, 6}
        // 2D arrays are useful for representing tables of data
        // Lots of use cases for Matrices

        // How do we create a two dimensional array?
        int[][] matrix = new int[3][3];
        // matrix is a 3x3 2d array
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        // {{0, 0, 0}, {0, 0, 0}, {0, 0, 0}}

        // The first set of brackets it the row
        // The second set of brackets is the column
        // row x column

        // How do we access elements in a 2D array?
        // Accessing the first element in the first row
        // matrix[row][column]
        System.out.println(matrix[0][0]); // 0
        // Overwrite the first element in the first row
        matrix[0][0] = 1;
        System.out.println(matrix[0][0]); // 1
        // {1, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        matrix[0][1] = 2;
        // {1, 2, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        matrix[2][2] = 9;
        // {1, 2, 0}
        // {0, 0, 0}
        // {0, 0, 9}
        
        System.out.println(matrix.length); // this will get the number of rows
        System.out.println(matrix[0].length); // this will get the number of columns

        // How do we loop through a 2D array?
        // Nested for loop
        for (int i = 0; i < matrix.length; i++) { // rows
            for (int j = 0; j < matrix[i].length; j++) { // columns
                System.out.println("Row: " + i + " Column: " + j + " Value: " + matrix[i][j]);
            }
            System.out.println();
        }

        // How do we print the elements in a two dimensional array using a for each loop?
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        // Lets show an example with Clothing and get the total counts of the clothes for each brand
        int BRANDS = 7;
        int TYPES = 3;
        // ROW X COLUMN
        // All values are init with 0 by default
        // Note: If an Array is a String Array, all values are init with null
        int[][] sales = new int[BRANDS][TYPES];
        // 7 X 3
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}
        // {0, 0, 0}

        String[] brands = {"Nike", "Adidas", "Puma", "Reebok", "Under Armour", "New Balance", "Fila"};

        // Lets say we have the following stock
        // Shirt Pants Jackets
        int[][] counts = {
            {10, 20, 30}, // Nike Sold 10 Shirts, 20 Pants, 30 Jackets
            {15, 25, 35},
            {20, 30, 40},
            {25, 35, 45},
            {30, 40, 50},
            {35, 45, 55},
            {40, 50, 60}
        };
        System.out.println("==================");
        // To access all the elements of the 2D array you use a nested for loop
        for (int i = 0; i < counts.length; i++){ // Rows
            for (int j = 0; j < counts[i].length; j++){ // Columns
                // process the jth element in the ith row
                // System.out.println("row: " + i + " column: " + j + " value: " + counts[i][j]);
                System.out.printf("%8d", counts[i][j]);
                /*
                 * printf is a method that allows you to format a string
                 * %8d means print an integer with a width of 8 (8 spaces)
                 * %8s means print a string with a width of 8
                 */
            }
            System.out.println();
        }
        System.out.println("===================");
        // Lets try to print the brands and the number of shirts they have
        for (int i = 0; i < counts.length; i++){
            System.out.printf("%-15s", brands[i]); // -15 means left align with a width of 15
            System.out.printf("%8d", counts[i][0]);
            System.out.println();
        }

        // Lets print a pretty grid output
        System.out.println("=========================================================");
        System.out.println("\t  Brand\t   Shirts\tPants\tJackets\t  Total");
        System.out.println("=========================================================");
        // Create a nested for loop to print the brands and the number of shirts they have
        for (int i = 0; i < BRANDS; i++){
            System.out.printf("%15s", brands[i]); // 20 means left align with a width of 15
            // the s in printf is the placeholder for the string
            // d is the placeholder for the integer
            int total = 0;
            for (int j = 0; j < TYPES; j++){
                System.out.printf("%10d", counts[i][j]);
                total += counts[i][j];
            }
            System.out.printf("%10d", total);
            System.out.println();
        }

    }
}

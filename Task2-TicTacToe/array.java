public class array {
    
    public static void main(String[] args){

        // 2D ARRAY INITIALIZATION
        char[][] charArray = new char[3][3];
        //System.out.println("Default Init: " + charArray[0];

        /*
         * 
                                [~][0]
        row0 - array0 - [0][~]    . . .
        row1 - array1 - [1][~]    . . .
        row2 - array2 - [2][~]    . . .

         * 
         */


        // SET DEFAULT VALUES OF 2D ARRAY
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                charArray[i][j] = 'X';
            }
        }

        // PRINT OUT THE VALUES OF THE 2D ARRAY
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(charArray[i][j]);
            }
            System.out.println(); // new line
        }

    }

}

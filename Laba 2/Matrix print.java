public class MatrixPrint {
	public static void main(String args[]){

        int[][] array = {
        		{0, 2, 3, 4, 0},
        		{6, 0, 8, 0, 10},
        		{11, 12 ,0, 14, 15},
        		{16, 0, 18, 0, 20},
        		{0, 22, 23, 24, 0}
        };
        
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 5; j++){
                if(array[i][j] == 0) {
                	System.out.print(" *" + " ");
                }
                else if(i == 0 || i == 1 && j != 4) {
                	System.out.print(" " + array[i][j] + " ");
                }
                else {
                	System.out.print(array[i][j] + " ");
                }
            }
            System.out.println();
        }
	}
}
package task4;

import java.util.concurrent.ExecutionException;

public class main {
    public static void main(String[] args) {
    String[][] matrix = {{},{},{}};
    try {
        System.out.println(sumMatrix(matrix));
    } catch (MyArraySizeException e) {
        System.out.println(e.getMessage());
        
    } catch(MyArrayDataException e){
        System.out.println(e.getMessage());
    }
    
}
    public static int sumMatrix(String[][] matrix) throws MyArrayDataException, MyArraySizeException{
        
        if (matrix[0].length != 4 || 4 != matrix.length) {
            throw new MyArraySizeException();
        }
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    int number = Integer.parseInt(matrix[i][j]);
                    sum += number;
                } catch (MyArrayDataException e) {
                    throw new MyArrayDataException("Неверные данные в ячейке [" + i + "][" + j + "]" );
                }
            }
                
        }
        return sum;
    }
}

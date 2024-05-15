package task4;

public class MyArraySizeException extends Exception {
    public MyArraySizeException(){
        super("Массив выходит за пределы размеров 4x4");
    }
    
}

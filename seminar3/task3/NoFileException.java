import java.io.FileNotFoundException;

public class NoFileException extends FileNotFoundException{
    public NoFileException(){
        super("Файл не найден");
    }
}

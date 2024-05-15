package seminar3;

import java.io.IOException;

public class Chetchik implements AutoCloseable{
    private  int chetchik;
    private boolean close = false;
    public void add() throws IOException{
        if (close) {
            throw new IOException();
        }
        chetchik++;
    }
    public String toString(){
        return String.valueOf(chetchik);
    }
    @Override
    public void close() throws Exception {
        close = true;
    }
}

package seminar3;

public class mainCh {
public static void main(String[] args) throws Exception {
    try(Chetchik chetchik = new Chetchik()){
        chetchik.add();
        System.out.println(chetchik);
    }
    
}
}

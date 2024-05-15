package seminar3;

public class task2 {
    public static void main(String[] args) {
        try {
            doSomething();
        } catch (IllegalArgumentException e) {
            System.out.println("gjzdbkfcm jib,rf");
        }
    }
    public static void doSomething() throws IllegalArgumentException{
        throw new IllegalArgumentException();
    }
}

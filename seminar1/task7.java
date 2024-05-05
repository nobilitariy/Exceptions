public class task7 {
    public static void main(String[] args) {
        int[] mass1 = {1,2,3,4};
        int[] mass2 = {1,1,1,1,1};
        for (int i : resMass(mass1, mass2)) {
            System.out.println(i);
        }
    }
    public static int[] resMass(int[] mass1, int[] mass2) throws RuntimeException{
        if (mass1.length != mass2.length) {
            throw new RuntimeException("Массивы не равны по длинне");
        }
        int[] resMass = new int[mass1.length];
        for (int i = 0; i < mass2.length; i++) {
            int sum = mass1[i] + mass2[i];
            resMass[i] = sum;
        }
        return resMass;
    }
}

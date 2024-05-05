public class task4 {
    public static void main(String[] args) {
        int[][] mass = {{0,3,0},{1,0,0,7},{1,1,1}};
        System.out.println(sumArr(mass));
    }

    public static int sumArr(int[][] mass){
        int length = mass.length;
        for (int[] is : mass) {
            if (length != is.length) {
               throw new RuntimeException(resultExeption(-1)); 
            }
        }
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] != 0  && mass[i][j] != 1) {
                    throw new RuntimeException(resultExeption(-2));
                }
                count += mass[i][j];
            }
        }
         return count;   
    }
    private static String resultExeption(int numberExeption){
        if (numberExeption == -1) {
           return "Массив не квадратный";
        }
        else return "Массив содержит не только 0 или 1";
    }

}

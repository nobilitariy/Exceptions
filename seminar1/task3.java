public class task3 {
    

    public static void main(String[] args) {
        int[][] mass = {{0,0,0},{1,0,0},{1,1,1}};
        System.out.println(sumArr(mass));
    }

    public static int sumArr(int[][] mass){
        if (mass.length != mass[0].length) {
            throw new RuntimeException("Массив не квадратный");
        }
        int count = 0;
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                if (mass[i][j] != 0  && mass[i][j] != 1) {
                    throw new RuntimeException("Массив содержит элеиенты отлтичающиеся от 0 или 1");
                }
                count += mass[i][j];
            }
        }
         return count;   
        
    }

}

public class task1 {
    public static void main(String[] args){
        int[] mass = new int[2];
        int minLens = 2;
        System.out.println(massProv(mass, minLens));  
    }
    public static int massProv(int[] mass, int minLens){
        if (mass.length <= minLens) {
            return -1;
        } else return mass.length;
    }
}


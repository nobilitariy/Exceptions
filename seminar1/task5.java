import java.util.ArrayList;
import java.util.List;

public class task5 {
    public static void main(String[] args) {
        Integer[] mass = {1, 2, 3, null, null};
        nullExeption(mass);
    }

    public static void nullExeption(Integer[] mass){
        List<Integer> list = new ArrayList<>();
        for (int j = 0; j < mass.length; j++) {
            if (mass[j] == null) {
                list.add(j);
            }
        }
        if (list.isEmpty()) {
            System.out.println("Массив не содержит пустых ячеек");
        }
        else{
            for (int i = 0; i < list.size()-1; i++) {
                System.out.print(list.get(i) + ", ");
            }
            System.out.print(list.get(list.size()));
            System.out.println(" - данных индексах массива содержится null");
        }
    }
}

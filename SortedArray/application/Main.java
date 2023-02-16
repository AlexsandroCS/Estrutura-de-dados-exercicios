import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(9, 8, 6, 2, 4, 5, 3, 11, 14, 12, 19, 13, 15, 1, 25, 21));
        System.out.println(newListSorted(list));
    }

    public static int captureLeastNumber(List<Integer> list){
        int scrollListNumber = list.get(0);
        int lowNumber = 0;

        for (int i = 0; i < list.size(); i++){
            if (scrollListNumber > list.get(i)){
                scrollListNumber = list.get(i);
                lowNumber = i;
            }
        }
        return lowNumber;
    }

    public static List<Integer> newListSorted(List<Integer> list){
        List<Integer> newList = new ArrayList<>(list.size());
        int sizeList = list.size();

        for (int i = 0; i < sizeList; i++){
            int captureLowNumber = captureLeastNumber(list);
            newList.add(list.get(captureLowNumber));
            list.remove(captureLowNumber);
        }
        return newList;
    }
}
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        List<List<Integer>> pTriangle = getTriangle(8);
        for(List<Integer> row: pTriangle){
            System.out.println(row);
        }
    }

    public static List<List<Integer>> getTriangle(int rows){

        List<List<Integer>> triangle = new ArrayList<>();

        if ( rows == 0){
            return triangle;
        }
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for(int i = 1; i < rows; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);

            List<Integer> preRow = triangle.get(i - 1);
            for(int j = 1; j < i; j++){
                row.add(preRow.get(j - 1) + preRow.get(j));
            }

            row.add(1);
            triangle.add(row);

        }
        return triangle;
    }
}

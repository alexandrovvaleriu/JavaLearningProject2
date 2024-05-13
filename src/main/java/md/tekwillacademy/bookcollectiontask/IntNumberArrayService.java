package md.tekwillacademy.bookcollectiontask;

public class IntNumberArrayService {
    public static int getTheMinValueOfAnArray(int[][] inputArray){

        int min = inputArray[0][0];
        for (int row = 0; row < inputArray.length; row++){
            for (int column = 0; column < inputArray[row].length; column++){
              if (inputArray[row][column] < min){
                  min = inputArray[row][column];
              }
            }
        }

        return min;
    }

    public static void main(String[] args) {
        int[][] biArray = new int [2][2];
        biArray[0][0] = 6;
        biArray[0][1] = 9;
        biArray[1][0] = 5;
        biArray[1][1] = 2;
        System.out.println(getTheMinValueOfAnArray(biArray));
    }
}

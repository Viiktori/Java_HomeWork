package lesson_2;

public class Main {
    public static int arraySum(String[][] twoDimensionalArray) throws MyArraySizeException, MyArrayDataException {
        if (twoDimensionalArray.length != 4) {
            throw new MyArraySizeException("Длина массива != 4");
        }

        for (String[] array : twoDimensionalArray) {
            if (array.length != 4) {
                throw new MyArraySizeException("Высота массива != 4");
            }
        }

        int sum = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray[i].length; j++) {
                try {
                    sum += Integer.parseInt(twoDimensionalArray[i][j]);
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("Не число в элементе:" + i  + "," + j);
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {

        String[][] successArray =
                {{"1", "8", "9", "6"},
                        {"2", "3", "5", "7"},
                        {"1", "3", "8", "6", "5"},
                        {"2", "1", "4", "8"}};

        Integer[][] array = new Integer[4][];
        array[0] = new Integer[4];
        array[0] = new Integer[5];
        array[0] = new Integer[4];

        try {
            System.out.println(arraySum(successArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }

        String[][] invalidDataArray =
                {{"1b", "8", "9", "6"},
                        {"2", "3", "5", "7"},
                        {"1", "3", "6", "5"},
                        {"2", "1", "4", "8"}};

        try {
            System.out.println(arraySum(invalidDataArray));
        } catch (MyArraySizeException e) {
            e.printStackTrace();
        } catch (MyArrayDataException e) {
            e.printStackTrace();
        }
    }
}

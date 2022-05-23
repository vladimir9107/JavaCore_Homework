package Lesson2;

public class Converter {

    public static int strConverter(String[][] strArray)
            throws Lesson2.MyArraySizeException, Lesson2.MyArrayDataException {

        int sum = 0;

        if (4 != strArray.length) throw new Lesson2.MyArraySizeException();

        for (int i = 0; i < strArray.length; i++) {

            if (4 != strArray[i].length) throw new Lesson2.MyArraySizeException();

            for (int k = 0; k < strArray[i].length; k++) {

                try {
                    sum += Integer.parseInt(strArray[i][k]);
                } catch (NumberFormatException e) {
                    throw new Lesson2.MyArrayDataException(i, k);
                }
            }
        }

        return sum;
    }
}
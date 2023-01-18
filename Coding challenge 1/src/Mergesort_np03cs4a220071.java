import java.util.ArrayList;
public class Mergesort_np03cs4a220071 {
    private final ArrayList<Integer> arrayToSort;

    public Mergesort_np03cs4a220071(ArrayList<Integer> arrayToSort) {
        this.arrayToSort = arrayToSort;
    }
    public ArrayList<Integer> getArrayAfterSorting() {
        return arrayToSort;
    }

    public void divideArrayElements(int indexStart, int indexEnd) {

        if (indexStart < indexEnd && (indexEnd - indexStart) >= 1) {
            int middleElement = (indexEnd + indexStart) / 2;

            divideArrayElements(indexStart, middleElement);
            divideArrayElements(middleElement + 1, indexEnd);

            mergeArrayElements(indexStart, middleElement, indexEnd);
        }
    }

    public void mergeArrayElements(int indexStart, int indexMiddle, int indexEnd) {

        ArrayList<Integer> tempArray = new ArrayList<>();

        int getLeftIndex = indexStart;
        int getRightIndex = indexMiddle + 1;

        while (getLeftIndex <= indexMiddle && getRightIndex <= indexEnd) {

            if (arrayToSort.get(getLeftIndex) <= arrayToSort.get(getRightIndex)) {

                tempArray.add(arrayToSort.get(getLeftIndex));
                getLeftIndex++;

            } else {

                tempArray.add(arrayToSort.get(getRightIndex));
                getRightIndex++;

            }
        }

        while (getLeftIndex <= indexMiddle) {
            tempArray.add(arrayToSort.get(getLeftIndex));
            getLeftIndex++;
        }

        while (getRightIndex <= indexEnd) {
            tempArray.add(arrayToSort.get(getRightIndex));
            getRightIndex++;
        }

        for (int i = 0; i < tempArray.size(); indexStart++) {
            arrayToSort.set(indexStart, tempArray.get(i++));
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> integerArrayList = new ArrayList<>();
        integerArrayList.add(25);
        integerArrayList.add(20);
        integerArrayList.add(5);
        integerArrayList.add(10);
        integerArrayList.add(15);

        Mergesort_np03cs4a220071 exampleClass1 = new Mergesort_np03cs4a220071(integerArrayList);

        System.out.println("Array Before Merge Sort: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.print(integer +" ");
        }
        System.out.println();
        exampleClass1.divideArrayElements(0, integerArrayList.size() - 1);

        System.out.println("Array After Merge Sort: ");
        for (Integer integer : exampleClass1.getArrayAfterSorting()) {
            System.out.print(integer+ " ");
        }

    }
}

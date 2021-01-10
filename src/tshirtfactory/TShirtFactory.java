/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tshirtfactory;

import java.util.ArrayList;
import java.util.List;
import models.Color;
import models.Fabric;
import models.Size;
import models.TShirt;
import sort.BubbleSort;
import sort.BucketSort;
import sort.QuickSort;

/**
 *
 * @author Dim.Kasimatis
 */
public class TShirtFactory {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        TShirtFactory myMainClass = new TShirtFactory();
        List<TShirt> tshirts = myMainClass.makeAllCombinations();
        List<TShirt> tshirtsToSort = new ArrayList<>();
        tshirtsToSort.add(tshirts.get(10));
        tshirtsToSort.add(tshirts.get(124));
        tshirtsToSort.add(tshirts.get(34));
        tshirtsToSort.add(tshirts.get(300));
        tshirtsToSort.add(tshirts.get(120));

        System.out.println("List before quicksort");
        myMainClass.printArray(tshirtsToSort);
        QuickSort quickSortTshirts = new QuickSort();

        System.out.println("List after quicksort by size ascending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 0, 0);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List after quicksort by size descending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 0, 1);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List after quicksort by color ascending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 1, 0);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List after quicksort by color descending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 1, 1);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List after quicksort by fabric ascending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 2, 0);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List after quicksort by fabric descending");
        quickSortTshirts.quickSort(tshirtsToSort, 0, tshirtsToSort.size() - 1, 2, 1);
        myMainClass.printArray(tshirtsToSort);

        System.out.println("List before bubblesort");
        myMainClass.printArray(tshirtsToSort);
        BubbleSort bubbleSortTshirts = new BubbleSort();

        System.out.println("List after bubblesort by size ascending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 0, 0));

        System.out.println("List after bubblesort by size descending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 0, 1));

        System.out.println("List after bubblesort by color ascending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 1, 0));

        System.out.println("List after bubblesort by color descending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 1, 1));

        System.out.println("List after bubblesort by fabric ascending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 2, 0));

        System.out.println("List after bubblesort by fabric descending");
        myMainClass.printArray(bubbleSortTshirts.bubbleSort(tshirtsToSort, 2, 1));

        System.out.println("List before bucketsort");
        myMainClass.printArray(tshirtsToSort);
        BucketSort bucketSortTshirts = new BucketSort();

        System.out.println("List after bucketsort by size ascending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 0, 0);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by size descending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 0, 1);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by color ascending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 1, 0);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by color descending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 1, 1);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by fabric ascending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 2, 0);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by fabric descending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSort(tshirtsToSort, 2, 1);
        System.out.println("---------------------");

        System.out.println("List after bucketsort by size color and fabric ascending");
        System.out.println("---------------------");
        bucketSortTshirts.bucketSortTShirtsBySizeThenColorThenFabric(tshirtsToSort, 0);
    }

    public static List<TShirt> makeAllCombinations() {
        RandomName rnd = new RandomName();
        List<TShirt> tshirts = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            Color color = Color.values()[i];
            for (int j = 0; j < 7; j++) {
                Size size = Size.values()[j];
                for (int k = 0; k < 7; k++) {
                    Fabric fabric = Fabric.values()[k];
                    tshirts.add(new TShirt(rnd.randomName(), color, size, fabric));
                }
            }
        }
        return (tshirts);
    }

    /* Prints the array */
    public void printArray(List<TShirt> arr) {
        System.out.println("---------------------");
        int n = arr.size();
        for (int i = 0; i < n; ++i) {
            System.out.println(arr.get(i) + " ");
        }
        System.out.println("---------------------");
    }
}

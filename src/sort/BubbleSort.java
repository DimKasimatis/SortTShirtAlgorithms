/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.List;
import models.TShirt;

/**
 *
 * @author Dim.Kasimatis
 */
public class BubbleSort {

    public List<TShirt> bubbleSort(List<TShirt> arr, int sortByAttribute, int sortingType) {
        List<TShirt> arr2 = new ArrayList<>(arr);
        int n = arr2.size();
        if (sortingType == 0) { // ASC {
            switch (sortByAttribute) {
                // Size
                case 0:
                    for (int i = 0; i < n - 1; i++) {

                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getSize().ordinal() > arr2.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                // Color
                case 1:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getColor().ordinal() > arr2.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                // Fabric
                case 2:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getFabric().ordinal() > arr2.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
            }
        } else {
            switch (sortByAttribute) {
                // Size
                case 0:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getSize().ordinal() < arr2.get(j + 1).getSize().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                // Color
                case 1:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getColor().ordinal() < arr2.get(j + 1).getColor().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
                // Fabric
                case 2:
                    for (int i = 0; i < n - 1; i++) {
                        for (int j = 0; j < n - i - 1; j++) {
                            if (arr2.get(j).getFabric().ordinal() < arr2.get(j + 1).getFabric().ordinal()) {
                                // swap arr[j+1] and arr[j] 
                                TShirt temp = arr2.get(j);
                                arr2.set(j, arr2.get(j + 1));  // arr[j] <- arr[j+1]
                                arr2.set(j + 1, temp); // arr[j+1] = temp; 
                            }
                        }
                    }
                    break;
            }
        }

        return (arr2);
    }
}

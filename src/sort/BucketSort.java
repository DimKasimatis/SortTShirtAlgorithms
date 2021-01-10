/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.ArrayList;
import java.util.List;
import models.Size;
import models.TShirt;

/**
 *
 * @author Dim.Kasimatis
 */
public class BucketSort {

    public void bucketSort(List<TShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets  
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets
        for (TShirt tShirt : randomTShirts) {
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }

        // Step 3, print
        // just print the contents of each bucket
        if (sortingType == 0) {
            for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {
                    System.out.println(buckets[i].get(j));
                }
            }
        } else {
            for (int i = noOfBuckets - 1; i >= 0; i--) { // noOfBuckets
                for (int j = 0; j < buckets[i].size(); j++) {
                    System.out.println(buckets[i].get(j));
                }
            }
        }

    }
    
    public void bucketSortForAllCriteria(List<TShirt> randomTShirts, int sortByAttribute, int sortingType) {
        // Step 1 - Create buckets, Size.length
        int noOfBuckets = Size.values().length;

        // Step 1, create noOfBuckets buckets  
        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets
        for (TShirt tShirt : randomTShirts) {
            switch (sortByAttribute) {
                case 0:
                    buckets[tShirt.getSize().ordinal()].add(tShirt);
                    break;
                case 1:
                    buckets[tShirt.getColor().ordinal()].add(tShirt);
                    break;
                case 2:
                    buckets[tShirt.getFabric().ordinal()].add(tShirt);
                    break;
            }
        }
    }
    
    public void bucketSortTShirtsBySizeThenColorThenFabric(List<TShirt> randomTShirts, int sortingType) {
        List<TShirt> tShirts = new ArrayList<>();
        QuickSort qs = new QuickSort();

        // Step 1 - Create noOfBuckets buckets, Size.length
        int noOfBuckets = Size.values().length;

        List<TShirt>[] buckets = new ArrayList[noOfBuckets];
        for (int i = 0; i < noOfBuckets; i++) { // noOfBuckets
            buckets[i] = new ArrayList<TShirt>(); // initialize the buckets
        }

        // Step 2, divide into buckets, Sort By Size
        for (TShirt tShirt : randomTShirts) {
            buckets[tShirt.getSize().ordinal()].add(tShirt);
        }

        // Step 3, Sort By Color
        for (List<TShirt> bucket : buckets) {
            qs.quickSort(bucket, 0, bucket.size() - 1, 1, 0);
        }

        // Step 4, Sort By Fabric
        for (List<TShirt> bucket : buckets) {
            List<TShirt> bucketByFabric = new ArrayList<>(bucket);
            bucketSortForAllCriteria(bucketByFabric, 2, 0);
            qs.quickSort(bucketByFabric, 0, bucketByFabric.size() - 1, 2, 0);
            bucket = bucketByFabric;
        }

        // combine all the buckets to 1 List
        for (List<TShirt> bucket : buckets) {
            for (TShirt tShirt : bucket) {
                tShirts.add(tShirt);
            }
        }
        for (TShirt tShirt : tShirts) {
            System.out.println(tShirt);
        }
    }
}

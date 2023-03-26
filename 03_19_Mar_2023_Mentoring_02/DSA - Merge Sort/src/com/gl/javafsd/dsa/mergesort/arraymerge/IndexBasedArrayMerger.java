package com.gl.javafsd.dsa.mergesort.arraymerge;


// {1, 3, 2, 7, 5}
// aArray
// bArray

// start - 2
// mid - 3
// end - 4

// aArray - {2, 7}
// bArray - {5}
// result -> originalArray [2, 5, 7]
//

public class IndexBasedArrayMerger {

    private int[] originalArray;
   
    public IndexBasedArrayMerger(int originalArray[]) {
   
        this.originalArray = originalArray;
    }
   
    public void merge(int leftIndex, int middleIndex, int rightIndex) {
       
        System.out.println(
            String.format("Merge Left(%d), Middle(%d), Right(%d)", leftIndex, middleIndex, rightIndex));
       
        int aArrayIndex = 0;
        int bArrayIndex = 0;
        int cArrayIndex;
       
        int aArrayLength = middleIndex - leftIndex + 1;
        int bArrayLength = rightIndex - middleIndex;
     
        /* Create two temp arrays */
        int aArray[] = new int[aArrayLength];
        int bArray[] = new int[bArrayLength];
     
        /* Copy data to temp arrays L[] based on the index */
        for (aArrayIndex = 0; aArrayIndex < aArrayLength; aArrayIndex++) {
            aArray[aArrayIndex] = originalArray[leftIndex + aArrayIndex];          
        }
       
        for (bArrayIndex = 0; bArrayIndex < bArrayLength; bArrayIndex++) {
            bArray[bArrayIndex] = originalArray[middleIndex + 1+ bArrayIndex];          
        }
     
        aArrayIndex = 0;
        bArrayIndex = 0;
        cArrayIndex = leftIndex;


        while (aArrayIndex < aArrayLength && bArrayIndex < bArrayLength) {
           
            if (aArray[aArrayIndex] <= bArray[bArrayIndex]) {
                originalArray[cArrayIndex] = aArray[aArrayIndex];
                aArrayIndex++;
                cArrayIndex++;
            }
            else {
                originalArray[cArrayIndex] = bArray[bArrayIndex];
                bArrayIndex++;
                cArrayIndex++;
            }
        }
     
        while (aArrayIndex < aArrayLength) {
           
            originalArray[cArrayIndex] = aArray[aArrayIndex];
            aArrayIndex++;
            cArrayIndex++;
        }
     
        while (bArrayIndex < bArrayLength) {
            originalArray[cArrayIndex] = bArray[bArrayIndex];
            bArrayIndex++;
            cArrayIndex++;
        }        
    }  
}

package collection;



import java.lang.reflect.Array;

public class Arrays {
    static void checkRange(int arrayLength, int startIndex, int endIndex){
        if(startIndex > endIndex){
            throw new IllegalArgumentException("startIndex cannot be greater than endIndex");
        }
        else if(startIndex < 0){
            throw new ArrayIndexOutOfBoundsException(startIndex);
        }
        else if(endIndex > arrayLength){
            throw new ArrayIndexOutOfBoundsException(endIndex);
        }
    }

    public static int binarySearch(int[] arr, int target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(int[] arr, int startIndex, int endIndex, int target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end-start)/2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(char[] arr, char target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(char[] arr, int startIndex, int endIndex, char target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(double[] arr, double target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(double[] arr, int startIndex, int endIndex, double target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(float[] arr, float target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(float[] arr, int startIndex, int endIndex, float target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(byte[] arr, byte target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(byte[] arr, int startIndex, int endIndex, byte target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(long[] arr, long target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(long[] arr, int startIndex, int endIndex, long target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(short[] arr, short target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(short[] arr, int startIndex, int endIndex, short target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if (target == arr[mid])     return mid;
            else if(target < arr[mid])    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
    public static int binarySearch(Object[] arr, Object target){
        return binarySearch(arr, 0, arr.length, target);
    }
    public static int binarySearch(Object[] arr, int startIndex, int endIndex, Object target){
        checkRange(arr.length, startIndex, endIndex);
        int start = startIndex, end = endIndex - 1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            Comparable midEle = (Comparable)arr[mid];
            if (midEle.compareTo(target) == 0)     return mid;
            else if(midEle.compareTo(target) > 0)    end = mid-1;
            else    start=mid+1;
        }
        return -1;
    }
//    public static <T> int  binarySearch(T[] arr, T key){
//        return binarySearch(arr, 0, arr.length, key);
//
//    }
    public static boolean[] copyOf(boolean[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static boolean[] copyOfRange(boolean[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        boolean[] newArray = new boolean[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = false;
        }
        return newArray;
    }
    public static byte[] copyOf(byte[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static byte[] copyOfRange(byte[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        byte[] newArray = new byte[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0b0;
        }
        return newArray;
    }
    public static char[] copyOf(char[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static char[] copyOfRange(char[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        char[] newArray = new char[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = '\0';
        }
        return newArray;
    }
    public static double[] copyOf(double[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static double[] copyOfRange(double[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        double[] newArray = new double[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0.0;
        }
        return newArray;
    }
    public static float[] copyOf(float[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static float[] copyOfRange(float[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        float[] newArray = new float[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0.0f;
        }
        return newArray;
    }
    public static int[] copyOf(int[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static int[] copyOfRange(int[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        int[] newArray = new int[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0;
        }
        return newArray;
    }
    public static long[] copyOf(long[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static long[] copyOfRange(long[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        long[] newArray = new long[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0;
        }
        return newArray;
    }
    public static short[] copyOf(short[] originalArray, int newLength){
        return copyOfRange(originalArray, 0, originalArray.length, newLength);
    }
    public static short[] copyOfRange(short[] originalArray, int startIndex, int endIndex, int newLength){
        checkRange(originalArray.length, startIndex, endIndex);
        short[] newArray = new short[newLength];
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = 0;
        }
        return newArray;
    }
    public static <T> T[] copyOf(T[] originalArray, int newLength) {
        return (T[]) copyOfRange(originalArray, 0, originalArray.length, newLength, originalArray.getClass());
    }
    public static <T> T[] copyOfRange(T[] originalArray, int startIndex, int endIndex, int newLength){
        return (T[]) copyOfRange(originalArray, startIndex, endIndex, newLength, originalArray.getClass());
    }
//    public static <T, U> T[] copyOf(U[] originalArray, int newLength, Class<? extends T[]> newType) {
//        T[] newArray = (T[]) Array.newInstance(newType.getComponentType(), newLength);
//        int i;
//        for(i = 0; i < newLength && i < originalArray.length; i++){
//            newArray[i] = (T) originalArray[i];
//        }
//        //if the new Array is smaller than the new Length
//        while(i < newLength){
//            newArray[i++] = null;
//        }
//        return newArray;
//    }
    public static<T, U> T[] copyOfRange(U[] originalArray, int startIndex, int endIndex, int newLength, Class<? extends T[]> newType){
        checkRange(originalArray.length, startIndex, endIndex);
        T[] newArray = (T[]) Array.newInstance(newType.getComponentType(), newLength);
        int i;
        for(i = 0; i < newLength && (i + startIndex) < originalArray.length && i < (endIndex - startIndex); i++){
            newArray[i] = (T) originalArray[i + startIndex];
        }
        //if the new Array is smaller than the new Length
        while(i < newLength){
            newArray[i++] = null;
        }
        return newArray;
    }
    public static boolean equals(boolean[] array1, boolean[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(boolean[] array1, int startIndex1, int endIndex1, boolean[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(byte[] array1, byte[] array2) {
        if (array1 == array2)
            return true;
        else if (array1 != null && array2 != null) {
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        } else {
            return false;
        }
    }
    public static boolean equals(byte[] array1, int startIndex1, int endIndex1, byte[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(char[] array1, char[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(char[] array1, int startIndex1, int endIndex1, char[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(double[] array1, double[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(double[] array1, int startIndex1, int endIndex1, double[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(float[] array1, float[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(float[] array1, int startIndex1, int endIndex1, float[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(int[] array1, int[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(int[] array1, int startIndex1, int endIndex1, int[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(long[] array1, long[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(long[] array1, int startIndex1, int endIndex1, long[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(short[] array1, short[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] != array2[i])
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(short[] array1, int startIndex1, int endIndex1, short[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(array1[startIndex1 + i] != array2[startIndex2 + i]) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean equals(Object[] array1, Object[] array2){
        if(array1 == array2)
            return true;
        else if(array1 != null && array2 != null){
            if (array1.length != array2.length)
                return false;
            for (int i = 0; i < array1.length; i++) {
                if (!array1[i].equals(array2[i]))
                    return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
    public static boolean equals(Object[] array1, int startIndex1, int endIndex1, Object[] array2, int startIndex2, int endIndex2){
        checkRange(array1.length, startIndex1, endIndex1);
        checkRange(array2.length, startIndex2, endIndex2);
        if(array1 == array2){
            return true;
        }
        else{
            int length1 = endIndex1 - startIndex1;
            int length2 = endIndex2 - startIndex2;
            if(length1 != length2){
                return false;
            }
            for(int i = 0; i < length1; i++){
                if(!array1[startIndex1 + i].equals(array2[startIndex2 + i])) {
                    return false;
                }
            }
            return true;
        }
    }
    public static void fill(boolean[] array, boolean value){
        fill(array, 0, array.length, value);
    }
    public static void fill(boolean[] array, int startIndex, int endIndex, boolean value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(byte[] array, byte value){
        fill(array, 0, array.length, value);
    }
    public static void fill(byte[] array, int startIndex, int endIndex, byte value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(char[] array, char value){
        fill(array, 0, array.length, value);
    }
    public static void fill(char[] array, int startIndex, int endIndex, char value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(double[] array, double value){
        fill(array, 0, array.length, value);
    }
    public static void fill(double[] array, int startIndex, int endIndex, double value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(float[] array, float value){
        fill(array, 0, array.length, value);
    }
    public static void fill(float[] array, int startIndex, int endIndex, float value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(int[] array, int value){
        fill(array, 0, array.length, value);
    }
    public static void fill(int[] array, int startIndex, int endIndex, int value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(long[] array, long value){
        fill(array, 0, array.length, value);
    }
    public static void fill(long[] array, int startIndex, int endIndex, long value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static void fill(Object[] array, Object value){
        fill(array, 0, array.length, value);
    }
    public static void fill(Object[] array, int startIndex, int endIndex, Object value){
        checkRange(array.length, startIndex, endIndex);
        for(int i = startIndex; i < endIndex; i++){
            array[i] = value;
        }
    }
    public static String toString(boolean[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(byte[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(char[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(double[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(float[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(long[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(int[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(short[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    public static String toString(Object[] array){
        if(array == null){
            return "null";
        }
        if(array.length == 0){
            return "[]";
        }
        StringBuilder sb = new StringBuilder("[" + array[0]);
        for(int i = 1; i < array.length; i++){
            sb.append(", ").append(array[i]);
        }
        sb.append("]");
        return sb.toString();
    }
    private static void mergeSort(int[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(int[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        int[] leftArray;
        int[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(int[] array){
        sort(array, 0, array.length);
    }
    public static void sort(int[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(byte[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(byte[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        byte[] leftArray;
        byte[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(byte[] array){
        sort(array, 0, array.length);
    }
    public static void sort(byte[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(char[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(char[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        char[] leftArray;
        char[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(char[] array){
        sort(array, 0, array.length);
    }
    public static void sort(char[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(double[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(double[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        double[] leftArray;
        double[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(double[] array){
        sort(array, 0, array.length);
    }
    public static void sort(double[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(float[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(float[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        float[] leftArray;
        float[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(float[] array){
        sort(array, 0, array.length);
    }
    public static void sort(float[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(long[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(long[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        long[] leftArray;
        long[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(long[] array){
        sort(array, 0, array.length);
    }
    public static void sort(long[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    private static void mergeSort(short[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(short[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        short[] leftArray;
        short[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(leftArray[i] < rightArray[j]){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(short[] array){
        sort(array, 0, array.length);
    }
    public static void sort(short[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
    //Sorting for Objects
    private static void mergeSort(Object[] a, int start, int end){
        if(start < end) {
            int mid = start + (end - start) / 2;
            mergeSort(a, start, mid);
            mergeSort(a, mid + 1, end);
            merge(a, start, mid, end);
        }
    }
    private static void merge(Object[] a, int start, int mid, int end){
        int leftLength = mid - start + 1;
        int rightLength = end - mid;

        Object[] leftArray;
        Object[] rightArray;
        leftArray = copyOfRange(a, start, start + leftLength, leftLength);
        rightArray = copyOfRange(a, mid + 1, mid + 1 + rightLength, rightLength);
        int i = 0, j = 0, k = start;
        while(i < leftLength && j < rightLength){
            if(((Comparable)leftArray[i]).compareTo(rightArray[j]) < 0){
                a[k++] = leftArray[i++];
            }
            else {
                a[k++] = rightArray[j++];
            }
        }
        if(i < leftLength || j < rightLength){
            while(i < leftLength){
                a[k++] = leftArray[i++];
            }
            while(j < rightLength){
                a[k++] = rightArray[j++];
            }
        }
    }
    public static void sort(Object[] array){
        sort(array, 0, array.length);
    }
    public static void sort(Object[] array, int startIndex, int endIndex){
        checkRange(array.length, startIndex, endIndex);
        mergeSort(array, startIndex, endIndex - 1);
    }
}
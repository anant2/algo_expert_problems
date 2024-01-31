package recursion;

import java.util.ArrayList;

public class LinearSearch {

    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 11, 98, 24, 24, 24, 67, 18};
        int target = 24;
        int result1 = findIndex(arr, target, 0);
        System.out.println(isPresent(arr, target, 0));
        System.out.println(result1);

        int result2 = findIndexLastIndex(arr, target, arr.length - 1);
        System.out.println(isPresentLastIndex(arr, target, arr.length - 1));
        System.out.println(result2);

        findAllIndex(arr, target, 0);
        System.out.println(list);

        ArrayList<Integer> al = findAllIndexReturnList(arr, target, 0,new ArrayList<>());
        System.out.println(al);

        System.out.println(findAllIndexReturnListWithoutPassing(arr, target,0));
    }

    private static ArrayList<Integer> findAllIndexReturnList(int[] arr, int target, int index, ArrayList<Integer> list) {
        if (index == arr.length) return list;
        if(arr[index] == target) {
            list.add(index);
        }
        return findAllIndexReturnList(arr, target, index +1, list);
    }

    private static ArrayList<Integer> findAllIndexReturnListWithoutPassing(int[] arr, int target, int index) {
        ArrayList<Integer> list = new ArrayList<>();

        if (index == arr.length) return list;
        if(arr[index] == target) {
            list.add(index);
        }
        ArrayList<Integer> result =  findAllIndexReturnListWithoutPassing(arr, target, index +1);
        list.addAll(result);
        return list;
    }

    static ArrayList<Integer> list = new ArrayList<>();

    private static void findAllIndex(int[] arr, int target, int index) {
        if (index == arr.length) return;
        if (arr[index] == target) {
            list.add(index);
            findAllIndex(arr, target, index + 1);
        } else
            findAllIndex(arr, target, index + 1);
    }

    private static boolean isPresent(int[] arr, int target, int index) {
        if (index == arr.length) return false;
        if (arr[index] == target) return true;
        else
            return isPresent(arr, target, index + 1);
    }

    private static int findIndex(int[] arr, int target, int index) {
        if (index == arr.length) return -1;
        if (arr[index] == target) return index;
        else
            return findIndex(arr, target, index + 1);
    }

    private static boolean isPresentLastIndex(int[] arr, int target, int index) {
        if (index == -1) return false;
        if (arr[index] == target) return true;
        else
            return isPresentLastIndex(arr, target, index - 1);
    }

    private static int findIndexLastIndex(int[] arr, int target, int index) {
        if (index == -1) return -1;
        if (arr[index] == target) return index;
        else
            return findIndexLastIndex(arr, target, index - 1);

    }

}

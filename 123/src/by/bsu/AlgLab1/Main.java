package by.bsu.AlgLab1;

import by.bsu.AlgLab1.action.AlgorithmAction;
import by.bsu.AlgLab1.entity.HybridMergeSort;
import by.bsu.AlgLab1.entity.HybridQuickSort;
import by.bsu.AlgLab1.entity.Sort;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Main {
    private static int K = 5;
    private static final int R = 10;
    private static final int N = 20_000;
    private static final int M = 1000;

    public static void main(String[] args) {
        AlgorithmAction algAction = new AlgorithmAction();
        int[][] arrays = new int[R][N];
        algAction.fillArraysWithRandomAndGauss(arrays, M);
        algAction.printArrays(arrays);
        Sort hybridQuickSort = new HybridQuickSort(K);
        Sort hybridMergeSort = new HybridMergeSort(K);
        System.out.println("========= Hybrid from quick sort ===================");
        algAction.findTheOptimalK(arrays, hybridQuickSort, K, true);
        System.out.println("========= Hybrid from merge sort ===================");
        algAction.findTheOptimalK(arrays, hybridMergeSort, K,true);
    }



}

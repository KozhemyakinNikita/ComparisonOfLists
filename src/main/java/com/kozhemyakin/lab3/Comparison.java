package com.kozhemyakin.lab3;

import java.util.List;
import java.util.Random;

public class Comparison implements ListСomparison {
    /**
     * Fills the provided List with random integer values.
     *
     * @param list The List to be filled with random integers.
     * @param size The number of random integers to generate and add to the List.
     */
    public void fillList(List<Integer> list, int size) {
        Random random = new Random();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt());
        }
    }
    /**
     * Inserts elements at the end of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    @Override
    public long insertEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(i);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Inserts elements in the middle of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    @Override
    public long insertMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(list.size() / 2, i);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Inserts elements at the start of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    @Override
    public long insertStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.add(0,i);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Removes elements from the end of the List and measures the execution time.
     *
     * @param list              The List from which elements will be removed.
     * @param numberOfExecutions The number of remove operations to perform.
     * @return The total execution time for the remove operations in nanoseconds.
     */
    @Override
    public long removeEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(list.size() - 1);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }

    @Override
    public long removeMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(list.size() / 2);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }

    @Override
    public long removeStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.remove(0);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Gets an element from the end of the List and measures the execution time.
     *
     * @param list              The List from which elements will be retrieved.
     * @param numberOfExecutions The number of get operations to perform.
     * @return The total execution time for the get operations in nanoseconds.
     */
    @Override
    public long getElementEnd(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(list.size() - 1);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Gets an element from the middle of the List and measures the execution time.
     *
     * @param list              The List from which elements will be retrieved.
     * @param numberOfExecutions The number of get operations to perform.
     * @return The total execution time for the get operations in nanoseconds.
     */
    @Override
    public long getElementMiddle(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(list.size() / 2);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
    /**
     * Gets an element from the start of the List and measures the execution time.
     *
     * @param list              The List from which elements will be retrieved.
     * @param numberOfExecutions The number of get operations to perform.
     * @return The total execution time for the get operations in nanoseconds.
     */
    @Override
    public long getElementStart(List<Integer> list, int numberOfExecutions) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfExecutions; i++) {
            list.get(0);
        }
        long endTime = System.nanoTime();
        long result = endTime - startTime;
        return result;
    }
}

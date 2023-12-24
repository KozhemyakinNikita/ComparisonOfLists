package com.kozhemyakin.lab3;

import java.util.List;

public interface ListСomparison {
    /**
     * Inserts elements at the end of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    long insertEnd(List<Integer> list, int numberOfExecutions);
    /**
     * Inserts elements in the middle of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    long insertMiddle(List<Integer> list, int numberOfExecutions);
    /**
     * Inserts elements at the start of the List and measures the execution time.
     *
     * @param list              The List to which elements will be added.
     * @param numberOfExecutions The number of insert operations to perform.
     * @return The total execution time for the insert operations in nanoseconds.
     */
    long insertStart(List<Integer> list, int numberOfExecutions);
    /**
     * Removes elements from the end of the List and measures the execution time.
     *
     * @param list              The List from which elements will be removed.
     * @param numberOfExecutions The number of remove operations to perform.
     * @return The total execution time for the remove operations in nanoseconds.
     */
    long removeEnd(List<Integer> list, int numberOfExecutions);
    /**
     * Removes elements from the middle of the List and measures the execution time.
     *
     * @param list              The List from which elements will be removed.
     * @param numberOfExecutions The number of remove operations to perform.
     * @return The total execution time for the remove operations in nanoseconds.
     */
    long removeMiddle(List<Integer> list, int numberOfExecutions);
    /**
     * Removes elements from the start of the List and measures the execution time.
     *
     * @param list              The List from which elements will be removed.
     * @param numberOfExecutions The number of remove operations to perform.
     * @return The total execution time for the remove operations in nanoseconds.
     */
    long removeStart(List<Integer> list, int numberOfExecutions);
    /**
     * Gets an element from the end of the List and measures the execution time.
     *
     * @param list              The List from which elements will be retrieved.
     * @param numberOfExecutions The number of get operations to perform.
     * @return The total execution time for the get operations in nanoseconds.
     */
    long getElementEnd(List<Integer> list, int numberOfExecutions);

    /**
     * Gets an element from the start of the List and measures the execution time.
     *
     * @param list              The List from which elements will be retrieved.
     * @param numberOfExecutions The number of get operations to perform.
     * @return The total execution time for the get operations in nanoseconds.
     */
    long getElementMiddle(List<Integer> list, int numberOfExecutions);

    long getElementStart(List<Integer> list, int numberOfExecutions);
}


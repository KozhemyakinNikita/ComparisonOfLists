package com.kozhemyakin.lab3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestComparison {
    private Comparison listComparison;

    @BeforeEach
    void setUp() {
        listComparison = new Comparison();
    }

    @Test
    void testInsertEnd() {
        List<Integer> list = new ArrayList<>();
        long executionTime = listComparison.insertEnd(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testInsertMiddle() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 500);
        long executionTime = listComparison.insertMiddle(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testInsertStart() {
        List<Integer> list = new ArrayList<>();
        long executionTime = listComparison.insertStart(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testRemoveEnd() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.removeEnd(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testRemoveMiddle() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.removeMiddle(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testRemoveStart() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.removeStart(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testGetElementEnd() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.getElementEnd(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testGetElementMiddle() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.getElementMiddle(list, 1000);
        assertTrue(executionTime > 0);
    }

    @Test
    void testGetElementStart() {
        List<Integer> list = new ArrayList<>();
        listComparison.fillList(list, 1000);
        long executionTime = listComparison.getElementStart(list, 1000);
        assertTrue(executionTime > 0);
    }
}


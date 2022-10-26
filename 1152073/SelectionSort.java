/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package tarea;

/**
 *
 * @author Usuario
 */
// Selection sort in Java

import java.util.Arrays;

class SelectionSort {
  void selectionSort(int array[]) {
    int size = array.length;

    for (int step = 0; step < size - 1; step++) {
      int min_idx = step;

      for (int i = step + 1; i < size; i++) {

        // To sort in descending order, change > to < in this line.
        // Select the minimum element in each loop.
        if (array[i] < array[min_idx]) {
          min_idx = i;
        }
      }

      // put min at the correct position
      int temp = array[step];
      array[step] = array[min_idx];
      array[min_idx] = temp;
    }
  }

  // driver code
  public static void main(String args[]) {
    int data [] = {71314,63437,34493,74509,77303,37637,40249,15709,45805,19872,13449,58786,70566,44787,11699,63281,67912,65141,12940,55453,31008,20292,16829,31288,10754,44836,61887,76941,47999,70098,22204,25891,86400,78689,41325,56579,21448,13686,83278,22827,86109,61665,50259,79229,81364,17620,44595,47245,64106,33317,56557,66187,48750,44664,19788,12995,47058,80292,36772,78010,50623,25145,24459,29294,61396,48105,17918,42667,86367,33792,64167,69737,50498,67520,20778,28594,16208,59608,17084,13586,12778,60932,89734,83910,52702,62969,49780,40785,37803,74379,19468,78836,51717,75594,88630,54486,11391,66909,88007,23947};SelectionSort ss = new SelectionSort();
    ss.selectionSort(data);
    System.out.println("Sorted Array in Ascending Order: ");
    System.out.println(Arrays.toString(data));
  }
}

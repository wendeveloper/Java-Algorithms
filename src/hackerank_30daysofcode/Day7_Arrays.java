package hackerank_30daysofcode;
/*
HackerRank 30 Days of Code
Day 7: Arrays
https://www.hackerrank.com/challenges/30-arrays/problem?isFullScreen=true
Objective
Today, we will learn about the Array data structure. Check out the Tutorial tab for learning materials and an instructional video.

Task
Given an array, , of  integers, print 's elements in reverse order as a single line of space-separated numbers.

Example


Print 4 3 2 1. Each integer is separated by one space.

Input Format

The first line contains an integer,  (the size of our array).
The second line contains  space-separated integers that describe array 's elements.

Constraints

Constraints

, where  is the  integer in the array.
Output Format

Print the elements of array  in reverse order as a single line of space-separated numbers.

Sample Input

4
1 4 3 2
Sample Output

2 3 4 1
 */

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Day7_Arrays {

//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//
//        int n = Integer.parseInt(bufferedReader.readLine().trim());
//
//        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
//                .map(Integer::parseInt)
//                .collect(toList());
//
//        String result = "";
//        for (int i = arr.size()-1; i >= 0; i--){
//            result += arr.get(i) + " ";
//        }
//        System.out.println(result);
//        bufferedReader.close();
//    }
}


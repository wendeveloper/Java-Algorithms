/*
https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem?isFullScreen=true
HackerRank 30 Days of Code
Day 8: Dictionaries and Maps
 */

import java.io.*;
import java.util.*;
public class DictionariesAndMaps_Day8HackerRank {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        //for each name queried, print entry from phonebook
        //name=phonenumber
        //if name ="" print "Not Found"
        //Dictionary/Map/HashMap data structure

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();       //n = number of phoneBook entries

        // create phoneBook
        Map<String, String> phoneBook = new HashMap<String, String>();

        for (int i = 0; i < n; i++) {
            String name = in.next();
            String phoneNumber = in.next();

            phoneBook.put(name, phoneNumber); //phoneBook key name, value phoneNumber
        }

        //query
        while(in.hasNext()){ //while true that Scanner has another token in user input
            String str = in.next();

            //check if phoneBook contains str
            if (phoneBook.containsKey(str)) {
                System.out.println(str + "=" + phoneBook.get(str));
            } else{
                System.out.println("Not found");
            }
        }
        in.close();
    }

}

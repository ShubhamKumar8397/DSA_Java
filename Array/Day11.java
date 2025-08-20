// Lecture 24

package Array;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Day11 {

    static void swapElements(ArrayList<Integer> list, int i, int j){

        // int temp = a;
        // a = b;
        // b = temp;

        int temp = Integer.valueOf(list.get(i));
        list.set(i, list.get(j));
        list.set(j, temp);
    }

    static void reverseList(ArrayList<Integer> list){
        int i = 0, j = list.size() - 1;
        while (i < j) {
            swapElements(list, i , j);
            
            i++;
            j--;
        }
        System.out.println(list);
    }
    public static void main(String [] args){
        // Wrapper Class
        Integer i = Integer.valueOf(4);

        Float f = Float.valueOf(4.6f);

        ArrayList<Integer> l1 = new ArrayList<>();
        ArrayList<Boolean> B1 = new ArrayList<>();

        // add new Element ;
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        // get value by index in arrayList
        System.out.println(l1.get(3));


        // print with for loop;
        for(int j = 0; j < l1.size(); j++){
            System.out.println(l1.get(j));
        }

        // printing the array list directly
        System.out.println(l1);

        // adding element at some index i
        l1.add(1, 800);
        System.out.println(l1);

        // modifying element at index i
        l1.set(3, 6000);
        System.out.println(l1);

        // removing an element at index i
        l1.remove(1);
        System.out.println(l1);

        // removing an element e if e is present then removve
        l1.remove(Integer.valueOf(800));
        System.out.println(l1.remove(Integer.valueOf(800)));
        System.out.println(l1);

        // checking the element is present or not - boolean return
        boolean ans = l1.contains(Integer.valueOf(566));
        System.out.println(ans);

        // if you dont specify class, you can put anything in this;
        // ArrayList l = new ArrayList();
        // l.add("hatt bhosdi ke");
        // l.add(3);
        // l.add(true);
        // System.out.println(l);


        // write a programme to Reverse The array list;

        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        System.out.println(list);

        // Collection method inbuilt function to reverse a array list
        Collections.reverse(list);
        System.out.println(list);

        // collection method inbuilt fnction to sort accending and decensending
        Collections.sort(list);   // directly sort in acending
        Collections.sort(list, Collections.reverseOrder());    // in which type means decensending

        // by the two pointer approach method
        reverseList(list);

    }
}

import java.util.ArrayList;

public class MyMain {

    // Counts the number of words that starts with 'a' or 'A'
    public static int startsWithA(ArrayList<String> list) {
        int acounter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).charAt(0) == 'A' || list.get(i).charAt(0) == 'a'){
                acounter += 1;
            }
        }
        return acounter;
    }

    // Adds a ! to each element in the ArrayList, returns an ArrayList
    public static ArrayList<String> makeExciting(ArrayList<String> list) {
        for(int i = 0; i < list.size(); i++){
            list.set(i, list.get(i) + "!");
        }
        return list;
    }

    // Returns true if there is an int that appears in both lists
    public static boolean checkDuplicates(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        for(int i = 0; i < list1.size(); i++){
            for(int k = 0; k < list2.size(); k++){
                if(list1.get(i) == list2.get(k)){
                    return true;
                }
            }
        }
        return false;
    }


    // METHODS FOR THE HOMEWORK:

    // Counts the number of odd numbers in list
    public static int countOdd(ArrayList<Integer> list) {
        int oddcounter = 0;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0){
                oddcounter += 1;
            }
        }
        return oddcounter;
    }

    // Takes an int[] as input and returns the equivalent ArrayList<Integer>
    // Unlike the other methods, the input is an array!
    public static ArrayList<Integer> convertToArrayList(int[] arr) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        return list;
    }

    // Takes two **sorted** ArrayLists and merges them together into one big sorted ArrayList
    // (Hint: you may find it useful to use a while loop, as well as the remove() method).
    public static ArrayList<Integer> merge(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        for(int i = 0; i < list1.size(); i++){
            list3.add(list1.get(i));
        }
        for(int i = 0; i < list2.size(); i++){
            list3.add(list2.get(i));
        }
        for(int i = 0; i < list3.size(); i++){
            for(int m = 0; m < list3.size() - 1; m++){
                if(list3.get(m) > list3.get(m + 1)) {
                    int temp = list3.get(m);
                    int temp2 = list3.get(m + 1);
                    list3.set(m + 1, temp);
                    list3.set(m, temp2);
                }
            }
        }
        return list3;
    }



    public static void main(String[] args) {
        // Write some code here to test your methods!
    }
}

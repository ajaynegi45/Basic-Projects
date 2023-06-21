import java.util.ArrayList;

public class LearnArrayList {
   public static void main(String[] args) {

        // Create an ArrayList of Strings
        ArrayList<String> fruits = new ArrayList<>();

        // Add elements to the ArrayList
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Mango");


        // Print all element in ArrayList
        System.out.println(fruits);


        // 1. size() - returns the number of elements in the ArrayList
        int size = fruits.size();
        System.out.println("Size of ArrayList: " + size);


        // 2. get(index) - returns the element at the specified index
        String firstFruit = fruits.get(0);
        System.out.println("First fruit: " + firstFruit);


        // 3. set(index, element) - replaces the element at the specified index
        fruits.set(1, "Grapes");
        System.out.println("Updated ArrayList: " + fruits);


        // 4. remove(index) - removes the element at the specified index
        fruits.remove(2);
        System.out.println("ArrayList after removing an element: " + fruits);


        // 5. contains(element) - checks if the ArrayList contains the specified element
        boolean containsMango = fruits.contains("Mango");
        System.out.println("Does ArrayList contain 'Mango'? " + containsMango);


        // 6. clear() - removes all elements from the ArrayList
        fruits.clear();
        System.out.println("ArrayList after clearing all elements: " + fruits);


        // Add elements to the ArrayList again
        fruits.add("Strawberry");
        fruits.add("Pineapple");


        // 7. isEmpty() - checks if the ArrayList is empty
        boolean isEmpty = fruits.isEmpty();
        System.out.println("Is ArrayList empty? " + isEmpty);


        // 8. indexOf(element) - returns the index of the first occurrence of the specified element
        int index = fruits.indexOf("Pineapple");
        System.out.println("Index of 'Pineapple': " + index);


        // 9. add(index, element) - inserts the element at the specified index
        fruits.add(1, "Watermelon");
        System.out.println("ArrayList after adding 'Watermelon': " + fruits);


        // 10. toArray() - returns an array containing all elements of the ArrayList
        String[] fruitsArray = fruits.toArray(new String[0]);
        System.out.print("ArrayList converted to Array: ");
        for (String fruit : fruitsArray) {
            System.out.print(fruit + " ");
        }
        System.out.println();


        // 12. subList(fromIndex, toIndex) - returns a sublist of elements from the specified range
        ArrayList<String> sublist = new ArrayList<>(fruits.subList(0, 2));
        System.out.println("Sublist: " + sublist);

    }
}


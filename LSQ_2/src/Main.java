//Alright idk if you noticed sha but in the first code we worked on sha we used a library for it

//Question 2 : Write a Java program to search an item in a Stack collection.
//HINT: ind = stck_list.search("Blue");
import java.util.Stack;
public class Main {

    //well as you know we are to solve question 2 but yunno the drill nau instantiate
    // the Stack and start using it but this time around we are doing something different
    //-----------Question 2---------------------------
    //Write a Java program to search an item in a Stack collection.
    //HINT: ind = stck_list.search("Blue");

    //so lets kick off

    public static void main(String[] args) {

        Stack<String> stack_l = new Stack<String>();               //<for me don't read this>
        stack_l.push("Red");//Normal drill nau you know what this does to the code nau
        stack_l.push("Blue");
        stack_l.push("Black");
        stack_l.push("Green");
        stack_l.push("Orange");
        stack_l.push("Yellow");

        //Now if I may ask, what will this give us?
        System.out.println(stack_l.search("Blue"));

    }
// So from this you can see this isn't that deep so far you've understood the concept
// the rest no go far at all na smalls

}
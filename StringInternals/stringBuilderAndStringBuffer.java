package stringInternals;

public class stringBuilderAndStringBuffer {
    /*String Builder is a mutable sequence of characters. Internally it uses a char array
    which is resizable. default capacity is 16 characters. 
    when the capacity is exceeded, it creates a new char array, copies old characters and continue append
    */

    public static void main(String[] args){

        //initialize stringBuild char array
        StringBuilder sb = new StringBuilder("hello");
        
        // append some characters in the end of hello
        sb.append(" world");
        System.out.println("Concatenate/Append -> "+ sb);

        //we can insert any characters at any of the index of our choice 
        sb.insert(2,"Y");
        System.out.println("Insert Character Y at index 2 -> " + sb);

        //delete characters from one index to another, all the remaining elements in left will shifts to right
        //here 1 is inclusive and 3 is exclusive
        sb.delete(1,3);
        System.out.println("Delete character from index 1 to 3 -> " + sb);

        //reverse the characters of array, it uses two-pointer swapping internally, takes O(N)
        sb.reverse();
        System.out.println("Reversed -> " + sb);

        //Till here, we have seen that sb is mutable and we can do whatever we want, now lets convert it to immutable string
        String immutableString = sb.toString();
        System.out.println("Converted to string -> "+ immutableString);

        //after learning all these methods, we came to know that, stringBuilder is faster that string as it just appends characters on particular index, instead of creating multiple objects again and again, as string does. 
        
        /* Time Complexity -
        append() - O(1)
        charAt() - O(1)
        insert() - O(n)
        delete() - O(n)
        reverse() - O(n)
        toString() - O(n)
        */

        /* StringBuilder and StringBuffer are same internally but,
            StringBuilder is not thread safe, which means multiple threads can access it , at the same time, which makes it unsynchronized, but faster
                example - 
                    Thread 1 ---> append()
                    Thread 2 ---> append()

                    Both execute together

            StringBuffer is thread safe, one thread access data at a time, which makes it synchronized, but slower
                example - 
                    Thread 1 ---> append() [Locked]
                    Thread 2 ---> waits
        */

        /*
        Both StringBuilder and StringBuffer reuse the implementation, as their parent interface is same i.e. AbstractStringBuilder
        */
    }
}
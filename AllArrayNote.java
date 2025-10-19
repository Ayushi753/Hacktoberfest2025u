import java.util.*;
import java.util.Collection;
class AllArrayNote
{
    public static void main(String args[])
    {
        ArrayList <Integer> list= new ArrayList<Integer>();


        //  add elements
        list.add(0);
        list .add(1);
        list.add(8);
        System.out.println(list);

        //get elements
        int element= list.get(2);
        System.out.println(element);

        // add element in between
        list .add(1,4);
        System.out.println(list);

        //set elements
        list .set(0,4);
        System.out.println(list);

        //remove elements
        list .remove(3);
        System.out.println(list);

        //size
        int size= list.size();
        System.out.println(size);

        //loops
        for(int i=0; i<list.size(); i++)
        {
            System.out.print(list.get(i));
        }
        System.out.println();

        //sorting
        Collections.sort(list);
        System.out.println(list);

        //Isempty
        list.isEmpty();
        System.out.println(list);

        //indexOf
        int indexOf=list.indexOf(3);
        System.out.println(indexOf);
    }

    
}

import org.junit.Test;
import org.junit.runners.Suite;

import java.util.*;

//import java.util.*;

public class Collections
{

    @Test
    public void apple()
    {
        //Performing collection action
        // This method will have to be deemed as collection do not have usable implementation of collecttion
        // interface.

    }
    @Test
    public void orange()
    {
        //performing mapping activity
        Map mp=new HashMap();
        //Adding elements to map
        mp.put(1,"Abram");
        mp.put(8,"RAKGOTHO");
        mp.put(2,"LEBUSA");

        //Traversing Map
        Set set = mp.entrySet();//  ENABLING TRANVERSE
        Iterator itr = set.iterator();

        while(itr.hasNext()){
            //Converting to Map.Entry so that we can get key and value separately

            Map.Entry entry=(Map.Entry)itr.next();
            //Here im obtaining a key and a value
            System.out.println(entry.getKey()+" "+entry.getValue());
            //System.out.println(itr.next()); //Doing only this will get the  key and values as assignment
        }



    }
    @Test
    public void pineapple()
    {
        //performing Setting activity
        HashSet<String> set = new HashSet<String>();
        set.add("Abram");
        set.add("Abram");
        set.add("Lebusa");
        set.add("Tryphina");

        Iterator<String> itr = set.iterator();
        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }


    }
    @Test
    public void pawpaw()
    {
        //performing List collection

        List<String> lst = new ArrayList<>();
        //Now adding list to my arraylist
        lst.add("Arinze");
        lst.add("Abram");
        lst.add("Lebusa");
        lst.add("Sanele");

        for(String display:lst)
        {

            System.out.println(display);
        }


    }
}



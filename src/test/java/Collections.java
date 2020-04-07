import org.junit.Test;

import java.util.*;

public class Collections
{
    @Test
    public void Collect()
    {
        Collection value = new ArrayList();

          value.add(5);
          value.add("Abram");
          value.add(4.3);


        for(Object i: value)
        {

            System.out.println(i);

        }


    }
    @Test
    public void Map()
            //Mapping

    {
        Map<String,String > mp = new HashMap<>();
        mp.put("Name: ", "Abram");
        mp.put("Surname: ", "Rakgotho");
        mp.put("Module: ", "ADP3");

        Set<String> keys = mp.keySet();

           for(String key: keys)

           {
               System.out.println(key +" "+ mp.get(key));
           }




    }
    @Test
    public void Set()
    {
        Set<String> st = new TreeSet<>();
        st.add("Course");
        st.add("Group");
        st.add("module");

        for(String s:st)
        {
            System.out.println(s);

        }


    }
    @Test
    public void list()
    {
        List<Integer> val = new ArrayList<Integer>();

            val.add(10);
            val.add(6);
            val.add(3);
            val.add(2);


        for(int i: val)
        {

            System.out.println(i);

        }

    }
}

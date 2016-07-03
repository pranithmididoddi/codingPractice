/**
 * Created by Pranith on 7/3/16.
 */

import java.util.*;

public class cutTheStack {

    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size=sc.nextInt();
        List<Integer> list=new ArrayList<>(size);

        System.out.println("Enter the elements into the list: ");

        for(int i=0;i<size; i++)
        {
            int value=sc.nextInt();
            list.add(value);
        }

        list.removeAll(Collections.singleton(0));

        while(list.size()>0) {
            int min = Collections.min(list);
            for (int i = 0; i < list.size(); i++) {


                list.set(i, list.get(i) - min);


            }

            list.removeAll(Collections.singleton(0));
            System.out.println(list.size());

        }
    }
}

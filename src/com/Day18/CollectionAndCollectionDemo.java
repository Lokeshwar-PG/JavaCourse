package com.Day18;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionAndCollectionDemo {

        public static void main(String[] args) {
            List<String> list = Arrays.asList("Goutham","ABC","Dolly","Allen");
            System.out.println(list);
            for (int i= list.size()-1;i>=0;i--){
                System.out.println(list.get(i));
            }
            Collections.sort(list);
            System.out.println(list);

            Collections.reverse(list);
            System.out.println(list);

            Collections.shuffle(list);
            System.out.println(list);

        }

}

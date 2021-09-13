package com.company.p4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CountWords {

    public static void main(String[] args) {

        List<String> s = new ArrayList<>();


        System.out.println("Enter String : ");
        String str = ReadData.sc.nextLine();

        s = List.of(str.split(" "));

        Map<String, Integer> map = new HashMap<>();

        for(int i=0; i < s.size(); i++){
            if(map.get(s.get(i))!=null)
                map.put(s.get(i), map.get(s.get(i))+1);
            else
                map.put(s.get(i),1);
        }



        System.out.println(map);
    }


}

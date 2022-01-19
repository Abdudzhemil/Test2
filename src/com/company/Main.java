package com.company;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        for (int i = 0; i < 10000; i++) {
            int j ;
            j= arrayList.get(arrayList.size()-1)+arrayList.get(arrayList.size()-2)+arrayList.get(arrayList.size()-3)+arrayList.get(arrayList.size()-4);
            j = j % 10;
            arrayList.add(j);
            if(arrayList.get(arrayList.size()-1)==4 && arrayList.get(arrayList.size()-2)==3 &&arrayList.get(arrayList.size()-3)==2 && arrayList.get(arrayList.size()-4)==1){
                System.out.println(i);
                System.out.println(arrayList);
                int f=0;
                for (int p=0; p< arrayList.size();p++){
                    f=f+ arrayList.get(p);
                }
                double h = (double) f / i;
                System.out.println(h);
                System.out.println(f);
                return;
            }
        }
    }
}



package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Hostel room1 = new Hostel("room1", "next to toilet",100);
        Hostel room2 = new Hostel("room2", "next to exit",110);
        Hostel room3 = new Hostel("room3", "next to lobby",150);
        Hostel room4 = new Hostel("room4", "next to bar",155);

        SemiLux chamber1 = new SemiLux("1","flor1",200, true);
        SemiLux chamber2 = new SemiLux("2","flor1",200);
        SemiLux chamber3 = new SemiLux("3","flor1",200);

        chamber3.setBarPrice(50);
        chamber3.setBreakfastPrice(100);

        List<IAccounting> list = Stream.of(
                room1, room2, room3, room4,
                chamber1, chamber2, chamber3).collect(Collectors.toList());

        int dayIncome = list.stream().mapToInt(IAccounting::getTotalSum).sum();
        System.out.println(dayIncome);

        String minProfit = list.stream().min(Comparator.comparing(item -> item.getTotalSum()))
                .orElse(null).getName();
        System.out.println(minProfit);

        Hostel2 room11 = new Hostel2("room11", "next to toilet",100);
        Hostel2 room22 = new Hostel2("room22", "next to exit",110);
        Hostel2 room33 = new Hostel2("room33", "next to lobby",150);
        Hostel2 room44 = new Hostel2("room44", "next to bar",155);

        SemiLux2 chamber11 = new SemiLux2("11","flor1",200, true);
        SemiLux2 chamber22 = new SemiLux2("22","flor1",200);
        SemiLux2 chamber33 = new SemiLux2("33","flor1",200);

        chamber33.setBarPrice(50);
        chamber33.setBreakfastPrice(100);

        List<BaseHousing> list2 = Stream.of(room11, room22, room33, room44, chamber11, chamber22, chamber33)
                .collect(Collectors.toList());


    }
}

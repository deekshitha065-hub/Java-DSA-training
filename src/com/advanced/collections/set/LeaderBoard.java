package com.advanced.collections.set;

import com.basics.strings.problems.ReverseAString;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class LeaderBoard {
    public static void main(String[] args) {
        Set<Integer> scores = new TreeSet<>();
        scores.add(100);
        scores.add(200);
        scores.add(23);
        scores.add(21);
        System.out.println("Leaderboard Status: "+scores);
    }
}

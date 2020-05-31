package WordLadder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class wordLadder {
    // find all possible next string for curr string, check if in dict,
    // all the possible next string, def. only change one letter, which is constant space
    // if true, move curr to this word and remove this word from dict,
    // else, continue
    public static int ladderLength(String s, String e, Set<String> dict) {
        if(dict == null || s == null || e == null || s.equals(e)) {
            return 0;
        }
        dict.add(e);
        int step = 1;
        Queue<String> q = new LinkedList<>();
        q.offer(s);

        while(!q.isEmpty()) {
            int levelSize = q.size();
            for(int i = 0; i < levelSize; i++) {
                String curr = q.poll();
                ArrayList<String> allNext = findNext(curr, dict);
                if(allNext.contains(e)) {
                    return step + 1;
                }
                q.addAll(allNext);
                dict.removeAll(allNext);
            }
            step++;
        }
        return -1;
    }

    public static ArrayList<String> findNext(String target, Set<String> dict) {
        if(target == null || dict == null) {
            return null;
        }
        ArrayList<String> next = new ArrayList<>();
        for(int i = 0; i < target.length(); i++) {
            for(char c = 'a'; c <= 'z'; c++) {
                if(target.charAt(i) != c) {
                    String curr = target.substring(0, i) + c + target.substring(i + 1);
                    if (dict.contains(curr)) {
                        next.add(curr);
                    }
                }
            }
        }
        return next;
    }

    public static void main(String[] args) {
        Set<String> dict = new HashSet<>();
        String start = "hit";
//        String end = "cog";
        String end = "dog";

        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        // hit -> hot -> dot -> dog -> cog
        System.out.println(ladderLength(start, end, dict));
    }
}

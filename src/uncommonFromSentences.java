import java.util.*;

/**
 * @author 闫亮23
 * @version 1.0
 */

// 两句话中 不常见的 单词
public class uncommonFromSentences {
   String s1;
   String s2;

    public uncommonFromSentences(String s1, String s2) {
        this.s1 = s1;
        this.s2 = s2;
    }


    public String[] uncommonFromSentences(String s1,String s2){
        Map<String,Integer> num = new HashMap<>();

        for(String s : s1.split(" "))
            num.put(s, num.getOrDefault(s,0)+1);
        for(String s : s2.split(" "))
            num.put(s, num.getOrDefault(s,0)+1);

        List<String> result = new ArrayList<>();

        for(String str : num.keySet()) // 遍历 所有 key 值
            if(num.get(str) == 1) {
                result.add(str);
            }

        return result.toArray(new String[0]);
            // new String[0]节省空间同时获取返回值为String[]的数组 性能更佳

    }


}


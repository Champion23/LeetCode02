import com.sun.javaws.IconUtil;

/**
 * @author 闫亮23
 * @version 1.0
 */
public class test {
    public static void main(String[] args) {
        String s1 = "lakers forever lebron James kobe";
        String s2 = "Nets forever James harden poul";
        uncommonFromSentences ufs = new uncommonFromSentences(s1, s2);
        String[] strs = ufs.uncommonFromSentences(s1,s2);
        for(int i =0 ;i< strs.length;i++){
            System.out.println(strs[i]);
        }
    }
    /**
     * 输出 如下：
     * lebron
     * harden
     * Nets
     * lakers
     */
}

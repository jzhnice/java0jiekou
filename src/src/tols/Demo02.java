package src.tols;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-10 08:13
 */

public class Demo02 {
    public static void main(String[] args) {
        String str[] = {"中文", "计算机", "ABC", "123", "qq@qq.com ", "ABC"};
        //1.将数组转换为集合   new HashSet<>(Arrays.asList(str));
        HashSet<String> set = new HashSet<>(Arrays.asList(str));
        System.out.println(set);
        // 将集合转换为数组  toArray()
        Object[] arr = set.toArray();
        System.out.println(Arrays.toString(arr));
        for (Object a : arr) {
            System.out.println(a);
        }
    }
}

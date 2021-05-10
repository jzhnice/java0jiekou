package src.tols;

import javax.xml.transform.Source;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-10 09:37
 */
public class Demo05 {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList<>();
        nums.add(2);
        nums.add(0);
        nums.add(-5);
        nums.add(3);
        nums.add(0);

        // 1.排序
        Collections.sort(nums);
        System.out.println("排序"+nums);
        //[-4, 2, 5, 13, 32, 34]
        //2.反转   reverse
        Collections.reverse(nums);
        System.out.println("反转"+nums);
        //[34, 32, 13, 5, 2, -4]
        //3,混洗
        Collections.shuffle(nums);
        System.out.println("混洗"+nums);
        // [-4, 13, 5, 2, 32, 34]
        //4.求最大值  求最小值
        System.out.println("最大值"+Collections.max(nums));
        System.out.println("最小值"+Collections.min(nums));
        // 5 替换
        Collections.replaceAll(nums,0,100);
        System.out.println( "替换"+nums);
        // 6 q求频率
        System.out.println("频率"+Collections.frequency(nums,100));
        // 7,二分搜索,, 使用的条件是集合有序的
        Collections.sort(nums);
        System.out.println(nums);
        int i = Collections.binarySearch(nums,3);
        System.out.println("位置"+i);


    }
}

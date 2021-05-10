package src.tols;

import java.util.*;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-10 08:21
 */


//现再学的中  数组的查新效率是最高的
public class Demo03 {
    public static void main(String[] args) {
        HashMap <String,String> map = new HashMap<>();
        map.put("1","A");
        map.put("2","B");
        map.put("3","C");
        map.put("4","D");
        //1:  keySet();
        Set<String> keys=map.keySet();
        System.out.println(keys);
        // 2:把set转换为其他集合
        ArrayList<String> alistkeys=new ArrayList<>(keys);
        System.out.println(alistkeys);
        //3 取出map的值  value()
        Collection<String> v = map.values();
        System.out.println(v);
        //4 把值转换成其他的即合 new LinkedList<>(v);
        LinkedList<String> llist  = new LinkedList<>(v);
        System.out.println(llist);
    }
}
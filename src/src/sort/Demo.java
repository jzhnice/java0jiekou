package src.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-10 10:24
 */
public class Demo {
    public static void main(String[] arg ) {
        ArrayList<User> list= new ArrayList<>() ;
        User zhangsan=new User(15,"zhangsan",98);
        User lisi=new User(13,"lisi",88);
        User wangwu=new User(16,"wangwu",68);

        list.add(zhangsan);
        list.add(lisi);
        list.add(wangwu);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, new Comparator<User>() {
            @Override
            public int compare(User o1, User o2) {
                return o1.getUid()-o2.getUid();
            }
        });
        System.out.println(list);

    }
}

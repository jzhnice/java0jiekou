package src.sort;

import java.util.Arrays;

//自定义类的排序
/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-05-10 10:18
 */
public class User  implements Comparable<User>{
    private  Integer uid;
    private  String  name;
    private  Integer  grade;

    public User() {
    }

    public User(Integer uid, String name, Integer grade) {
        this.uid = uid;
        this.name = name;
        this.grade = grade;
    }



    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public int compareTo(User o) {
        return this.getUid()-o.getUid();
    }




    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
/**@Override
public int compareTo(Object o) {
return this.getGrade() - o.getGrade();
}*/

package java8.lambdas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
    public Integer eno;
    public String ename;

    public Employee(Integer eno, String ename) {
        this.eno = eno;
        this.ename = ename;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "eno=" + eno +
                ", ename='" + ename + '\'' +
                '}';
    }
}
public class CustomizedObjSortDemo {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        list.add(new Employee(500,"Five Hundreds"));
        list.add(new Employee(200,"Two Hundreds"));
        list.add(new Employee(100,"One Hundred"));
        list.add(new Employee(400,"Four Hundreds"));
        list.add(new Employee(300,"Three Hundreds"));
        System.out.println("list before sorting = " + list);
        Collections.sort(list,(Employee e1,Employee e2)-> {
            return (e1.eno < e2.eno) ? 1 : ((e1.eno > e2.eno) ? -1 : 0);
        });
        System.out.println("list after sorting = " + list);
    }
}

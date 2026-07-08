package model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Interview {
    public static void main(String[] args) {

        int[] input = {3,5,7,3,5,20,3,4,7,11,5,3,4};
//        Output = {3,5,7,4,20,11}
        LinkedHashMap<Integer, Long> collect = Arrays.stream(input).boxed().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new,
                Collectors.counting()));
        System.out.println(collect);
//        collect.entrySet().stream().sorted(Comparator.comparing(Map.Entry::comparingByValue).reversed()).map(x -> x.getKey()).toArray();
//
//        ename, salary, dname
//                dapt- > avg.20000
//
//            dept wise
//
//        Emp_ID	Emp_name	Salary	Dept_ID
//        100	Ram	20000	            1001
//        101	Joseph	25000	        1002
//        103	Karthic	15000	        1001
//        104	Jyothi	20000	        1003
//        105	Radhika	25000	        1002
//
//
//        Dept_ID	Dept_Name
//        1001	IT
//        1002	CSC
//        1003	ECE
//
//            select d.dept_name, e.Emp_name, e.salary from employee e inner join dept d on e.dept_id= d.dept_id
//               where e.salary > (select d.dept_name, avg(e.salary) from )

    }
}

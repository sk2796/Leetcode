package Easy;

import model.Employee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8 {

    
    public static void main(String[] args) {
        int[] arr = {5,8,7,6,9,2,3,5,4,2,6,8,9,7,7,4,6,6,9,8,4};
        int[] nums = {5,8,4,6};
        Map<Integer, Integer> hmap = new HashMap<>();
        for(int x : nums) {
            if(hmap.containsKey(x)) {
                hmap.put(x, hmap.get(x)+1);
            } else hmap.put(x, 1);
        }
//        System.out.println(hmap);
        int max = hmap.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
        int min = hmap.entrySet().stream().min(Map.Entry.comparingByValue()).get().getKey();
        int single = hmap.entrySet().stream().filter(x -> x.getValue()==1).findFirst().get().getKey();
//        Map.Entry<Integer, Integer> integerIntegerEntry = hmap.entrySet().stream().filter(x -> Collections.frequency(Arrays.asList(nums), x) > 1).findFirst().get();
//        System.out.println(integerIntegerEntry);
//        System.out.println(max);
//        System.out.println(min);
//        System.out.println(single);
        System.out.println("------------------");
//        IntStream.range(0, 10).forEach(System.out::println);


        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Yanksha", 28, 12300, "F", "HR", "Blore", 2020));
        empList.add(new Employee(2, "Francesca", 29, 12000, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 11500, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 12500, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 15000, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 14000, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 13000, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 14500, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(9, "Ram", 25, 16000, "M", "IT", "Blore", 2010));

//        Map<String, Double> collect = empList.stream().collect(Collectors.groupingBy(Employee::department,
//                Collectors.mapping(Employee::salary, Collectors.collectingAndThen(Collectors.toSet(),
//                        s -> s.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get()))));
//
//        empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(
//                Employee::salary,
//        )));
//        System.out.println(collect);
    }


}

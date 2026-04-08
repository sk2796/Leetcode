package Easy;

import model.Employee;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

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
        empList.add(new Employee(2, "Francesca", 29, 10000, "F", "HR", "Hyderabad", 2015));
        empList.add(new Employee(3, "Ramesh", 30, 11500, "M", "HR", "Chennai", 2014));
        empList.add(new Employee(4, "Melanie", 32, 12500, "F", "HR", "Chennai", 2013));

        empList.add(new Employee(5, "Padma", 22, 15000, "F", "IT", "Noida", 2013));
        empList.add(new Employee(6, "Milad", 27, 14000, "M", "IT", "Gurugram", 2017));
        empList.add(new Employee(7, "Uzma", 26, 13000, "F", "IT", "Pune", 2016));
        empList.add(new Employee(8, "Ali", 23, 14500, "M", "IT", "Trivandam", 2015));
        empList.add(new Employee(10, "Ram3wj", 30, 11000, "M", "OP", "Pune", 2011));
        empList.add(new Employee(9, "Shubham", 29, 26000, "M", "IT", "Pune", 2025));


//        Map<String, Double> collect = empList.stream().
//                collect(Collectors.groupingBy(Employee::department,
//                Collectors.mapping(Employee::salary, Collectors.collectingAndThen(Collectors.toSet(),
//                        s -> s.stream().sorted(Comparator.reverseOrder()).collect()))));

        //sort by sal and group by dept
        Map<String, List<Employee>> sortBySal = empList.stream().sorted((a, b) -> (int) (a.salary() - b.salary()))
                .collect(Collectors.groupingBy(Employee::department)
        );
        System.out.println(sortBySal);

        Map<String, List<Employee>> sortBySal1 = empList.stream().sorted(Comparator.comparing(Employee::salary)).collect(
                Collectors.groupingBy(Employee::department)
        );
        System.out.println(sortBySal1);




        //group by age
        Map<Integer, List<Employee>> ageGroup = empList.stream().collect(Collectors.groupingBy(Employee::age));
        System.out.println(ageGroup);

        Map<Integer, List<Employee>> collect1 = empList.stream().sorted(Comparator.comparing(Employee::age))
                .collect(Collectors.groupingBy(Employee::age, TreeMap::new, Collectors.toList()));
        System.out.println(collect1);

//        empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(
//                Employee::salary, Collectors.collectingAndThen(Collectors.toList(),
//                        s -> s.stream().collect(Collectors.maxBy(Comparator.comparing()))))));

        // List of sal per dept
        Map<String, List<Double>> collect = empList.stream().collect(
                Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::salary, Collectors.toList())));
        System.out.println(collect);


        Map<String, Optional<Employee>> collect2 = empList.stream().collect(Collectors.groupingBy(
                Employee::department, Collectors.maxBy(Comparator.comparing(Employee::salary))));
        System.out.println(collect2);

        Map<String, Double> collect3 = empList.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.averagingDouble(Employee::salary)));
        System.out.println(collect3);

        Map<String, Optional<Double>> collect4 = empList.stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.mapping(Employee::salary, Collectors.collectingAndThen(Collectors.toList(),
                        s -> s.stream().reduce(Double::sum)))));

        System.out.println(collect4);

        Optional<Employee> max1 = empList.stream().max(Comparator.comparing(Employee::salary));
        System.out.println(max1.get());

        double collect5 = empList.stream().mapToDouble(Employee::age).sum();
        System.out.println("Collect age "+collect5);

        TreeMap<String, Employee> collect6 = empList.stream().collect(Collectors.groupingBy(Employee::department,
                TreeMap::new, Collectors.mapping(Function.identity(), Collectors.collectingAndThen(Collectors.toList(),
                        s -> s.stream().max(Comparator.comparing(Employee::age)).get()))));

        System.out.println(collect6);

        Map<Integer, Optional<Employee>> collect7 = empList.stream().collect(Collectors.groupingBy(Employee::age, TreeMap::new, Collectors.maxBy(Comparator.comparing(Employee::salary))));
        System.out.println(collect7);

        Map<String, Long> collect8 = empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.counting()));
        System.out.println(collect8);

//        empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(Fun)))
        Map<String, Long> collect9 = empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::age,
                Collectors.filtering(x -> (x >= 30), Collectors.counting()))));

        System.out.println(collect9);

        Map<String, List<Integer>> collect11 = empList.stream().collect(Collectors.groupingBy(Employee::department, Collectors.mapping(Employee::age,
                Collectors.filtering(age -> (age >= 25), Collectors.toList()
                ))));
        System.out.println("hj "+collect11);

        LocalDate date = LocalDate.now();
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("DATE :"+date);
        System.out.println("ZONE :"+zonedDateTime);
        System.out.println("ZONEdate :"+localDateTime);

        Long collect13 = empList.stream().filter(x -> x.yearOfJoining() >= 2015).count();
        System.out.println(collect13);

        List<Employee> collect12 = empList.stream().filter(x -> x.yearOfJoining() >= 2015)
                .filter(z -> z.salary()>=13000 && z.salary()<=18000)
                .sorted(Comparator.comparing(Employee::salary)).collect(Collectors.toList());
        System.out.println(collect12);

        String s = "abc";

        List<?> collect10 = IntStream.rangeClosed(1, s.length()).boxed().flatMap(x -> permutation(s, x).stream()).distinct().collect(Collectors.toList());
        System.out.println(collect10);

    }



    private static Set<String> permutation(String str, Integer length) {
        if(length==1) {
            return str.chars().mapToObj(c -> String.valueOf((char) c)).collect(Collectors.toSet());
        }
        return permutation(str, length-1).stream().flatMap(p-> str.chars().mapToObj(c -> p + (char) c))
                .filter(s -> isUnique(s)).collect(Collectors.toSet());
    }

    private static boolean isUnique(String s) {
        return s.chars().distinct().count() == s.length();
    }

}

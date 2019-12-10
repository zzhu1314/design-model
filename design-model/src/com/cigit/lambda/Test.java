package com.cigit.lambda;

import java.io.PrintStream;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * @Author:zhuzhou
 * @Date: 2019/10/31  11:15
 * ① Lambda 体中调用方法的参数列表与返回值类型，要与函数式接口抽象方法的函数列表和返回值类型保持一致！
 * 　② Lambda 参数列表中的第一参数是实例方法的调用者，而第二个参数是实例方法的参数时，可以使用 类名 :: Method
 * 当不存在第二个参数时，实例方法也必须是无参方法
 **/
public class Test {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("1", "1", "3", "4");
        List<String> distinct = list.stream().filter(distinctByKey(s -> s)).collect(Collectors.toList());
        System.out.println(distinct);

    }

    private static <T> Predicate<T> distinctByKey(Function<? super T, ?> keyExtractor) {
        Map<Object, Boolean> seen = new ConcurrentHashMap<>();
        return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
        // return t -> seen.putIfAbsent(keyExtractor.apply(t), Boolean.TRUE) == null;
    }

    @org.junit.Test
    public void test1() {
        //方法引用1.对象::方法名,
        PrintStream ps = System.out;
        Consumer<Employee> consumer1 = ps::println;//被调用方法的返回类型要与抽象方法accept返回类型一致
        consumer1.accept(new Employee(11, 23, "zz"));
        Employee employee = new Employee(11);
        Supplier<Integer> supplier = employee::getId;
        supplier.get();
    }

    @org.junit.Test
    public void test2() {
        //方法引用2.类::静态方法名
        Comparator<Integer> comparator = (x, y) -> x.compareTo(y);
        Comparator<Integer> comparator1 = Integer::compare;
        int compare = comparator.compare(4, 2);
        int compare1 = comparator1.compare(5, 3);
        System.out.println(compare);
        System.out.println(compare1);
    }

    @org.junit.Test
    public void test3() {
        //方法引用3.类::方法名,第一个参数必须调用该方法，第二个参数需是方法的参数
        BiPredicate<String, String> predicate = (x, y) -> x.equals(y);
        BiPredicate<String, String> predicate1 = String::equals;
        boolean test = predicate.test("3", "5");
        boolean test1 = predicate1.test("3", "5");
        System.out.println(test);
        System.out.println(test1);
        List<Employee> list = new ArrayList<>(Arrays.asList(new Employee(1), new Employee(5),
                new Employee(4)));


        List<Employee> collect = list.stream().sorted(Comparator.comparingInt(Employee::getId)).collect(Collectors.toList());
        System.out.println(list);
        System.out.println(collect);
    }

    @org.junit.Test
    public void test4() {
        //构造器引用 类::new   ,有几个参数就返回带几个参数的构造函数
        Supplier<Employee> supplier = () -> new Employee();
        Employee employee = supplier.get();
        Supplier<Employee> supplier1 = Employee::new;//无参构造函数
        Employee employee1 = supplier1.get();
        System.out.println(employee);
        System.out.println(employee1);
        Function<Integer, Employee> function = Employee::new;
        Employee apply = function.apply(111);
        System.out.println(apply);
        BiFunction<Integer, Integer, Employee> biFunction = Employee::new;
        Employee apply1 = biFunction.apply(11, 22);
        System.out.println(apply1);
    }

    @org.junit.Test
    public void test5() {
        //数组引用 类型[]::new
        Function<Integer, String[]> function = String[]::new;
        String[] apply = function.apply(10);
        System.out.println(apply.length);
    }

    public static void doSomething(Runnable r) {
        r.run();
    }

    public static void doSomething(Task task) {
        task.excute();
    }

    @org.junit.Test
    public void test06() {
        doSomething((Task) () -> System.out.println("111"));
    }

    @org.junit.Test
    public void test07() {
        List<Double> list = Arrays.asList(1d, 2d, 5d, 3d);
        list.sort(Double::compareTo);
        list.stream().sorted(Double::compareTo);
        System.out.println(list);
    }
    @org.junit.Test
    public void test08() {
        List<Employee> employees = Arrays.asList(new Employee(1, 23), new Employee(2, 43), new Employee(3, 32));
        ToIntFunction<Employee> toIntFunction = (x)->x.getAge();
        toIntFunction.applyAsInt(new Employee());
        ToIntFunction<Employee> toIntFunctionq =Employee::getAge;
        List<Employee> collect = employees.stream().sorted((Comparator.comparingInt(toIntFunction))).collect(Collectors.toList());
        System.out.println(collect);

    }
}

interface Task {
    public void excute();
}




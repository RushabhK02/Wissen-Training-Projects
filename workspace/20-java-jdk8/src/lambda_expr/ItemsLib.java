package lambda_expr;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ItemsLib {

	public <T> List<T> filter(List<T> list, Predicate<T> predicate) {
		List<T> newList = new ArrayList<>();
		for (T element : list) {
			if (predicate.test(element)) {
				newList.add(element);
			}
		}
		return newList;
	}

	public <T, E> List<E> map(List<T> list, Function<T, E> function) {
		List<E> newList = new ArrayList<>();
		for (T element : list) {
			newList.add(function.apply(element));
		}
		return newList;
	}

	public <T> void forEach(List<T> list, Consumer<T> consumer) {
		for (T element : list) {
			consumer.accept(element);
		}
	}

	public static void main(String[] args) {
		ItemsLib itemsLib = new ItemsLib();
		List<Employee> list = Arrays.asList(Employee.SOME);
		Predicate<Employee> pred = e -> e.getSalary() < 3000;

		Consumer<Employee> consume = e -> {
			System.out.println("Name: " + e.getName());
			System.out.println("Salary: " + e.getSalary());
			System.out.println();
		};

		List<Employee> list2 = itemsLib.filter(list, pred);
		itemsLib.forEach(list2, consume);

		List<String> list3 = itemsLib.map(list, e -> {return e.getName();});
		for(String element:list3) {
			System.out.println(element);
		}

	}

}

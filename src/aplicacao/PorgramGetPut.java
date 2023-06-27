package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PorgramGetPut {

	public static void main(String[] args) {
		
		List<Double> doubleList = Arrays.asList(3.24,6.45,19.51,2.29);
		List<Long> longList = Arrays.asList(43232L, 1313123212L, 8484916L,393848L);
		List<Integer> integerList = Arrays.asList(2,17,4,9,221);		
		
		List<Object> objectList = new ArrayList<Object>();	
		
		print(objectList); // emptyList
		copySubCLassToSuperClassOfNumber(integerList, objectList);
		print(objectList);		
		copySubCLassToSuperClassOfNumber(longList, objectList);
		print(objectList);
		copySubCLassToSuperClassOfNumber(doubleList, objectList);
		print(objectList);
		
		

	}
	
	// acessa uma lista de subclasse de number (consegue acessar o método GET)
	// adiciona cada item em um lista de superClass de Number(consegue acessar o método PUT)
	public static void copySubCLassToSuperClassOfNumber(List<? extends Number> from, List<? super Number> to) {
		for(Number nickname : from) {
			to.add(nickname);
		}
	}
	
	public static void print(List<?> listOfObject) {
		System.out.println("Printling list of Numbers");
		for(Object nickname : listOfObject) {
			System.out.println(nickname + " ");
		}
		System.out.println("\n");
	}

}

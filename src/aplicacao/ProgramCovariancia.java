package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCovariancia {

	public static void main(String[] args) {
		
		System.out.println("Covariância\n"
				+ "Acontece quando a operação de GET é permite, mas a operação de PUT não é permitida.\n"
				+ "Não é permite adicionar, pois o compilador não sabe se o tipo double vai ser compatível contro outro tipo de number da lista.\n");
		
		List<Double> doubleList = new ArrayList<Double>();
		doubleList.add(2.5);
		doubleList.add(6.28);
		doubleList.add(4.19);
		
		List<? extends Number> numberList = doubleList;
		
		Number n1 = doubleList.get(0);
		Number n2 = doubleList.get(1);
		Number n3 = doubleList.get(2);
		
		System.out.println(Arrays.asList(doubleList));
		
		

	}

}

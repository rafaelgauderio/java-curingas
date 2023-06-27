package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramCovariancia {

	public static void main(String[] args) {
		
		System.out.println("Covari�ncia\n"
				+ "Acontece quando a opera��o de GET � permite, mas a opera��o de PUT n�o � permitida.\n"
				+ "N�o � permite adicionar, pois o compilador n�o sabe se o tipo double vai ser compat�vel contro outro tipo de number da lista.\n");
		
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

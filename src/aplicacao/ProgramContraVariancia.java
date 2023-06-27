package aplicacao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProgramContraVariancia {

	public static void main(String[] args) {
		
		System.out.println("Contravari�ncia\n"
				+ "Acontece quando a opera��o de GET � proibida, mas a opera��o de PUT � permitida.\n"
				+ "� poss�vel adicionar qualquer tipo de Number ou supertipo de number na lista.\n"
				+ "A atribui��o n�o � permitida, porque o tipo da lista pode ser um supertipo de Number.\n");
		
		List<Object> objectList = new ArrayList<Object>();
		objectList.add(2.5);
		objectList.add(17);
		objectList.add("Rafael");
		objectList.add('a');
		objectList.add(true);
		objectList.add(null);
		
		List<? super Number> miscellaneousList = objectList;
		
		/*
		Number n1 = (Number) miscellaneousList.get(0);
		Number n2 = (Number) miscellaneousList.get(1);
		Number n3 = (Number) miscellaneousList.get(2);
		Number n4 = (Number) miscellaneousList.get(3);
		Number n5 = (Number) miscellaneousList.get(4);
		Number n6 = (Number) miscellaneousList.get(5);
		*/		
		
		System.out.println(Arrays.asList(miscellaneousList));		

	}

}

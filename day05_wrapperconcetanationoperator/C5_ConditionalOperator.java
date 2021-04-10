package day05_wrapperconcetanationoperator;

public class C5_ConditionalOperator {

	public static void main(String[] args) {
		
	//AND (&&), OR ||
	
		boolean isTrue=5>4 && 7-3>0;//eger &&(and) ile olanda hamisi true dursa demeli true cixir
		//eger biri false olsa demeli false dur
		System.out.println(isTrue);//true
		int x=10;
		int y=5;
		System.out.println(x/y==2 && x*y>20 && x-y>0);//true
	System.out.println(x+y<0 && x-y >0);//false
		//OR(||) opertaoru ise optimistdir.1 i true olsa cvb true olr
	System.out.println(x<y || x+y<0 ||x*y>0);//true
	

	}

}

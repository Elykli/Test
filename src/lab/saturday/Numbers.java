package lab.saturday;

public class Numbers {

	public static void main(String[] args) {
		
		//declare variable of type int
		int iNumOne, iNumTwo, iResult;
		
		//declare variable of type double
		double dNumOne, dNumTwo, dResult;
		
		//assign/store
		
		iNumOne = 5;
		iNumTwo = 2;
		
		dNumOne = 10.0;
		dNumTwo = 11.5;
		
		String intRes = " int result :";
		String dRes = " double result :";
		
		iResult = iNumOne + (int) dNumOne;
		dResult = dNumTwo + iNumOne;
		System.out.println("int result :" + iResult);
		System.out.println("double result :" + dResult);
		
		iResult = iNumOne - (int) dNumOne;
		dResult = dNumTwo - iNumOne;
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
		
		iResult = iNumOne * (int) dNumOne;
		dResult = dNumTwo * iNumOne;
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
		
		iResult = iNumOne / (int) dNumOne;
		dResult = dNumTwo / iNumOne;
		System.out.println(intRes + iResult);
		System.out.println(dRes + dResult);
	}

}

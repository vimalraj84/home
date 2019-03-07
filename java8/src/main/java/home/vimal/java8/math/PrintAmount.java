package home.vimal.java8.math;

import java.util.Arrays;
import java.util.stream.IntStream;

public class PrintAmount {

	public static void main(String[] args) {
		float ip = 345.92f;
		
		System.out.println("Input : "+String.valueOf(ip));
		String[] amount = String.valueOf(ip).split("\\D");
		Arrays.asList(amount).forEach(System.out::println);
		int dollor = Integer.parseInt(amount[0]);
		IntStream.rangeClosed(1, amount[0].length()).forEach(digit -> {
			
			if(digit == 1)
				System.out.format("%s Hundred and",Ones.getOnes(dollor/100));
			else if(digit == 2)
				System.out.format(" %s",Tens.getTens((dollor/10)%10));
			else if(digit == 3)
				System.out.format(" %s Dollors",Ones.getOnes(dollor%10));
		});
		
		
		int change = Integer.parseInt(amount[1]);
		IntStream.rangeClosed(1, amount[1].length()).forEach(digit -> {
			
			if(digit == 1)
				System.out.format(" %s",Tens.getTens(change/10));
			else if(digit == 2)
				System.out.format(" %s cents",Ones.getOnes(change%10));
		});
		
		
	}
	
	
	public static enum Ones{
		
		ONE(1),
		TWO(2),
		THREE(3),
		FOUR(4),
		FIVE(5),
		SIX(6),
		SEVEN(7),
		EIGHT(8),
		NINE(9);
		
		int num;
		
		private Ones(int n) {
			this.num=n;
		}
		
		public static String getOnes(int n) {
			for(Ones ones:Ones.values()) {
				if(ones.num == n)
					return ones.toString();
			}
			return "";
		}
		
	}
	
	public static enum Tens{
		
		TEN(1),
		TWENTY(2),
		THIRTY(3),
		FOURTY(4),
		FIFTY(5),
		SIXTY(6),
		SEVENTY(7),
		EIGHTY(8),
		NINTY(9);
		
		int num;
		
		private Tens(int n) {
			this.num=n;
		}
		
		public static String getTens(int n) {
			for(Tens tens:Tens.values()) {
				if(tens.num == n)
					return tens.toString();
			}
			return "";
		}
	}

}

package practicalOne;

import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumbers {

	public static void main(String[] args) {

		Set<Integer> randomValue = new LinkedHashSet<Integer>();
		while (randomValue.size() != 500) {
			randomValue.add(getRandomNumInRange(0, 999));
		}

		Integer max = null;
		 
		for(Integer x : randomValue){
		    if(max == null){
		        max = x;
		    }else if(max < x ){
		        max = x;    
		    }
		}
		
		Integer min = null;
		
		for(Integer y : randomValue){
		    if(min == null){
		        min = y;
		    }else if(min > y ){
		        min = y;    
		    }
		}
		int size = randomValue.size();
		System.out.println("This array contains "+ size +" numbers");
		System.out.println("Smallest number: " + min);
		System.out.println( "Largest number: " + max );
		
		System.out.println();
		System.out.println("random unique numbers list");
		
		for(Integer n : randomValue) {
			System.out.print(n+" ");
		}
	}

	public static int getRandomNumInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}
		Random r = new Random();
		int randomResult = r.nextInt(max - min + 1) + min;

		return randomResult;
	}

	
}

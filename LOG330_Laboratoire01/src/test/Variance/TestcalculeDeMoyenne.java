package test.Variance;

import java.util.ArrayList;

import org.junit.Test;

public class TestcalculeDeMoyenne {
	
	private ArrayList<Integer> ValeurTest ;
	

	   public class TestcalculEcartType {
		   

		@Test
		public void TestlmiteInferieure() {
			
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			
		}
		@Test
	    public void TestlmiteSuperieure() {
			
			
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
		}
	    @Test
	    public void TestValeurInvalide() {
	    	
	    	ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			ValeurTest.add(4);
			
		}
	}


}

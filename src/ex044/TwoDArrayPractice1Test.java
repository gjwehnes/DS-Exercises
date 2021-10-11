package ex044;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class TwoDArrayPractice1Test {


	@Test
	public void tests() {
		
		double[][] a = {
				{1.4,2.0,3.3,2,1},
				{4,1.5,6.1,1,1},
				{1.2,3.1,4,1.6,1}
			};
			double[][] result = {
			    {2.8,4,6.6,4,2},
			    {8,3,12.2,2,2},
			    {2.4,6.2,8,3.2,2}
			};
			TwoDArrayPractice1.doubleArray(a);
			for(int r=0;r<a.length;r++)
			    for(int c=0;c<a[0].length;c++)
			        assertEquals(result[r][c],a[r][c],0.001);
	}


}

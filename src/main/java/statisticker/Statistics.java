package statisticker;

import java.util.List;

public class Statistics 
{
    public static class Stats {

		public float average;
		
		public float max;
		
		public float min;
	}

	public static Stats getStatistics(List<Float> numbers) {
		
		Stats stats = new Stats();
		
		stats.average = Statistics.getAverage(numbers);
		
		stats.max = Statistics.getMax(numbers);
		
		stats.min = Statistics.getMin(numbers);
		
		return stats;
    }
	
	private static float getAverage(List<Float> numbers) {
		if(numbers.isEmpty()) {
			return Float.NaN;
		}
		float avg = 0;
		for(float f: numbers) {
			avg += f;
		}
		return avg/numbers.size();
	}
	
	private static float getMax(List<Float> numbers) {
		if(numbers.isEmpty()) {
			return Float.NaN;
		}
		float max = numbers.get(0);
		for(float f: numbers) {
			if(f>max) {
				max = f;
			}
		}
		return max;
	}
	
	private static float getMin(List<Float> numbers) {
		if(numbers.isEmpty()) {
			return Float.NaN;
		}
		float min = numbers.get(0);
		for(float f: numbers) {
			if(f<min) {
				min = f;
			}
		}
		return min;
	}
}

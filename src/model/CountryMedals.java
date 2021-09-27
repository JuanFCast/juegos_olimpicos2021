package model;

import java.util.Comparator;

public class CountryMedals implements Comparator<Country>{
	@Override
	public int compare(Country c1, Country c2) {
		
		if(c1.getmGoldMedal() > c2.getmGoldMedal()) {
			return -1;
			
		}else if (c1.getmGoldMedal() < c2.getmGoldMedal()) {
			return 1;
			
		}else {
			if(c1.getmSilverMedal() > c2.getmSilverMedal()) {
				return -1;
				
			}else if(c1.getmSilverMedal() < c2.getmSilverMedal()) {
				return 1;
				
			}else {
				if(c1.getmBronzeMedal() > c2.getmBronzeMedal()) {
					return -1;
					
				}else if(c1.getmBronzeMedal() < c2.getmBronzeMedal()) {
					return 1;
					
				}else {
					return c1.getName().compareTo(c2.getName());
				}
			}
		}
	}
}

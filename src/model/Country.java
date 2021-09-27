package model;

public class Country {
	private String name;
	private int mGoldMedal;
	private int mSilverMedal;
	private int mBronzeMedal;
	private int fGoldMedal;
	private int fSilverMedal;
	private int fBronzeMedal;
	private int combinedGoldMedal;
	private int combinedSilverMedal;
	private int combinedBronzeMedal;

	public Country(String name, int mGoldMedal, int mSilverMedal, int mBronzeMedal, int fGoldMedal, int fSilverMedal, int fBronzeMedal) {
		this.name = name;
		this.mGoldMedal = mGoldMedal;
		this.mSilverMedal = mSilverMedal;
		this.mBronzeMedal = mBronzeMedal;
		this.fGoldMedal = fGoldMedal;
		this.fSilverMedal = fSilverMedal;
		this.fBronzeMedal = fBronzeMedal;
	}

	public Country(String name, int combinedGoldMedal, int combinedSilverMedal, int combinedBronzeMedal) {
		this.name = name;
		this.combinedGoldMedal = combinedGoldMedal;
		this.combinedSilverMedal = combinedSilverMedal;
		this.combinedBronzeMedal = combinedBronzeMedal;

	}

	public String getName() {
		return name;
	}

	public int getmGoldMedal() {
		return mGoldMedal;
	}

	public int getmSilverMedal() {
		return mSilverMedal;
	}

	public int getmBronzeMedal() {
		return mBronzeMedal;
	}

	public int getfGoldMedal() {
		return fGoldMedal;
	}

	public int getfSilverMedal() {
		return fSilverMedal;
	}

	public int getfBronzeMedal() {
		return fBronzeMedal;
	}

	public int getcombinedGoldMedal() {
		return combinedGoldMedal;
	}

	public int getcombinedSilverMedal() {
		return combinedSilverMedal;
	}

	public int getcBronce() {
		return combinedBronzeMedal;
	}

	// 0 si son iguales, 1 si es mayor a c, -1 si es menor a c
	public int compareTo(Country c) {
		//Se compara medalla de oro
		if(fGoldMedal > c.getfGoldMedal()) {
			return 1;
		}else if (fGoldMedal < c.getfGoldMedal()) {
			return -1;
		}else {
			//Se compara medalla de oro plata
			if(fSilverMedal > c.getfSilverMedal()) {
				return 1;
			}else if(fSilverMedal < c.getfSilverMedal()) {
				return -1;
			}else {
				//Se compara medalla de oro bronce
				if(fBronzeMedal > c.getfBronzeMedal()) {
					return 1;
				}else if(fBronzeMedal < c.getfBronzeMedal()) {
					return -1;
				}else {
					//Se compara por nombre
					return name.compareTo(c.getName());
				}
			}
		}
	}
}

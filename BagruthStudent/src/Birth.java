
public class Birth {
	private int year, month, day;

	public Birth(int year_, int month_, int day_) {
		setDay(day_);
		setMonth(month_);
		setYear(year_);
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public void setYear(int year) {
		this.year = year;
	}
}

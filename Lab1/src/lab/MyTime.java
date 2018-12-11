package lab;

import java.util.Calendar;
import java.util.Scanner;

public class MyTime {
	private int hour;
	private int minute;
	private int second;
	public int getHour() {
		return hour;
	}


	public void setHour(int hour) {
		this.hour = hour;
	}


	public int getMinute() {
		return minute;
	}


	public void setMinute(int minute) {
		this.minute = minute;
	}


	public int getSecond() {
		return second;
	}


	public void setSecond(int second) {
		this.second = second;
	}
	public MyTime(int hour,int minute,int second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
	}
	public String timeDifference() {
		Calendar c = Calendar.getInstance();
		 int hour=c.get(Calendar.HOUR_OF_DAY);
		 int minute=c.get(Calendar.MINUTE);
		 int second=c.get(Calendar.SECOND);
		 if (this.hour-hour < 0) {hour-=24;}
		 if (this.minute-minute < 0) {minute-=60;}
		 if (this.second-second < 0) {second-=60;}
		 return (this.hour - hour)+":"+(this.minute-minute)+":"+(this.second-second);
	}
	public MyTime() {
	 Calendar c = Calendar.getInstance();
	 this.hour=c.get(Calendar.HOUR_OF_DAY);
	 this.minute=c.get(Calendar.MINUTE);
	 this.second=c.get(Calendar.SECOND);
	}
	
	
@Override
	public String toString() {
		return   hour + ":" + minute + ":" + second + ":";
	}


public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	MyTime time1 = new
			MyTime(input.nextInt(),input.nextInt(),input.nextInt());
	   MyTime time2 = new MyTime();
	   System.out.println("current time "+time2);
	   System.out.println("input time "+time1);
	   System.out.println("difference "+time1.timeDifference());
}
}

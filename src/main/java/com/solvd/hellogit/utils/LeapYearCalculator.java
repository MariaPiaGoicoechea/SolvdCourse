package com.solvd.hellogit.utils;

public class LeapYearCalculator {

	public LeapYearCalculator() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean isLeapYear(int year) {
	    // if the year is divided by 4
	    if (year % 4 == 0) {
	      // if the year is century (Gregorian Calendar)
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          return true;
	        else
	          return false;
	      }
	      // if the year is not century
	      else
	        return true;
	    }
	    else
	      return false;
	}
}

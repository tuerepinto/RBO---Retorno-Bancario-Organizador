package br.com.layoutretbanc.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.layoutretbanc.builder.DateClass;

public class DateFolderController {

	public void dateFolder() {
		Date df = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");
		sdf.format(df);

		String stringDate = sdf.format(df);
	    try {
	        df = sdf.parse(stringDate);
	    } catch(ParseException e){
	     //Exception handling
	    } catch(Exception e){
	     //handle exception
	    }
		DateClass.setDate(stringDate);

		System.out.println(DateClass.getDate());
	}
}

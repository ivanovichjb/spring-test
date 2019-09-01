package com.example.demo.service;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import org.springframework.stereotype.Repository;

import com.example.demo.beans.Information;
import com.example.demo.beans.InformationList;


@Repository
public class InformationService {
		 	
	   	 private static InformationList informationList=new InformationList();
	 	    
	   	 static {
	   		LocalDateTime.now();
	   	    informationList.getInformationList().add(new Information("PRODCP-00001","Samgsun A30",LocalDateTime.parse("2019-02-20T06:00:00"),new BigDecimal("500.87")));
	   	    informationList.getInformationList().add(new Information("PRODTV-00001","TV SONY 52in",LocalDateTime.parse("2019-03-20T18:30:00"),new BigDecimal("1000.00")));
	   	    informationList.getInformationList().add(new Information("PRODCP-00002","IPHONE 10X",LocalDateTime.parse("2019-03-20T18:31:00"),new BigDecimal("400.50")));
	   	    informationList.getInformationList().add(new Information("PRODHD-00001","Samsung A30",LocalDateTime.parse("2019-03-20T20:30:00"),new BigDecimal("150.20")));
	   	    informationList.getInformationList().add(new Information("PRODTV-00002","Samnsung 42in",LocalDateTime.parse("2019-07-20T10:10:10"),new BigDecimal("500.30")));
	   	 }
	   	 
	   	public InformationList getAllInformation()
	    {
	        return informationList;
	    }
	     
	    public void addInformation(Information information) {
	    	informationList.getInformationList().add(information);
	    }
	 
}

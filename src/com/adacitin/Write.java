package com.adacitin;

import java.util.concurrent.TimeUnit;

public class Write extends Base {
	
	public static void main(String[] args) throws Throwable {
		
		getDriver();
		
		launchUrl("https://adactin.com/HotelApp/");
		
		driver.manage().window().maximize();
				
			LoginPage page = new LoginPage();
		
		Base.type(page.getName(), "Sridharan");
		
		Base.type(page.getPass(), "1234567890");
		
		Base.clicking(page.getClick());
		
			SearchPage page1 = new SearchPage();
		
		Base.clicking(page1.getLocate());
		
		Base.keyboard();
		
		Base.clicking(page1.getHotel());
		
		Base.keyboard1();
		
		Base.clicking(page1.getRoom());
		
		Base.keyboard2();
		
		Base.clicking(page1.getNoOfRooms());
		
		Base.keyboard3();
		
		Base.type(page1.getCheckInDate(), "18/05/2020");
		
		Base.type(page1.getCheckOutDate(), "01/01/2021");
		
		Base.clicking(page1.getNoOfPersons());
		
		Base.keyboard2();
		
		Base.clicking(page1.getNoOfChild());
		
		Base.keyboard1();
		
		Base.clicking(page1.getClick());
		
			SelectHotelPage page2 = new SelectHotelPage();
		
		Base.clicking(page2.getRadioButton());
		
		Base.clicking(page2.getButton());
		
			BookHotelPage page3 = new BookHotelPage();
		
		Base.type(page3.getName(), "SRIDHARAN");
		
		Base.type(page3.getLastName(), "Y K");
		
		Base.type(page3.getAddress(), "Greens Technology, OMR Road, Salem");
		
		Base.type(page3.getCrdtNo(), "1234567891011121");
		
		Base.clicking(page3.getCrdtType());
		
		Base.keyboard1();
		
		Base.selecting(page3.getCrdtMonth(), "May");
		
		Base.selecting(page3.getCrdtYear(), "2020");
		
		Base.type(page3.getCVVNo(), "1234");
		
		Base.clicking(page3.getSubmit());
		
		driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		
			OrderPage page4 = new OrderPage();
			
		System.out.println(Base.getAttribute(page4.getOrderNo()));
		
	}

}

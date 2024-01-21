package org.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.sam.BaseClass;
import org.sam.LoginPojo;

public class PageFactory extends BaseClass {
	public static void main(String[] args) {
		launchBrowser();
		launchUrl("https://en-gb.facebook.com/");
		windowMaximize();
		LoginPojo f = new LoginPojo();
		passText("smitarr",f.getVarRef());
		passText("abc",f.getPassword());
        clickBtn(f.getLoginBtn());
        
		
		
		
	}

}

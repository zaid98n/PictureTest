package com.picture.test;

import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadLinks {
	
	public void Picturelinkextract() throws IOException  {
	
			String a1 = Readexcel.CellData(1, 3);
			String a2 = Readexcel.CellData(2, 3);
			String a3 = Readexcel.CellData(3, 3);
			String a4 = Readexcel.CellData(4, 3);
			String a5 = Readexcel.CellData(5, 3);
			String a6 = Readexcel.CellData(6, 3);
			String a7 = Readexcel.CellData(7, 3);
			String a8 = Readexcel.CellData(8, 3);
			String a9 = Readexcel.CellData(9, 3);
			String a10 = Readexcel.CellData(10, 3);
			String a11 = Readexcel.CellData(11, 3);
			String a12 = Readexcel.CellData(12, 3);
			String a13 = Readexcel.CellData(13, 3);
			String a14 = Readexcel.CellData(14, 3);
			String a15 = Readexcel.CellData(15, 3);
			String a16 = Readexcel.CellData(16, 3);
			String a17 = Readexcel.CellData(17, 3);
			String a18 = Readexcel.CellData(18, 3);
			String a19 = Readexcel.CellData(19, 3);
			String a20 = Readexcel.CellData(20, 3);
			String a21 = Readexcel.CellData(21, 3);
			String a22 = Readexcel.CellData(21, 3);
			String a23 = Readexcel.CellData(23, 3);
			String a24 = Readexcel.CellData(24, 3);
			
			String link[] = {a1, a2, a3, a4, a5, a6, a7, a8, a9, a10, a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24};
			
			System.setProperty("webdriver.chrome.driver", "drivers\\chromedriver.exe");
			ChromeDriver driver = new ChromeDriver();
			
			Date Date = new Date();
			
			Writer.write("---Data for: "+Date+" ---"+"\n");
			Writer.write(" "+"\n");
			
			for(int i=0; i<link.length; i++) {
				
				try{
					if(link[i] != null) {
						String x = link[i].substring(9);
						String y = x.split("'>")[0];
						
						System.out.println(y);
						
						try {
							driver.get(y);
							Thread.sleep(1000);
							WebElement err = driver.findElement(By.xpath("/html/body/h1"));
							Thread.sleep(1000);
							err.isDisplayed();
							Thread.sleep(1000);
							Writer.write("* "+"Image broken for: "+y+"\n");
						}
						catch (Exception e) {
							Writer.write("* "+"Image found for: "+y+"\n");
						}
					}
				}
				catch (Exception e) {
					// TODO: handle exception
				}
	
			}
		}

}

package com.spp.generics;

import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.awt.image.DataBuffer;
import java.io.File;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

import java.text.DateFormatSymbols;
public class Utility {
	
	
	
	public static String getRandNum() {
	 String randnum = null;
		if (randnum==null) {
		        randnum = Integer.toString(ThreadLocalRandom.current().nextInt(1000, 100000));
		}
		return randnum;
	}
	
	
		
		
		
		public static String getRandNum1() {
			 String randnum = null;
			if (randnum==null) {
			        randnum = Integer.toUnsignedString(ThreadLocalRandom.current().nextInt(1, 9));
			}
			return randnum;
		}
		
		public static String getRandNum(int min, int max) {
			 String randnum = null;
			if (randnum==null) {
			        randnum = Integer.toUnsignedString(ThreadLocalRandom.current().nextInt(min, max));
			}
			return randnum;
		}
		
		
		public static String getRandMon() {	
			 int randnum = 0;
			 
			        randnum =ThreadLocalRandom.current().nextInt(1, 12);
			  String  monthString = new DateFormatSymbols().getShortMonths()[randnum-1];
			
			return monthString;
		}
		
		public static String getRandLongMon() {	
			 int randnum = 0;
			 
			        randnum =ThreadLocalRandom.current().nextInt(1, 12);
			  String  monthString = new DateFormatSymbols().getMonths()[randnum-1];
			
			return monthString;
		}
		
		
		
		
	private static String randnum2 = null;
		
		public static String getRandNum2() {	
			if (randnum2==null) {
			        randnum2 = Integer.toUnsignedString(ThreadLocalRandom.current().nextInt(10, 20));
			}
			return randnum2;
		}
	
		public static String Random=null;
		public static String getRandom()
		{
		Random random = new Random();
		int minDay = (int) LocalDate.of(1900, 1, 1).toEpochDay();
		int maxDay = (int) LocalDate.of(2015, 1, 1).toEpochDay();
		long randomDay = minDay + random.nextInt(maxDay - minDay);

		@SuppressWarnings("unused")
		LocalDate randomBirthDate = LocalDate.ofEpochDay(randomDay);
		return getRandom();
		}
		
		
		
		
	public static String getFormatedDateTime(){
		SimpleDateFormat sd = new SimpleDateFormat("dd_MM_yyyy_hh_mm_ss");
		return sd.format(new Date());
	}
	
	public static String getPageScreenShot(WebDriver driver, String imageFolderPath){
		String imagePath=imageFolderPath+"/"+getFormatedDateTime()+".png";
		EventFiringWebDriver edriver=new EventFiringWebDriver(driver);
		try{
			FileUtils.copyFile(edriver.getScreenshotAs(OutputType.FILE), new File(imagePath));
		}catch(Exception e){
			
		}
		return imagePath;
		
	}
	
	public static String cropImage(String imagePath,int x,int y,int width,int height,String OutputImgFolder)
	{
		String newImagePath=OutputImgFolder+"/"+getFormatedDateTime()+".png";
		try{
			BufferedImage originalImgage = ImageIO.read(new File(imagePath));
	        BufferedImage subImgage = originalImgage.getSubimage(x,y,width,height);
	        ImageIO.write(subImgage,"png", new File(newImagePath));
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return newImagePath;
	}
	
	public static boolean compareImage( String actualImage,String expectedImage) {        
		try {
		        DataBuffer eImg = ImageIO.read(new File(expectedImage)).getData().getDataBuffer();        
		        DataBuffer aImg = ImageIO.read(new File(actualImage)).getData().getDataBuffer();
		        int size=eImg.getSize(),matchCount=0;
		            for(int i=0; i<size; i++) 
		                if(eImg.getElem(i) == aImg.getElem(i))
		                {
		                	matchCount++;
		                }
		            	int percentage=matchCount*100/size;
		            	System.out.println("ImageSize:"+size);
		            	System.out.println("Match:"+matchCount);
		            	System.out.println("percentage"+percentage);
		            	if(percentage>90){
		            		return true;
		            	}
		            	else{
		            		return false;
		            	}
		    } 
		
		 catch (Exception e){
			 return  false;
			}
		}

	public static void getDesktopScreenshot(String folder)  {
		try{
		SimpleDateFormat s=new SimpleDateFormat("DD_MM_YYYY_hh_mm_ss");
		String res=s.format(new Date());
		System.out.println(res);
		//get size of desktop
		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
		//desktop area
		Rectangle screenRect= new Rectangle(d);
		//take that area screen shot
		Robot r=new Robot();
		BufferedImage img=r.createScreenCapture(screenRect);
		//create new file
		File output=new File(folder+res+".png");
		//paste it
		ImageIO.write(img, "png", output);
		System.out.println("done");
		}
		catch(Exception e){
			
		}
	}
		
}

































//package generics;
//
//import java.awt.Dimension;
//import java.awt.Rectangle;
//import java.awt.Robot;
//import java.awt.Toolkit;
//import java.awt.image.BufferedImage;
//import java.io.File;
//import java.text.SimpleDateFormat;
//import java.util.Date;
//
//import javax.imageio.ImageIO;
//
//public abstract class Utility {
//	
//	
//	public static void getDesktopScreenshot(String folder)  {
//		
//		try{
//		SimpleDateFormat s=new SimpleDateFormat("DD_MM_YYYY_hh_mm_ss");
//		String res=s.format(new Date());
//		System.out.println(res);
//		//get size of desktop
//		Dimension d=Toolkit.getDefaultToolkit().getScreenSize();
//		//desktop area
//		Rectangle screenRect= new Rectangle(d);
//		//take that area screen shot
//		Robot r=new Robot();
//		BufferedImage img=r.createScreenCapture(screenRect);
//		//create new file
//		File output=new File(folder+res+".png");
//		//paste it
//		ImageIO.write(img, "png", output);
//		System.out.println("done");
//		 }
//		catch(Exception e){
//			
//		}
//     }
//}

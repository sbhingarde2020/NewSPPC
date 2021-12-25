package com.spp.scripts;

import org.testng.annotations.Test;

import com.spp.common.BaseTest;
import com.spp.pages.AddNewGratuity;

public class Gratuity extends BaseTest{

	@Test(priority=0)
	public void AddNewGratuity_SC_342() throws Exception {
		AddNewGratuity ag = new AddNewGratuity(driver);
		
		
	}
}

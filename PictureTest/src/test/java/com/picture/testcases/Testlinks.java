package com.picture.testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.picture.test.ReadLinks;

public class Testlinks {
	
	ReadLinks obj = new ReadLinks();
	
	@Test
	public void testpicturelinks() throws IOException {
		obj.Picturelinkextract();
	}

}

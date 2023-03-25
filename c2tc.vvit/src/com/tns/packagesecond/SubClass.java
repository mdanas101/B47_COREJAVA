package com.tns.packagesecond;

import com.tns.packagefirst.*;

public class SubClass extends ParentClass {
 protected void display() {
		System.out.println("Hii"); 
		super.display();
		
		 
}
 public static void main(String[] args) {
	 SubClass s=new SubClass();
	 s.display();
 }
 
}
package com.appsteer.file;

public class Collection {
	
	int age;
	
	Collection(int age){
       this.age=age;		
	}
	@Override
	public String toString() {
		return ""+age;
		
	}
	
	public static void main(String[] args) {
		
		Collection c = new Collection(23);
		
		
		System.out.println(c);
		System.out.println(c.toString());
	System.out.println(	c.toString());
	}

}

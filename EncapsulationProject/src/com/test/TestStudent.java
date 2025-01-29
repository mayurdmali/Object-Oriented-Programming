package com.test;

import com.entity.Student;

import service.Service;

public class TestStudent {
	public static void main(String[] args) {
		// object of service class
		Service s1 = new Service();
		// call m1 method that is in service class and store result in std.
		System.out.println(s1.m1());
	}
}

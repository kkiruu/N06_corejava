package org.tnsif.wrapperclass;
//program to Demonstrate on AutoBoxing
/*Autoboxing: conversion of primitive to object type*/
public class AutoBoxing {

	public static void main(String[] args) {
		int num=98;
		//converting a primitive type to object
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());
		

	}

}

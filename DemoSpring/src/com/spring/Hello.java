package com.spring;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {1,2,3,4,5};
		int temp;
		for(int i=0; i<arr.length/2; i++) {
			temp= arr[i];
			arr[i]=arr[arr.length-1-i];
			arr[arr.length-1-i]=temp;
			
		}
		
		
		System.out.println("Reversed :");
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}

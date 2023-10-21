package com.edu.array;

public class secondlargestarrayelement {

	public static void main(String[] args) {
		int a[]= {5,7,1,9,4,2,89,23};

		int max1,max2;
		max1=max2=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max1) {
				max2=max1;
				max1=a[i];
			}
			else if(a[i]>max2) {
				max2=a[i];
			}
		}
		System.out.println("Second largest element in array=" +max2);

	}

}

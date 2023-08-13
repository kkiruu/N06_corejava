//program to demonstrate on Array of objects
//deriver class
package org.tnsif.singledimentionalarray;

public class ArrayOfObjectDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[3];
		arr[0]=new Employee(101,"Sahil Lokhande",67000.45);
		arr[1]=new Employee(102,"Kiran Aher",77000.45);
		arr[2]=new Employee(103,"Kiran Lokhande",89000.45);
		for(int i=0;i<3;i++){
			System.out.println(arr[i].getID()+"  "+arr[i].getName()
					+"  "+arr[i].getSalary());
		}
	}

}

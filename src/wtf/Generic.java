package wtf;

import java.util.ArrayList;

public class Generic<T> {
	
	private T t;
	static Object age="wusui";
	
	public void add(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
	
	public static <E> void printArray(E[] inputArray){
		for(E element : inputArray){
			System.out.printf("%s",element);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Integer [] intArray={1,2,3,4,5,6,};
    Double [] doubleArray={1.2,4.3,4.4,5.423};
    Character[] charArray={'d','f','f','f'};
    String [] stringArray={"one","two","three","four"};
    
    System.out.println(age);
    Generic<Integer[]> generic= new Generic<Integer[]> ();
    generic.add(intArray);
    
  printArray(generic.get());
   // printArray(intArray);
    printArray(doubleArray);
    printArray(charArray);
    printArray(stringArray);
    
	}

}

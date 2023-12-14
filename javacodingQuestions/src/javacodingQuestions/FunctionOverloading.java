package javacodingQuestions;

public class FunctionOverloading {
	public static void add(Integer i, Integer j) {
		System.out.println("In Integer type");
	}
    public static void add(float i, float j) {
    	System.out.println("In float type");
	}
   public static void add(int i, int j) {
	   System.out.println("In int type");
	}

	public static void main(String[] args) {
		add(3,5);

	}

}

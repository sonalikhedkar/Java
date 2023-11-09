
public class Student {
   private int  id;
   private String name;
   private int m1;
   private int m2;
   private int m3;
   
   
    public Student() {
	super();
     }


	public Student(int id, String name, int m1, int m2, int m3) {
		super();
		this.id = id;
		this.name = name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
   }


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	
   
}

package home.vimal.util;

public interface InterfaceInnerClass {
	
	void print();
	
	class One{
		public void print() {
			System.out.println("One");
		}
	}
	
	static class Two{
		public void print() {
			System.out.println("Two");
		}
	}
}

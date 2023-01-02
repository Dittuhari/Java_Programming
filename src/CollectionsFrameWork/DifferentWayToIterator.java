package CollectionsFrameWork;

import ForLoopStarPattern.TestingImpl;

class A {
	void display() {
		System.out.println("class A");
	}
}
abstract class B
{
	void display()
	{
		System.out.println("welcome to abstract");
	}
	abstract void show();
}


public class DifferentWayToIterator extends TestingImpl {
	
	public static void main(String[] args) {
		DifferentWayToIterator differentWayToIterator = new DifferentWayToIterator();
		differentWayToIterator.testing();
		
	}

	

}

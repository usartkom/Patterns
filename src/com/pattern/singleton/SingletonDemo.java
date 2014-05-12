package com.pattern.singleton;

public class SingletonDemo {

	public static void main(String[] args) {
		//SingleObject object1 = new SingleObject();
		SingleObject object2 = SingleObject.getInstance();
		object2.showMessage();
	}

}

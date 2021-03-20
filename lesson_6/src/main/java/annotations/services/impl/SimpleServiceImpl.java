package annotations.services.impl;


import annotations.MyAnnotationInit;
import annotations.MyAnnotationService;

@MyAnnotationService(name = "simpleService")
public class SimpleServiceImpl{

	@MyAnnotationInit(suppressException = true)
	public void initService() {
		System.out.println("From initService() method");
	}
	@MyAnnotationInit
	private static void printMe(){
		System.out.println("FRom private method");
	}

}

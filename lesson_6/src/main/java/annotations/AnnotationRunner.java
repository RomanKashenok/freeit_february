package annotations;


import annotations.services.impl.LazyServiceImpl;
import annotations.services.impl.SimpleServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class AnnotationRunner {

	private static int myAnnInitCounter = 0;

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
//		inspectService(String.class);
		inspectService(SimpleServiceImpl.class);
//		inspectService(LazyServiceImpl.class);
	}
	
	static void inspectService(Class<?> serviceClass) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException{
//		LazyServiceImpl lsi;
		if(serviceClass.isAnnotationPresent(MyAnnotationService.class)){
			MyAnnotationService mas = serviceClass.getAnnotation(MyAnnotationService.class);
			System.out.println(mas);
			
			if(serviceClass.isAnnotationPresent(MyAnnotationInit.class)){
				MyAnnotationInit mai = serviceClass.getAnnotation(MyAnnotationInit.class);
				if(mai.suppressException() == true){
					SimpleServiceImpl ssi = new SimpleServiceImpl();
					System.out.println(ssi);
				}
			}
		}
		

		
//		Method [] methods = serviceClass.getMethods();
//		for(Method m : methods){
//			if(m.getAnnotation(MyAnnotationInit.class) != null){
//				if(m.getAnnotation(MyAnnotationInit.class).suppressException() == true){
//					System.out.println("Here we will pass all Exceptions: method = " + m);
//				}
//			}
//		}
		
		Method[] allMethods = serviceClass.getDeclaredMethods();
		for(Method m : allMethods){
			if(m.getAnnotation(MyAnnotationInit.class) != null){
				if(m.getAnnotation(MyAnnotationInit.class).suppressException() == false){
					myAnnInitCounter++;
					System.out.println("Here we will pass all Exceptions: method = " + m);
					m.setAccessible(true);
					m.invoke(new LazyServiceImpl(), null);
				}else{
					System.out.println("Here we should to proceed Exceptions: method = " + m);
				}
			}
		}
		
	}
}

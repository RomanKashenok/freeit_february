package annotations.services.impl;

import annotations.MyAnnotationInit;
import annotations.MyAnnotationService;
import annotations.services.LazyService;

@MyAnnotationService(name = "lazyService", lazyLoad = true)
public class LazyServiceImpl implements LazyService
{

	@MyAnnotationInit(suppressException = true)
	public void lazyInit() throws Exception
	{
		System.out.println("From public lazyInit() method");
	}

	@MyAnnotationInit(suppressException = false)
	private void secondLazyInit()
	{
		System.out.println("From private secondLazyInit() method");
	}

}

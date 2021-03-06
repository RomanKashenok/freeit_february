package finalization;

import java.util.ArrayList;
import java.util.List;

public class FinalizationRunner
{
//    public final static List<SimpleObject> objList = new ArrayList<>();

	public static void main(String[] args)
	{
		List<SimpleObject> soList  = new ArrayList<>();

//		for (int i = 0; i < 2_500_000; i++)
//		{
//			createObject(i);
//			soList.add(createObject(i));
//		}
//
// 		int i = 0;
//		while (i < 2500000) {
//			soList.add(createObject(i));
//			i++;
//		}

        System.out.println("******************** Size of my list: " + soList.size());
	}

	private static SimpleObject createObject(int number)
	{
		return new SimpleObject("so" + number);
	}
}

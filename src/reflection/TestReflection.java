package reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import charactor.Hero;

public class TestReflection {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String className = "charactor.Hero";
			Class pClass1 = Class.forName(className);
			Constructor c = pClass1.getConstructor();
			Hero h2 = (Hero)c.newInstance();
			//h2.name = "gareen";
			//Field f1 = h2.getClass().getField("name");
			//f1.set(h2,"wfwf");
			Method m = h2.getClass().getDeclaredMethod("setName",String.class);
			m.invoke(h2, "Éª·òÉª·ò");
			System.out.println(h2.getName());
			//System.out.println();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}

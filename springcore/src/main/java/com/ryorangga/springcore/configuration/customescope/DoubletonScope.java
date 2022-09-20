package com.ryorangga.springcore.configuration.customescope;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

public class DoubletonScope implements Scope{

	private List<Object> objects = new ArrayList<>(2);
	private Long counter = 0L;
	
	@Override
	public Object get(String name, ObjectFactory<?> objectFactory) {
		// TODO Auto-generated method stub
		
		
		if (objects.size() == 2) {
			int index = (int)(counter%2);
			counter++;
			return objects.get(index);
		}else {
			 Object object = objectFactory.getObject();
			 objects.add(object);
			 return object;
		}
	}

	@Override
	public Object remove(String name) {
		// TODO Auto-generated method stub
		if (objects != null) {
			return objects.remove(0);
		}else
			return null;
	}

	@Override
	public void registerDestructionCallback(String name, Runnable callback) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object resolveContextualObject(String key) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getConversationId() {
		// TODO Auto-generated method stub
		return null;
	}

}

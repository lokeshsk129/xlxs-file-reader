package com.appsteer.file;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ObjectToString {

	String ans;

	@Override
	public String toString() {
		return "" + ans;

	}

	public static void main(String[] args) throws Exception {

		Map<String, Object> text = new HashMap<String, Object>();
		Map<String, String> newMap = new HashMap<String, String>();

		text.put("firstName", "Alex");
		text.put("lastName", "Anderson");
		List<String> st = new ArrayList<>();
		st.add("8009000909");
		st.add("987856767");
		text.put("PhoneNum", st);

	
		for (Map.Entry<String, Object> entry : text.entrySet()) {
			try {
				Object tempValue = entry.getValue();
				String.valueOf(tempValue);
				if (tempValue instanceof List) {

					List<String> tempList = (List<String>) tempValue;
					String string = "";
					for (int i = 0; i < tempList.size(); i++) {
						if (i <= 0)
							string = tempList.get(i);
						else
							string = string + "," + tempList.get(i);
						String str = String.join(",", string);

					}
					newMap.put(entry.getKey(), string);
				}
				else {
					newMap.put(entry.getKey(), String.valueOf(tempValue));

				}

			} catch (ClassCastException e) {
				System.out.println("ERROR: " + entry.getKey() + " -> " + entry.getValue() + " not added, as "
						+ entry.getValue() + " is not a String");
			}
			
			
		
		}
		
		
		} 
		
}

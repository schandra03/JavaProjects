import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class RepeatIndexLeast {

	public RepeatIndexLeast() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 2, 3, 5, 2, 6};
	             // 0, 1, 2, 3, 4, 5, 6, 7, 8, 9,10,11,12,13
		Map<Integer, Integer> arrayMap = new TreeMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++) {
			if(arrayMap.containsKey(a[i])) {
				arrayMap.put(a[i], i);
			} else {
				arrayMap.put(a[i], 1);
			}
		}
		
		Set<Integer> keySet = arrayMap.keySet();
		Iterator<Integer> keySetIterator = keySet.iterator();
		while (keySetIterator.hasNext()) {
			int key = keySetIterator.next();
			if(arrayMap.get(key) == 1)
				keySetIterator.remove();
		}

		for (Map.Entry<Integer, Integer> itrFinal : arrayMap.entrySet()) {
			System.out.println("Key:" + itrFinal.getKey() + " Value :" + itrFinal.getValue());
		}
			
		
		
		/*for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {
					if (!(arrayMap.containsKey(i)))
						arrayMap.put(i, a[i]);

					if (!(arrayMap.containsKey(j)))
						arrayMap.put(j, a[j]);
				}
			}
		}

		for (Map.Entry<Integer, Integer> itrFinal : arrayMap.entrySet()) {
			System.out.println("Key:" + itrFinal.getKey() + " Value :" + itrFinal.getValue());
		}
		
		Map<Integer, Integer> mapFinal = new HashMap<Integer, Integer>();
		for (Map.Entry<Integer, Integer> entry : arrayMap.entrySet()) {
			// System.out.println("Key = " + entry.getKey() + ", Value = " +
			// entry.getValue());
			int count = 0;
			boolean firstMatch = true;
			for (Map.Entry<Integer, Integer> entry2 : arrayMap.entrySet()) {
				if (entry2.getValue().intValue() == entry.getValue().intValue() && firstMatch) {
					firstMatch = false;
					continue;
				} else if(entry2.getValue().intValue() == entry.getValue().intValue() && !mapFinal.containsKey(entry.getKey())) {
					//System.out.println("Count : " + entry2.getValue() + " : " + count);
					mapFinal.put(entry2.getKey(), entry2.getValue());
					break;
				}
				if(entry2.getKey() >= entry.getKey())
					count++;
			}
		}
		List<Integer> ls = new ArrayList<Integer>();
 		for (Map.Entry<Integer, Integer> itrFinal : mapFinal.entrySet()) {
			//System.out.println("Key:" + itrFinal.getKey() + " Value :" + itrFinal.getValue());
			ls.add(itrFinal.getValue());
		}
		
 		System.out.println(ls.get(0));*/
		
	}

}

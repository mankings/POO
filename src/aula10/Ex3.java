package aula10;

import java.util.*;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Sentence: ");
        String s = sc.nextLine();
        sc.close();

        Map<Character, Set<Integer>> m = new HashMap<Character, Set<Integer>>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(m.containsKey(c)) {
                m.get(c).add(i);
            } else {
                Set<Integer> a = new HashSet<Integer>();
                a.add(i);
                m.put(c, a);
            }
        }

        StringBuilder sb = new StringBuilder();
        sb.append("{");

        Iterator<Character> i1 = m.keySet().iterator();

        while (i1.hasNext()) {
			char c = (Character) i1.next();
			Iterator<Integer> i2 = m.get(c).iterator();
			sb.append(c + "=[");

			while (i2.hasNext()) {
				int i = i2.next();
				if (i2.hasNext()) {
					sb.append(i + ",");
				} else {
					if (i1.hasNext()) {
						sb.append(i + "], ");
					} else {
						sb.append(i + "]");
					}
				}
			}
		}
		sb.append("}");

		System.out.print(sb.toString());
    }
}

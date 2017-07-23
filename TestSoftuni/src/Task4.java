import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Task4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String text = "";
		Set<String, String> outMap = new LinkedHashSet<String, String>();
		//Map<String, String> outMap = new LinkedHashMap<String, String>();
		Map<String, Integer> inMap = new LinkedHashMap<String, Integer>();

		do {

			String name = "";
			String evol = "";
			int index = -1;

			text = sc.nextLine();
			String[] info = text.split(" -> ");

			name = info[0];
			if (info.length > 1) {
				evol = info[1];
				index = Integer.parseInt(info[2]);
			} else {
				for (String key : inMap.keySet()) { // Step 4

					System.out.println(key + inMap.get(key));
				}

			}

			inMap.put(evol, index);
			outMap.put(name, evol);

		} while (!text.equals("wubbalubbadubdub"));

	}

}

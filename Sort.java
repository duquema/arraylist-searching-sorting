import java.util.*;
public class Sorting
{
  public void selectionSort(ArrayList<String> list)
  {
    String last = "z";
    int lowest = 0;
		int place = 0;

		for (int i = 0; i < list.size(); i++) {
			for (int k = i; k < list.size(); k++) {
				if (list.get(k).compareTo(last) < lowest) {
					lowest = list.get(k).compareTo(last);
					last = list.get(k);
					place = k;
				}
			}

			String str = list.get(i);
			list.set(i, list.get(place));
			list.set(place, str);

			last = "z";
			lowest = 0;
			place = 0;
		}
  }

  public void insertionSort(ArrayList<String> list)
  {
    for (int i = 0; i < list.size() - 1; i++) {
			for (int j = i + 1; j > 0; j--) {
				if (list.get(j).compareTo(list.get(j - 1)) < 0) {
					String str = list.get(j - 1);
					list.set(j - 1, list.get(j));
					list.set(j, str);
				}
			}
		}
  }

  public void bubbleSort(ArrayList<String> list)
  {
    boolean sorted = false;
		int count = 0;

		while (count < list.size()) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i + 1).compareTo(list.get(i)) < 0) {
					String str = list.get(i);
					list.set(i, list.get(i + 1));
					list.set(i + 1, str);
				}
			}
      
			for (int j = 0; j < list.size() - 1; j++) {
				if (list.get(j + 1).compareTo(list.get(j)) >= 0) {
					count++;
				}
			}
		}
  }

  public static void main(String[args])
  {
    ArrayList<String> strList = new ArrayList<String>();
		strList.add("h");
		strList.add("g");
		strList.add("f");
		strList.add("e");
		strList.add("d");
		strList.add("c");
		strList.add("b");
		strList.add("a");

		selectionSort(strList);
		for (int i = 0; i < strList.size(); i++) {
			System.out.println(strList.get(i));
		}
	}
  }
}

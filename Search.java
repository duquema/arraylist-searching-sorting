import java.util.*;
public class Search
{
  public static int search(ArrayList<String> haystack, String needle)
  {
    int correctNeedle = -1;

    for (int i = 0; i < haystack.size(); i++){
      if (haystack.get(i).equals(needle)){
        correctNeedle = i;
      }
    }

    return correctNeedle;
  }

  public static int binarySearch(ArrayList<String> haystack, String needle)
  {
    int i = -1;
		int end = haystack.size() - 1;
		int start = 0;

		while (start < end && i == -1) {

      int middle = (start + end) / 2;

			if (haystack.get(middle).equals(needle)){
				i = middle;
			}else if (needle.compareTo(haystack.get(middle)) > 0){
				start = middle;
			}else{
				end = middle;
			}

			if (end - start <= 1){
				if (end == haystack.size() - 1){
					i = haystack.size() - 1;
				}
			} else {
				if (haystack.get(0).equals(needle)){
					i = 0;
				}
			}
			end = start;
		}
		return i;
  }

  public static void main(String[] args)
  {
		ArrayList<String> haystack = new ArrayList<String>();

    haystack.add("a");
		haystack.add("b");
		haystack.add("c");
		haystack.add("d");
		haystack.add("e");
		haystack.add("f");
		haystack.add("g");
		haystack.add("h");

		System.out.println(search(haystack, "f"));
		System.out.println(binarySearch(haystack, "f"));
	}
}


# Stream Min() and Max() Method

# Description
  1.Java 8 Stream class provides methods min() and max() for finding minimum and maximum values in a stream.

  2.Java 8 also added a static method comparing() to the Comparator class that lets us build a comparator using a sort key.

  3.Lets see some examples of Stream min() and max() functions with the Comparator.comparing() method.

```
List<String> list = Arrays.asList("Gza","Gzb","Gox","Elephant");
		String max = list.stream().max(Comparator.comparing(String::valueOf)).get();
		System.out.println("Max:"+ max);
		String min = list.stream().min(Comparator.comparing(String::valueOf)).get();
		System.out.println("Min:"+ min);
```

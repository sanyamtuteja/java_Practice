package hackerRank;

  import java.io.*;
 import java.math.*;
 import java.security.*;
 import java.text.*;
 import java.util.*;
import java.util.Map.Entry;
import java.util.concurrent.*;
 import java.util.function.*;
 import java.util.regex.*;
 import java.util.stream.*;
 import static java.util.stream.Collectors.joining;
 import static java.util.stream.Collectors.toList;

 public class MigratoryBirds {

     // Complete the migratoryBirds function below.
     static int migratoryBirds(List<Integer> arr) {
    	 
    	 int high=0;
    	 HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
    	 
    	 for (int i = 0; i<arr.size(); i++){
			 System.out.println("x=" +arr.get(i));

    		 if(hm.containsKey(arr.get(i))){
    			 hm.put(arr.get(i), hm.get(arr.get(i)) + 1);
    		 }else{
			 hm.put(arr.get(i), 1);
    		 }
    	 }
    	 
    	 Iterator<Map.Entry<Integer, Integer>> itr = hm.entrySet().iterator();
    	 while (itr.hasNext()) {
    	     Map.Entry<Integer, Integer> entry = itr.next();
    	     System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
    	 
    	 
    	     
    	 }   
    	 int maxValueInMap=(Collections.max(hm.values())); 
	     System.out.println(maxValueInMap);
	     
	     for (Entry<Integer, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
	            if (entry.getValue()==maxValueInMap) {
	            	high = entry.getKey();
	                System.out.println(high);   // Print the key with max value
	                break;
	            }
	     }
    	     return high;
     }

     public static void main(String[] args) throws IOException {
         BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
         BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("C:\\New folder\\result.txt"));
         System.out.println("abc");
         int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

         List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
             .map(Integer::parseInt)
             .collect(toList());

         int result = migratoryBirds(arr);

         bufferedWriter.write(String.valueOf(result));
         bufferedWriter.newLine();

         bufferedReader.close();
         bufferedWriter.close();
     }
 }

package other.general;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class JavaStreamsOnMap {

    Map<String, String> map = new HashMap<String, String>(){
        {
            put("1","KOLKATA");
            put("2","DELHI");
            put("1","Bengaluru");
            put("3","Chandigarh");
            put("2","Punjab");
            put("1","Karnataka");
        }
    };
    List<String> list = Arrays.asList("papaya","orange","apple","banana","apple","orange", "applor");

    public void groupByKey() {
        Map<String, String> groupByMap = list.stream().collect(Collectors.groupingBy(x -> x.substring(0,3), Collectors.joining(",")));
        Map<Boolean, List<String>> partitionByMap = list.stream().collect(Collectors.partitioningBy(s -> s.startsWith("a")));
        int sum = map.keySet().stream().map(x -> Integer.parseInt(x)).collect(Collectors.summingInt(x -> x)).intValue();
        System.out.println(sum);

    }
}

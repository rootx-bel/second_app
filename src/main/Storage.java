package main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class Storage {
    private String[] str = new String[0];
    private int srznach;
    private static String[] append(String[] arr, String element)
    {
        List<String> list = new ArrayList<>(Arrays.asList(arr));
        list.add(element);

        return list.toArray(new String[0]);
    }
    public void append(String op1){
        str = append(str,op1);
        sorting();
    }
    public String displayMax(){
        return(str[str.length-1]);
    }
    public int displaySr(){
        return srznach;
    }
    private void sorting(){
        int alllength=0;
        for (String s : str) {
            alllength += s.length();
        }
        srznach=alllength/str.length;
        boolean isSorted = false;
        String buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < str.length-1; i++) {
                if(str[i].length() > str[i+1].length()){
                    isSorted = false;

                    buf = str[i];
                    str[i] = str[i+1];
                    str[i+1] = buf;
                }
            }
        }
    }
}
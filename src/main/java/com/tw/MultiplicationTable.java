package com.tw;

public class MultiplicationTable {
    public static void main(String[] args) {
        MultiplicationTable test = new MultiplicationTable();
        System.out.println(test.create(2,4));
    }

    public String create(int start, int end) {
        /*
        Plan:2min
        Do:15min
        Check:a little bit messed up in the nested loop
        Act:practice more nested loop
        */
        boolean areValid = areInputsValid(start,end);
        return areValid ? implementMultiplicationTable(start,end) : null;
    }

    private String implementMultiplicationTable(int start, int end) {
        /*
        Plan:1mingit
        Do:14min
        Check:a little bit messed up in the nested loop
        Act:practice more nested loop
        */
        String table="";
        for(int i=start;i<=end;i++) {
            for(int j=start;j<=i;j++) {
                table += j + "*" + i + "=" + i * j;
                if (j != i) {
                    table += "  ";
                }
            }
            if(i!=end)
            {
                table+=System.lineSeparator();
            }
        }
        return table;
    }

    private boolean areInputsValid(int start, int end) {
        /*
        Plan:1min
        Do:1min
        Check:all good
        Act:no need
        */
        if(start>end || start<1 || end>1000) {
            return false;
        }
        return true;
    }
}

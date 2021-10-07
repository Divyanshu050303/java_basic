package com.company;
class recursive_array{
    int [] array;
    recursive_array(int n){
        array=new int[n];
    }
    // display array -- recursively
    void printArray(int n){
        if (n==0) return;
        else printArray(n-1);
        System.out.println(array[n-1]);
    }
}
public class recursive_print_array {
    public static void main(String[] args) {
        recursive_array re=new recursive_array(10);
        for(int i=0;i<10;i++) {
            re.array[i]=i;
        }
        re.printArray(10);
    }
}

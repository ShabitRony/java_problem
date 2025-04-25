package practice;

import java.util.HashSet;

public class MyArrayList {
    public static void main(String[] args) {
                int[] numbers = {1, 2, 3, 2, 3, 4, 5, 5, 5};
                HashSet<Integer> hashSet = new HashSet<>();

                for(int i =0;i< numbers.length;i++){
                    if(hashSet.contains(numbers[i])){
                        continue;
                    }
                    int count=1;
                    for(int j=i+1;j<numbers.length;j++){
                        if(numbers[i] == numbers[j]){
                            count++;
                        }
                    }if(count>1){
                        System.out.println(numbers[i]+ " found "+count+ " times");
                    }
                    hashSet.add(numbers[i]);
                }
            }

        }


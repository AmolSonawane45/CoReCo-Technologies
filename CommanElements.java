package com.amol.basic.commonelements;

import java.util.*;

public class CommanElements {

	public static void main(String[] args) 
	{
        List<Integer> L1 = Arrays.asList(56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 88, 72, 73, 74, 75, 76, 77, 78, 79, 80);
        List<Integer> L2 = Arrays.asList(81, 82, 83, 1, 84, 85, 86, 87, 88, 60, 89, 90, 1, 91, 92, 93);

        List<Integer> commonElements = findCommonElements(L1, L2);
        System.out.println("Common elements are: " + commonElements);
    }

    public static List<Integer> findCommonElements(List<Integer> L1, List<Integer> L2) 
    {
        Set<Integer> set1 = new HashSet<>(L1);
        Set<Integer> set2 = new HashSet<>(L2);

        set1.retainAll(set2); 

        return new ArrayList<>(set1);
    }
}

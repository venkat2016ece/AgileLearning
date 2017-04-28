package S6_26_4.Map;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {
		TreeMap t=new TreeMap();
		System.out.println(t instanceof Serializable);
		System.out.println(t instanceof Cloneable);
		
		ArrayList al= new ArrayList();
		System.out.println(al instanceof Serializable);
		System.out.println(al instanceof Cloneable);
		
		HashMap h=new HashMap();
		System.out.println(h instanceof Serializable);
		System.out.println(h instanceof Cloneable);
		
		LinkedHashMap l =new LinkedHashMap();
		System.out.println(l instanceof Serializable);
		System.out.println(l instanceof Cloneable);
	}
	
/*
 * gettting synchronized version
 * =============================
 * all methods are present in java.util.Collections
 * ==================================================
 * ArrayList&LinkedList
 * public static <T> java.util.List<T> synchronizedList(java.util.List<T>);
 * HashSet&Linked HashSet
 *   public static <T> java.util.Set<T> synchronizedSet(java.util.Set<T>);
 *   HashMap&LinkedHashMap
 *    public static <K, V> java.util.Map<K, V> synchronizedMap(java.util.Map<K, V>);
 *    TreeMap:non syn
  public static <K, V> java.util.SortedMap<K, V> synchronizedSortedMap(java.util.SortedMap<K, V>);
  TreeSet:non sync
     public static <T> java.util.SortedSet<T> unmodifiableSortedSet(java.util.SortedSet<T>);*/
}

package S6_26_4.Collections.SortingMechanisams.SynchronizedVersions;
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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

public class test {
	
ArrayList al =new ArrayList();//non syn
List l=Collections.synchronizedList(al);//syn


HashSet h=new HashSet();//non syn
Set s=Collections.synchronizedSet(h);

TreeMap t=new TreeMap();//non syn
SortedMap a=Collections.synchronizedSortedMap(t);

TreeSet t1= new TreeSet();
SortedSet s1=Collections.synchronizedSortedSet(t1);

}

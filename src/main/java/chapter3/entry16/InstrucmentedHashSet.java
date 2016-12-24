package chapter3.entry16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

/**
 * This is a class extends from the HashSet to show the
 * @author jacka
 * @version 1.0 on 12/20/2016.
 */
public class InstrucmentedHashSet<E> extends HashSet<E> {
  private int addCount = 0;

  public InstrucmentedHashSet() {}

  public InstrucmentedHashSet(int initCap, float loadFactor) {
    super(initCap, loadFactor);
  }

  @Override
  public boolean add(E e) {
    addCount++;
    return super.add(e);
  }

  @Override public boolean addAll(Collection<? extends E> c) {
    addCount += c.size();
    return super.addAll(c);
  }

  public int getAddCount() {
    return addCount;
  }

  public static void main(String[] args) {
    InstrucmentedHashSet<Integer> selfSet = new InstrucmentedHashSet<>();
    selfSet.addAll(Arrays.asList(1, 2, 3));
    System.out.println(selfSet.getAddCount()); // print 6 because of dynamic binding
    List<String> listOfString = new ArrayList<>();

  }



}

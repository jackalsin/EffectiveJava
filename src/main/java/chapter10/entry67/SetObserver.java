package chapter10.entry67;

/**
 * @author jacka
 * @version 1.0 on 1/2/2017.
 */
public interface SetObserver<E> {
  // Invoked when an element is added to the observable set
  void added(ObservableSet<E> set, E element);
}

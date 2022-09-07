
public class DoublyLinkedListItem{
  private Objeto obj;
  private DoublyLinkedListItem next;
  private DoublyLinkedListItem previous;

  public DoublyLinkedListItem(Objeto o){
    obj = o;
    next = null;
    previous = null;
  }
  public DoublyLinkedListItem getNext(){
    return next;
  }
  public void setNext(DoublyLinkedListItem n){
    next = n;
  }
  public DoublyLinkedListItem getPrevious(){
    return previous;
  }
  public void setPrevious(DoublyLinkedListItem p){
    previous = p;
  }
  public Objeto getObjeto(){
    return obj;
  }
}
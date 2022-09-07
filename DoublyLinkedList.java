//import class DoublyLinkedListItem;

public class DoublyLinkedList{
  private DoublyLinkedListItem first;
  private DoublyLinkedListItem last;

  public DoublyLinkedList(){
    first = null;
    last = null;
  }

  public DoublyLinkedListItem getFirst(){
    return first;
  }
  public void setFirst(DoublyLinkedListItem f){
    first = f;
  }
  public DoublyLinkedListItem getLast(){
    return last;
  }
  public void setLast(DoublyLinkedListItem l){
    last = l;
  }
  
  public void AddFirst(DoublyLinkedListItem item){
    if(first == null){
      first = item;
      last = item;
    }
    else{
      if(first.getObjeto().getNumero() == last.getObjeto().getNumero()){
        item.setNext(first);
        last.setPrevious(item);
        first = item;
      } 
      else{
        item.setNext(first);
        first.setPrevious(item);
        first = item;
      }
    }  
  }
  
  public void AddLast(DoublyLinkedListItem item){
    if(last == null){
      first = item;
      last = item;
    }
    else{
      if(first.getObjeto().getNumero() == last.getObjeto().getNumero()){
        last.setNext(item);
        item.setPrevious(last);
        last = item;
      }
      else{
        last.setNext(item);
        item.setPrevious(last);
        last = item;
      }
    }
  }
  //before antes
  public void Addbefore(DoublyLinkedListItem beforeItem,DoublyLinkedListItem newItem){
    beforeItem.getPrevious().setNext(newItem);
    newItem.setPrevious(beforeItem.getPrevious());
    newItem.setNext(beforeItem);
    beforeItem.setPrevious(newItem);
  }
  //after despues
  public void AddAfter(DoublyLinkedListItem AfterItem,DoublyLinkedListItem newItem){
    AfterItem.getNext().setPrevious(newItem);
    newItem.setPrevious(AfterItem);
    newItem.setNext(AfterItem.getNext());
    AfterItem.setNext(AfterItem);
  }
  
  //en todas la comparaciones de if; poner .getObjeto().getNumero()
  public void Clear(){
    DoublyLinkedListItem ecuals = first;
    if(ecuals.getObjeto().getNumero() == last.getObjeto().getNumero()){
      first=null;
      last=null;
    }
    while (ecuals != null) {
      if(ecuals.getNext() != null){
        first = ecuals.getNext();
        ecuals.setNext(null);
      }
      else{
        ecuals.setNext(null);
        last = null;
        first = null;
      }
      ecuals = ecuals.getNext();
    }
  }
  
  public int Contains(DoublyLinkedListItem item){
    return item.getObjeto().getNumero();
  }
  
  //terminado el remover
  public void Remove(DoublyLinkedListItem item){
    if(item.getObjeto().getNumero() == first.getObjeto().getNumero()){
      RemoveFirst();
    }
    else{
      if(item.getObjeto().getNumero() == last.getObjeto().getNumero()){
        RemoveLast();
      }
      else{
        item.getNext().setPrevious(item.getPrevious());
        item.getPrevious().setNext(item.getNext());
        item.setNext(null);
        item.setPrevious(null);
      }
    }
  }
  
  
  public void RemoveFirst(){
    DoublyLinkedListItem ecuals = first;
    if(first.getObjeto().getNumero() == last.getObjeto().getNumero()){
      first=null;
      last=null;
    }else{
      first = ecuals.getNext();
      first.setPrevious(null);
      ecuals.setNext(null);
    }
  }
  
  public void RemoveLast(){
    DoublyLinkedListItem ecuals = last;
    if(last.getObjeto().getNumero() == first.getObjeto().getNumero()){
      first=null;
      last=null;
    }else{
      last = ecuals.getPrevious();
      last.setNext(null);
      ecuals.setPrevious(null);;
    }
  }
}
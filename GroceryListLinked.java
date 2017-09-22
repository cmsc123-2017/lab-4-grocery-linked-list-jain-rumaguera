class GroceryListLinked implements IGroceryList {
  
  GroceryNode head = null;
  int size = 0;
  
  GroceryListLinked() {}
  
  /*TEMPLATE
   * Fields:
   * ...this.head...          --GroceryNode
   * ...this.size...          --int
   * 
   * Methods:
   * ...this.addLast()...           --boolean
   * ...this.remove()...            --boolean
   * ...this.markAsBought()...      --boolean
   * ...this.display()...           --
  */
  
  // -> boolean
  // Returns true if an item is successfully added to the list given this GroceryItem
  public boolean addFirst(GroceryItem item) {
    GroceryNode newNode = new GroceryNode(item, head);
      head = newNode;
      this.size++;
      return true;
  } 
  
  /*TEMPLATE
   * Fields:
   * ...this.head...          --GroceryNode
   * ...this.size...          --int
   * 
   * Methods:
   * ...this.addLast()...           --boolean
   * ...this.remove()...            --boolean
   * ...this.markAsBought()...      --boolean
   * ...this.display()...           --
  */
  
  // -> boolean
  //Returns true if an item is successfully remove from the list given this name
  public boolean remove(String name) {
    if(this.size == 0){
      return false;
    }
    
    GroceryItem item = new GroceryItem(name, 0);
    GroceryNode currentNode = this.head;
    GroceryNode lastNode = currentNode;
    
    while(currentNode.next != null){
      if(item.equals(currentNode.data)){
        lastNode.next = currentNode.next;
        currentNode.next = null;
      
        this.size--;
        return true;
      }
      
      lastNode = currentNode;
      currentNode = currentNode.next;
    }
    
     return false;
    
  }
  
  /*TEMPLATE
   * Fields:
   * ...this.head...          --GroceryNode
   * ...this.size...          --int
   * 
   * Methods:
   * ...this.addLast()...           --boolean
   * ...this.remove()...            --boolean
   * ...this.markAsBought()...      --boolean
   * ...this.display()...           --
  */
  
  //String --> boolean
  //Returns true if the item has been marked as bought
  public boolean markAsBought(String name) {
    GroceryItem item = new GroceryItem(name, 0);
    
    GroceryNode currentNode = this.head;
    
    while(currentNode.next != null){
      if(item.equals(currentNode.data)){
        currentNode.data.isBought();
      
        return true;
      }
        currentNode = currentNode.next;      
    }
        
      return false;
  }
  
  /*TEMPLATE
   * Fields:
   * ...this.head...          --GroceryNode
   * ...this.size...          --int
   * 
   * Methods:
   * ...this.addLast()...           --boolean
   * ...this.remove()...            --boolean
   * ...this.markAsBought()...      --boolean
   * ...this.display()...           --
  */
  
  //-> void
  //Displays the Linked List
  public void display() {
    GroceryNode current = head;
    while(current != null) {
      System.out.println(current.data);
      current = current.next;
    }
  }
}

class GroceryNode {
  GroceryItem data;
  GroceryNode next;
  
  GroceryNode(GroceryItem data, GroceryNode next) {
    this.data = data;
    this.next = next;
  }
}

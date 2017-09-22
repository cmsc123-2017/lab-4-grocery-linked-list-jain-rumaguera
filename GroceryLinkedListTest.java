import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class GroceryLinkedListTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testAdd() {
    GroceryListLinked lList = new GroceryListLinked();
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem keyboard = new GroceryItem("Keyboard", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
    
      lList.addFirst(soap);
      lList.addFirst(toothpaste);
      lList.addFirst(laptop);
      lList.addFirst(earphones);
      
      assertEquals(true, lList.addFirst(soap));
      assertEquals(true, lList.addFirst(toothpaste));
      assertEquals(true, lList.addFirst(conditioner));
      assertEquals(true, lList.addFirst(laptop));
   }
  
  public void testRemove(){
  
  GroceryListLinked lList = new GroceryListLinked();
    
    GroceryItem soap = new GroceryItem("Soap", 3);
    GroceryItem toothpaste = new GroceryItem("Colgate", 2);
    GroceryItem conditioner = new GroceryItem("Conditioner", 10);
    GroceryItem earphones = new GroceryItem("Earphones", 5);
    GroceryItem keyboard = new GroceryItem("Keyboard", 1);
    GroceryItem laptop = new GroceryItem("Laptop", 6);
    
     lList.addFirst(soap);
     lList.addFirst(toothpaste);
     lList.addFirst(conditioner);
     lList.addFirst(earphones);
     lList.addFirst(laptop);
     
     assertEquals(false, lList.remove("Mouse"));
     assertEquals(true, lList.remove("Colgate"));
   
  }
  
  public void testMarkAsBought() {
  
  GroceryListLinked lList = new GroceryListLinked();
  
  GroceryItem soap = new GroceryItem("Soap", 3);
  GroceryItem toothpaste = new GroceryItem("Colgate", 2);
  GroceryItem conditioner = new GroceryItem("Conditioner", 10);
  GroceryItem earphones = new GroceryItem("Earphones", 5);
  GroceryItem keyboard = new GroceryItem("Keyboard", 1);
  GroceryItem laptop = new GroceryItem("Laptop", 6);
  
  lList.addFirst(soap);
  lList.addFirst(toothpaste);
  lList.addFirst(conditioner);
  lList.addFirst(earphones);
  lList.addFirst(laptop);
  
  assertEquals(false, lList.markAsBought("Mouse"));
  assertEquals(true, lList.markAsBought("Laptop"));

  }
  
  
}

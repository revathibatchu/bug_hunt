package com.uh.pat;
import com.uh.pat.AVLTree;   
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.RunWith;

public class CustomTest {
    @Test(timeout = 4000)
    public void test1() throws Throwable {
       
        AVLTree aVLTree0 = new AVLTree();
        AVLTree.Node node2 = aVLTree0.find((int) '4');
        AVLTree.Node node3 = aVLTree0.getRoot();
        aVLTree0.delete(100);
        aVLTree0.insert((int) (byte) 10);
        AVLTree.Node node8 = aVLTree0.getRoot();
        aVLTree0.insert((int) (short) 0);
        // during test generation this statement threw an exception of type java.lang.NullPointerException in error
        aVLTree0.delete(10);
    }
    
    @Test(timeout = 4000)
    public void test3()  throws Throwable  {
        AVLTree aVLTree0 = new AVLTree();
       
       aVLTree0.insert(500);
       aVLTree0.insert(890);
       aVLTree0.insert(230);
       aVLTree0.insert(568);
       aVLTree0.delete(890);
       aVLTree0.delete(230);
       aVLTree0.delete(568);   
       
        // Undeclared exception!
        
        
    }

    
  
}

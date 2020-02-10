
/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Marcelle Tamegnon.)
 * @version (02/09/20.)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private boolean courseText;
    /**
     * Set the author and title fields when this object
     * is constructed.
     */
public Book(String bookAuthor, String bookTitle, int bookPages,
 boolean bookcourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = bookcourseText;
    }

    // Add the methods here ...
    
public String getAuthor()
    {
        return author;
    }
    
public String getTitle()
    {
        return title;
    }
    
public void printAuthor()
    {
        System.out.println("Book's Author:" + author);
    }
    
public void printTitle()
    {
        System.out.println("Book's Title:" + title);
    }
    
public int getPages()
    {
        return pages;
    }
    
public void setRefNumber(String ref)
    {
        
        if(refNumber.length() >= 3){
        refNumber = ref;
        }
        else {
        refNumber = "";    
        System.out.println("Please enter at leat 3 charaters.");
        }
            
    }
    
public String getRefNumber()
    {
        return refNumber;
    }
    
public void borrow()
    {
        borrowed = borrowed + 1;
    } 
    
public int getBorrowed()
    {
        return borrowed;
    }    

public boolean isCourseText()
    {
        return courseText;
    }
    
public void printDetails()
    {
        System.out.println("Author: "+ author + ",  Title: " + title + 
        ", Pages:" + pages);
        if (refNumber.length() == 0) {
        System.out.println("ZZZ");
        }
        else {
        System.out.println("Reference Number: " + refNumber); 
    } 
        System.out.println("Number times books borrowed: " + borrowed);
} 
}

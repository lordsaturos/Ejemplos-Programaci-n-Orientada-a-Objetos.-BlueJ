/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int prestado;
    private boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int pagesCount, boolean bookCourseText)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = pagesCount;
        refNumber = "";
        prestado = 0;
        courseText = bookCourseText;
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

    public int getPages()
    {
        return pages;
    } 

    public String getRefNumber()
    {
        return refNumber;
    } 

    public int getPrestado()
    {
        return prestado;
    } 

    public boolean isCourseText()
    {
        return courseText;
    }

    public void printAuthor()
    {
        System.out.println("El autor es: " + author);
        return;
    }
    
    public void printTitle()
    {
        System.out.println("El libro es: " + title);
        return;
    }
    
    public void printDetails()
    {
        System.out.println("El titulo es: " + title + ". El autor es: " + author + ". El numero de paginas es: " + pages);
        if (refNumber.length() == 0)
        {
            System.out.println("La referencia del libro es: ZZZ");
        }
        else
        {
            System.out.println("La referencia del libro es: " + refNumber);
        }
        System.out.println("El libro ha sido prestado: " + prestado + " veces.");
    }

    public void setRefNumber(String ref)
    {
        if(ref.length() < 3)
        {
            System.out.println("La referencia introducida tiene menos de 3 caracteres de largo. Introduzca una referencia correcta");
        }
        else
        {
            refNumber = ref;
            System.out.println("La referencia introducida es correcta. La referencia hasido actualizada");
        }
        return;
    }

    public void prestar()
    {
        prestado = prestado + 1;
        return;
    }
}

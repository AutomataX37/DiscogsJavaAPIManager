package discogsjava.database.artist;

public class ArtistUrls
{
    //Variables
    private String next = null;
    private String last = null;
    private String first = null;
    private String previous = null;

    //Functions
    public String getNext()
    {
        return next;
    }

    public void setNext(String next)
    {
        this.next = next;
    }

    public String getLast()
    {
        return last;
    }

    public void setLast(String last)
    {
        this.last = last;
    }

    public String getFirst()
    {
        return first;
    }

    public void setFirst(String first)
    {
        this.first = first;
    }

    public String getPrevious()
    {
        return previous;
    }

    public void setPrevious(String previous)
    {
        this.previous = previous;
    }

}

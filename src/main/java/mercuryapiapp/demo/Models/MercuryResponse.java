package mercuryapiapp.demo.Models;

public class MercuryResponse {
    
    private String next_page_url;

    private String rendered_pages;

    private String title;

    private String content;

    private String direction;

    private String excerpt;

    private String word_count;

    private String total_pages;

    private String domain;

    private String dek;

    private String url;

    public String getNext_page_url ()
    {
        return next_page_url;
    }

    public void setNext_page_url (String next_page_url)
    {
        this.next_page_url = next_page_url;
    }

    public String getRendered_pages ()
    {
        return rendered_pages;
    }

    public void setRendered_pages (String rendered_pages)
    {
        this.rendered_pages = rendered_pages;
    }

    public String getTitle ()
    {
        return title;
    }

    public void setTitle (String title)
    {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getDirection ()
    {
        return direction;
    }

    public void setDirection (String direction)
    {
        this.direction = direction;
    }

    public String getExcerpt ()
    {
        return excerpt;
    }

    public void setExcerpt (String excerpt)
    {
        this.excerpt = excerpt;
    }

    public String getWord_count ()
    {
        return word_count;
    }

    public void setWord_count (String word_count)
    {
        this.word_count = word_count;
    }

    public String getTotal_pages ()
    {
        return total_pages;
    }

    public void setTotal_pages (String total_pages)
    {
        this.total_pages = total_pages;
    }

    public String getDomain ()
    {
        return domain;
    }

    public void setDomain (String domain)
    {
        this.domain = domain;
    }

    public String getDek ()
    {
        return dek;
    }

    public void setDek (String dek)
    {
        this.dek = dek;
    }

    public String getUrl ()
    {
        return url;
    }

    public void setUrl (String url)
    {
        this.url = url;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [next_page_url = "+next_page_url+", rendered_pages = "+rendered_pages+", title = "+title+", title = "+content+", direction = "+direction+", excerpt = "+excerpt+", word_count = "+word_count+", total_pages = "+total_pages+", domain = "+domain+", dek = "+dek+", url = "+url+"]";
    }
    
}

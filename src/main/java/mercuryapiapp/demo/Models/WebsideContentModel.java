package mercuryapiapp.demo.Models;

import java.util.Map;

public class WebsideContentModel {

    private String title;

    private String content;

    private String word_count;

    private String total_pages;

    private String domain;

    private String url;

    private String author;

    private String date_published;

    private Map<String, Long> countedTags;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getWord_count() {
        return word_count;
    }

    public void setWord_count(String word_count) {
        this.word_count = word_count;
    }

    public String getTotal_pages() {
        return total_pages;
    }

    public void setTotal_pages(String total_pages) {
        this.total_pages = total_pages;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getDate_published() {
        return date_published;
    }

    public void setDate_published(String date_published) {
        this.date_published = date_published;
    }

    public Map<String, Long> getCountedTags() {
        return countedTags;
    }

    public void setCountedTags(Map<String, Long> countedTags) {
        this.countedTags = countedTags;
    }

    public WebsideContentModel(String title, String content, String word_count, String total_pages, String domain, String url, String author, String date_published, Map<String, Long> countedTags) {
        this.title = title;
        this.content = content;
        this.word_count = word_count;
        this.total_pages = total_pages;
        this.domain = domain;
        this.url = url;
        this.author = author;
        this.date_published = date_published;
        this.countedTags = countedTags;
    }
}

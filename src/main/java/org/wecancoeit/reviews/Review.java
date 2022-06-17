package org.wecancoeit.reviews;

public class Review {
    private Long id;
    private String title;
    private String imageUrl;
    private String description;
    private String content;

    public Long getId() {
        return id;

    }

    public String getTitle() {
        return title;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public String getDescription() {
        return description;
    }

    public String getContent() {
        return content;
    }

    public Review(Long id, String title, String imageUrl, String description, String content) {
        this.id = id;
        this.title = title;
        this.imageUrl = imageUrl;
        this.description = description;
        this.content = content;
    }

}

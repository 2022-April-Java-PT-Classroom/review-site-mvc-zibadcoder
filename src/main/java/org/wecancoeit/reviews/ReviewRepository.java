package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class ReviewRepository {

    Map<Long, Review> reviewsList = new HashMap<>();
    public ReviewRepository() {
      Review laptopReview = new Review(1L,"HP laptop","/laptop.jpg",
              "This is an HP laptop icore 7.","I love this laptop! 5 star");
      Review bookReview = new Review(2L,"Unlimited Memory","/book.jpg",
              "It is a book written by memory master, Kevin.", "I loved it! 5 star");
      Review erasablePen = new Review(3L,"Parkoo Erasable pen","/pen.jpg",
              "It is pencil like pen. It allows you to erase what you have written!",
                      "Good for the money. 4 star");

      reviewsList.put(laptopReview.getId(),laptopReview);
      reviewsList.put(bookReview.getId(),bookReview);
      reviewsList.put(erasablePen.getId(),erasablePen);
    }

    public ReviewRepository(Review ... reviewsToAdd) {
        for(Review review: reviewsToAdd){
            reviewsList.put(review.getId(),review);
        }



    }

    public Review findOne(long id) {
        return reviewsList.get(id);
    }

    public Collection<Review> findAll() {
        return reviewsList.values();
    }
}

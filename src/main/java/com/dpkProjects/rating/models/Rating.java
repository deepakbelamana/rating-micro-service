package com.dpkProjects.rating.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document("ratings")
public class Rating {
    @MongoId
    private String ratingId;
    private String userId;
    private String hotelId;
    private int rating;
    private String feedback;
}

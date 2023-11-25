package com.dpkProjects.rating.services.services.impl;

import com.dpkProjects.rating.Repositories.RatingRepository;
import com.dpkProjects.rating.models.Rating;
import com.dpkProjects.rating.services.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RatingServiceImpl implements RatingService {

    @Autowired
    RatingRepository ratingRepository;
    /**
     * @param rating
     * @return
     */
    @Override
    public Rating create(Rating rating) {
        return ratingRepository.save(rating);
    }

    /**
     * @return
     */
    @Override
    public List<Rating> getRatings() {
        return ratingRepository.findAll();
    }

    /**
     * @param userId
     * @return
     */
    @Override
    public List<Rating> getRatingByUserId(String userId) {
        return ratingRepository.findByUserId(userId);
    }

    /**
     * @param hotelId
     * @return
     */
    @Override
    public List<Rating> getRatingByHotelId(String hotelId) {
        return ratingRepository.findByHotelId(hotelId);
    }
}

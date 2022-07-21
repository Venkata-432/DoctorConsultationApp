package com.example.doctorconsultaionapp.service;

import java.util.List;
import java.util.Optional;

import com.example.doctorconsultaionapp.entity.FeedBack;

public interface IFeedBackService {

	void feedbackInput(FeedBack fb);

	List<FeedBack> viewFeedbacks();

	Optional<FeedBack> viewFeedback(int id);

	void deleteFeedback(int id);

	void updateFeedback(FeedBack fb,int id);
}

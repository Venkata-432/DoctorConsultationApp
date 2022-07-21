package com.example.doctorconsultaionapp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.doctorconsultaionapp.dao.FeedBackRepo;
import com.example.doctorconsultaionapp.entity.FeedBack;

@Service
public class FeedBackService implements IFeedBackService{

	@Autowired
	private FeedBackRepo fbRepo;
	
	@Override
	public void feedbackInput(FeedBack fb) {
		fbRepo.save(fb);
	}

	@Override
	public List<FeedBack> viewFeedbacks() {
		List<FeedBack> feedbacks=fbRepo.findAll();
		return feedbacks;
	}

	@Override
	public Optional<FeedBack> viewFeedback(int id) {
		
		return fbRepo.findById(id);
	}

	@Override
	public void deleteFeedback(int id) {
		fbRepo.deleteById(id);
		
	}

	@Override
	public void updateFeedback(FeedBack fb,int id) {
		FeedBack fbup=fbRepo.findById(id).get();
		
	}

}

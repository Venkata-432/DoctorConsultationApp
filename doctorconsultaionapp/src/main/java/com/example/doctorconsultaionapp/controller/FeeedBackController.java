package com.example.doctorconsultaionapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.doctorconsultaionapp.entity.FeedBack;
import com.example.doctorconsultaionapp.service.IFeedBackService;

@RestController
@RequestMapping("/feedback")
public class FeeedBackController {

	@Autowired
	private IFeedBackService feedback;
	
	@PostMapping("fbinput")
	public void feedbackInput(@RequestBody FeedBack fb) {
		feedback.feedbackInput(fb);
	}
	
	@GetMapping("viewFeedBacks")
	public void viewFeedBacks() {
		feedback.viewFeedbacks();
	}
	
	@GetMapping("viewFeedBack/{id}")
	public void viewFeedBack(@PathVariable int id) {
		feedback.viewFeedback(id);
	}
	
	@PutMapping("updateFeedBack/{id}")
	public void updateFeedBack(FeedBack fb,@PathVariable int id) {
		feedback.updateFeedback(fb,id);
	}
	
	@DeleteMapping("deleteFeedBack/{id}")
	public void deleteFeedBack(@PathVariable int id) {
		feedback.deleteFeedback(id);
	}
}

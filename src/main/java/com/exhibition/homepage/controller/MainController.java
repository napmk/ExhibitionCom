package com.exhibition.homepage.controller;



import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.exhibition.homepage.dto.MemberForm;
import com.exhibition.homepage.dto.QuestionDto;
import com.exhibition.homepage.entity.RvQuestion;
import com.exhibition.homepage.service.RvMemberService;


import lombok.RequiredArgsConstructor;


//@RequiredArgsConstructor
@Controller
public class MainController {
	
	//private final RvMemberService rvMemberService;
	
	@RequestMapping(value = "/")
	public String home() {
		
		return "redirect:index";
	}
	
	
	@RequestMapping(value = "/index")
	public String index() {
		
		 
		
		return "index";
	}

	@RequestMapping(value = "/join")
		public String join(MemberForm memberForm) {
					
			return "join_form";
		}
		
//	@PostMapping(value = "/joinOk")
//		public String joinOk(@Valid MemberForm memberForm, BindingResult bindingResult) {
//			
//			if(bindingResult.hasErrors()) {
//				return "join_form";
//			}
//			
//			
//			try {
//				rvMemberService.memberCreate(memberForm.getMuserid(), memberForm.getMusername(), memberForm.getMpw(), memberForm.getMemail());
//			}catch(Exception e){
//				e.printStackTrace();
//				bindingResult.reject("joinFail", "이미 등록된 아이디입니다.");
//				return "join_form";
//			}
//			return "redirect:index";
//		}
//		
	@RequestMapping(value = "/login")
	public String login() {
		return "login_form";
	}
	
	@RequestMapping(value = "/list")	
	public String list(Model model) {

//		List<Question> questionList = questionRepository.findAll();

		Object questionService;
		List<QuestionDto> questionList = questionService.getQuestionList();

		model.addAttribute("questionList", questionList);

		return "question_list";
	}

	@RequestMapping(value = "/questionView/{id}")
	public String questionView(Model model, @PathVariable("id") Integer id) {

		   QuestionDto question = questionService.getQuestion(id);

			model.addAttribute("question", question);

			return "question_view";
			
			
	
		
  }
}

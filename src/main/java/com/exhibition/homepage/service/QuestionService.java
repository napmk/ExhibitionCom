package com.exhibition.homepage.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.exhibition.homepage.entity.RvQuestion;
import com.exhibition.homepage.exception.DataNotFoundException;
import com.exhibition.homepage.repository.AnswerRepository;
import com.exhibition.homepage.repository.QuestionRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class QuestionService {

	private final QuestionRepository questionRepository;
	private final AnswerRepository answerRepository;

	public List<RvQuestion> getQuestionList() {
		List<RvQuestion> questionList = questionRepository.findAll();


		return questionList;
	}

	public RvQuestion getQuestion(Integer id) {

		Optional<RvQuestion> optQuestion = questionRepository.findById(id);
		if(optQuestion.isPresent()) {
			RvQuestion question = optQuestion.get();
			return question;
		} else {
			throw new DataNotFoundException("해당 질문이 없습니다.");
		}
		
	}

}

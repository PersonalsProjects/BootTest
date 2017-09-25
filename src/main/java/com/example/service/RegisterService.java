package com.example.service;

import org.springframework.stereotype.Service;

import com.example.model.RegisterModel;

@Service
public interface RegisterService {
	public void register(RegisterModel registerModel);
}

package com.example.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.model.RegisterModel;
import com.example.service.RegisterService;

@Service
public class RegisterServiceImpl implements RegisterService {

	@Override
	public void register(RegisterModel registerModel) {
		// TODO Auto-generated method stub
		System.out.println("in service");
		
	}

}

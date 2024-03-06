package com.jisang.realEstate.controller.implement;

import com.jisang.realEstate.controller.AuthController;
import com.jisang.realEstate.dto.request.CheckIdRequestDto;
import com.jisang.realEstate.dto.request.SendCodeRequestDto;
import com.jisang.realEstate.dto.response.CheckIdResponseDto;
import com.jisang.realEstate.dto.response.SendCodeResponseDto;
import com.jisang.realEstate.interfaces.Code;
import com.jisang.realEstate.service.AuthService;
import com.jisang.realEstate.service.implement.AuthServiceImplement;

public class AuthControllerImplement implements AuthController {
	
	private AuthService authService;
	
	public AuthControllerImplement (AuthService authService) {
		this.authService = authService;
	}

	@Override
	public CheckIdResponseDto checkId(CheckIdRequestDto request) {
		boolean validId = request.validId(); 
		if (!validId) return new CheckIdResponseDto(Code.VF, null);  // 검증을 하는데 실패하면 다시 화면으로 되돌려보냄!
		
		CheckIdResponseDto response = authService.checkId(request); 
		return response;
	}

	@Override
	public SendCodeResponseDto sendCode(SendCodeRequestDto request) {
		boolean valid = request.validEmail();
		if (!valid) return new SendCodeResponseDto(Code.VF, null);
		
		SendCodeResponseDto response = authService.sendCode(request);
		return response;
	}

}

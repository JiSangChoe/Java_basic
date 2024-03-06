package com.jisang.realEstate.service;

import com.jisang.realEstate.dto.request.CheckIdRequestDto;
import com.jisang.realEstate.dto.request.SendCodeRequestDto;
import com.jisang.realEstate.dto.response.CheckIdResponseDto;
import com.jisang.realEstate.dto.response.SendCodeResponseDto;

public interface AuthService {
	CheckIdResponseDto checkId(CheckIdRequestDto dto); 
	SendCodeResponseDto sendCode(SendCodeRequestDto dto);

}

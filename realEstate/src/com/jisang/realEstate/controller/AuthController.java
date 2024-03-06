package com.jisang.realEstate.controller;

import com.jisang.realEstate.dto.request.CheckIdRequestDto;
import com.jisang.realEstate.dto.request.SendCodeRequestDto;
import com.jisang.realEstate.dto.response.CheckIdResponseDto;
import com.jisang.realEstate.dto.response.SendCodeResponseDto;

public interface AuthController {
	CheckIdResponseDto checkId(CheckIdRequestDto request);
	SendCodeResponseDto sendCode(SendCodeRequestDto request);

}

package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class ExecClass {
	
	@Autowired // bean이 없는데 이걸 하는거여서에러 = @Autowired는 컨테이너에서 빼오는거  
	private UploadService upload1;
	

	public void getExecDi() {
		upload1.upload();
	}
	

}

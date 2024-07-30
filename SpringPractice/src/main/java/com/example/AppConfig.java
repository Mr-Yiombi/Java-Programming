package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan("com.example")
public class AppConfig{
	
	//빈을 생성하는데 uploadService의 return 값을 AboardUploadServiceImpl로 해준다. 그러면 ExecClass에서 빈을 가져오는데. 
	//@Autowired
	//private UploadService upload1; 하면 AboardUploadServiceImpl로 실행할 수 있게 된다. 그러면 AboardUploadServiceImpl의 메소드가 실행이 된다.  밑에가 이
	@Bean 
	public UploadService getUploadService() { //getUploadService 메서드는 UploadService 타입의 빈을 생성하여 AboardUploadServiceImpl 객채 생스프링 컨테이너에 등록된 빈을 가져옴. 이게 먼저 실행됨. 
		return new LocalUploadServiceImpl();
		
	}
	//*************메소드의 Return 값을 Bean으로 설정*************//
	
	//@Bean =  어노테이션은 XML 설정 파일 대신 자바 클래스를 사용하여 빈을 정의할 수 있게 해줍니다. 
}

/*
 * myService 메서드는 @Bean 어노테이션을 사용하여 스프링 컨테이너에 빈을 등록하는 역할을 합니다. 이 메서드는 MyService 타입의 빈을 생성하고, 
 * 스프링 컨테이너는 이를 관리하게 됩니다. 이러한 메서드를 정의하는 이유는 여러 가지가 있습니다:

1. 빈 등록
myService 메서드는 MyService 타입의 빈을 생성하고 반환합니다. @Bean 어노테이션이 붙은 메서드는 스프링 컨테이너가 자동으로 호출하여 그 반환값을 빈으로 등록합니다. 
이를 통해 다른 빈들이 MyService 빈을 의존성 주입받을 수 있습니다.*/


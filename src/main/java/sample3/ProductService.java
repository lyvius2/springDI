package sample3;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import sample2.Logger;

// 아래와 같이 이름을 부여('pservice'), 설정하지 않으면 클래스명 앞글자를 소문자로 바꾸어 Bean 객체 이름이 지정된다.
@Component("pservice")
public class ProductService {

	// requied=false는 반드시 해당 객체가 context 설정에 없어도 넘어간다.
	//@Autowired(required=false)
	
	//name을 적시하지 않으면 @Autowired와 동일하게 동작
	//동일한 interface를 참조하는 두개의 객체를 등록한 뒤 name으로 어떤 객체를 사용할 것인지 지정한다.
	@Resource(name="db")
	Logger logger;
	
	public void add(){
		// 상품 등록 로직...
		
		logger.write("새 상품 등록 완료");
	}
}

package com.fastcampus.ooppractice;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThatCode;

@SpringBootTest
class OopPracticeApplicationTests {

	@DisplayName("비밀번호가 최소 8자리 이상, 12자 이하면 예외가 발생하지 않는다.")
	@Test
	void validatePasswordTest() {
		assertThatCode(() -> PasswordValidator.validate("serverwizard"))
				.doesNotThrowAnyException();
	}

}

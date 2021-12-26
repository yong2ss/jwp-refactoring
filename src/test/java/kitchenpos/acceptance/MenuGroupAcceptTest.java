package kitchenpos.acceptance;

import static kitchenpos.acceptance.step.MenuGroupAcceptStep.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import kitchenpos.AcceptanceTest;
import kitchenpos.domain.MenuGroup;

@DisplayName("메뉴 그룹 인수테스트")
public class MenuGroupAcceptTest extends AcceptanceTest {

	@DisplayName("메뉴 그룹 관리")
	@Test
	void 메뉴_그룹_관리() {
		// given
		MenuGroup 생성_요청_메뉴_그룹 = new MenuGroup();
		생성_요청_메뉴_그룹.setName("추천메뉴");

		// when
		ExtractableResponse<Response> 메뉴_그룹_생성_응답 = 메뉴_그룹_생성_요청(생성_요청_메뉴_그룹);

		// then
		MenuGroup 생성된_메뉴_그룹 = 메뉴_그룹_생성_확인(메뉴_그룹_생성_응답, 생성_요청_메뉴_그룹);

		// when
		ExtractableResponse<Response> 메뉴_그룹_목록_조회_응답 = 메뉴_그룹_목록_조회_요청();

		// then
		메뉴_그룹_목록_조회_확인(메뉴_그룹_목록_조회_응답, 생성된_메뉴_그룹);
	}
}

package docspractice;

import com.epages.restdocs.apispec.ResourceSnippetParameters;
import com.epages.restdocs.apispec.Schema;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;

import static com.epages.restdocs.apispec.MockMvcRestDocumentationWrapper.document;
import static com.epages.restdocs.apispec.ResourceDocumentation.resource;
import static org.springframework.restdocs.mockmvc.RestDocumentationRequestBuilders.post;
import static org.springframework.restdocs.operation.preprocess.Preprocessors.*;
import static org.springframework.restdocs.payload.PayloadDocumentation.fieldWithPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class MemberControllerTest extends ControllerTest {

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    @DisplayName("조건을 만족하면 회원가입에 성공합니다")
    void signup1() throws Exception {
        // given
        MemberSignup memberSignup = new MemberSignup(
                "xxx@gmail.com", "1234", "닉네임",
                "경기도 수원시 영통구", "010-0000-0000"
        );

        String memberSignupJson = objectMapper.writeValueAsString(memberSignup);

        // expected
        mockMvc.perform(post("/signup1")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(memberSignupJson))
                .andExpect(status().isOk())
                .andDo(document("회원 가입 성공1",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        resource(ResourceSnippetParameters.builder()
                                .tag("회원")
                                .summary("회원 가입 1")
                                .requestFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .responseFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .build(
                                ))));
    }

    @Test
    @DisplayName("조건을 만족하면 회원가입에 성공합니다")
    void signup2() throws Exception {
        // given
        MemberSignup memberSignup = new MemberSignup(
                "xxx@gmail.com", "1234", "닉네임",
                "경기도 수원시 영통구", "010-0000-0000"
        );

        String memberSignupJson = objectMapper.writeValueAsString(memberSignup);

        // expected
        mockMvc.perform(post("/signup2")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(memberSignupJson))
                .andExpect(status().isOk())
                .andDo(document("회원 가입 성공2",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        resource(ResourceSnippetParameters.builder()
                                .tag("회원")
                                .summary("회원 가입 2")
                                .requestFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .responseFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .build(
                                ))));
    }

    @Test
    @DisplayName("조건을 만족하면 회원가입에 성공합니다")
    void signup3() throws Exception {
        // given
        MemberSignup memberSignup = new MemberSignup(
                "xxx@gmail.com", "1234", "닉네임",
                "경기도 수원시 영통구", "010-0000-0000"
        );

        String memberSignupJson = objectMapper.writeValueAsString(memberSignup);

        // expected
        mockMvc.perform(post("/signup3")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(memberSignupJson))
                .andExpect(status().isOk())
                .andDo(document("회원 가입 성공3",
                        preprocessRequest(prettyPrint()),
                        preprocessResponse(prettyPrint()),
                        resource(ResourceSnippetParameters.builder()
                                .tag("회원")
                                .summary("회원 가입 3")
                                .requestFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .responseFields(
                                        fieldWithPath("nickname").description("닉네임"),
                                        fieldWithPath("email").description("이메일"),
                                        fieldWithPath("password").description("비밀 번호"),
                                        fieldWithPath("address").description("주소"),
                                        fieldWithPath("phoneNumber").description("전화 번호")
                                )
                                .build(
                                ))));
    }
}

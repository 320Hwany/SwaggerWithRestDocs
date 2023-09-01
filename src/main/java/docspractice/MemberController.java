package docspractice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @PostMapping("/signup1")
    public MemberSignup signup1(@RequestBody final MemberSignup memberSignup) {
        return memberSignup;
    }

    @PostMapping("/signup2")
    public MemberSignup signup2(@RequestBody final MemberSignup memberSignup) {
        return memberSignup;
    }

    @PostMapping("/signup3")
    public MemberSignup signup3(@RequestBody final MemberSignup memberSignup) {
        return memberSignup;
    }
}

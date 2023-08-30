package docspractice;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @PostMapping("/signup1")
    public String signup1(@RequestBody final MemberSignup memberSignup) {
        return "hello";
    }

    @PostMapping("/signup2")
    public String signup2(@RequestBody final MemberSignup memberSignup) {
        return "hello";
    }

    @PostMapping("/signup3")
    public String signup3(@RequestBody final MemberSignup memberSignup) {
        return "hello";
    }
}

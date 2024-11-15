package naver.kiel0103.cicd;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FrontController {

    @GetMapping("/")
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("test");
    }
}

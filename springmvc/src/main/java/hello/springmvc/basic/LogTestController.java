package hello.springmvc.basic;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogTestController {
    // @Slf4J 어노테이션을 사용함으로써 사용 X
//    private final Logger log = LoggerFactory.getLogger(LogTestController.class);



    @RequestMapping("/log-test")
    public String logTest() {
        String name = "신재원";
/*
        쓸모없는 연산('+')과 리소스를 사용함으로 '+'연산으로 사용하면안된다.
        log.trace("trace log=" + name);
*/

        log.trace("trace log= {}", name);
        log.debug("debug log= {}", name);
        log.info("info log= {}", name);
        log.warn("warn log= {}", name);
        log.error("error log= {}", name);

        return "ok";
    }

}

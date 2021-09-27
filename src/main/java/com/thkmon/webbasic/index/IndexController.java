package com.thkmon.webbasic.index;

import org.springframework.web.bind.annotation.*;

@RestController
public class IndexController {

    // @GetMapping("/") : HTTP Method인 Get의 요청을 받을 수 있다. @RequestMapping(value="경로", method = RequestMethod.GET)와 동일
    // @PostMapping("/") : HTTP Method인 Post의 요청을 받을 수 있다. @RequestMapping(value="경로", method = RequestMethod.POST)와 동일
    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "";
    }

    @RequestMapping(value="/response", method = {RequestMethod.GET, RequestMethod.POST})
    public IndexResponseDto indexResponseDto(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "count", required = false, defaultValue = "0") int count) {
        // @RequestParam : 외부에서 API로 넘긴 파라미터를 가져오는 어노테이션
        return new IndexResponseDto(name, count);
    }
}
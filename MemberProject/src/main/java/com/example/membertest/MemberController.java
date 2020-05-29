package com.example.membertest;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {
    @Autowired
    private MemberRepository memberRepository;

    @RequestMapping("/member")
    public List memberlist2(){
        System.out.println("aaaa");
        List<Member> list = memberRepository.findAll();
        return list;
    }

}

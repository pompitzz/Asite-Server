package me.asite.api;

import lombok.RequiredArgsConstructor;
import me.asite.repository.StudentRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class TestApiController {

    private final StudentRepository memberRepository;

    @PostMapping("/api/test")
    public void joinMember(@RequestBody StudentJoinRequestDto dto){
        memberRepository.save(dto.toEntity());
    }

}

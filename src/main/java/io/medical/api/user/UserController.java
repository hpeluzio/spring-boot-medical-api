package io.medical.api.user;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("users")
public class UserController {

    @PostMapping
    public String create(@RequestBody CreateUserDto body) {
        System.out.println(body);
        return "cadastrar";

    }
}

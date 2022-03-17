package com.example.demo.service;

public interface UserService {
@Transactional(rollbackFor = Exception.class)
public String saveDto(UserDto userDto) {
        userDto.setPassword(bCryptPasswordEncoder
        .encode(userDto.getPassword()));
        return save(new User(userDto)).getId();
        }

        getUserWithAuthorities()
}

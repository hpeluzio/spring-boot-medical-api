package io.medical.api.user;

public record CreateUserDto(String name, String email, String password, Role role, Address address)  {
}

package com.AashwikIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AashwikIT.Entity.UserEntity;

public interface UserRepo extends JpaRepository<UserEntity, Integer> {

	public UserEntity findByEmail(String email);

	public UserEntity findByEmailAndPassword(String email, String password);

}

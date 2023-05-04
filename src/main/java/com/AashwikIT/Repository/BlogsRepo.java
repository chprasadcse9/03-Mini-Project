package com.AashwikIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AashwikIT.Entity.BlogEntity;

public interface BlogsRepo extends JpaRepository<BlogEntity, Integer> {

}

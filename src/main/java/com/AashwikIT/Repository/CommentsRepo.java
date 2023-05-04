package com.AashwikIT.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.AashwikIT.Entity.CommentEntity;


public interface CommentsRepo extends JpaRepository<CommentEntity, Integer> {

}

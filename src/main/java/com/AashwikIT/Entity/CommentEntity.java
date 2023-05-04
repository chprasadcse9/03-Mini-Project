package com.AashwikIT.Entity;

import java.time.LocalTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="User_Comments")
public class CommentEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer commentId;
	private String name;
	private String email;
	private String comment;
	@CreationTimestamp
	private LocalTime createdOn;
	
	
	@ManyToOne
	@JoinColumn(name="blog_id")
	private BlogEntity blog;
	
}

package com.AashwikIT.Entity;

import java.time.LocalTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name="User_Blogs")
public class BlogEntity {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer blogId;
	private String title;
	private String shortDescription;
	private String content;
	@CreationTimestamp
	private LocalTime createdOn;
	@UpdateTimestamp
	private LocalTime updatedOn;
	
	
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity user;
	
	@OneToMany(mappedBy = "blog", cascade=CascadeType.REMOVE)
    private List<CommentEntity> comments;
}

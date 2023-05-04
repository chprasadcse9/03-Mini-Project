package com.AashwikIT.FormBinding;

import java.time.LocalTime;

import lombok.Data;

@Data
public class CommentForm {

	private String email;
	private String comment;
	private LocalTime createdDate;
	
}

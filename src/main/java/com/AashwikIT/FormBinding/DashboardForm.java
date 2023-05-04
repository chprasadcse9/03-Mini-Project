package com.AashwikIT.FormBinding;

import java.time.LocalTime;

import lombok.Data;

@Data
public class DashboardForm {

	private String title;
	private String shortDescription;
	private LocalTime createdOn;
}

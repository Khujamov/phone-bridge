package com.phonebridge.usermanagement.model;

import java.util.Date;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Phone Bridge user entity
 *
 * @author Vinoth Manoharan
 * @version 1.0
 * @since 06-March-2020
 */

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Document("users")
public class User {

	// pb id
	@Id
	private String pbId;

	// account id
	private int accountId;

	// user id
	private String userId;

	// password
	private String password;

	// privilege
	private Privilege privilege;

	// created on
	private Date createdOn;

	// created by
	private String createdBy;

	// modified on
	private Date modifiedOn;

	// modified by
	private String modifiedBy;


}

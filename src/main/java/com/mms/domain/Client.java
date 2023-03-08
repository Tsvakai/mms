package com.mms.domain;

import com.mms.domain.base.BaseEntity;
import com.mms.domain.status.Status;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.*;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@Table(name = "client")
public class Client extends BaseEntity {
    @NotBlank
    @NotEmpty
    private String name;
    @NotBlank
    @NotEmpty
    private String phone;
    @NotBlank
    @NotEmpty
    @Past
    private Date dob;

    @NotBlank
    @NotEmpty
    @Pattern(regexp = "(?i)^\\d\\d\\-\\d\\d\\d\\d\\d\\d[a-zA-Z]\\d\\d$",
            message = "username must be of 6 to 12 length with no special characters")
    private  String nationalId;
    @NotBlank
    @NotEmpty
    @Email
    private String email;
    @NotBlank
    @NotEmpty
    private String address;
    private Status status;

}

package com.factory.appraisal.vehiclesearchapp.dto;

// authorName : YogeshKumarV

import lombok.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DealerRegistration extends TransactionEntityDto {
    @Size(max = 30)
    @NotNull
    private String name;
    @Size(max = 15)
    @NotNull
    private String firstName;
    @Size(max = 15)
    @NotNull
    private String lastName;
    @Size(max = 20)
    @NotNull
    private String ApartmentNumber;
    @Size(max = 10)
    @NotNull
    private String city;
    @Size(max = 50)
    @NotNull
    private String email;
    @Size(max = 20)
    @NotNull
    private String password;
    @Pattern(regexp="^\\+1[.-]?(?:\\d[.-]?){9}\\d$")
    @NotNull
    private String phoneNumber;
    @Size(max = 17)
    @NotNull
    private String profilePicture;
    @Size(max = 10)
    @NotNull
    private String state;
    @Size(max = 50)
    @NotNull
    private String streetAddress;
    @Size(max = 5)
    @NotNull
    private String zipCode;
    @Size(max = 10)
    @NotNull
    private String latitude;
    @Size(max = 10)
    @NotNull
    private String longitude;
    @Size(max = 17)
    @NotNull
    private String taxCertificate;
    @Size(max = 30)
    @NotNull
    private String dealershipName;
    @Size(max = 50)
    @NotNull
    private String dealershipAddress;
    @Size(max = 50)
    @NotNull
    private String dealershipStreet;
    @Size(max = 10)
    @NotNull
    private String dealershipCity;
    @Size(max = 5)
    @NotNull
    private String dealershipZipCode;
    @Pattern(regexp="^\\+1[.-]?(?:\\d[.-]?){9}\\d$")
    @NotNull
    private String dealershipPhoneNumber;
    @Size(max = 17)
    @NotNull
    private String dealershipPicture;
    @Size(max = 17)
    @NotNull
    private String dealershipLicense;
    @Size(max = 30)
    @NotNull
    private String corporationName;
    @Size(max = 30)
    private String codeId;
    private ConfigCodes configCodes;

}

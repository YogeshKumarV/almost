package com.factory.appraisal.vehiclesearchapp.persistence.model;
//@Author: Yudhister vijay
import com.factory.appraisal.vehiclesearchapp.persistence.TransactionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@AuditTable(value = "USER_REG_AUD" , schema = "FACTORY_AUD")
@Entity
@Table(name = "USER_REG",schema = "FACTORY_DB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "userId", column = @Column(name = "USER_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
public class EUserRegistration extends TransactionEntity {
    @Id
    @Column(name = "USER_ID")
    @GeneratedValue(strategy= GenerationType.TABLE,generator = "user_registration")
    @GenericGenerator(
            name = "user_registration",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name",value = "factory_db.user_reg_seq")
            }
    )
    private Long userId;
    @Column(name = "APT_NUMBER")
    private String apartmentNumber;
    private String city;
    private String email;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    private String password;
    @Column(name = "PHONE_NUMBER")
    private String phoneNumber;
    private String state;
    @Column(name = "STREET_ADDRESS")
    private String streetAddress;
    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "ZIP_CODE")
    private String zipCode;

    @OneToOne(targetEntity = EConfigCodes.class, fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @JoinColumn(name = "CODE_ID", referencedColumnName = "CODE_ID", nullable = false)
    private EConfigCodes configCodes;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EDealerRegistration.class, fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "DEALER_ID", referencedColumnName = "DEALER_ID",nullable = false)
    private EDealerRegistration dealerRegistration;


    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "userRegistration")
    private EAppraisalVehicle eAppraiseVehicle;



}

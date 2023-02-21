package com.factory.appraisal.vehiclesearchapp.persistence.model;
// authorName : YogeshKumarV

import com.factory.appraisal.vehiclesearchapp.persistence.TransactionEntity;
import lombok.*;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;

@Audited
@AuditTable(value = "CONFIG_CODES_AUD",schema = "FACTORY_AUD")
@Entity
@Table(name = "CONFIG_CODES",schema = "FACTORY_DB")
@DynamicUpdate
@DynamicInsert
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EConfigCodes extends TransactionEntity {

    @Id
    @Column(name = "CODE_ID")
    @GeneratedValue(strategy= GenerationType.TABLE,generator = "config_codes")
    @GenericGenerator(
            name = "config_codes",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name",value = "factory_db.config_codes_seq")
            }
    )
    private Long codeId;
    private String codeType;
    private String shortCode;
    private String longCode;
    private String shortDescription;
    @OneToOne(mappedBy = "configCodes")
    private EDealerRegistration dealerRegistration;
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(mappedBy = "configCodes")
    private EUserRegistration userRegistration;

}
package com.factory.appraisal.vehiclesearchapp.persistence.model;
//@Author:Yudhister vijay

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
@AuditTable(value = "E_SIGN_DET_AUD" , schema = "FACTORY_AUD")
@Entity
@Table(name = "E_SIGN_DET",schema = "FACTORY_DB")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "signId", column = @Column(name = "E_SIGN_ID"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
public class ESignDetails extends TransactionEntity {


    @Id
    @Column(name="E_SIGN_ID")
    @GeneratedValue(strategy= GenerationType.TABLE,generator = "sign_details")
    @GenericGenerator(
            name = "sign_details",
            strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = {
                    @Parameter(name = "sequence_name",value = "factory_db.e_sign_det_seq")
            }
    )
    private Long signId;
    @Column(name = "E_SIGN_DOC")
    private String signDocument;

    @OneToOne(targetEntity = EAppraisalVehicle.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "APPR_REF_ID",referencedColumnName = "APPR_REF_ID", nullable = false)
    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    private EAppraisalVehicle appraisalReferenceId;





}

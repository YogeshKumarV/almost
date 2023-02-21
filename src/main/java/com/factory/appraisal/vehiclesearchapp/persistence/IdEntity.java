package com.factory.appraisal.vehiclesearchapp.persistence;

/*import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;*/

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;
/*import java.sql.Date;*/


@MappedSuperclass
//@Inheritance
@AllArgsConstructor
@NoArgsConstructor
public class IdEntity {

  /* @Id
    @GeneratedValue(strategy= GenerationType.AUTO)

    @Column(name = "id")
    private Long id;*/


    private Boolean valid;

   /* public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }*/

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }
}

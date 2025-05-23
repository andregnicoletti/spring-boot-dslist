package com.nicoletti.dslist.model.entities;

import jakarta.persistence.Embedded;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_belonging")
public class BelongingEntity {

    @EmbeddedId
    private BelongingPkEntity id = new BelongingPkEntity();

    private Integer position;

}

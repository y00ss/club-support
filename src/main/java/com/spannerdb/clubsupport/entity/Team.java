package com.spannerdb.clubsupport.entity;

import lombok.Data;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Column;
import org.springframework.cloud.gcp.data.spanner.core.mapping.PrimaryKey;
import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name = "teams")
@Data
public class Team {

    @PrimaryKey
    private Long id;

    @Column(name = "team_name")
    private String name;

    private String city;

    private String stadium;

    public Team() {
    }

    public Team(Long id, String name, String city, String stadium) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.stadium = stadium;
    }
}


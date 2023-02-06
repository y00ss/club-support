package com.spannerdb.clubsupport.entity;

import org.springframework.cloud.gcp.data.spanner.core.mapping.Table;

@Table(name = "fan")
public class Fan {

    private String user_id;
    private String team_id;
}

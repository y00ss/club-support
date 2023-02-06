package com.spannerdb.clubsupport.repository;


import com.spannerdb.clubsupport.entity.User;
import org.springframework.cloud.gcp.data.spanner.repository.SpannerRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends SpannerRepository<User, Long> {
}

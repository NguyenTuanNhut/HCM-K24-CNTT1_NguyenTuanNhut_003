package com.re.hackathon.repository;

import com.re.hackathon.entity.Watch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WatchRepostitory extends JpaRepository<Watch,Long> {
}

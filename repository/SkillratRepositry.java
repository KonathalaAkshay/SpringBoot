package com.skillratservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.skillratservice.requestdao.Skillratservicedao;

@Repository("skillratRepositry")
public interface SkillratRepositry extends JpaRepository<Skillratservicedao, Long> {
}
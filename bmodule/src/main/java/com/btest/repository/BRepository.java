package com.btest.repository;

import com.btest.model.BRecord;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BRepository extends JpaRepository<BRecord,Long> {



}

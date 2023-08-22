package com.td.proj.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.td.model.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long> {

}

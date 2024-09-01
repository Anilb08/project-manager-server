package com.prjmng.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjmng.model.Chat;
import com.prjmng.model.Project;

public interface ChatRepository extends JpaRepository<Chat, Long> {
    

	Chat findByProject(Project projectById);
	
//	List<Chat> findByProjectNameContainingIgnoreCase(String projectName);
}


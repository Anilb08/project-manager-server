package com.prjmng.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.prjmng.model.PasswordResetToken;

public interface PasswordResetTokenRepository extends JpaRepository<PasswordResetToken, Integer> {
	PasswordResetToken findByToken(String token);
}

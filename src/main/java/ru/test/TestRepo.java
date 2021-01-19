package ru.test;

import org.springframework.data.jpa.repository.JpaRepository;

public interface TestRepo extends JpaRepository<Test, String> {
}

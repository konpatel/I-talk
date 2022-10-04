package italk.repository;

import italk.entity.Box;
import italk.entity.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoxRepository extends JpaRepository<Box, String> {
}

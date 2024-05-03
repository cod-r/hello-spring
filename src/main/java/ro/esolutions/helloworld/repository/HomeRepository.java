package ro.codr.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.codr.helloworld.entity.HomeMessage;

public interface HomeRepository extends JpaRepository<HomeMessage, Long> {

}

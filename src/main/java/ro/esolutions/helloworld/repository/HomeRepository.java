package ro.esolutions.helloworld.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ro.esolutions.helloworld.entity.HomeMessage;

public interface HomeRepository extends JpaRepository<HomeMessage, Long> {

}

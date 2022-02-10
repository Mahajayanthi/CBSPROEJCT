package net.guides.springboot2.springboot2jpacrudexample.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import antlr.collections.List;
import net.guides.springboot2.springboot2jpacrudexample.model.Canteen;


@Repository
public interface CanteenRepository extends JpaRepository<Canteen, Integer>{

	/* List<canteen> findByshopName(@Param("id") Integer id); */
}

package jl.forthem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jl.forthem.model.Entry;

public interface EntryRepository extends JpaRepository<Entry, Integer> {

}

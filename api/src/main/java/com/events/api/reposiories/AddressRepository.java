package com.events.api.reposiories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.events.api.domain.event.Event;

public interface AddressRepository extends JpaRepository<Event, UUID> {

}

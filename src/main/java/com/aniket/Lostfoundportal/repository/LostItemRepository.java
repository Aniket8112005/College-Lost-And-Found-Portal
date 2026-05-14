package com.aniket.Lostfoundportal.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.aniket.Lostfoundportal.entity.LostItem;

public interface LostItemRepository extends JpaRepository<LostItem, Long> {

}

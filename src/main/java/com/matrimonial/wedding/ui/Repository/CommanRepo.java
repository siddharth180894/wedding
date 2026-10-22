package com.matrimonial.wedding.ui.Repository;

import com.matrimonial.wedding.ui.Entity.Name;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommanRepo extends JpaRepository<Name, Long> {


}

package eu.apps4net.genericJavaApp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import eu.apps4net.genericJavaApp.models.Setting;

@Repository
public interface SettingRepository extends JpaRepository<Setting, Long> {
	Setting getBySettingName(String name);
}

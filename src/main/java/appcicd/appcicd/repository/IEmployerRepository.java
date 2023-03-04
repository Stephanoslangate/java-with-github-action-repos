package appcicd.appcicd.repository;

import appcicd.appcicd.entity.EmployerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface IEmployerRepository extends JpaRepository<EmployerEntity, Integer> {
    public EmployerEntity findByEmail(String email);
}

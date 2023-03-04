package appcicd.appcicd.mapping;

import appcicd.appcicd.domaine.AppEmployer;
import appcicd.appcicd.entity.EmployerEntity;
import org.mapstruct.Mapper;


@Mapper
public interface EmployerMapper {
    AppEmployer toAppEmployer(EmployerEntity appEmployerEntity);
    EmployerEntity fromAppEmployer(AppEmployer appEmployer);
}

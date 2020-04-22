package org.codezen.jhtest;

import com.tngtech.archunit.core.domain.JavaClasses;
import com.tngtech.archunit.core.importer.ClassFileImporter;
import com.tngtech.archunit.core.importer.ImportOption;
import org.junit.jupiter.api.Test;

import static com.tngtech.archunit.lang.syntax.ArchRuleDefinition.noClasses;

class ArchTest {

    @Test
    void servicesAndRepositoriesShouldNotDependOnWebLayer() {

        JavaClasses importedClasses = new ClassFileImporter()
            .withImportOption(ImportOption.Predefined.DO_NOT_INCLUDE_TESTS)
            .importPackages("org.codezen.jhtest");

        noClasses()
            .that()
                .resideInAnyPackage("org.codezen.jhtest.service..")
            .or()
                .resideInAnyPackage("org.codezen.jhtest.repository..")
            .should().dependOnClassesThat()
                .resideInAnyPackage("..org.codezen.jhtest.web..")
        .because("Services and repositories should not depend on web layer")
        .check(importedClasses);
    }
}

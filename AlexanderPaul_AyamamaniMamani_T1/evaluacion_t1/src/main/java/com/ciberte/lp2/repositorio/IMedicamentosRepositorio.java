package com.ciberte.lp2.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import com.ciberte.lp2.entidades.Medicamentos;

public interface IMedicamentosRepositorio extends JpaRepository<Medicamentos, Integer> {

}

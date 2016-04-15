package id.go.bkn.app.dao;

import id.go.bkn.app.entities.Instansi;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstansiDao extends JpaRepository<Instansi, Long> {

}

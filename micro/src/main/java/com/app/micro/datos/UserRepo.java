package com.app.micro.datos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.app.micro.modelo.User;


@Repository
public interface UserRepo extends JpaRepository < User, Integer > {
	
	User findByYearUvtEquals(int valor);
	
	@Query(value=" SELECT json_serialize(solicitud) FROM ACC_TMP_TIPUVT_DOWN_TBL WHERE year_uvt = ?",nativeQuery = true)
	void serializar(int valor);
	
	@Query(value=" UPDATE ACC_TMP_TIPUVT_DOWN_TBL SET solicitud = json_mergepatch(solicitud, ?) WHERE year_uvt = ?",nativeQuery = true)
	void actualizar(String path, int valor);
	
}


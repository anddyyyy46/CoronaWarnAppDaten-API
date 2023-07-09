package com.example.CvdData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CvdDataRepository extends JpaRepository<CvdDataModel, Integer> {


    @Query(nativeQuery = true, value = "SELECT * FROM cvddatamodel")
    List<CvdDataModel> getAll();

    @Query(value = "SELECT * FROM cvddatamodel WHERE effective_date = TO_DATE(:date, 'DD.MM.YYYY')", nativeQuery = true)
    List<CvdDataModel> findByDate(String date);

    @Query(value = "SELECT * FROM cvddatamodel WHERE effective_date >= TO_DATE(:start, 'DD.MM.YYYY') AND effective_date <= TO_DATE(:end, 'DD.MM.YYYY')", nativeQuery = true)
    List<CvdDataModel> findByRange(String start, String end);

    @Query(value = "SELECT * FROM cvddatamodel WHERE TO_CHAR(effective_date, 'mm.yyyy')=:monthYear", nativeQuery = true)
    List<CvdDataModel> findByMonthAndYear(String monthYear);

    @Query(value = "SELECT * FROM cvddatamodel WHERE TO_CHAR(effective_date, 'yyyy') =:year", nativeQuery = true)
    List<CvdDataModel> findByYear(String year);
}

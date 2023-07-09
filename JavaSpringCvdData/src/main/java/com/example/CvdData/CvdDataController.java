package com.example.CvdData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;

@RestController
@CrossOrigin(origins = "*")
public class CvdDataController {
    @Autowired
    CvdDataService cvdDataService;

    @GetMapping("/getData")
    public List<CvdDataModel> getData(@RequestParam("date") String date) throws SQLException {
        return cvdDataService.getData(date);
    }
    @GetMapping("getDataAverages")
    public List<Average> getDataAverages(@RequestParam("date") String date){
        return cvdDataService.getDataAverages(date);
    }



}

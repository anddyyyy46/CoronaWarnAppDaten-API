package com.example.CvdData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class CvdDataService {

    @Autowired
    CvdDataRepository cvdDataRepository;

    /**
     * Manages the requested number of a specific range
     * @param date was das macht...
     * @return was das macht...
     */
    public List<CvdDataModel> getData(String date) {
        switch (date.length()){
            case 1:
                return cvdDataRepository.getAll();
            case 4:                                                 //Numbers of all days in the requested year
                return cvdDataRepository.findByYear(date);
            case 7:                                                 //Numbers of all days in the requested month;
                return cvdDataRepository.findByMonthAndYear(date);
            case 10:                                                //Numbers of a requested day
                return cvdDataRepository.findByDate(date);
            case 21:                                                //Number each day in a specific range
                return cvdDataRepository.findByRange(date.split("-")[0], date.split("-")[1]);

            default:
                return null;
        }
    }

    /**
     * Manages the requested averages
     * @param date
     * @return
     */
    public List<Average> getDataAverages(String date){
        switch (date.length()){
            case 1: //Average numbers per year
                return getAvrgYears();
            case 4: //Average numbers per month in a specific year
                return getAvrgMonths(cvdDataRepository.findByYear(date));
            default:
                return null;
        }
    }

    /**
     * @return List of the average object with the average numbers in a year and
     * the related year and a month which is always null because all given getters/setters
     * will be used when converting java object to JSON
     */
    public List<Average> getAvrgYears(){
        double averages = 0;
        int months = 0;
        List<Average> yearAverages = new ArrayList<>();
        for(String year : getAllYears()){
            System.out.println(year);
            List<Average> monthAverages = getAvrgMonths(cvdDataRepository.findByYear(year));
            for(Average month : monthAverages){
                averages += month.getAverage();
                months = monthAverages.size();
            }
            yearAverages.add(new Average(averages/months, year));
        }
        return yearAverages;
    }

    /**
     * Returns a list of the average object with the average numbers in a month and the related month and year
     * @param allDaysinaYear
     * @return
     */
    public List<Average> getAvrgMonths(List<CvdDataModel> allDaysinaYear){
        List<Average> averages = new ArrayList<>();
        String month = "";
        int numbers = 0;
        int days = 0;
        final String year = allDaysinaYear.get(0).getDate().substring(0,4);
        for(int i = 0; i<allDaysinaYear.size(); i++){
            month = allDaysinaYear.get(i).getDate().substring(5, 7);
            while(month.equals(allDaysinaYear.get(i).getDate().substring(5, 7))){
                numbers += allDaysinaYear.get(i).getinfections_published_daily();
                days++;
                if(i+1>=allDaysinaYear.size())break;
                i++;
            }
            averages.add(new Average(numbers/(double)days, Integer.parseInt(month)-1, year));
        }
        return averages;
    }

    /**
     * Returns a List of all the years in the dataset
     * @return
     */
    public List<String> getAllYears(){
        System.out.println("test");
        List<CvdDataModel> allData = cvdDataRepository.getAll();
        System.out.println(allData.get(0).getDate());
        String currentYear = allData.get(0).getDate().substring(0,4);
        List<String> allYears = new ArrayList<>();
        for(int i =1; i<allData.size();i++){
            allYears.add(currentYear);
            while(currentYear.equals(allData.get(i).getDate().substring(0,4)) && i+1<allData.size()){
                i++;
            }
            currentYear = allData.get(i).getDate().substring(0,4);
        }
        return allYears;
    }
}





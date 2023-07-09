# CoronaWarnApp-Daten-API
First the Main.java in the CVSFileIntoDBScript folder reads the [CoronaWarnAppDaten.csv](https://github.com/anddyyyy46/CoronaWarnAppDaten-API/blob/master/CSVFileIntoDBScript/CoronaWarnAppDaten.csv) (also in the folder) file and inserts all data into a PostgreSQL Database.

The API has 2 endpoints:

getData?date=range responses with all the data from a day in the given range.
patterns for the range:<br>
&emsp;YYYY for example: 2021<br>
&emsp;MM.YYYY for example: 02.2021<br>
&emsp;DD.MM.YYYY-DD.MM.YYYY for example: 01.01.2021-01.02.2022 

getDataAverage?date=range responses with the average infections per day in the given range.
patterns for the range:<br>
&emsp;0 (average infections per day over a year)<br>
&emsp;YYYY for example 2021 (average infections per day in a mmonth over a year)

## Installation:
```
git clone https://github.com/anddyyyy46/CoronaWarnAppDaten-API.git
```
**and to run it:**<br>
&emsp;for the Script:<br>
 ```
cd CSVFileIntoDB
mvn exec:java
```
&emsp;for the API:<br>
```
cd JavaSpringCvdData
mvn spring-boot:run
```
but don't forget the environment variables
# Live-Demo (it's free hosted, so it could take up to 2min for loading): 
getData endpoint:<br>
&emsp;**https://coronawarnappdaten.onrender.com/getData?date=01.01.2021-01.05.2021**<br>
getDataAvrg endpoint:<br>
&emsp;**https://coronawarnappdaten.onrender.com/getDataAverages?date=2021**<br>
With FrontEnd:<br> 
&emsp;**https://corona-warn-app-front-end.vercel.app/**
![image](https://github.com/anddyyyy46/CoronaWarnAppDaten-API/assets/132681533/32b77706-cf45-45ed-a945-77f03080c310)


  

  

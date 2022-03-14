# quotes
 
* this program contains: 

    * Recentquotes class : 
      * author, text properities declared as String;
      
    * In App class: 
      * readFile(): accepts two arguments random number and path of the file, it reads quets from file ecentquotes.json
      * in main() : random number generated and passed to readFile() as parameter
     

* How it work:
    * a random number generated and passed to function reafdFile that read the file of quets and then convert the json object and save them into array
    * it search about the rand number and in indecies of array and returns its contents 
    * a random qoute printed to secreen from API 


* to run the App:

  >./gradlew run
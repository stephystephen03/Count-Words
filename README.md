#Count Words

This project processes following business rules:

- Counts and returns the number of words that starts with 'M' and 'm'.
- Returns all the words longer than 5 characters.

##Prerequisites

- Java 16
- Maven

##Build the Project
```sh
mvn clean install
```

##Application Result

###Example
Given the input file `input_words.txt`

```sh
Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text
Marry had a little lamp.
Mango
Mountains
```

###Output
```sh
Words staring with 'M' or 'm': 
Marry
Mango
Mountains
No.of words staring with 'M' or 'm' : 3
Words longer than 5 characters: [simply, printing, typesetting, industry., industry's, standard, little, Mountains]
```




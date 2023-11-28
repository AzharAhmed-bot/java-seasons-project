## Seasons Project By Azhar

The Seasons project is a simple Java program that allows users to define a range of years and perform various operations on that range. The main functionalities include listing all the years in the specified range, identifying years divisible by specific numbers, and identifying leap years.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Usage
# YearRange Class

The YearRange class is the core component of the project. It has the following attributes:

1. yearone: The starting year of the range.
2. yeartwo: The ending year of the range.
3. range: An indicator for the type of range.

It has the following methods:

1. YearRange class constructor
2. SetRange setter method
3. printYears getter method
4. getFirstDivisor
5. getSecondDivisor
6. getFirstYear
7. getSecondYear

## Running the code

Use the following commands to run:


1. Clone into the repository

```sh
git clone git@github.com:AzharAhmed-bot/java-seasons-project.git
```
2. Navigate to src folder

```sh
cd src
```
3. Run the Java compiler 

```sh
javac YearRange.java
```

4. Run your code

```sh
java YearRange
```



## License 
Copyright (c) [2023] [Azhar Ahmed]
This is a Strathmore University Lab work tested on 28/11/2023 that is part of my course work marks.

No restrictions on forking or cloning the work. If you wish to make contributions you can do so. It's an Open Source Work.


## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

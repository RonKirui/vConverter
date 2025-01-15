 
Text-to-CSV Phone Number Converter

Overview

This is a simple Java project designed to convert text files containing phone numbers into clean, formatted CSV files. The program removes all non-numeric characters from the input to extract valid phone numbers. This makes it easy to further convert the cleaned phone numbers into VCF files that can be directly imported into a phonebook.

Features

Converts text files to CSV format.
Cleans and extracts numeric phone numbers.
Removes all non-numeric characters.
Prepares data for easy conversion to VCF files.
Simple and efficient Java implementation.

Motivation

The project is motivated by the need for a clean and structured approach to handle phone numbers. By converting unorganized text data into a CSV file with only valid phone numbers, users can seamlessly manage contacts and import them into devices.

Getting Started

Prerequisites

Java Development Kit (JDK) installed (Java 8 or above).
A text file with raw phone number data.

Installation

Clone the repository:
git clone https://github.com/RonKirui/vConverter.git
cd vConverter

Compile the Java files:
javac Main.java

Run the program:
java Main

Usage
Place the text file containing raw data in the "Files" folder inside project directory or you can make changes on the code and provide the full path to the file.
Run the program.
Open the generated CSV file (Inside the "Desktop") in any spreadsheet application to view the cleaned phone numbers.

Input Example

text

John Doe: +1 (123) 456-7890
Jane Smith: 987.654.3210
Contact: (555)555-5555; invalid entries: abc12345

Output Example

csv

Phone Numbers
1234567890
9876543210
5555555555

How It Works

Reads the input text file line by line.
Extracts numeric characters from each line to identify valid phone numbers.
Writes the cleaned phone numbers to a CSV file, each on a new line.

Future Enhancements

Add support for validating phone numbers based on country codes.
Integrate functionality to directly export to VCF format.
Create a GUI for easier file selection and processing.

Contributing

Contributions are welcome! Feel free to fork the repository and submit pull requests for new features or bug fixes.
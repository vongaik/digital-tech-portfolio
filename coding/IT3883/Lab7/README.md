# Lab7: Extract Words After "the" from Presidential Speech (Python)

This lab I did reads a text file of a presidential inaugural speech, extracts all words that come immediately after the word "the", and saves them to a new file. It demonstrates my skills in basic file handling, string manipulation, and class-based design in Python.

## What the Program Does

1. Reads the content of `President Washinton Inaugural Speech.txt`.
2. Extracts all words that appear immediately after "the" (case-insensitive).
3. Saves the extracted words into `extracted_word_list.txt`.

## Skills Demonstrated

- Object-Oriented Programming (classes and methods)
- File input/output operations
- String manipulation and splitting
- List handling

## Classes

- **ProcessFile**: Reads a text file and returns its content as a string.
- **StringAnalyzer**: Extracts words that follow "the" in a given string.
- **FileWriter**: Stores extracted words in a list and writes them to a file.

## How It Works

- The `ProcessFile` class reads the speech file into a string.
- The `StringAnalyzer` class loops through the words in the string and collects each word following "the".
- The `FileWriter` class stores these words and writes them to `extracted_word_list.txt`.

## Tech Stack

- Python 3.x

## Notes

- Output file `extracted_word_list.txt` will contain one word per line.

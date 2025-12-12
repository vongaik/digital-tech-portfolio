# Program Name: Lab7.py (proj)
# Course: IT3883/Section W01
# Student Name: Vongai K
# Assignment Number: Lab7
# Due Date: 05/12/ 2023

# class to process file
class ProcessFile:
    # Created a read file method to read president speech file and return it as string
    def read_file(self, file_name):
        with open(file_name, 'r') as f:
            content = f.read()  # content is a string
        # return file content
        return content

# method to analyze string
    # this extract_next_word method is for taking string as input and splitting to words
    def extract_next_word(self, text):
        words = text.split()  # split string into words and storing it in list called words
        next_words = []  # list created
        for i in range(len(words)-1):
            # so words that come after the word "the" are extracted
            if words[i].lower() == "the":  # .lower() used to make comparison case-insensitive
                next_word = words[i+1]  # temporarily stores each word that comes after "the"
                #  stored in next_words list
                next_words.append(next_word)
        # return next_words list
        return next_words

# main method

# text. speechFile used to store name of file for easier reference
speechFile = "President Washinton Inaugural Speech.txt"

# create instances of the classes
readSpeech = ProcessFile()
extractWords = StringAnalyzer()

# read the speech file content
content = readSpeech.read_file(speechFile)
print(content)  # print content to verify

# extract the next words after "the" and put in next_words list
next_words = extractWords.extract_next_word(content)
print(next_words)  # Print the extracted words to verify

# save the word list to a file
output_file = "extracted_word_list.txt"
with open(output_file, 'w') as f:
    for word in next_words:
        f.write(word + '\n')





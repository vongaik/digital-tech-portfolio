# Program Name: Lab6.py
# Course: IT3883/Section W01
# Student Name: Vongai Kwenda
# Assignment Number: Lab6
# Due Date: Nov/29/2023

# first import tkinter

from tkinter import *

# function to check age

def age():
    age = int(age_entry.get())
    if age > 65:
        output.config(text="Senior Citizen") #these print statements will appear in window
    elif age >= 18:
        output.config(text="Old enough to vote")
    else:
        output.config(text="You're not old enough to vote")


# creating the GUI main window
window = Tk() # makes the main window of GUI
window.title("Checking Age") # giving the window a title

# creating age input label and entry widget
age_input = Label(window, text="Enter your age:")
age_input.pack()

age_entry = Entry(window)
age_entry.pack()

# creating a button to check the age
verify = Button(window, text="verify", command=age)
verify.pack()

# creating a label to show the result
output = Label(window, text="")
output.pack()

# tkinter event loop where method continuously waits for user input & events
window.mainloop()



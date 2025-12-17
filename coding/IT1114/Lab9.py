# Program Name:  Lab9.py
# Course:  IT1114L/Section W02
# Student Name: Vongai Kwenda
# Assignment Number: Lab9
# Due Date: 09/04/ 2023
# Purpose: Verify user password

password = input("Password: ")

# go after things that make it invalid. what it should not be

# must be at least 9 characters
if len(password) < 9:
    print("Invalid Password")

# must include upper AND lower case letters
elif password.isupper() or password.islower():
    print("Invalid Password")

# must include at least one number
elif not any(char.isdigit() for char in password):
    print("Invalid Password")

# must include at least one special character
elif not ("#" in password or "!" in password or "$" in password or "_" in password):
    print("Invalid Password")

else:
    print("Valid Password")


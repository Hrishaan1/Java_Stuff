import csv
import time
from betterPrint import betterPrint


def main():
    print("*** Welcome to the Student Grade Manager ***")
    running = True
    while running:
        print()
        print("Menu:")
        print("1. Add student")
        print("2. View all students")
        print("3. Calculate average grade")
        print("4. Find student grade")
        print("5. Edit student grade")
        print("6. Exit program")
        try:
            choice = int(input("Choose one: "))
        except ValueError:
            print("Error: Invalid Input.")
            time.sleep(1)

        match choice:
            case 1:
                stName = input("Enter student name: ")
                stIniGrade = input("Enter student initial grade: ")
                with open("grades.csv", "a", newline="") as csvfile:
                    writer = csv.writer(csvfile)
                    writer.writerow([stName, stIniGrade])
                betterPrint(f"Added {stName} with grade {stIniGrade}.")
                time.sleep(0.5)
            case 2:
                with open("grades.csv", "r", newline="") as csvfile:
                    reader = csv.reader(csvfile)
                    betterPrint("Student Grades:")
                    for row in reader:
                        if row:
                            betterPrint(f"{row[0]}: {row[1]}")
                            time.sleep(0.5)
                time.sleep(1)
            case 3:
                if get_grades():
                    betterPrint(f"Average grade is {average(get_grades())}")
                else:
                    betterPrint("No grades found.")
            case 4:
                gradesDict = get_students_grades()
                stGrade = input("Enter student name here: ")
                betterPrint(f"{stGrade}'s grade is {gradesDict[stGrade]}")
                time.sleep(1)
            case 5:
                stName = input("Enter student name to edit: ")
                newGrade = input("Enter new grade: ")
                students = []
                found = False
                with open("grades.csv", "r", newline="") as csvfile:
                    reader = csv.reader(csvfile)
                    for row in reader:
                        if row and row[0] == stName:
                            students.append([stName, newGrade])
                            found = True
                        elif row:
                            students.append(row)
                
                if found:
                    with open("grades.csv", "w", newline="") as csvfile:
                        writer = csv.writer(csvfile)
                        writer.writerows(students)
                    betterPrint(f"Updated {stName}'s grade to {newGrade}.")
                else:
                    betterPrint(f"Student '{stName}' not found.")
                time.sleep(1)
            case 6:
                running = False
                betterPrint("Ending program. Goodbye!")

def average(grades):
    return sum(grades) / len(grades) if grades else 0

def get_grades():
    grades = []
    with open("grades.csv", "r", newline="") as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            if row:
                grades.append(int(row[1]))
    return grades

def get_students_grades():
    student_grades = {}
    with open("grades.csv", "r", newline="") as csvfile:
        reader = csv.reader(csvfile)
        for row in reader:
            if row:
                student_grades[row[0]] = int(row[1])
    return student_grades

main()
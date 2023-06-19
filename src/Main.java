class Student:
        def __init__(self, name):
        self.name = name
        self.grades = []

        def addGrade(self, grade):
        self.grades.append(grade)

        def getAverageGrade(self):
        if len(self.grades) == 0:
        return 0
        return sum(self.grades) / len(self.grades)

        # Main method
        if __name__ == "__main__":
        # Create two Student objects
        student1 = Student("John")
        student2 = Student("Emily")

        # Add grades for each student
        student1.addGrade(85)
        student1.addGrade(90)
        student1.addGrade(92)

        student2.addGrade(80)
        student2.addGrade(88)
        student2.addGrade(95)

        # Calculate and display the average grade for each student
        average_grade1 = student1.getAverageGrade()
        average_grade2 = student2.getAverageGrade()

        print(f"{student1.name}'s average grade: {average_grade1}")
        print(f"{student2.name}'s average grade: {average_grade2}")

        # Compare the average grades of the two students and display the student with the higher average grade
        if average_grade1 > average_grade2:
        print(f"{student1.name} has a higher average grade.")
        elif average_grade2 > average_grade1:
        print(f"{student2.name} has a higher average grade.")
        else:
        print("Both students have the same average grade.")

package io.zipcoder;

import java.util.*;

public class Classroom {
    private final Student[] students;

    public Classroom(Integer maxNumberOfStudents) {
        students = new Student[maxNumberOfStudents];
    }

    public Classroom(Student[] students) {
        this.students = students;
    }

    public Classroom() {
        students = new Student[10];
    }

    public Student[] getStudents() {
        return students;
    }

    public  Double getAverageExamScore() {

        int count = 0;
        Double sum = 0.0;
        for (Student student : students) {
            if (student != null) {
                count++;
                sum += student.getAverageExamScore();
            }
        }
        return sum / count;
    }

    public void addStudent(Student student) {
        for (int i = 0; i < students.length; i++) {
            if(students[i] == null) {
                students[i] = student;
                break;
            }
        }
    }
    public void removeStudent(String firstName, String lastName) {
        boolean removed = false;

        for (int i = 0; i < students.length; i++) {
            if(removed) {
                students[i - 1] = students[i];
                students[i] = null;
            }
            else if(students[i] != null) {
                if( students[i].getFirstName().equals(firstName) && students[i].getLastName().equals(lastName)) {
                    students[i] = null;
                    removed = true;
                    System.out.println("Hi Students");
                }
            }
        }
    }

    public Student[] getStudentsByScore() {
        Arrays.sort(this.students, Collections.reverseOrder());
        return students;
    }

    public Map<String, ArrayList<Student>> getGradeBook() {

        TreeMap<String, ArrayList<Student>> gradeBook = new TreeMap<>();
        gradeBook.put("A", new ArrayList<>());
        gradeBook.put("B", new ArrayList<>());
        gradeBook.put("C", new ArrayList<>());
        gradeBook.put("D", new ArrayList<>());
        gradeBook.put("E", new ArrayList<>());

        Student[] sortedStudents = this.getStudentsByScore();

        for (int i = 0; i < sortedStudents.length; i++) {
            if(sortedStudents[i] != null) {
                double percentile = (sortedStudents.length - i) / (double)sortedStudents.length;
                System.out.println(percentile);
                if(percentile >= .9) {
                    gradeBook.get("A").add(sortedStudents[i]);
                } else if(percentile > .7) {
                    gradeBook.get("B").add(sortedStudents[i]);
                } else if(percentile >= .5) {
                    gradeBook.get("C").add(sortedStudents[i]);
                } else if (percentile > .1) {
                    gradeBook.get("D").add(sortedStudents[i]);
                } else {
                    gradeBook.get("E").add(sortedStudents[i]);
                }
            }
        }
        return gradeBook;
    }
}


package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

    public class StudentTest {

        @Test
        public void setFirstName() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            student.setFirstName("Joh");

            String expected = "Joh";
            String actual = student.getFirstName();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void setLastName() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            student.setLastName("Doeee");

            String expected = "Doeee";
            String actual = student.getLastName();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void addExamScore() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            student.addExamScore(60.0);

            String expected = "Exam Scores:\n" +
                    "\tExam 1 -> 100.0\n" +
                    "\tExam 2 -> 100.0\n" +
                    "\tExam 3 -> 100.0\n" +
                    "\tExam 4 -> 60.0\n";
            String actual = student.getExamScores();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void setExamScore() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            student.setExamScore(2, 60.0);

            String expected = "Exam Scores:\n" +
                    "\tExam 1 -> 100.0\n" +
                    "\tExam 2 -> 100.0\n" +
                    "\tExam 3 -> 60.0\n";
            String actual = student.getExamScores();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getExamScores() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            String expected = "Exam Scores:\n" +
                    "\tExam 1 -> 100.0\n" +
                    "\tExam 2 -> 100.0\n" +
                    "\tExam 3 -> 100.0\n";
            String actual = student.getExamScores();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getNumberOfExamsTaken() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            Integer expected = 3;
            Integer actual = student.getNumberOfExamsTaken();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void getAverageExamScore() {
            Double[] scores = {100.0, 50.0, 75.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            Double expected = 75.0;
            Double actual = student.getAverageExamScore();

            Assert.assertEquals(expected, actual);
        }

        @Test
        public void testToString() {
            Double[] scores = {100.0, 100.0, 100.0};
            ArrayList<Double> scoresList = new ArrayList<Double>(Arrays.asList(scores));
            Student student = new Student("John", "Doe", scoresList);

            String expected = "Student Name: John Doe\n" +
                    "> Average Score: 100.0\n" +
                    "> Exam Scores:\n" +
                    "\tExam 1 -> 100.0\n" +
                    "\tExam 2 -> 100.0\n" +
                    "\tExam 3 -> 100.0\n";
            String actual = student.toString();

            Assert.assertEquals(expected, actual);
        }
    }

import java.util.Scanner;;
import java.util.ArrayList;

public class Main {
    
    
    public static void main(String[] args) {
        //declares
        Scanner scanner = new Scanner(System.in);
        double assignments = 0, midterms = 0 ,finalExam = 0, finalAveragedGrade = 0;
        //prompting user
        System.out.println("Getting assignment grade average.");
        assignments = AssignmentsGrade(scanner);

        System.out.println("Getting midterm grade average.");
        midterms = MidtermsGrade(scanner);

        System.out.println("Getting final exam grade average.");
        finalExam = FinalExamsGrade(scanner);

        //calculate final grade average
        finalAveragedGrade = calculateFinalGrade(assignments, midterms, finalExam);
        System.out.println("Final grade average is: "+ finalAveragedGrade);

        scanner.close();

    }

    public static double AssignmentsGrade(Scanner scanner) {
        //declare
        ArrayList<Double> grades = new ArrayList<>();
        String addAssignment;
        double grade, average, total = 0;
        //loop to keep adding grades
        while (true) { 
            System.out.println("Add assignment grade? Y for yes, N for no.");
            addAssignment = scanner.nextLine();
            //if Y, add grade
            if (addAssignment.equals("Y")) {
                System.out.print("Enter assignment grade: ");
                grade = scanner.nextDouble();
                scanner.nextLine();
                grades.add(grade);
            }
            //else, calculate and return average
            else {
                for (double g : grades) {
                    total += g;
                }
                average = total / grades.size();
                return average;
            }
        }
    }

    //basically AssignmentGrade() copy pasted
    public static double MidtermsGrade(Scanner scanner) {
        //declare
        ArrayList<Double> grades = new ArrayList<>();
        String addMidterm;
        double grade, average, total = 0;
        while (true) { 
            System.out.println("Add midterm grade? Y for yes, N for no.");
            addMidterm = scanner.nextLine();

            if (addMidterm.equals("Y")) {
                System.out.print("Enter midterm grade: ");
                grade = scanner.nextDouble();
                scanner.nextLine();
                grades.add(grade);
            }
            else {
                for (double g : grades) {
                    total += g;
                }
                average = total / grades.size();
                return average;
            }
        }
    }

      //basically AssignmentGrade() copy pasted
    public static double FinalExamsGrade(Scanner scanner) {
        //declare
        ArrayList<Double> grades = new ArrayList<>();
        String addFinalExam;
        double grade, average, total = 0;
        while (true) { 
            System.out.println("Add Final Exam grade? Y for yes, N for no.");
            addFinalExam = scanner.nextLine();

            if (addFinalExam.equals("Y")) {
                System.out.print("Enter Final Exam grade: ");
                grade = scanner.nextDouble();
                scanner.nextLine();
                grades.add(grade);
            }
            else {
                for (double g : grades) {
                    total += g;
                }
                average = total / grades.size();
                return average;
            }
        }
    }

    

    public static double calculateFinalGrade(double assignments, double midterms, double finalExams) {
        double finalAverage = (assignments * .4) + (midterms * .3) +(finalExams * .3); 
        return finalAverage;
    }

}





//c# application i made from Wk4 referance

// namespace Wk4Ex2

//         static void Main(string[] args)
//         {
//             //declarations

            
//             double assignments = 0;
//             double midterms = 0;
//             double finalExam = 0;

//             //getting assignment grade average
//             Console.WriteLine("Getting Assignmnet Grade average.");
//             assignments = AssignmentsGrade();
//             Console.WriteLine("Assignment grade average is: " + assignments);

//             //getting Midterm grade azverage
//             Console.WriteLine("Getting Midterm Grade average.");
//             midterms = MidtermsGrade();
//             Console.WriteLine("Midterm grade average is: " + midterms);

//             //getting final exam average
//             Console.WriteLine("Getting Final Exam Grade average.");
//             finalExam = FinalExamsGrade();
//             Console.WriteLine("Final Exam grade average is: " + finalExam);

//             //calculating final grade
//             Console.WriteLine("Getting Final Grade average.");
//             Console.WriteLine("Final grade average is: " + CalculateFinalGrade(assignments, midterms, finalExam));


//             Console.ReadLine();

//         }

//         public static double AssignmentsGrade()
//         {
            
//             List<double> assignments = new List<double>(); //using list top store grade values, will use .length to average grades later
//             //declaring values
//             string addAssignment; 
//             double grade;
//             double total = 0;
//             double average;
//             //using loop to repeatedly add values to List
//             while (true)
//             {
//                 //asking user if they want to input more grades
//                 Console.WriteLine("Add assignment grade? Y for yes, N for no.");
//                 addAssignment = Console.ReadLine();

//                 //if user inputs Y, add grades
//                 if (addAssignment == "Y")
//                 {
//                     Console.WriteLine("Enter your grade for the assignment:");
//                     grade = Convert.ToDouble(Console.ReadLine());
//                     assignments.Add(grade);

//                 }
//                 //user inputs N to start average calculation
//                 else
//                 {

//                     for (int i = 0; i < assignments.Count; i++)
//                     {
//                         total += assignments[i]; 
//                     }

//                     average = total / assignments.Count;


//                     Console.WriteLine("Calculating assignments grade.");
//                     return average;
//                 }
//             }
//         }




//         public static double MidtermsGrade()
//         {
//             List<double> midterm = new List<double>(); //using list top store grade values, will use .length to average grades later
//             //declaring values
//             string addMidterm;
//             double grade;
//             double total = 0;
//             double average;
//             //using loop to repeatedly add values to List
//             while (true)
//             {
//                 //asking user if they want to input more grades
//                 Console.WriteLine("Add midterm grade? Y for yes, N for no.");
//                 addMidterm = Console.ReadLine();

//                 //if user inputs Y, add grades
//                 if (addMidterm == "Y")
//                 {
//                     Console.WriteLine("Enter your grade for the midterm:");
//                     grade = Convert.ToDouble(Console.ReadLine());
//                     midterm.Add(grade);

//                 }
//                 //user inputs N to start average calculation
//                 else
//                 {
//                     //going through every value and adding it to total
//                     for (int i = 0; i < midterm.Count; i++)
//                     {
//                         total += midterm[i];
//                     }
//                     //averaging out the grade
//                     average = total / midterm.Count;

//                     //returning average value
//                     Console.WriteLine("Calculating midterm grade.");
//                     return average;
//                 }
//             }
//         }
//         public static double FinalExamsGrade()
//         {
//             List<double> finalExam = new List<double>(); //using list top store grade values, will use .length to average grades later
//             //declaring values
//             string addFinalExam;
//             double grade;
//             double total = 0;
//             double average;
//             //using loop to repeatedly add values to List
//             while (true)
//             {
//                 //asking user if they want to input more grades
//                 Console.WriteLine("Add final exam grade? Y for yes, N for no.");
//                 addFinalExam = Console.ReadLine();

//                 //if user inputs Y, add grades
//                 if (addFinalExam == "Y")
//                 {
//                     Console.WriteLine("Enter your grade for the final exam:");
//                     grade = Convert.ToDouble(Console.ReadLine());
//                     finalExam.Add(grade);

//                 }
//                 //user inputs N to start average calculation
//                 else
//                 {
//                     //going through every value and adding it to total
//                     for (int i = 0; i < finalExam.Count; i++)
//                     {
//                         total += finalExam[i];
//                     }
//                     //averaging out the grade
//                     average = total / finalExam.Count;

//                     //returning average value
//                     Console.WriteLine("Calculating Final Exam grade.");
//                     return average;
//                 }
//             }
//         }
//         public static double CalculateFinalGrade(double assignments, double midterms, double finals)
//         {
//             //Calculating final grade
//             double finalAveragedGrade = (assignments*.4) + (midterms * .3) + (finals*.3);
//             //returniong calculated grade
//             return finalAveragedGrade;
//         }
//     }
// }
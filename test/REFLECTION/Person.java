package REFLECTION;
import java.util.*;
public class Person {
    private boolean isSolved;
    private final List<Problem> problemList = new ArrayList<>() ;
    public void add(Problem problem) {

        this.problemList.add(problem);
    }
    public String reCountProblems(){
        String output = "";
        for(Problem problem : problemList){
            output+= problem.getName() +" -> "+ problem.getType()+ "\n";
        }
        return output;
    }
    public boolean isSolved(Problem problem){
        boolean isSolved = false;
        for(Problem probs : problemList){
            isSolved = problem.equals(probs);
            if(isSolved) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Person person = new Person();

        Problem financialProblem = new Problem("Financial Issue", Type.FINANCIAL);
        Problem educationalProblem = new Problem("Educational Challenge", Type.EDUCATIONAL);
        Problem spiritualProblem = new Problem("Spiritual problem", Type.SPIRITUAL);

        person.add(financialProblem);
        person.add(educationalProblem);
        person.add(spiritualProblem);


        System.out.println("Problems:");
        System.out.println(person.reCountProblems());


        Problem problemToCheck = new Problem("Financial Issue", Type.FINANCIAL);
        if (person.isSolved(problemToCheck)) {
            System.out.println("The problem is solved!");
        } else {
            System.out.println("The problem is not solved.");
        }
    }
}


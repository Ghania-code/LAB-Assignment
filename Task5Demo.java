public class Task5Demo {

    void updateEpochsHelper(AiExperiment exp){
        exp.completedEpochs += 5;
   }

    public static void main(String[] args){
        Task5Demo demo = new Task5Demo();

      
        AiExperiment exp1 = new AiExperiment();
        exp1.experimentName = "Linear Regression";
        exp1.completedEpochs = 10;
        exp1.targetEpochs = 50;

        AiExperiment exp2 = new AiExperiment();
        exp2.experimentName = "Neural Network";
        exp2.completedEpochs = 20;
        exp2.targetEpochs = 100;

     
        System.out.println("INITIAL STATES");
        System.out.println(exp1.status());
        System.out.println(exp2.status());

   
        System.out.println(" METHOD CALLS (Modifying exp1 only)");
        exp1.runEpochs(15);
        exp1.runEpochs(5, 2);

        System.out.println("exp1 status: " + exp1.status() + " | Remaining: " + exp1.remainingEpochs());
        System.out.println("exp2 status: " + exp2.status() + " | Remaining: " + exp2.remainingEpochs());

   
        System.out.println(" HELPER METHOD MUTATION (Passing exp2)");
        System.out.println("Before Helper Call: " + exp2.status());
        demo.updateEpochsHelper(exp2);
        System.out.println("After Helper Call:  " + exp2.status());
    }
}
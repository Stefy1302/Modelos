import expressions.*; 

public class Interpreter {

    public static Expression defineContractRules() {
        Expression subject = new OrExpression(
            new TerminalExpression("Arrendatario"), 
            new TerminalExpression("Inquilino")
        );

        Expression action = new OrExpression(
            new TerminalExpression("pagará"), 
            new TerminalExpression("abonará")
        );

        Expression complements = new AndExpression(
            new TerminalExpression("renta"), 
            new TerminalExpression("mensual")
        );

        Expression noCash = new NotExpression(new TerminalExpression("efectivo"));

        Expression baseRule = new AndExpression(subject, action);
        Expression ruleWithComplements = new AndExpression(baseRule, complements);
        
        return new AndExpression(ruleWithComplements, noCash);
    }

    public static void main(String[] args) {
        Expression validator = defineContractRules();

        String c1 = "El Arrendatario pagará la renta mensual por transferencia";
        String c2 = "El Inquilino abonará la renta mensual en efectivo";
        String c3 = "El dueño vende la casa mañana";

        System.out.println("Clause 1 is valid: " + validator.interpret(c1));
        System.out.println("Clause 2 is valid: " + validator.interpret(c2));
        System.out.println("Clause 3 is valid: " + validator.interpret(c3));
    }
}
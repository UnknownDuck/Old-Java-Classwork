import java.beans.Expression;

package parser;

public class Increment extends Expression{
    
    private final Expression operand;

    public Increment(Expresion operand){
        this.operand = operand;
    }

    @Override
    public double evaluate(){
        double value = this.operand.evealuate();
        return value + 1;
    }
    @Override
    public string toString(){

        return "++ " ;
    }
}

package parser;

public class Addition extends Expression{
    private final Expression left;
    private final Expression right;

    public Addition(Expression left, Expression right){
        this.left = left;
        this.right = right;
    }

    @Override
    public double evaluate(){
        
    }
    
}

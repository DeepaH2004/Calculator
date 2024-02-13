class Calculator
{
    float addition(float operand_1,float operand_2)
    {
        return(operand_1+operand_2);
    }

    float subtraction(float operand_1,float operand_2)
    {
        return(operand_1-operand_2);
    }

    float multiplication(float operand_1,float operand_2)
    {
        return(operand_1*operand_2);
    }

    float division(float operand_1,float operand_2)
    {
        return(operand_1/operand_2);
    }
    float Square(int operand_1)
    {
        return(operand_1*operand_1);
    }
    float cube(int operand_1)
    {
        return(operand_1*operand_1*operand_1);
    }

    public static void main(String[] args){
        float operand_1=10;
        float operand_2=5;
        Calculator calc=new Calculator();
        float add_result=calc.addition(operand_1,operand_2);
        System.out.print("Result of addition is:" +add_result);

        float sub_result=calc.subtraction(operand_1,operand_2);
        System.out.print("Result of subtraction is:" +sub_result);

        float mult_result=calc.multiplication(operand_1,operand_2);
        System.out.print("Result of multiplication is:" +mult_result);

        float div_result=calc.division(operand_1,operand_2);
        System.out.print("Result of division is:" +div_result);
        
        float square_result=calc.Square(operand_1);
        System.out.print("Result of Square is:" +square_result);
        
        float cube_result=calc.cube(operand_1);
        System.out.print("Result of cubeis:" +cube_result);
    }
}

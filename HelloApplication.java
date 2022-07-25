package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Scanner;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 400, 550);
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

    public static class ArithmeticApp {
        public static String Arithmetic(String expression,int base) {
            char[] Base2Legal = {'0', '1', '+', '-', '*', '/', '.',' '};
            char[] Base8Legal = {'0', '1', '2', '3', '4', '5', '6', '7', '+', '-', '*', '/', '.',' '};
            char[] Base10Legal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', '+', '-', '*', '/', '.',' '};
            char[] Base16Legal = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', '+', '-', '*', '/', '.',' '};
            boolean flag_Change = false;
            boolean MulOperator = false;
            boolean FirstCharacter = true;
            boolean DivideBy0 = false;
            boolean InvalidExpBoolean = false;
            int indexSTART = 0;
            int indexEND = 0;
            int i = 0, j = 0;
            double TempResult;
            String Base10Expression = "";

            String TempExp = "";
            String ExpBackup;
            String newExp = "";
            String InvalidExp = "";
            String basee;
            int Number1START, Number1END, Number2START, Number2END;
            Scanner input = new Scanner(System.in);
            boolean pp = true;
            // Scanner input2 = new Scanner(System.in);
        /*   System.out.println("Enter base (2/8/10/16):");
            while (pp) {
                basee = input.nextLine();
                if(basee.length() == 2) {
                    base = retbase(basee.charAt(0), basee.charAt(1));
                }else {
                    base = retbase(basee.charAt(0), '/');
                }
                if ((base == 2 || base == 8 || base == 10 || base == 16)) {
                    pp =false;

                }else{

                    System.out.print("Error – this base isn’t supported. Please enter a base (2/8/10/16):");
                }
            }
            System.out.println("Enter expression:");
            expression = input.nextLine();

         */
            ExpBackup = expression;
            char[] expressionCHAR = expression.toCharArray();
            i = 0;
            j = 0;
            while(i < expressionCHAR.length)
            {
                if(expressionCHAR[i] == '*' || expressionCHAR[i] == '/' || expressionCHAR[i] == '+' || expressionCHAR[i] == '-')
                {
                    if(MulOperator == true)
                    {
                        InvalidExpBoolean = true;
                    }
                    MulOperator = true;
                }
                else
                {
                    if((expressionCHAR[i] >= 48 && expressionCHAR[i] <= 57) || (expressionCHAR[i] >= 65 && expressionCHAR[i] <= 70))
                        MulOperator = false;
                }
                i++;
            }
            if(MulOperator == true)
                InvalidExpBoolean = true;
            i = 0;
            j = 0;
            if (base == 8)
            {
                while (i < expressionCHAR.length && InvalidExpBoolean == false)
                {
                    if (j == Base8Legal.length)
                    {
                        while (i > -1 && expressionCHAR[i] != 32)
                        {
                            i--;
                        }
                        i++;
                        while (i < expressionCHAR.length && expressionCHAR[i] != 32) {
                            InvalidExp = InvalidExp + expressionCHAR[i];
                            i++;
                        }
                        InvalidExpBoolean = true;
                    }
                    if(InvalidExpBoolean == false)
                    {
                        if (expressionCHAR[i] == Base8Legal[j]) {
                            i++;
                            j = 0;
                        } else {
                            j++;
                        }
                    }

                }
            }
            i = 0;
            j = 0;
            if (base == 2)
            {
                while (i < expressionCHAR.length && InvalidExpBoolean == false)
                {
                    if (j == Base2Legal.length)
                    {
                        while (i > -1 && expressionCHAR[i] != 32)
                        {
                            i--;
                        }
                        i++;
                        while (i < expressionCHAR.length && expressionCHAR[i] != 32) {
                            InvalidExp = InvalidExp + expressionCHAR[i];
                            i++;
                        }
                        InvalidExpBoolean = true;
                    }
                    if(InvalidExpBoolean == false)
                    {
                        if (expressionCHAR[i] == Base2Legal[j]) {
                            i++;
                            j = 0;
                        } else {
                            j++;
                        }
                    }

                }
            }
            i = 0;
            j = 0;
            if (base == 10)
            {
                while (i < expressionCHAR.length && InvalidExpBoolean == false)
                {
                    if (j == Base10Legal.length)
                    {
                        while (i > -1 && expressionCHAR[i] != 32)
                        {
                            i--;
                        }
                        i++;
                        while (i < expressionCHAR.length && expressionCHAR[i] != 32) {
                            InvalidExp = InvalidExp + expressionCHAR[i];
                            i++;
                        }
                        InvalidExpBoolean = true;
                    }
                    if(InvalidExpBoolean == false)
                    {
                        if (expressionCHAR[i] == Base10Legal[j]) {
                            i++;
                            j = 0;
                        } else {
                            j++;
                        }
                    }

                }
            }
            i = 0;
            j = 0;
            if (base == 16)
            {
                while (i < expressionCHAR.length && InvalidExpBoolean == false)
                {
                    if (j == Base16Legal.length)
                    {
                        while (i > -1 && expressionCHAR[i] != 32)
                        {
                            i--;
                        }
                        i++;
                        while (i < expressionCHAR.length && expressionCHAR[i] != 32) {
                            InvalidExp = InvalidExp + expressionCHAR[i];
                            i++;
                        }
                        InvalidExpBoolean = true;
                    }
                    if(InvalidExpBoolean == false)
                    {
                        if (expressionCHAR[i] == Base16Legal[j]) {
                            i++;
                            j = 0;
                        } else {
                            j++;
                        }
                    }

                }
            }
            if (InvalidExpBoolean == false)
            {
                //System.out.println(ToBase10(expressionCHAR,base,0,2)); TEST ToBase10
                i = 0;
                while (i != expressionCHAR.length)
                {
                    if (expressionCHAR[i] == '*' || expressionCHAR[i] == '/' || expressionCHAR[i] == '+' || expressionCHAR[i] == '-')
                    {
                        if(expressionCHAR[i] == '-' && (i == 0 || FirstCharacter == true))
                        {
                            if(expressionCHAR[i+1] == 32)
                            {
                                newExp = "0 -";
                                j = i+1;
                                while(j < expressionCHAR.length)
                                {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                i = 0;
                                FirstCharacter = false;
                            }
                            else
                            {
                                newExp = "0 - ";
                                j = i+1;
                                while(j < expressionCHAR.length)
                                {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                expressionCHAR = newExp.toCharArray();
                                i = 0;
                                FirstCharacter = false;
                            }
                        }
                        else {

                            if (expressionCHAR[i - 1] != 32) {
                                FirstCharacter = false;
                                newExp = "";
                                j = 0;
                                while (j < i) {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                newExp = newExp + " ";
                                while (j < expressionCHAR.length) {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                expressionCHAR = newExp.toCharArray();
                                i = 0;
                            }
                            if (expressionCHAR[i + 1] != 32) {
                                FirstCharacter = false;
                                newExp = "";
                                j = 0;
                                while (j <= i) {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                newExp = newExp + " ";
                                while (j < expressionCHAR.length) {
                                    newExp = newExp + expressionCHAR[j];
                                    j++;
                                }
                                expressionCHAR = newExp.toCharArray();
                                i = 0;
                            }
                        }
                    }
                    i++;

                }
                i = 0;
                while (i != expressionCHAR.length)
                {
                    if (expressionCHAR[i] != 32)
                    {
                        if (expressionCHAR[i] == '+' || expressionCHAR[i] == '-' || expressionCHAR[i] == '*' || expressionCHAR[i] == '/')
                        {
                            Base10Expression = Base10Expression + " " + expressionCHAR[i] + " ";
                        }
                        else
                        {
                            indexSTART = i;
                            while (expressionCHAR[i] != 32 && i != expressionCHAR.length - 1) {
                                i++;
                            }
                            if (expressionCHAR[i] == 32)
                                indexEND = i - 1;
                            else if (i == expressionCHAR.length - 1)
                                indexEND = i;
                            Base10Expression = Base10Expression + ToBase10(expressionCHAR, base, indexSTART, indexEND);
                        }
                    }
                    i++;
                }
                //System.out.println( "New Expression Is: " + Base10Expression);
                expressionCHAR = Base10Expression.toCharArray();
                // System.out.println("TESTING: " + Base10Expression);
                i = 0;
                while (i != expressionCHAR.length && DivideBy0 == false)
                {
                    if (expressionCHAR[i] == '*' || expressionCHAR[i] == '/')
                    {
                        flag_Change = true;
                        Number1END = i - 2;
                        Number1START = Number1END;
                        Number2START = i + 2;
                        Number2END = Number2START;


                        while (Number1START > -1 && expressionCHAR[Number1START] != 32)
                            Number1START--;
                        Number1START++;

                        while (Number2END < expressionCHAR.length && expressionCHAR[Number2END] != 32)
                            Number2END++;
                        Number2END--;
                        TempResult = 0;
                        if (expressionCHAR[i] == '*')
                            TempResult = CharToInt(expressionCHAR, Number1START, Number1END) * CharToInt(expressionCHAR, Number2START, Number2END);
                        else {
                            if (CharToInt(expressionCHAR, Number2START, Number2END) != 0) {
                                TempResult = CharToInt(expressionCHAR, Number1START, Number1END) / CharToInt(expressionCHAR, Number2START, Number2END);
                            } else {
                                DivideBy0 = true;
                                break;
                            }
                        }
                        TempResult = (int) TempResult;
                        TempExp = "";
                        j = 0;
                        while (j < Number1START) {
                            TempExp = TempExp + expressionCHAR[j];
                            j++;
                        }
                        TempExp = TempExp + TempResult;
                        j = Number2END + 1;
                        while (j < expressionCHAR.length) {
                            TempExp = TempExp + expressionCHAR[j];
                            j++;
                        }
                        expressionCHAR = TempExp.toCharArray();
                        //System.out.println("TempExp: " + TempExp);
                        i = -1;
                    }
                    i++;
                }
                if (flag_Change == true) {
                    expressionCHAR = TempExp.toCharArray();
                }
                i = 0;
                int k = 0;
                while (i < expressionCHAR.length && DivideBy0 == false) {
                    if (expressionCHAR[i] == '+' || ((expressionCHAR[i] == '-') && (expressionCHAR[i + 1] < 48 || expressionCHAR[i] > 57))) {
                        Number1END = i - 2;
                        Number1START = Number1END;
                        Number2START = i + 2;
                        Number2END = Number2START;


                        while (Number1START > -1 && expressionCHAR[Number1START] != 32)
                            Number1START--;
                        Number1START++;

                        while (Number2END < expressionCHAR.length && expressionCHAR[Number2END] != 32)
                            Number2END++;
                        Number2END--;

                        if (expressionCHAR[i] == '+') {

                            TempResult = CharToInt(expressionCHAR, Number1START, Number1END) + CharToInt(expressionCHAR, Number2START, Number2END);
                        } else {
                            TempResult = CharToInt(expressionCHAR, Number1START, Number1END) - CharToInt(expressionCHAR, Number2START, Number2END);
                        }
                        TempExp = "";
                        j = 0;
                        while (j < Number1START) {
                            TempExp = TempExp + expressionCHAR[j];
                            j++;
                        }
                        TempExp = TempExp + TempResult;
                        j = Number2END + 1;
                        while (j < expressionCHAR.length) {
                            TempExp = TempExp + expressionCHAR[j];
                            j++;
                        }
                        expressionCHAR = TempExp.toCharArray();
                        //System.out.println("TempExp: " + TempExp);
                        i = -1;
                    }
                    //  System.out.println("So Far: " + TempExp);
                    i++;
                }
                if (DivideBy0 == false)
                {
                    expressionCHAR = TempExp.toCharArray();
                    TempExp = DecimalToBaseAny(expressionCHAR, base);
                   return TempExp;
                } else
                {
                    return "-1";
                }
            }
            else
            {
                return "-1";

            }
        }

        public static String DecimalToBaseAny(char[] exp,int base)
        {
            int number;
            boolean negative = false;
            if(exp[0] == '-') {
                negative = true;
                number = (int) CharToInt(exp, 1, (exp.length) - 1);
            }
            else
            {
                number = (int) CharToInt(exp, 0, (exp.length) - 1);
            }
            number = (int)number;
            String Letter;
            String result = "";
            while(number > 0)
            {
                if(base == 16 && number % 16 > 9)
                {
                    if(number % 16 == 10)
                        Letter = "A";
                    else if(number % 16 == 11)
                        Letter = "B";
                    else if(number % 16 == 12)
                        Letter = "C";
                    else if(number % 16 == 13)
                        Letter = "D";
                    else if(number % 16 == 14)
                        Letter = "E";
                    else
                        Letter = "F";
                    result = Letter + result;
                }
                else
                {
                    result =  + (number % base) + result;
                }
                number = number / base;
            }
            if(negative == true)
            {
                result = "-" + result;
                return result;
            }
            else
                return result;

        }
        public static double CharToInt(char[] exp,int indexSTART,int indexEND)
        {
            boolean negative = false;
            if(indexSTART == indexEND)
                return exp[indexSTART];
            if(exp[indexSTART] == '-') {
                indexSTART++;
                negative = true;
            }
            int i = indexSTART;
            int DotIndex = indexSTART;
            int j;
            double result = 0;
            while(exp[DotIndex] != '.')
                DotIndex++;
            j = DotIndex - indexSTART - 1;
            while(i < indexEND + 1)
            {
                if(exp[i] == '.')
                {
                    j = - 1;
                    i++;
                }
                result = result + (exp[i]-48)*Math.pow(10,j);
                i++;
                j--;
            }
            if(negative)
                result = result * -1;
            return result;
        }
        public static double ToBase10(char[] exp,int base,int indexStart,int indexEnd)
        {
            double result = 0;
            int number;
            while(indexStart != indexEnd + 1)
            {
                number = exp[indexStart];
                if(number > 57)
                {
                    switch(number)
                    {
                        case 65:
                            number = 10;
                            break;
                        case 66:
                            number = 11;
                            break;
                        case 67:
                            number = 12;
                            break;
                        case 68:
                            number = 13;
                            break;
                        case 69:
                            number = 14;
                            break;
                        case 70:
                            number = 15;
                            break;
                    }
                }
                else
                {
                    number = number - 48;
                }
                if(indexEnd - indexStart == 0) {
                    result = result + number;
                }
                else {
                    result = result + (Math.pow(base, indexEnd - indexStart ) * number);
                }
                indexStart++;

            }
            return result;
        }

        public static int retbase(char x , char y) {
            if(x == '2'){
                return 2;
            }
            if(x == '8'){
                return 8;
            }
            if(x == '1'){
                if(y =='6') {
                    return 16;
                }
                if(y=='0') {
                    return 10;
                }
            }
            return -1;
        }
    }
}
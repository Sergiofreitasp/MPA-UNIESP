/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzariafactory;

import java.text.DateFormatSymbols;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;
import visao.Calzone;
import visao.Pizza;
import visao.PizzaSQS;
import visao.PizzaiolosqsFactory;
import visao.PizzaiolotqsFactory;
import visao.PizzariaFactory;

/**
 *
 * @author Usuario
 */
public class Consumidor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia, mes, ano;
        System.out.println("Bem-vindo! Informe a data de hoje");
        System.out.println("Hoje é dia:");
        Scanner myObj = new Scanner(System.in);
        dia = myObj.nextInt();
        System.out.println("Do mes:");
        mes = myObj.nextInt();
        System.out.println("Do ano:");
        ano = myObj.nextInt();
        
        
        Calendar cal = new GregorianCalendar(ano, mes-1, dia);
        
        String wd = weekDay(cal);
        if (wd.equals("Segunda-feira")||wd.equals("Quarta-feira")||wd.equals("Sexta-feira")){
            PizzariaFactory psqs = new PizzaiolosqsFactory();
            Pizza pizza = psqs.makePizza();
            Calzone calz = psqs.makeCalzone();
            System.out.println("A pizza do dia é  de Calabresa(" + pizza.getIngredientes()+ ")");
            System.out.println("O calzone do dia é  de Calabresa(" + calz.getIngredientes()+ ")");
        }else if(wd.equals("Domingo")){
            System.out.println("Desculpe! Hoje estamos FECHADOS :(");
        }else{
            PizzariaFactory ptqs = new PizzaiolotqsFactory();
            Pizza pizza = ptqs.makePizza();
            Calzone calz = ptqs.makeCalzone();
            System.out.println("A pizza do dia é  de Presunto(" + pizza.getIngredientes()+ ")");
            System.out.println("O calzone do dia é  de Presunto(" + calz.getIngredientes()+ ")");
        }
        
       
    }
    
    
    public static String weekDay(Calendar cal) { return new DateFormatSymbols().getWeekdays()[cal.get(Calendar.DAY_OF_WEEK)]; }
    
}

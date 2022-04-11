package ru.skypro;

public class Main {

    public static void main(String[] args) {

        //Задание 6
//        int age = 19;
//        int salary = 58_000;
//        if (age >= 23) {
//            if (salary >= 50_000){
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.2 + " рублей");
//            } else  if (salary >= 80_000){
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 3 * 1.5 + " рублей");
//            }
//        } else {
//            if (salary >= 50_000){
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.2 + " рублей");
//            } else if (salary >= 80_000){
//                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + salary * 2 * 1.5 + " рублей");
//            }
//        }


        //Задание 7
        int age = 25;
        double salary = 60_000;
        double wantedSum = 330_000;
        double maxPayment = salary / 2;
        double interestRate = 10.0;
        double loanPayment = 0.0;
        double monthlyInterestRate = 0.0;

        if (age < 23 && salary > 80_000){
            interestRate += 1 - 0.7;
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        } else if (age < 23 && salary < 80_000){
            interestRate += 1;
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        } else if (age >=23 && age < 30 && salary > 80_000) {
            interestRate += 0.5 - 0.7;
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        } else if (age >=23 && age < 30 && salary < 80_000) {
            interestRate += 0.5;
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        } else if (age >= 30 && salary > 80_000) {
            interestRate -= 0.7;
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        } else {
            monthlyInterestRate = interestRate / (100 * 12);
            loanPayment = wantedSum /12  + wantedSum * monthlyInterestRate;
            System.out.print("Максимальный платеж при ЗП " + salary + " равен "+ maxPayment + " рублей. Платеж по кредиту " + loanPayment + " рублей. ");
        }

        if (loanPayment <= maxPayment) {
            System.out.println("Одобрено");
        } else {
            System.out.println("Отказано");
        }




    }
}

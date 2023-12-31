//L - Liskov substitution Principle - принцип подстановки Барбары Лисков.
// Должна быть возможность вместо базового (родительского) типа (класса) подставить любой его подтип (класс-наследник),
// при этом работа программы не должна измениться.

/*Данный принцип непосредственно связан с наследованием классов.
Допустим у нас есть базовый класс Счет (Account), в котором есть три метода: просмотр остатка на счете, пополнение счета и оплата.

Нам необходимо написать еще два класса: зарплатный счет и депозитный счет, при этом зарплатный счет должен поддерживать все операции,
представленные в базовом классе, а депозитный счет - не должен поддерживать проведение оплаты.

Сейчас замена класса PaymentAccount на его класс-наследник SalaryAccount не "поломает" нашу программу,
так как класс SalaryAccount имеет доступ ко всем методам, что и PaymentAccount.
Также все будет хорошо при замене класса Account на его класс-наследник PaymentAccount.

Принцип подстановки Барбары Лисков заключается в правильном использовании отношения наследования.
Мы должны создавать наследников какого-либо базового класса тогда и только тогда,
когда они собираются правильно реализовать его логику, не вызывая проблем при замене родителей на наследников.

 */



package HomeWork3.LiskovsubstitutionPrinciple;

public class Main {
}


package br.com.descomplicandoJava.day14.javatime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {

    public static void main(String[] args) {

        LocalDate dataDeHoje = LocalDate.now();
        System.out.println("Data de hoje: " + dataDeHoje);

        LocalDate DataDeOntem = dataDeHoje.minusDays(1);
        System.out.println("Data de ontem: " + DataDeOntem);


        LocalDate hojeMenosDois = dataDeHoje.minusDays(2);
        System.out.println("Data de hoje menos dois: " + hojeMenosDois);

        LocalDate dataTransformada = LocalDate.of(2023, 3, 2);
        System.out.println("Data de hoje menos dois: " + dataTransformada);

        LocalDateTime horaTransformada = dataTransformada.atTime(22, 0, 1);
        System.out.println(horaTransformada);


        LocalTime queHorasSao = LocalTime.now();
        System.out.println(queHorasSao);


        LocalTime horaTransformada2 = LocalTime.of(23, 0, 59);
        System.out.println(horaTransformada2);


        LocalTime adicionaHoras = horaTransformada2.plusHours(8);
        System.out.println(adicionaHoras);

        LocalTime adicionaMinutos = adicionaHoras.plusMinutes(59);
        System.out.println(adicionaMinutos);


        YearMonth anoMes = YearMonth.now();
        System.out.println(anoMes);


        String anoMesFormatado = anoMes.format(DateTimeFormatter.ofPattern("yyyy MM"));
        System.out.println(anoMesFormatado);


    }
}

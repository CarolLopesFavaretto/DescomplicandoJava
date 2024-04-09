
package br.com.descomplicandoJava.day14.textBlocks;

/*veio no Java 15
 * forma de declaramos Strings com varias linhas com mais eficiencia e clean*/

public class textBlocksExample {

    public static void main(String[] args) {


        String sqlAntesDoJava15 =
                "  SELECT id, nome, sobrenome\n"
                        + "    FROM estudante\n"
                        + "   WHERE linguagem = \"Java\"\n"
                        + "ORDER BY nome";


        String sqlDepoisDoJava15 = """
                  SELECT id, nome, sobrenome
                   FROM estudante
                   WHERE linguagem = "Java"
                   ORDER BY nome
                """;


        System.out.println(sqlDepoisDoJava15);
    }
}



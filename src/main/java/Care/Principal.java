package Care;

public class Principal {
    public static void main(String[] args) {
        // Criar pacientes
        Paciente paciente1 = new Paciente(85, 1.67);
        paciente1.setNome("Andreza");

        Paciente paciente2 = new Paciente(50, 1.70);
        paciente2.setNome("Shuri");

        Paciente paciente3 = new Paciente(90, 1.80);
        paciente3.setNome("Rodrigo");

        // Exibir diagnósticos
        System.out.println(paciente1);
        System.out.println(paciente2);
        System.out.println(paciente3);
    }
}

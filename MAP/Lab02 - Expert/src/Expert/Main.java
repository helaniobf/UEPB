package Expert;

public class Main {

    public static void main(String[] args) {

        ControleAcademico controle = new ControleAcademico();
        Disciplina map = new Disciplina("MAP", "QUI-16:00/18:00");
        Disciplina llp = new Disciplina("LLP", "TER-7:00/9:00");

        controle.registrarDisciplina(map);
        controle.registrarDisciplina(llp);

        RDM rdm = new RDM(controle.getDisciplinas());

        Aluno douglas = new Aluno("Douglas");
        Aluno klebio = new Aluno("Klebio");

        //Matriculando alunos
        controle.matricularAluno(douglas, llp);
        controle.matricularAluno(douglas, map);
        //controle.matricularAluno(klebio, map);

        //Registrando os professores
        Professor alberto = new Professor("Alberto");
        Professor bianca = new Professor("Bianca");

        //Resgistrando professoras nas disciplinas
        controle.registrarProfessor(alberto, map);
        //controle.registrarProfessor(bianca, llp);

        //Mostrar alunos matriculados em certa disciplina
        rdm.mostrarAlunosTodasDisciplinas(controle.getDisciplinas());
        rdm.mostrarAlunos(llp);

        //Mostrar as disciplinas ministradas por certo professor
        rdm.mostrarDisciplinasProfessor(alberto);
        rdm.mostrarDisciplinasProfessor(bianca);

        //Mostrar as disciplinas de certo aluno
        rdm.mostrarDisciplinasAluno(douglas);
        rdm.mostrarDisciplinasAluno(klebio);

        //Contar numero de aluno
        rdm.contarAlunos(map);
    }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author daniel
 */
public class MenuPrincipal {
    
    ArrayList<Curso> cursosCadastrados = new ArrayList<>();
    ArrayList<Estudante> estudantesCadastrados = new ArrayList<>();
    ArrayList<Professor> professoresCadastrados = new ArrayList<>();
    ArrayList<Disciplina> disciplinasCadastradas = new ArrayList<>();
    ArrayList<Colegiado> colegiadosCadastrados = new ArrayList<>();
    ArrayList<AlunosCurso> alunosCursos = new ArrayList<>();
    ArrayList<Aula> aulasCadastradas = new ArrayList<>();
    
    public void imprimirMenu() {
        System.out.println("1 - Cadastrar Curso");
        System.out.println("2 - Cadastrar Estudante");
        System.out.println("3 - Cadastrar Professor");
        System.out.println("4 - Cadastrar Disciplina");
        System.out.println("5 - Cadastrar Disciplina no Curso");
        System.out.println("6 - Cadastrar Curso no Colegiado");
        System.out.println("7 - Cadastrar Professor no Colegiado");
        System.out.println("8 - Cadastrar uma nova Turma com determinado Curso");
        System.out.println("9 - Cadastrar Aluno no Curso da Turma");
        System.out.println("10 - Cadastrar uma Aula");
        System.out.println("11 - Cadastar Aluno em uma Aula");
        System.out.println("12 - Cadastrar Disciplina em uma Aula");
<<<<<<< HEAD
        System.out.println("13 - Listagem dos alunos do curso");
        System.out.println("14 - Listagem das disciplinas do curso");
        System.out.println("15 - Listagem do colegiado do curso");
        System.out.println("16 - Listagem da aula do curso:");
    }
    
    public void listaAulaCurso() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cursos cadastrados!");
        for (int i = 0; i < cursosCadastrados.size(); i++) {
            System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
        }
        System.out.print("Digite um numero relacionado ao curso: ");
        Integer cursoSelecionado = Integer.parseInt(sc.nextLine());
    	
        for(int j = 0; j < aulasCadastradas.size(); j++) {
        	System.out.println(aulasCadastradas.get(cursoSelecionado).toString());	
        }
    }
    
    
    public void listaColegiadoDoCurso() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cursos cadastrados!");
        for (int i = 0; i < cursosCadastrados.size(); i++) {
            System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
        }
        System.out.print("Digite um numero relacionado ao curso: ");
        Integer cursoSelecionado = Integer.parseInt(sc.nextLine());
        
        for(int j = 0; j < colegiadosCadastrados.size(); j++) {
        	System.out.println(colegiadosCadastrados.get(cursoSelecionado).getProf());	
        }
    }
    
    public void listaDiciplinaCurso() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cursos cadastrados!");
        for (int i = 0; i < cursosCadastrados.size(); i++) {
            System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
        }
        System.out.print("Digite um numero relacionado ao curso: ");
        Integer cursoSelecionado = Integer.parseInt(sc.nextLine());
        
        for(int j = 0; j < cursosCadastrados.size(); j++) {
        	System.out.println(cursosCadastrados.get(cursoSelecionado).getDisciplina());	
        }
    }
    
    
    public void listaAlunoCurso(){
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Cursos cadastrados!");
        for (int i = 0; i < cursosCadastrados.size(); i++) {
            System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
        }
        System.out.print("Digite um numero relacionado ao curso: ");
        Integer cursoSelecionado = Integer.parseInt(sc.nextLine());
        
        for (int j = 0; j < alunosCursos.size(); j++) {
        	System.out.println();
            System.out.println(alunosCursos.get(cursoSelecionado).getAlunosCurso());
        }  	
    
 }
    
=======
    }
    
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
    public void cadastrarCurso(String nome) {
        Curso curso = new Curso();
        curso.setNomeCurso(nome);
        cursosCadastrados.add(curso);
        System.out.println("Curso cadastrado com sucesso!");
    }
    
    public void cadastrarEstudante(String nome, String cpf, 
                                   Date dtNascimento, String ra,
                                   int periodo, Curso curso)
    {
        Estudante estudante = new Estudante();
        estudante.setNome(nome);
        estudante.setCpf(cpf);
        estudante.setDtNascimento(dtNascimento);
        estudante.setRa(ra);
        estudante.setPeriodo(periodo);
        estudante.setCurso(curso);
        estudantesCadastrados.add(estudante);
        System.out.println("Estudante cadastrado com sucesso!");
        
    }
    
    public void cadastrarProfessor(String nome, String cpf, Date dtNascimento,
                                   String nRegistro, String titulacao,
                                   Double horasSemanais, Double precoHora) 
    {
        Professor professor = new Professor();
        professor.setNome(nome);
        professor.setCpf(cpf);
        professor.setDtNascimento(dtNascimento);
        professor.setnRegistro(nRegistro);
        professor.setTitulacao(titulacao);
        professor.setHorasSemanais(horasSemanais);
        professor.setPrecoHora(precoHora);
        professoresCadastrados.add(professor);
        System.out.println("Professor cadastrado com sucesso!");
    }
    
    public void cadastrarDisciplina(String nome, Integer cargaHoraria) {
        Disciplina disciplina = new Disciplina();
        disciplina.setNome(nome);
        disciplina.setCargaHoraria(cargaHoraria);
        disciplinasCadastradas.add(disciplina);
        System.out.println("Disciplina cadastrada com sucesso!");
    }
    
    public void cadastrarDisciplinaCurso() {
        Scanner scanner = new Scanner(System.in);
        if (cursosCadastrados.isEmpty()) {
            System.out.println("Por favor cadastre um curso e tente novamente!");
        } else {
            if (disciplinasCadastradas.isEmpty()) {
                System.out.println("Por favor cadastre uma disciplina e tente novamente!");
            } else {
                System.out.println("Cursos cadastrados!");
                for (int i = 0; i < cursosCadastrados.size(); i++) {
                    System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
                }
                System.out.print("Digite um numero relacionado ao curso: ");
                Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
                System.out.println("Disciplinas cadastradas");
                for (int i = 0; i < disciplinasCadastradas.size(); i++) {
                    System.out.println(i + " - " + disciplinasCadastradas.get(i).getNome());
                }
                System.out.print("Digite um numero relacionado as disciplinas: ");
                Integer disciplinaSelecionada = Integer.parseInt(scanner.nextLine());
                cursosCadastrados.get(cursoSelecionado)
                        .inseriDisciplina(disciplinasCadastradas.get(disciplinaSelecionada));
                System.out.println("Disciplina adicionada com sucesso no curso!");
            }
        }
    }
    
    public void cadastrarCursoColegiado() {
        Colegiado colegiado = new Colegiado();
        Scanner scanner = new Scanner(System.in);
        if (cursosCadastrados.isEmpty()) {
            System.out.println("Por favor cadastre um curso e tente novamente!");
        } else {
            System.out.println("Cursos cadastrados!");
            for (int i = 0; i < cursosCadastrados.size(); i++) {
                System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
            }
            System.out.print("Digite um numero corresponde ao curso: ");
            Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
            colegiado.setCurso(cursosCadastrados.get(cursoSelecionado));
            colegiadosCadastrados.add(colegiado);
            System.out.print("Colegiado cadastrado com sucesso!");
        }
    }
    
    public void cadastrarProfessorColegiado() {
        Scanner scanner = new Scanner(System.in);
        if (professoresCadastrados.isEmpty()) {
            System.out.println("Por favor cadastre um professor e tente novamente!");
        } else {
            if (colegiadosCadastrados.isEmpty()) {
                System.out.println("Por favor cadastre um colegiado e tente novamente");
            } else {
                System.out.println("Colegiados cadastrados");
                for (int i = 0; i < colegiadosCadastrados.size(); i++) {
                    System.out.println(i + " - " + colegiadosCadastrados.get(i).getCurso().getNomeCurso());
                }
                System.out.print("Digite um numero correspondente ao colegiado: ");
                Integer colegiadoSelecionado = Integer.parseInt(scanner.nextLine());
                System.out.println("Professores cadastrados");
                for (int i = 0; i < professoresCadastrados.size(); i++) {
                    System.out.println(i + " - " + professoresCadastrados.get(i).getNome());
                }
                System.out.print("Digite um numero correspondente ao colegiado: ");
                Integer professorSelecionado = Integer.parseInt(scanner.nextLine());
                colegiadosCadastrados.get(colegiadoSelecionado)
                        .inseriProfessor(professoresCadastrados.get(professorSelecionado));
                System.out.println("Professor inserido no colegiado com sucesso!");
            }
        }
    }
    
    public void cadastrarTurma() {
        Scanner scanner = new Scanner(System.in);
        AlunosCurso alunosCurso = new AlunosCurso();
        if (cursosCadastrados.isEmpty()) {
            System.out.println("Nenhum curso cadastrado, por favor cadastre um curso e tente novamente!");
        } else {
            System.out.println("Cursos cadastrados");
            for (int i = 0; i < cursosCadastrados.size(); i++) {
                System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
            }
            System.out.print("Digite um numero corresponde ao curso: ");
            Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
            alunosCurso.setCurso(cursosCadastrados.get(cursoSelecionado));
            alunosCursos.add(alunosCurso);
            System.out.println("Turma criada com sucesso!");
        }
    }
    
    public void cadastarAlunosCursoTurma() {
        Scanner scanner = new Scanner(System.in);
        if (alunosCursos.isEmpty()) {
            System.out.println("Por favor cadastre uma turma e tente novamente!");
        } else {
            if (estudantesCadastrados.isEmpty()) {
                System.out.println("Por favor cadastre um estudante e tente novamente!");
            } else {
                System.out.println("Turmas cadastradas com cursos!");
                for (int i = 0; i < alunosCursos.size(); i++) {
                    System.out.println(i + " - " + alunosCursos.get(i).getCurso().getNomeCurso());
                }
<<<<<<< HEAD
                System.out.print("Digite um número correspondete ao curso: ");
=======
                System.out.print("Digite um nÃºmero correspondete ao curso: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
                System.out.println("Estudantes cadastrados!");
                for (int i = 0; i < estudantesCadastrados.size(); i++) {
                    System.out.println(i + " - " + estudantesCadastrados.get(i).getNome());
                }
                System.out.print("Digite um numero correspondente ao estudante: ");
                Integer estudanteSelecionado = Integer.parseInt(scanner.nextLine());
                alunosCursos.get(cursoSelecionado)
                        .insereAluno(estudantesCadastrados.get(estudanteSelecionado));
                System.out.println(alunosCursos.get(cursoSelecionado).getAlunosCurso());
                System.out.println("Aluno inserido na turma com sucesso!");
            }
        }
    }
    
    public void cadastrarAula(String lab, Date dataHora) {
        Aula aula = new Aula();
        aula.setLab(lab);
        aula.setDataHora(dataHora);
        aulasCadastradas.add(aula);
        System.out.println("Aula cadastrada com sucesso!");
    }
    
    public void cadastrarAlunoAula() {
        Scanner scanner = new Scanner(System.in);
        if (aulasCadastradas.isEmpty()) {
            System.out.println("Cadastre uma aula e tente novamente!");
        } else {
            if (alunosCursos.isEmpty()) {
                System.out.println("Cadastre uma turma e tente novamente!");
            } else {
                System.out.println("Cursos cadastrados");
                for (int i = 0; i < alunosCursos.size(); i++) {
                    System.out.println(i + " - " + alunosCursos.get(i).getCurso().getNomeCurso());
                }
                System.out.print("Digite um numero correspondente ao curso para listar os alunos desse curso: ");
                Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
                for (Map.Entry<String, Estudante> dados : alunosCursos.get(cursoSelecionado).getAlunosCurso().entrySet()) {
                    System.out.println(dados);
                }
                System.out.println("Aulas cadastradas");
                for (int i = 0; i < aulasCadastradas.size(); i++) {
                    System.out.println(i + " - " + aulasCadastradas.get(i).getLab());
                }
<<<<<<< HEAD
                System.out.print("Digite o número correspondente ao laboratório: ");
=======
                System.out.print("Digite o nÃºmero correspondente ao laboratÃ³rio: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                Integer labSelecionado = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite o RA do aluno que deseja cadastrar na aula: ");
                String alunoRaSelecionado = scanner.nextLine();
                aulasCadastradas.get(labSelecionado).insereAluno(
                        alunosCursos.get(cursoSelecionado).recuperaAluno(alunoRaSelecionado)
                );
                System.out.println("Aluno cadastrado na aula com sucesso!");
            }
        }
    }
    
    public void cadastrarDisciplinaAula() {
        Scanner scanner = new Scanner(System.in);
        if (aulasCadastradas.isEmpty()) {
            System.out.println("Por favor cadastre um aula!");
        } else {
            System.out.println("Cursos cadastrados");
            for (int i = 0; i < cursosCadastrados.size(); i++) {
                System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
            }
<<<<<<< HEAD
            System.out.print("Digite um número correspondente ao curso: ");
            Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
            if (cursosCadastrados.get(cursoSelecionado).getDisciplina().isEmpty()) {
                System.out.println("Esse curso não têm disciplinas cadastradas!");
=======
            System.out.print("Digite um nÃºmero correspondente ao curso: ");
            Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
            if (cursosCadastrados.get(cursoSelecionado).getDisciplina().isEmpty()) {
                System.out.println("Esse curso nÃ£o tÃªm disciplinas cadastradas!");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
            } else {
                System.out.println("Disciplinas cadastradas!");
                System.out.println(cursosCadastrados.get(cursoSelecionado).getDisciplina());
                System.out.println("Aulas cadastradas!");
                for (int i = 0; i < aulasCadastradas.size(); i++) {
                    System.out.println(i + " - " + aulasCadastradas.get(i).getLab());
                }
<<<<<<< HEAD
                System.out.print("Digite o número correspondente ao laboratório: ");
=======
                System.out.print("Digite o nÃºmero correspondente ao laboratÃ³rio: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                Integer aulaSelecionada = Integer.parseInt(scanner.nextLine());
                System.out.print("Digite o nome da disciplina que deseja cadastrar na aula: ");
                String nomeDisciplina = scanner.nextLine();
                Integer posicaoDisciplinaArray = 0;
                boolean encontrou = false;
                for (int i = 0; i < cursosCadastrados.get(cursoSelecionado).getDisciplina().size(); i++) {
                    if (cursosCadastrados.get(cursoSelecionado).getDisciplina().get(i).getNome().equals(nomeDisciplina)) {
                        posicaoDisciplinaArray = i;
                        aulasCadastradas.get(aulaSelecionada)
                            .setDisc(cursosCadastrados.get(cursoSelecionado).getDisciplina()
                            .get(posicaoDisciplinaArray));
                        encontrou = true;
                    }
                }
                if (encontrou) {
                    System.out.println("Disciplina cadastrada com sucesso!");
                } else {
<<<<<<< HEAD
                    System.out.println("Disciplina não encontrada!");
=======
                    System.out.println("Disciplina nÃ£o encontrada!");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                }
                System.out.println(aulasCadastradas.get(aulaSelecionada).getDisc());
            }
        }
    }
    
    public void start() throws ParseException {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            SimpleDateFormat dataFormato = new SimpleDateFormat("dd/MM/yyyy");
            imprimirMenu();
<<<<<<< HEAD
            System.out.print("Escolha a opção desejada: ");
=======
            System.out.print("Escolha a opÃ§Ã£o desejada: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
            String decisao = scanner.nextLine();
            if (decisao.equals("1")) {
                System.out.print("Digite o nome do curso: ");
                String nome = scanner.nextLine();
                cadastrarCurso(nome);
            } else if (decisao.equals("2")) {
                if (cursosCadastrados.isEmpty()) {
                    System.out.println("Por favor cadastre um curso!");
                } else {
                    System.out.print("Nome do estudante: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o cpf: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a data de nascimento: ");
                    String data = scanner.nextLine();
                    Date dataFormatada = dataFormato.parse(data);
                    System.out.print("Digite seu RA: ");
                    String ra = scanner.nextLine();
                    System.out.print("Digite o periodo: ");
                    Integer periodo = Integer.parseInt(scanner.nextLine());
                    System.out.println("Cursos cadastrados");
                    for (int i = 0; i < cursosCadastrados.size(); i++) {
                        System.out.println(i + " - " + cursosCadastrados.get(i).getNomeCurso());
                    }
<<<<<<< HEAD
                    System.out.print("Digite o número correspondente ao curso: ");
=======
                    System.out.print("Digite o nÃºmero correspondente ao curso: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                    Integer cursoSelecionado = Integer.parseInt(scanner.nextLine());
                    cadastrarEstudante(nome, cpf, dataFormatada, ra, periodo,
                            cursosCadastrados.get(cursoSelecionado));
                }
            } else if (decisao.equals("3")) {
                System.out.print("Digite o nome do professor: ");
                String nome = scanner.nextLine();
                System.out.print("Digite o cpf: ");
                String cpf = scanner.nextLine();
                System.out.print("Digite a data de nascimento: ");
                String data = scanner.nextLine();
                Date dataFormatada = dataFormato.parse(data);
                System.out.print("Digite o registro: ");
                String registro = scanner.nextLine();
<<<<<<< HEAD
                System.out.print("Digite a titulação: ");
=======
                System.out.print("Digite a titulaÃ§Ã£o: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                String titulacao = scanner.nextLine();
                System.out.print("Digite as horas semanais: ");
                Double horasSemanais = Double.parseDouble(scanner.nextLine());
                System.out.print("Digite a o valor por hora: ");
                Double horaPreco = Double.parseDouble(scanner.nextLine());
                cadastrarProfessor(nome, cpf, dataFormatada, registro, titulacao, 
                                   horasSemanais, horaPreco);
            } else if (decisao.equals("4")) {
                System.out.print("Digite o nome da disciplina: ");
                String nome = scanner.nextLine();
                System.out.print("Digite a carga horaria: ");
                Integer cargaHoraria = Integer.parseInt(scanner.nextLine());
                cadastrarDisciplina(nome, cargaHoraria);
            } else if (decisao.equals("5")) {
                cadastrarDisciplinaCurso();
            } else if (decisao.equals("6")) {
                cadastrarCursoColegiado();
            } else if (decisao.equals("7")) {
                cadastrarProfessorColegiado();
            } else if (decisao.equals("8")) {
                cadastrarTurma();
            } else if (decisao.equals("9")) {
                cadastarAlunosCursoTurma();
            } else if (decisao.equals("10")) {
<<<<<<< HEAD
                System.out.print("Digite o nome do laboratório: ");
=======
                System.out.print("Digite o nome do laboratÃ³rio: ");
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999
                String nome = scanner.nextLine();
                SimpleDateFormat dataFormatada = new SimpleDateFormat("dd/MM/yyyy HH:mm");
                System.out.print("Digite a data e a hora: ");
                String data = scanner.nextLine();
                Date dataFinal = dataFormatada.parse(data);
                cadastrarAula(nome, dataFinal);
            } else if (decisao.equals("11")) {
                cadastrarAlunoAula();
            } else if (decisao.equals("12")) {
                cadastrarDisciplinaAula();
<<<<<<< HEAD
            } else if (decisao.equals("13")) {
            	listaAlunoCurso();
            }else if (decisao.equals("14")) {
            	listaDiciplinaCurso();
            }else if (decisao.equals("15")) {
            	listaColegiadoDoCurso();;
            }else if (decisao.equals("16")) {
            	listaAulaCurso();
            }
        }
    }
}
=======
            }
        }
    }
}
>>>>>>> ea68548583c6f79d5e988edec5694da0475bb999

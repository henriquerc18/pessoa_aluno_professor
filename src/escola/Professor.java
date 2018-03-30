package escola;

public class Professor extends Pessoa {
    private String disciplina = "";
    private int cargaHoraria = 0;

    public String getDisciplina(){
        return disciplina;
    } 
              
    public void setDiscipĺina(String disciplina){
        this.disciplina = disciplina;
    }
     
    public int getCargaHoraria(){
        return cargaHoraria;
    } 
      
    public void setCargaHoraria(int cargaHoraria){
        this.cargaHoraria = cargaHoraria;
    }

    public Professor(String nome, String email, String disciplina, int cargaHoraria){
        super(nome, email);
        this.disciplina = disciplina;
        this.cargaHoraria = cargaHoraria;
    }
    
    public Professor(){
    	super(nome, email);
    	System.out.println("Disciplina: ");
    	String disciplina = Escola.scan.next();
    	System.out.println("Você informou:" + disciplina);
    	System.out.println("Matrícula: ");
    	int cargaHoraria = Escola.scan.nextInt();
    	System.out.println("Você informou:" + cargaHoraria);
    	this.disciplina = disciplina;
    	this.cargaHoraria = cargaHoraria;
    }

    public void mostraDados(){
        super.mostraDados();
        System.out.println("Disciplina: " + this.disciplina);
        System.out.println("Carga Horária: " + this.cargaHoraria); 
    }
}    
        

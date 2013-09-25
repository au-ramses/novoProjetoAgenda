package pessoa;

public class PessoaFisica extends Pessoa{
	private String cpf;
	private String empresa;
	private String cargo;
	private String aniversario;
	private Object foto;
	
	public PessoaFisica(String nome, String cpf){
		super(nome); 
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getCargo() {
		return cargo;
	}
	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public String getAniversario() {
		return aniversario;
	}
	public void setAniversario(String aniversario) {
		this.aniversario = aniversario;
	}
	public Object getFoto() {
		return foto;
	}
	public void setFoto(Object foto) {
		this.foto = foto;
	}
	
	

}

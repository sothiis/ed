/* Implemente um método para inserir elementos de modo ordenado, 
usando ordem crescente.

public void addOrdenado(int novoElemento) */


public class Lista {
	private No inicio;
	private No fim;
	private int qtd;
	
//	Construtor
	public Lista() {
		this.inicio = null;
		this.fim = null;
		this.qtd = 0;
	}
	
//	Tamanho
	public int size() {
		return this.qtd;
	}
	
//	Está vazio
	public boolean isEmpty() {
		return (this.qtd == 0);
	}
	
//	Busca, se existe
	public boolean exist(double elem) {
		if(this.isEmpty())
			return false;
		
		No atual = this.inicio;
		
		while(atual != null) {
			if(atual.dado == elem)
				return true;
			
			atual = atual.prox;			
		}
		
		return false;		
	}
	
//	Inserir

	public void addOrdenado(int novoElemento) {
		No novoNo = new No(elem);
		No anterior = null;
		No primeiro = inicio;
		while(primeiro !=null && primeiro.exist() <inicio){
			anterior = primeiro;
			primeiro = primeiro.prox();
		}
		novoElemento = new No();
		novoElemento.qtd(i);

		if(anterior == null){
			novo.prox(primeiro);
			primeiro = novo;
			}else{
				novo.prox(anterior.prox());
				anterior.prox(novo);
			}
		}
	
	
//	Add no fim
	public void add(int novolem) {
		this.add(elem, this.size());
	}
	
//	Remover
	public double remove(int pos) {
		if(this.isEmpty() || pos >= this.size() || pos < 0) {
			System.out.println("Erro!");
			return -1.0;
		}
		
		if(pos == 0 && this.qtd == 1) {
			No temp = this.inicio;
			this.inicio = null;
			this.fim = null;
			this.qtd--;
			return temp.dado;
		}
		
		if(pos == 0) {
			No temp = this.inicio;
			this.inicio = this.inicio.prox;
			this.qtd--;
			return temp.dado;			
		}
		
		No anterior = this.inicio;
		int cont = 0;
		
		while(cont != pos-1) {
			anterior = anterior.prox;
			cont++;
		}
		
		No removido = anterior.prox;
		
		anterior.prox = removido.prox;
		
		this.qtd--;
		
		return removido.dado;
		
	}
	
}

/* Acrescente um método à Lista que remova a primeira ocorrência de um número informado como parâmetro, e retorne true. 
Caso o elemento não seja encontrado, retornar false.

public boolean remove (int elementoRemovido); */


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
	public boolean exist(int elem) {
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
	public void add(int elem, int pos) {
		if(pos > this.size() || pos < 0)
			return;
		
		if(pos == 0 && this.isEmpty()) {
			No novoNo = new No(elem);
			this.inicio = novoNo;
			this.fim = novoNo;
			this.qtd++;
			return;
		}
		
		if(pos == 0 && !this.isEmpty()) {
			No novoNo = new No (elem);
			novoNo.prox = this.inicio;
			this.inicio = novoNo;
			this.qtd++;
			return;
		}
		
		if(pos == this.size()) {
			No novoNo = new No(elem);
			this.fim.prox  = novoNo;
			this.fim = novoNo;
			this.qtd++;
			return;
		}
		
		No novoNo = new No(elem);
		
		No anterior = this.inicio;
		int cont = 0;
		
		while(cont != pos-1) {
			anterior = anterior.prox;
			cont++;
		}
		novoNo.prox = anterior.prox;
		anterior.prox = novoNo;
		
		this.qtd++;		
	}
	
//	Add no fim
	public void add(int elem) {
		this.add(elem, this.size());
	}
	
//	Remover
	public boolean removerElemento (int elementoRemovido) {
		if(this.isEmpty())
			return false;
		
		No atual = this.inicio;
		int cont = 0;
		
		while(atual != null) {
			
			if(atual.dado == elementoRemovido) {
				this.removerElemento(cont);
			return true;
			}
			
			atual = atual.prox;
			cont++;
			
		}
		return false;
	}


	}





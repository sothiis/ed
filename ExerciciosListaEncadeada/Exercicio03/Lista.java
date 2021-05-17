/* Acrescente um método que encontre o maior elemento da Lista 

public int maior() */


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
	
//	Est� vazio
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

	public int maior() {		
		No atual = this.inicio.prox;
		No maior = this.inicio;
			
		while(atual != null) {
				if(atual.dado > maior.dado) {
				maior = atual;
				}
				atual = atual.prox;
			}
			
			return maior.dado;
		}

	}

	
}

package com.carteira

class Acao {

	String nomeCodigo
	String empresa
	String setor 
	Cotacao cotacao

	 
	static belongsTo=[carteira:Carteira]
	


    static constraints = {
    }
}

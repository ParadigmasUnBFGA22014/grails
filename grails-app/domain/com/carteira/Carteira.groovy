package com.carteira

class Carteira {

	String nomeCarteira 
	Double desvioPadrao=desvioPadrao_1(10)
	Double covariancia
	Double variancia
	Double retornoMedio
	
	
	static hasMany = [acoes: Acao ]
	
    static constraints = {
    }

    String toString() 
    {
    	nomeCarteira
    }


    def desvioPadrao_1 ={
    	Double valor
    	->

    	valor=valor *10
    }
}

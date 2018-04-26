package brcesed.unifacisa.si.map.enums;

import brcesed.unifacisa.si.map.strategy.Strategy;

public enum Cargos implements Strategy{       

    ATENDENTE {

        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.01);
        }
    },

    VENDEDOR {

        @Override
        public double calcularComissao(double valorVenda) {
            return (valorVenda * 0.02);
        }
    },

    GERENTE {

        @Override
        public double calcularComissao(double valorVenda) {
            return (100 + valorVenda * 0.03);
        }
    };
}


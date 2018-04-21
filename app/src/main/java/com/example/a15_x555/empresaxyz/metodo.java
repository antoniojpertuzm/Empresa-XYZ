package com.example.a15_x555.empresaxyz;

public class metodo {

    public static int calcular(int spsexo, int Sptipozapato, int spmarca, int idcantidad) {
        int resultado = 0;

        switch (spsexo) {
            case 0:
                switch (Sptipozapato) {
                    case 0:
                        switch (spmarca) {
                            case 0:
                                resultado = 120000 * idcantidad;
                                break;
                            case 1:
                                resultado = 140000 * idcantidad;
                                break;
                            case 2:
                                resultado = 130000 * idcantidad;
                                break;
                        }
                        break;

                    case 1:

                                switch (spmarca) {

                                    case 0:
                                        resultado = 50000 * idcantidad;
                                        break;
                                    case 1:
                                        resultado = 80000 * idcantidad;
                                        break;
                                    case 2:
                                        resultado = 10000 * idcantidad;
                                        break;
                                }
                                break;
                        }
                        break;

                            case 1:
                                switch (Sptipozapato){
                                    case 0:
                                switch (spmarca) {
                                    case 0:
                                        resultado = 100000 * idcantidad;
                                        break;
                                    case 1:
                                        resultado = 130000 * idcantidad;
                                        break;
                                    case 2:
                                        resultado = 110000 * idcantidad;
                                        break;
                                }
                                break;

                                    case 1:
                                        switch (spmarca){

                                            case 0:
                                                resultado = 60000 * idcantidad;
                                                break;
                                            case 1:
                                                resultado = 70000 * idcantidad;
                                                break;
                                            case 2:
                                                resultado = 120000 * idcantidad;
                                                break;
                                        }

                        }
                        break;

                }

                return resultado;

        }

        }







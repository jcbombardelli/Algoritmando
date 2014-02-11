using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algoritmando
{
    class EstruturaDeDados20140210
    {
        static int  max = 10;
        static int[] vetor = new int[max];
        static int pos = 0;

        public static void exercicioPilha() { 
           int op;
            do{
                Console.WriteLine(" Digite uma opção: \n 1) Inserir na pilha\n 2) Remover da pilha\n 3) Listar Pilha\n 4) Sair");
                op = int.Parse(Console.ReadLine());
                
                switch(op){             
                    case 1 :
                        Console.Clear();
                        Console.Write("Insira um valor para preencher a pilha : ");
                        int v = int.Parse(Console.ReadLine());
                        inserir(v);
                        break;
                    case 2 :
                        remover();
                        break;
                    case 3 :
                        listar();
                        break;
                    default:
                        Console.WriteLine("Selecione uma Opção válida");
                        break;
                }        
            }while(op != 4);
        }


        private static void inserir(int valor){
            vetor[pos] = valor;
            pos++;
        }

        private static void remover() {
            pos--;
            int x = vetor[pos];
            vetor[pos] = 0;
            Console.WriteLine("Valor {0} removido do topo da pilha. \nPressione qualquer tecla para continuar...", x);
            Console.ReadKey();
            Console.Clear();
            
        }

        private static void listar() {
            Console.Clear();
            for (int i = 0; i < max; i++) {
                Console.WriteLine(" Posição {0} : {1}", i+1, vetor[i]);
            }
            Console.WriteLine("\n Pressione qualquer tecla para voltar ao menu...");
            Console.ReadKey();
            Console.Clear();

        }


    }
}

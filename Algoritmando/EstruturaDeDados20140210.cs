using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algoritmando
{
    class EstruturaDeDados20140210
    {
        static int max = 10;
        static int[] vetor = new int[max];
        static int pos = 0;

        public static void pilha()
        {
            int op;
            do
            {
                Console.WriteLine("\nSelecione : ------------------------------------");
                Console.WriteLine(" 1) Inserir na pilha\n 2) Remover da pilha\n 3) Listar Pilha\n 4) Sair");
                Console.Write(">");
                op = int.Parse(Console.ReadLine());

                switch (op)
                {
                    case 1:
                        int v;
                        Console.Clear();
                        Console.Write("Insira um valor para preencher a pilha : ");
                        v = int.Parse(Console.ReadLine());
                        inserir(v);
                        break;
                    case 2:
                        remover();
                        break;
                    case 3:
                        listar();
                        break;
                    case 4:
                        break;
                    default:
                        Console.WriteLine("Selecione uma Opção válida");
                        break;
                }
            } while (op != 4);
        }


        private static void inserir(int valor)
        {
            vetor[pos] = valor;
            pos++;
            Console.WriteLine("\nValor {0} inserido no topo da pilha. \nPressione qualquer tecla para continuar...", valor);
            Console.ReadKey();
            Console.Clear();
            Console.WriteLine("Ultimo Valor inserido : {0}", valor);
        }

        private static void remover()
        {
            pos--;
            int x = vetor[pos];
            vetor[pos] = 0;
            Console.WriteLine("\nValor {0} removido do topo da pilha. \nPressione qualquer tecla para continuar...", x);
                Console.ReadKey();
            Console.Clear();
            Console.WriteLine("Ultimo Valor removido : {0}", x);

        }

        private static void listar()
        {
            Console.Clear();

            if (pos == 0)
                Console.WriteLine("\t Vetor Vazio");
            else
            {
                for (int i = 0; i < pos; i++)
                {
                    Console.WriteLine(" Posição {0} : {1}", i + 1, vetor[i]);
                }
            }
            Console.WriteLine("\n Pressione qualquer tecla para voltar ao menu...");
            Console.ReadKey();
            Console.Clear();

        }


    }
}

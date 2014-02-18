using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algoritmando
{
    class EstruturaDeDados20140213
    {

        private int info;     
        EstruturaDeDados20140213 next;


        public EstruturaDeDados20140213() {
            info = 0;
            next = null;
        }

        private void push(int n, ref EstruturaDeDados20140213 topo){
            this.info = n;
            this.next = topo;
            topo = this;
        }

        private void pop(ref EstruturaDeDados20140213 topo) {
            topo = this.next;
        }

        private void print(ref EstruturaDeDados20140213 topo) {
            EstruturaDeDados20140213 temp = this;
            while (temp != null)
            {
                Console.WriteLine("{0}", temp.info);
                temp = temp.next;
            }            
           

        }

        public static void pilhaDinamica() {
            EstruturaDeDados20140213 topo = null;
            EstruturaDeDados20140213 pp;
            int n, escolha;

            do{

            Console.WriteLine("\nSelecione : ------------------------------------");
            Console.WriteLine(" 1) Inserir na pilha\n 2) Remover da pilha\n 3) Listar pilha \n 4) Sair");
            Console.Write(">");
            escolha = int.Parse(Console.ReadLine());

            switch (escolha)  {

                case 1:
                    Console.Clear();
                    Console.Write("Insira um valor para preencher a pilha : ");
                    n = int.Parse(Console.ReadLine());
                    pp = new EstruturaDeDados20140213();
                    pp.push(n, ref topo);
                    break;
                case 2:
                    if (topo == null)
                        Console.WriteLine("Vazio");
                    else
                        topo.pop(ref topo);
                    break;
                case 3:
                    if (topo == null)
                        Console.WriteLine("Vazio");
                    else
                        topo.print(ref topo);
                    break;
            }


            } while (escolha != 4);
        } 


    }
}

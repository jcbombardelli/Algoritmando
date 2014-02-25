using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algoritmando
{
    class EstruturaDeDados20140220
    {

        private int info;
        EstruturaDeDados20140220 next;

        public EstruturaDeDados20140220()
        {
            info = 0;
            next = null;
        }

        public void insere(int n, ref EstruturaDeDados20140220 start, ref EstruturaDeDados20140220 end)
        {

            this.info = n;
            if (start == null)
                start = end = this;
            else
            {
                end.next = this;
                end = this;
            }

        }

        public void remove(ref EstruturaDeDados20140220 start, ref EstruturaDeDados20140220 end)
        {

            if (start.next != null)
            {                
		start = start.next;
                
            }

        }

        public void  mediaAritimetica(ref EstruturaDeDados20140220 start)
        {
            EstruturaDeDados20140220 lista = new EstruturaDeDados20140220();
            float soma=0; int cont=0;
            lista = start;
            do
            {
                soma = lista.info;
                cont++;
                lista = lista.next;
            } while (lista != null);

            Console.WriteLine(soma / cont);

        }
        public void listar(ref EstruturaDeDados20140220 start)
        {
            Console.Clear();
            Console.WriteLine("listagem da fila");
            EstruturaDeDados20140220 lista = new EstruturaDeDados20140220();
            lista = start;

            do
            {
                Console.WriteLine(lista.info);
                lista = lista.next;
            } while (lista != null);


        }

        public static void main()
        {

            EstruturaDeDados20140220 start, end, ff;
            int n, escolha;
            start = end = ff = null;


            do
            {

                Console.WriteLine("\nSelecione : ------------------------------------");
                Console.WriteLine(" 1) Inserir na fila\n 2) Remover da fila\n 3) Media Ariatimetica \n 4) Listar fila \n 5) Sair");
                Console.Write(">");
                escolha = int.Parse(Console.ReadLine());

                switch (escolha)
                {

                    case 1:
                        ff = new EstruturaDeDados20140220();
                        Console.WriteLine("Digite um numero \n> ");
                        n = int.Parse(Console.ReadLine());
                        ff.insere(n, ref start, ref end);
                        break;

                    case 2:
                        ff = new EstruturaDeDados20140220();
                        ff.remove(ref start, ref end);
                        break;

                    case 3:
                        ff = new EstruturaDeDados20140220();
                        ff.mediaAritimetica(ref start);
                        break;
                    case 4:
                        ff = new EstruturaDeDados20140220();
                        ff.listar(ref start);
                        break;
                    case 5:
                        break;
                }


            } while (escolha != 5);

        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;

namespace Algoritmando
{
    class EstruturaDeDados20140217
    {
        private string info;
        EstruturaDeDados20140217 next;

        public EstruturaDeDados20140217()
        {
            info = null;
            next = null;
        }

        private void push(string n, ref EstruturaDeDados20140217 topo)
        {
            this.info = n;
            this.next = topo;
            topo = this;
        }

        private void pop(ref EstruturaDeDados20140217 topo)
        {
            topo = this.next;
        }

        private void print(ref EstruturaDeDados20140217 topo)
        {
            EstruturaDeDados20140217 temp = this;
            while (temp != null)
            {
                Console.WriteLine("{0}", temp.info);
                temp = temp.next;
            }
        }

        public static void expressaoMatematicaTP()
        {
            EstruturaDeDados20140217 topo = null;
            EstruturaDeDados20140217 pp = new EstruturaDeDados20140217();
            string escolha;
            string LAtual;
            bool jaz = false;

            Console.WriteLine("\nInsira a expressao: ");
            Console.Write(">");
            escolha = "(())";//Console.ReadLine();

            for (int i = 0; i <= escolha.Length; i++)
            {
                LAtual = escolha.Substring(i, 1);


                if (LAtual == "(" || LAtual == "{" || LAtual == "[")
                {
                    pp.push(LAtual, ref topo);
                    jaz = true;
                }

                else if (LAtual == ")" || LAtual == "}" || LAtual == "]")
                {

                    if (topo == null && jaz == false)
                    {
                        Console.WriteLine("Expressão Invalida");
                    }
                    else if (topo.info == "(" && LAtual == ")")
                    {
                        pp.pop(ref topo);
                    }
                    else
                        if (topo.info == "{" && LAtual == "}")
                        {
                            pp.pop(ref topo);
                        }
                        else
                            if (topo.info == "[" && LAtual == "]")
                            {
                                pp.pop(ref topo);
                            }
                            else
                            {
                                Console.WriteLine("FOUDASEEEEE invalida");
                            }
                }
            }

            if (topo == null && jaz == true)
                Console.WriteLine("Expressao Ok");
            else if (topo != null)
                Console.WriteLine("Expressão invalida, topo nao esta nulo");
            Console.ReadKey();

        }
    }
}
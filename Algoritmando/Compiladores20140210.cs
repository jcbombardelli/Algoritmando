using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Algoritmando
{
    class Compiladores20140210
    {
        public static void aula()
        {
            FileStream infile, outfile, extrafile;
            int tam, dig = 0, let = 0, outr = 0;
            char x, y;

            infile = new System.IO.FileStream("teste.txt", System.IO.FileMode.Open, System.IO.FileAccess.Read);
            outfile = new System.IO.FileStream("teste2.txt", System.IO.FileMode.Create, System.IO.FileAccess.Write);
            extrafile = new System.IO.FileStream("teste3.txt", System.IO.FileMode.Open, System.IO.FileAccess.Read);



            tam = (int)infile.Length;
            for (int i = 0; i < tam; ++i)
            {
                x = (char)infile.ReadByte();

                if (char.IsLetter(x))
                {
                    let++;
                    y = char.ToUpper(x);
                }
                else if (char.IsNumber(x))
                {
                    dig++;
                    y = x;
                }
                else
                {
                    outr++;
                    y = x;
                }


                outfile.WriteByte((byte)y);
            }

            infile.Close();
            Console.WriteLine("Quantidade de Letras: {0}", let);
            Console.WriteLine("Quantidade de Numeros: {0}", dig);
            Console.WriteLine("Outros Carecteres/Tokens: {0}", outr);
            Console.WriteLine("----------------------------");
            Console.WriteLine("Texto convertido para Caixa alta\n\n");
            Console.WriteLine("Pressione qualquer tecla para continuar...");
            Console.ReadKey();

            tam = (int)extrafile.Length;
            for (int i = 0; i < tam; ++i)
            {
                x = (char)extrafile.ReadByte();

                outfile.WriteByte((byte)x);
            }

            extrafile.Close();
            outfile.Close();

        }
    }
}
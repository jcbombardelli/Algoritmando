using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Algoritmando
{
    class Compiladores20140224
    {
        public static void main()
        {
            FileStream infile, outfile;

            int tam, dig = 0, let = 0, outr = 0;
            char x, y;
            List<String> a = new List<String>();


            infile = new System.IO.FileStream("teste-20140224.txt", System.IO.FileMode.Open, System.IO.FileAccess.Read);

            tam = (int)infile.Length;

            for (int i = 0; i < tam; ++i)
            {
                x = (char)infile.ReadByte();

                if (char.IsNumber(x))
                {
                    String valor = "";
                    do
                    {
                        valor += x;
                        i++;
                        x = (char)infile.ReadByte();     

                    } while (char.IsNumber(x));
                    Console.WriteLine(valor);
                }
            }

            
           
            Console.ReadKey();
        }
    }
}
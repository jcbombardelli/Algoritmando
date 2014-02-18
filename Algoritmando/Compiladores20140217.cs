using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.IO;

namespace Algoritmando
{
    class Compiladores20140217
    {

        public static void main()
        {

            FileStream infile, outfile;

            int tam, dig = 0, let = 0, outr = 0;
            char x, y;

            infile = new System.IO.FileStream("teste-20140217.txt", System.IO.FileMode.Open, System.IO.FileAccess.Read);
            outfile = new System.IO.FileStream("teste2-20140217.txt", System.IO.FileMode.Create, System.IO.FileAccess.Write);

            tam = (int)infile.Length;

            for (int i = 0; i < tam; ++i) {
                x = (char)infile.ReadByte();
                if (x == ' ')
                    continue;
                else if (x == '#')
                {
                    do
                    {
                        i++;
                        y = (char)infile.ReadByte();
                    } while (y != '#');
                }
                else
                {
                    outfile.WriteByte((byte)x);
                }
            }
            outfile.Close();
        }
    }
}
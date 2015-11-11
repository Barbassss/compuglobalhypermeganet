using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using WindowsFormsApplication2.Dominio;

namespace WindowsFormsApplication2.Presentacion
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            if (textBox1.Text.Equals("user") && textBox2.Text.Equals("user"))
            {
                Form2 form = new Form2();
               

                form.Show();
                
            }
            else
            {

                MessageBox.Show("Error de autenticacion, pruebe otra vez");

            }
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }
    }
}

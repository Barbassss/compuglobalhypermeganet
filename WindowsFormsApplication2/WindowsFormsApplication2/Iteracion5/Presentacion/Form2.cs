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
    public partial class Form2 : Form
    {
        private String accion;
        public Form2()
        {
            InitializeComponent();
            Usuario usr = new Usuario();
            usr.leerTodo();


            foreach (Usuario u in usr.getGestor().getLista())
            {
                listBox1.Items.Add(u.getId());
                listBox2.Items.Add(u.getNom());
                listBox3.Items.Add(u.getNum());
            }

        }

        private void button1_Click(object sender, EventArgs e)
        {


            if (accion.Equals("añadir"))
            {
                try {
                    Usuario usr = new Usuario(Int32.Parse(textBox1.Text), textBox2.Text, Int32.Parse(textBox3.Text));
                    usr.insertar();
                }catch (Exception)
                {
                    MessageBox.Show("Inserte el id, el nombre y el telefono a insertar");
                }
            }

            if (accion.Equals("modificar"))
            {
                try {
                    Usuario usr = new Usuario(Int32.Parse(textBox1.Text), textBox2.Text, Int32.Parse(textBox3.Text));
                    usr.actualizar();
                }catch (Exception)
                {
                    MessageBox.Show("Inserte el id a modificar y complete los parametros");
                    
                }

            }
            if (accion.Equals("eliminar"))
            {
                try {
                    Usuario usr = new Usuario(Int32.Parse(textBox1.Text));
                    usr.eliminar();
                }catch (Exception)
                {
                    MessageBox.Show("Inserte el id a eliminar");

                }
            }

            button1.Enabled = false;
            button2.Enabled = true;
            button3.Enabled = true;
            button4.Enabled = true;
            textBox1.Enabled = false;
            textBox2.Enabled = false;
            textBox3.Enabled = false;
            textBox1.Text = "";
            textBox2.Text = "";
            textBox3.Text = "";

            listBox1.Items.Clear();
            listBox2.Items.Clear();
            listBox3.Items.Clear();
            Usuario usar = new Usuario();
            usar.leerTodo();


            foreach (Usuario u in usar.getGestor().getLista())
            {
                listBox1.Items.Add(u.getId());
                listBox2.Items.Add(u.getNom());
                listBox3.Items.Add(u.getNum());
            }

        }

        private void button2_Click(object sender, EventArgs e)
        {
            accion = "añadir";
            button1.Enabled = true;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            textBox1.Enabled = true;
            textBox2.Enabled = true;
            textBox3.Enabled = true;
        }

        private void button3_Click(object sender, EventArgs e)
        {
            accion = "modificar";
            button1.Enabled = true;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            textBox1.Enabled = true;
            textBox2.Enabled = true;
            textBox3.Enabled = true;

        }

        private void button4_Click(object sender, EventArgs e)
        {
            accion = "eliminar";
            button1.Enabled = true;
            button2.Enabled = false;
            button3.Enabled = false;
            button4.Enabled = false;
            textBox1.Enabled = true;
        }

    }
}

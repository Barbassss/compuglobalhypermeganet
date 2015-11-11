using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using WindowsFormsApplication2.Persistencia;


namespace WindowsFormsApplication2.Dominio
{
    class Usuario
    {
        private int id;
        private String nom;
        private int num;
        private GestorConsultarUsuario gestor;

        public Usuario(int i)
        {
            id = i;
        }
        public Usuario(int i, String s, int n)
        {
            id = i;
            nom = s;
            num = n;
        }
        public Usuario()
        {
        }

        public GestorConsultarUsuario getGestor()
        {
		if (gestor!=null){
                return gestor;
            }else{
                return new GestorConsultarUsuario();
            }
        }

        public void leerTodo()
        {
            gestor = new GestorConsultarUsuario();
            gestor.leerTod();
        }

        public void leer()
        {
            gestor = new GestorConsultarUsuario();
            gestor.leer(this);
        }

        public void insertar()
        {

            GestorAñadirUsuario.insertar(this);
        }

        public void eliminar()
        {

            GestorEliminarUsuario.eliminar(this);
        }

        public void actualizar()
        {
            GestorModificarUsuario.modificar(this);
        }

        public int getId()
        {
            return id;
        }
        public void setNom(String n)
        {
            nom = n;
        }
        public void setNum(int nu)
        {
            num = nu;
        }
        public String getNom()
        {
            return nom;
        }
        public int getNum()
        {
            return num;
        }

    }
}

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.OleDb;
using System.Collections;
using System.Collections.ObjectModel;
using WindowsFormsApplication2.Persistencia;

namespace WindowsFormsApplication2.Dominio
{
    class GestorConsultarUsuario
    {
        private Collection<Usuario> lista;
        private AgenteBD ag = AgenteBD.getAgente();

        public GestorConsultarUsuario()
        {
            lista = new Collection<Usuario>();
        }

        public Collection<Usuario> getLista()
        {
            return lista;
        }

        public void leerTod()
        {
            Usuario usr;
            ag = AgenteBD.getAgente();
            OleDbDataReader lector = ag.leer("SELECT * FROM Agenda;");
            while (lector.Read())
            {
                usr = new Usuario(lector.GetInt32(0), lector.GetString(1), lector.GetInt32(2));
                lista.Add(usr);
            }
            lector.Close();
        }

        public void leer(Usuario usr)
        {
            ag = AgenteBD.getAgente();
            int Id = usr.getId();
            OleDbDataReader lector = ag.leer("SELECT * FROM Agenda WHERE Id='" + Id.ToString() + "';");
            while (lector.Read())
            {
                usr.setNom(lector.GetString(1));
                usr.setNum(lector.GetInt32(2));

            }
            lector.Close();

        }
    }
}

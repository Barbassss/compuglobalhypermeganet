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
    class GestorModificarUsuario
    {
        private static AgenteBD ag = AgenteBD.getAgente();
        public static void modificar(Usuario usr)
        {

            ag.modificar("UPDATE Agenda SET nombre='" + usr.getNom() + "', numeroTelf='" + usr.getNum().ToString() + "' WHERE Id=" + usr.getId().ToString() + ";");
        }
    }
}

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
    class GestorEliminarUsuario
    {
        private static  AgenteBD ag = AgenteBD.getAgente();
        public static void eliminar(Usuario usr)
        {

            ag.modificar("DELETE FROM Agenda WHERE Id=" + usr.getId().ToString() + ";");

        }

    }
}

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
    class GestorAñadirUsuario
    {
        private static AgenteBD ag = AgenteBD.getAgente();

        public static void insertar(Usuario usr)
        {
            ag.modificar("INSERT INTO Agenda VALUES ('" + usr.getId().ToString() + "', '" + usr.getNom() + "', '" + usr.getNum().ToString() + "');");

        }
    }
}

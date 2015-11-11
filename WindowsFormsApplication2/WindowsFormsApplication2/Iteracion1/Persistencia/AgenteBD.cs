using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Data.OleDb;
using System.Windows.Forms;

namespace WindowsFormsApplication2.Persistencia
{
    class AgenteBD
    {
        private String CadenaCon = "Provider=Microsoft.Jet.OLEDB.4.0;" + @"Data Source=C:\Users\JAVIER OLIVER ASUS\Dropbox\Lab_ISO2\Agenda Monolitica\WindowsFormsApplication2\WindowsFormsApplication2\monolitica.mdb";
        private OleDbConnection mConexion;
        private static AgenteBD Instancia;

        private AgenteBD()
        {
            mConexion = new OleDbConnection();
            mConexion.ConnectionString= CadenaCon;
            try {
                mConexion.Open();
            }catch (Exception e){
                MessageBox.Show("ERRROR DE CONEXION CON LA BDD");
            }
        }
        public static AgenteBD getAgente()
        {
            if (Instancia == null) {
                Instancia = new AgenteBD();
            }
            return Instancia;
        }
        public OleDbDataReader leer(String sql)
        {
            OleDbCommand com = new OleDbCommand(sql,mConexion);
            return com.ExecuteReader();

        }

        public int modificar(String sql)
        {
            OleDbCommand com = new OleDbCommand(sql, mConexion);
            return com.ExecuteNonQuery();
        }
    }
}

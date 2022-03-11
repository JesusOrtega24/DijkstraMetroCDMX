/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metrocdmx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JTextField;
import org.graphstream.algorithm.Dijkstra;
import org.graphstream.graph.Edge;
import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;
import org.graphstream.graph.Path;
import org.graphstream.graph.implementations.SingleGraph;

/**
 *
 * @author Jesus
 */
public class dijkstra {
    
        public static Graph exampleGraph() {
            
            Graph g = new SingleGraph("example");
            g.addAttribute("ui.stylesheet", styleSheet);
            System.setProperty("org.graphstream.ui.renderer", "org.graphstream.ui.j2dviewer.J2DGraphRenderer");

            /***************LINEA 1 (ROSA CLARO)***************/

            g.addNode("JUANACATLAN").addAttribute("xy", -10, -2);//JUANACATLAN 
            g.addNode("CHAPULTEPEC").addAttribute("xy", -9, -1); //CHAPULTEPEC
            g.addNode("SEVILLA").addAttribute("xy", -8, 0);  //SEVILLA
            g.addNode("INSURGENTES").addAttribute("xy", -7, 0);  //INSURGENTES 
            g.addNode("CUAUHTEMOC").addAttribute("xy", -6, 0);  //CUAUTEMOC
            g.addNode("BALDERAS").addAttribute("xy", -5, 0);  //BALDERAS
            g.addNode("SALTO_DEL_AGUA").addAttribute("xy", -4, 0);  //SALTO DEL AGUA
            g.addNode("ISABEL_LA_CATOLICA").addAttribute("xy", -3, 0);  //ISABEL LA CATOLICA
            g.addNode("PINO_SUAREZ").addAttribute("xy", -2, 0);  //PINO SUAREZ
            g.addNode("MERCED").addAttribute("xy", -1, 0);  //MERCED 
            g.addNode("CANDELARIA").addAttribute("xy", 0, 0);   //CANDELARIA
            g.addNode("SAN_LAZARO").addAttribute("xy", 1, 0);   //SAN LAZARO
            g.addNode("MOCTEZUMA").addAttribute("xy", 2, 0);   //MOCTEZUMA
            g.addNode("BALBUENA").addAttribute("xy", 3, 0);   //BALBUENA
            g.addNode("BOULEVARD_PUERTO_AEREO").addAttribute("xy", 4, 0);   //BOULEVARD PUERTO AEREO
            g.addNode("GOMEZ_FARIAS").addAttribute("xy", 5, 0);   //GOMEZ FARIAS
            g.addNode("ZARAGOZA").addAttribute("xy", 6, 0);   //ZARAGOZA
            g.addNode("PANTITLAN").addAttribute("xy", 7, 0);   //PANTITLAN
            g.addNode("OBSERVATORIO").addAttribute("xy", -12, -3);//OBSERVATORIO

            g.getNode("OBSERVATORIO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/observatorio.png');");
            g.getNode("JUANACATLAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/juanacatlan.png');");
            g.getNode("CHAPULTEPEC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/chapultepec.png');"); 
            g.getNode("SEVILLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/sevilla.png');"); 
            g.getNode("INSURGENTES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/insurgentes.png');"); 
            g.getNode("CUAUHTEMOC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/cuahutemoc.png');"); 
            g.getNode("BALDERAS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/balderas.png');");
            g.getNode("SALTO_DEL_AGUA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/saltodelagua.png');");
            g.getNode("ISABEL_LA_CATOLICA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/isabel.png');");
            g.getNode("PINO_SUAREZ").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/pinosuarez.png');");
            g.getNode("MERCED").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/merced.png');");
            g.getNode("CANDELARIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/candelaria.png');");
            g.getNode("SAN_LAZARO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/sanlazaro.png');");
            g.getNode("MOCTEZUMA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/moctezuma.png');");
            g.getNode("BALBUENA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/balbuena.png');");
            g.getNode("BOULEVARD_PUERTO_AEREO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/blvdptaereo.png');");
            g.getNode("GOMEZ_FARIAS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/gomezfarias.png');");
            g.getNode("ZARAGOZA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/zaragoza.png');");
            g.getNode("PANTITLAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea1/pantitlan.png');");

            /***************LINEA 4 (VERDE CLARO)***************/

            g.addNode("TALISMAN").addAttribute("xy", 0, 6);    //TALISMAN
            g.addNode("BONDOJITO").addAttribute("xy", 0, 5);    //BONDOJITO
            g.addNode("CONSULADO").addAttribute("xy", 0, 4);    //CONSULADO
            g.addNode("CANAL_DEL_NORTE").addAttribute("xy", 0, 2.5);  //CANAL DEL NORTE
            g.addNode("MORELOS").addAttribute("xy", 0, 1);    //MORELOS
            g.addNode("FRAY_SERVANDO").addAttribute("xy", 0, -1.5);//FRAY SERVANDO
            g.addNode("JAMAICA").addAttribute("xy", 0, -3);   //JAMAICA
            g.addNode("SANTA_ANITA").addAttribute("xy", 0, -4);   //SANTA ANITA


            g.getNode("TALISMAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/talisman.png');");
            g.getNode("BONDOJITO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/bondojito.png');");
            g.getNode("CONSULADO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/rioconsulado.png');");
            g.getNode("CANAL_DEL_NORTE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/canaldelnorte.png');");
            g.getNode("MORELOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/morelos.png');");
            g.getNode("FRAY_SERVANDO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/frayservando.png');");
            g.getNode("JAMAICA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/jamaica.png');");
            g.getNode("SANTA_ANITA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea4/santaanita.png');");


            /***************LINEA 5 (AMARILLA CLARA)***************/

            g.addNode("HANGARES").addAttribute("xy", 6, 1);   //HANGARES
            g.addNode("TERMINAL_AEREA").addAttribute("xy", 5, 2);   //TERMINAL AEREA
            g.addNode("OCEANIA").addAttribute("xy", 4, 3);   //OCEANIA
            g.addNode("ARAGON").addAttribute("xy", 3, 4);   //ARAGON
            g.addNode("EDUARDO_MOLINA").addAttribute("xy", 1.5, 4); //EDUARDO MOLINA
            g.addNode("VALLE_GOMEZ").addAttribute("xy", -1.5, 4);//VALLE GOMEZ
            g.addNode("MISTERIOS").addAttribute("xy", -3, 4);  //MISTERIOS
            g.addNode("LA_RAZA").addAttribute("xy", -4, 5);  //LA RAZA
            g.addNode("AUTOBUSES_DEL_NORTE").addAttribute("xy", -5, 6);  //AUTOBUSES DEL NORTE
            g.addNode("INSTITUTO_DEL_PETROLEO").addAttribute("xy", -5, 7);  //INSTITUTO DEL PETROLEO
            g.addNode("POLITECNICO").addAttribute("xy", -5, 8); //POLITECNICO

            g.getNode("HANGARES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/hangares.png');");
            g.getNode("TERMINAL_AEREA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/terminalarea.png');");
            g.getNode("OCEANIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/oceania.png');");
            g.getNode("ARAGON").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/aragon.png');");
            g.getNode("EDUARDO_MOLINA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/eduardomolina.png');");
            g.getNode("VALLE_GOMEZ").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/vallegomez.png');");
            g.getNode("MISTERIOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/misterios.png');");
            g.getNode("LA_RAZA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/laraza.png');");
            g.getNode("AUTOBUSES_DEL_NORTE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/autobusesnorte.png');");
            g.getNode("INSTITUTO_DEL_PETROLEO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/imp.png');");
            g.getNode("POLITECNICO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea5/ipn.png');");

            /***************LINEA 9 (CAFE OSCURA)***************/

            g.addNode("LAZARO_CARDENAS").addAttribute("xy", -3.5, -3); //LAZARO CARDENAS
            g.addNode("CENTRO_MEDICO").addAttribute("xy", -5, -3);   //CENTRO MEDICO
            g.addNode("CHILPANCINGO").addAttribute("xy", -7, -3);   //CHILPANCINGO
            g.addNode("PATRIOTISMO").addAttribute("xy", -9, -3);   //PATRIOTISMO
            g.addNode("TACUBAYA").addAttribute("xy", -11, -3);  //TACUBAYA
            g.addNode("MIXIUHCA").addAttribute("xy", 1.5, -3);  //MIXIUHCA
            g.addNode("VELODROMO").addAttribute("xy", 3, -3);    //VELODROMO
            g.addNode("CIUDAD_DEPORTIVA").addAttribute("xy", 4.5, -2);  //CIUDAD DEPORTIVA
            g.addNode("PUEBLA").addAttribute("xy", 5.5, -1.25);//PUEBLA

            g.getNode("LAZARO_CARDENAS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/lazarocardenas.png');");
            g.getNode("CENTRO_MEDICO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/centromedico.png');");
            g.getNode("CHILPANCINGO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/chilpancingo.png');");
            g.getNode("PATRIOTISMO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/patriotismo.png');");
            g.getNode("TACUBAYA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/tacubaya.png');");
            g.getNode("MIXIUHCA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/mixiuhca.png');");
            g.getNode("VELODROMO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/velodromo.png');");
            g.getNode("CIUDAD_DEPORTIVA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/ciudadeportiva.png');");
            g.getNode("PUEBLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea9/puebla.png');");

            /***************LINEA A (MORADA)***************/

            g.addNode("AGRICOLA_ORIENTAL").addAttribute("xy", 8, -1);  //AGRICOLA ORIENTAL
            g.addNode("CANAL_DE_SAN_JUAN").addAttribute("xy", 9, -2);  //CANAL DE SAN JUAN
            g.addNode("TEPALCATES").addAttribute("xy", 10, -3); //TEPALCATES
            g.addNode("GUELATAO").addAttribute("xy", 11, -4); //GUELATAO
            g.addNode("PEÑON_VIEJO").addAttribute("xy", 12, -5); //PEÑON VIEJO
            g.addNode("ACATITLA").addAttribute("xy", 13, -6); //ACATITLA
            g.addNode("SANTA_MARTHA").addAttribute("xy", 14, -7); //SANTA MARTHA
            g.addNode("LOS_REYES").addAttribute("xy", 14, -8); //LOS REYES
            g.addNode("LA_PAZ").addAttribute("xy", 14, -9); //LA PAZ

            g.getNode("AGRICOLA_ORIENTAL").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/agricolaote.png');");
            g.getNode("CANAL_DE_SAN_JUAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/canalsnjuan.png');");
            g.getNode("TEPALCATES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/tepalcates.png');");
            g.getNode("GUELATAO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/guelatao.png');");
            g.getNode("PEÑON_VIEJO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/penonviejo.png');");
            g.getNode("ACATITLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/acatitla.png');");
            g.getNode("SANTA_MARTHA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/santamartha.png');");
            g.getNode("LOS_REYES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/losreyes.png');");
            g.getNode("LA_PAZ").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaA/lapaz.png');");

            /***************LINEA 8 (VERDE PASTO)***************/

            g.addNode("GARIBALDI").addAttribute("xy", -4, 3);  //GARIBALDI
            g.addNode("BELLAS_ARTES").addAttribute("xy", -4, 2);  //BELLAS ARTES
            g.addNode("SAN_JUAN_DE_LETRAN").addAttribute("xy", -4, 1);  //SAN JUAN DE LETRAN
            g.addNode("DOCTORES").addAttribute("xy", -4, -1); //DOCTORES
            g.addNode("OBRERA").addAttribute("xy", -3, -2); //OBRERA 
            g.addNode("CHABACANO").addAttribute("xy", -2, -3);//CHABACANO
            g.addNode("LA_VIGA").addAttribute("xy", -1, -4); //LA VIGA
            g.addNode("COYUYA").addAttribute("xy", 1, -4);  //COYUYA
            g.addNode("IZTACALCO").addAttribute("xy", 2, -5);  //IZTACALCO
            g.addNode("APATLACO").addAttribute("xy", 2, -6);  //APATLACO
            g.addNode("ACULCO").addAttribute("xy", 2, -7);  //ACULCO
            g.addNode("ESCUADRON_201").addAttribute("xy", 2, -8);  //ESCUADRON 201
            g.addNode("ATLALILCO").addAttribute("xy", 2, -9);  //ATLALILCO
            g.addNode("IZTAPALAPA").addAttribute("xy", 3, -9);  //IZTAPALAPA
            g.addNode("CERRO_DE_LA_ESTRELLA").addAttribute("xy", 4, -9);  //CERRO DE LA ESTRELLA
            g.addNode("UAM-1").addAttribute("xy", 5, -9);  //UAM-1
            g.addNode("CONSTITUCION_DE_1917").addAttribute("xy", 6, -9);  //CONSTITUCION DE 1917

            g.getNode("GARIBALDI").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/garibaldi.png');");
            g.getNode("BELLAS_ARTES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/bellasartes.png');");
            g.getNode("SAN_JUAN_DE_LETRAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/sanjuandeletran.png');"); 
            g.getNode("DOCTORES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/doctores.png');"); 
            g.getNode("OBRERA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/obrera.png');"); 
            g.getNode("CHABACANO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/chabacano.png');"); 
            g.getNode("LA_VIGA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/laviga.png');");
            g.getNode("COYUYA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/coyuya.png');");
            g.getNode("IZTACALCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/iztacalco.png');");
            g.getNode("APATLACO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/apatlaco.png');");
            g.getNode("ACULCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/aculco.png');");
            g.getNode("ESCUADRON_201").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/escuadron201.png');");
            g.getNode("ATLALILCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/atlalilco.png');");
            g.getNode("IZTAPALAPA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/iztapalapa.png');");
            g.getNode("CERRO_DE_LA_ESTRELLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/cerroestrella.png');");
            g.getNode("UAM-1").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/uam-i.png');");
            g.getNode("CONSTITUCION_DE_1917").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea8/constitucion1917.png');");

            /***************LINEA B (VERDE OSCURO)***************/

            g.addNode("BUENA_VISTA").addAttribute("xy", -6, 3);  //BUENA VISTA
            g.addNode("LAGUNILLA").addAttribute("xy", -2, 3);  //LAGUNILLA
            g.addNode("TEPITO").addAttribute("xy", -1, 2);  //TEPITO
            g.addNode("RICARDO_FLORES_MAGON").addAttribute("xy", 2.25, 1.25);//RICARDO FLORES MAGON
            g.addNode("ROMERO_RUBIO").addAttribute("xy", 3.25, 2.25);//ROMERO RUBIO
            g.addNode("DEPORTIVO_OCEANIA").addAttribute("xy", 5, 4);  //DEPORTIVO OCEANIA
            g.addNode("BOSQUE_ARAGON").addAttribute("xy", 6, 5);  //BOSQUE ARAGON
            g.addNode("VILLA_DE_ARAGON").addAttribute("xy", 7, 6);  //VILLA DE ARAGON
            g.addNode("NEZAHUALCOYOTL").addAttribute("xy", 7, 7);  //NEZAHUALCOYOTL
            g.addNode("IMPULSORA").addAttribute("xy", 7, 8);  //IMPULSORA
            g.addNode("RIO_DE_LOS_REMEDIOS").addAttribute("xy", 7, 9);  //RIO DE LOS REMEDIOS
            g.addNode("MUZQUIZ").addAttribute("xy", 7, 10); //MUZQUIZ
            g.addNode("ECATEPEC").addAttribute("xy", 7, 11); //ECATEPEC
            g.addNode("OLIMPICA").addAttribute("xy", 7, 12); //OLIMPICA
            g.addNode("PLAZA_ARAGON").addAttribute("xy", 7, 13); //PLAZA ARAGON
            g.addNode("CIUDAD_AZTECA").addAttribute("xy", 7, 14); //CIUDAD AZTECA

            g.getNode("BUENA_VISTA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/buenavista.png');");
            g.getNode("LAGUNILLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/lagunilla.png');");
            g.getNode("TEPITO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/tepito.png');"); 
            g.getNode("RICARDO_FLORES_MAGON").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/floresmagon.png');"); 
            g.getNode("ROMERO_RUBIO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/romerorubio.png');"); 
            g.getNode("DEPORTIVO_OCEANIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/depoceania.png');"); 
            g.getNode("BOSQUE_ARAGON").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/bosquearagon.png');");
            g.getNode("VILLA_DE_ARAGON").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/VillaAragon.png');");
            g.getNode("NEZAHUALCOYOTL").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/neza.png');");
            g.getNode("IMPULSORA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/impulsora.png');");
            g.getNode("RIO_DE_LOS_REMEDIOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/rioremedios.png');");
            g.getNode("MUZQUIZ").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/muzquiz.png');");
            g.getNode("ECATEPEC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/ecatepec.png');");
            g.getNode("OLIMPICA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/olimpica.png');");
            g.getNode("PLAZA_ARAGON").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/plazaragon.png');");
            g.getNode("CIUDAD_AZTECA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/lineaB/cdazteca.png');");

            /***************LINEA 3 (AMARILLO MOSTAZA)***************/

            g.addNode("INDIOS_VERDES").addAttribute("xy", -3, 8);  //INDIOS VERDES
            g.addNode("DEPORTIVO_18_DE_MARZO").addAttribute("xy", -3, 7);  //DEPORTIVO 18 DE MARZO
            g.addNode("POTRERO").addAttribute("xy", -3, 6);  //POTRERO
            g.addNode("TLATELOLCO").addAttribute("xy", -5, 4);  //TLATELOLCO
            g.addNode("GUERRERO").addAttribute("xy", -5, 3);  //GUERRERO
            g.addNode("HIDALGO").addAttribute("xy", -5, 2);  //HIDALGO
            g.addNode("JUAREZ").addAttribute("xy", -5, 1);  //JUAREZ
            g.addNode("NIÑOS_HEROES").addAttribute("xy", -5, -1); //NIÑOS HEROES
            g.addNode("HOSPITAL_GENERAL").addAttribute("xy", -5, -2); //HOSPITAL GENERAL
            g.addNode("ETIOPIA").addAttribute("xy", -5, -4.25);//ETIOPIA
            g.addNode("EUGENIA").addAttribute("xy", -5, -5.5); //EUGENIA
            g.addNode("DIVISION_DEL_NORTE").addAttribute("xy", -5, -6.75);//DIVISION DEL NORTE
            g.addNode("ZAPATA").addAttribute("xy", -6, -7.75);//ZAPATA
            g.addNode("COYOACAN").addAttribute("xy", -7, -9);  //COYOACAN
            g.addNode("VIVEROS").addAttribute("xy", -7, -10); //VIVEROS
            g.addNode("M.A._QUEVEDO").addAttribute("xy", -7, -11); //M.A. QUEVEDO
            g.addNode("COPILCO").addAttribute("xy", -7, -12); //COPILCO
            g.addNode("UNIVERSIDAD").addAttribute("xy", -7, -13); //UNIVERSIDAD

            g.getNode("INDIOS_VERDES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/indiosverdes.png');");
            g.getNode("DEPORTIVO_18_DE_MARZO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/18marzo.png');");
            g.getNode("POTRERO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/potrero.png');"); 
            g.getNode("TLATELOLCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/tlatelolco.png');"); 
            g.getNode("GUERRERO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/guerrero.png');"); 
            g.getNode("HIDALGO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/hidalgo.png');"); 
            g.getNode("JUAREZ").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/juarez.png');");
            g.getNode("NIÑOS_HEROES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/ninosheroes.png');");
            g.getNode("HOSPITAL_GENERAL").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/hospitalgeneral.png');");
            g.getNode("ETIOPIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/etiopia-plaza.png');");
            g.getNode("EUGENIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/eugenia.png');");
            g.getNode("DIVISION_DEL_NORTE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/divisiondelnorte.png');");
            g.getNode("ZAPATA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/zapata.png');");
            g.getNode("COYOACAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/coyoacan.png');");
            g.getNode("VIVEROS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/viveros.png');");
            g.getNode("M.A._QUEVEDO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/maq.png');");
            g.getNode("COPILCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/copilco.png');");
            g.getNode("UNIVERSIDAD").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea3/universidad.png');");

            /***************LINEA 12 (CAFE CLARO)***************/

            g.addNode("MIXCOAC").addAttribute("xy", -10, -6.75); //MIXCOAC
            g.addNode("INSURGENTES_SUR").addAttribute("xy", -8.5, -6.75);//INSURGENTES SUR
            g.addNode("HOSPITAL_20_DE_NOVIEMBRE").addAttribute("xy", -7, -6.75);//HOSPITAL 20 DE NOVIEMBRE
            g.addNode("PARQUE_DE_LOS_VENADOS").addAttribute("xy", -5, -9);   //PARQUE DE LOS VENADOS
            g.addNode("EJE_CENTRAL").addAttribute("xy", -3.5, -9); //EJE CENTRAL
            g.addNode("ERMITA").addAttribute("xy", -2, -9); //ERMITA
            g.addNode("MEXICALTZINGO").addAttribute("xy", 0, -9);  //MEXICALTZINGO 
            g.addNode("CULHUACAN").addAttribute("xy", 2, -10); //CULHUACAN
            g.addNode("SAN_ANDRES_TOMATLAN").addAttribute("xy", 2, -11); //SAN ANDRES TOMATLAN
            g.addNode("LOMAS_LA_ESTRELLA").addAttribute("xy", 3, -12); //LOMAS ESTRELLA
            g.addNode("CALLE_11").addAttribute("xy", 4, -12); //CALLE 11
            g.addNode("PERIFERICO_ORIENTE").addAttribute("xy", 5, -12); //PERIFERICO ORIENTE
            g.addNode("TEZONCO").addAttribute("xy", 6, -12); //TEZONCO
            g.addNode("OLIVOS").addAttribute("xy", 7, -12); //OLIVOS
            g.addNode("NOPALERA").addAttribute("xy", 8, -12); //NOPALERA
            g.addNode("ZAPOTITLAN").addAttribute("xy", 9, -12); //ZAPOTITLAN
            g.addNode("TLALTENCO").addAttribute("xy", 10, -13);//TLALTENCO
            g.addNode("TLAHUAC").addAttribute("xy", 11, -14);//TLAHUAC

            g.getNode("MIXCOAC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/mixcoac.png');");
            g.getNode("INSURGENTES_SUR").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/insurgentessur.png');");
            g.getNode("HOSPITAL_20_DE_NOVIEMBRE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/20noviembre.png');"); 
            g.getNode("PARQUE_DE_LOS_VENADOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/parquevenados2.png');"); 
            g.getNode("EJE_CENTRAL").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/ejecentral2.png');"); 
            g.getNode("ERMITA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/ermita.png');"); 
            g.getNode("MEXICALTZINGO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/mexicaltzingo.png');");
            g.getNode("CULHUACAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/culhuacan.png');");
            g.getNode("SAN_ANDRES_TOMATLAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/tomatlan.png');");
            g.getNode("LOMAS_LA_ESTRELLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/lomasestrella.png');");
            g.getNode("CALLE_11").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/calle11.png');");
            g.getNode("PERIFERICO_ORIENTE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/perifericooriente.png');");
            g.getNode("TEZONCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/tezonco.png');");
            g.getNode("OLIVOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/olivos.png');");
            g.getNode("NOPALERA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/nopalera2.png');");
            g.getNode("ZAPOTITLAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/zapotitlan.png');");
            g.getNode("TLALTENCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/tlaltenco.png');");
            g.getNode("TLAHUAC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea12/tlahuac.png');");

            /***************LINEA 2 (AZUL MARINO)***************/

            g.addNode("ZOCALO").addAttribute("xy", -2, 1); //ZOCALO
            g.addNode("ALLENDE").addAttribute("xy", -3, 2); //ALLENDE
            g.addNode("REVOLUCION").addAttribute("xy", -6, 2); //REVOLUCION
            g.addNode("SAN_COSME").addAttribute("xy", -7, 2); //SAN COSME
            g.addNode("NORMAL").addAttribute("xy", -8, 2); //NORMAL
            g.addNode("COLEGIO_MILITAR").addAttribute("xy", -8.5, 2.5); //COLEGIO MILITAR
            g.addNode("POPOTLA").addAttribute("xy", -9, 3); //POPOTLA
            g.addNode("CUITLAHUAC").addAttribute("xy", -10, 3);//CUITLAHUAC
            g.addNode("TACUBA").addAttribute("xy", -11, 3);//TACUBA
            g.addNode("PANTEONES").addAttribute("xy", -12, 3);//PANTEONES
            g.addNode("4_CAMINOS").addAttribute("xy", -13, 3);//CUATRO CAMINOS
            g.addNode("SAN_ANTONIO_ABAD").addAttribute("xy", -2, -1.5);//SAN ANTONIO ABAD
            g.addNode("VIADUCTO").addAttribute("xy", -2, -4);//VIADUCTO
            g.addNode("XOLA").addAttribute("xy", -2, -5);//XOLA
            g.addNode("VILLA_DE_CORTES").addAttribute("xy", -2, -6);//VILLA DE CORTES
            g.addNode("NATIVITAS").addAttribute("xy", -2, -7);//NATIVITAS
            g.addNode("PORTALES").addAttribute("xy", -2, -8);//PORTALES
            g.addNode("GENERAL_ANAYA").addAttribute("xy", -2, -10);//GENERAL ANAYA
            g.addNode("TASQUEÑA").addAttribute("xy", -2, -11);//TASQUEÑA (TAXQUEÑA)

            g.getNode("ZOCALO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/zocalo.png');");
            g.getNode("ALLENDE").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/allende.png');");
            g.getNode("REVOLUCION").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/revolucion.png');"); 
            g.getNode("SAN_COSME").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/sancosme.png');"); 
            g.getNode("NORMAL").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/normal.png');"); 
            g.getNode("COLEGIO_MILITAR").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/colegio-militar.png');"); 
            g.getNode("POPOTLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/popotla.png');");
            g.getNode("CUITLAHUAC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/cuitlahuac.png');");
            g.getNode("TACUBA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/tacuba.png');");
            g.getNode("PANTEONES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/panteones.png');");
            g.getNode("4_CAMINOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/cuatrocaminos.png');");
            g.getNode("SAN_ANTONIO_ABAD").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/sanantonioabad.png');");
            g.getNode("VIADUCTO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/viaducto.png');");
            g.getNode("XOLA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/xola.png');");
            g.getNode("VILLA_DE_CORTES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/villadecortes.png');");
            g.getNode("NATIVITAS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/nativitas.png');");
            g.getNode("PORTALES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/portales.png');");
            g.getNode("GENERAL_ANAYA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/generalanaya.png');");
            g.getNode("TASQUEÑA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea2/tasquena.png');"); 

            /***************LINEA 7 (NARANJA)***************/

            g.addNode("BARRANCA_DEL_MUERTO").addAttribute("xy", -10, -9);  //BARRANCA DEL MUERTO
            g.addNode("SAN_ANTONIO").addAttribute("xy", -10, -5.5);//SAN ANTONIO
            g.addNode("SAN_PEDRO_DE_LOS_PINOS").addAttribute("xy", -10, -4.25);//SAN PEDRO DE LOS PINOS
            g.addNode("CONSTITUYENTES").addAttribute("xy", -11, -1.75);//CONSTITUYENTES
            g.addNode("AUDITORIO").addAttribute("xy", -11, -.5);  //AUDITORIO
            g.addNode("POLANCO").addAttribute("xy", -11, .75);  //POLANCO
            g.addNode("SAN_JOAQUIN").addAttribute("xy", -11, 1.75); //SAN JOAQUIN
            g.addNode("REFINERIA").addAttribute("xy", -11, 4);  //REFINERIA
            g.addNode("CAMARONES").addAttribute("xy", -11, 5);  //CAMARONES
            g.addNode("AQUILES_SERDAN").addAttribute("xy", -11, 6);  //AQUILES SERDAN

            g.getNode("BARRANCA_DEL_MUERTO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/barrancadelmuerto.png');");
            g.getNode("SAN_ANTONIO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/sanantonio.png');");
            g.getNode("SAN_PEDRO_DE_LOS_PINOS").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/sanpedro.png');"); 
            g.getNode("CONSTITUYENTES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/constituyentes.png');"); 
            g.getNode("AUDITORIO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/auditorio.png');"); 
            g.getNode("POLANCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/polanco.png');"); 
            g.getNode("SAN_JOAQUIN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/sanjoaquin.png');");
            g.getNode("REFINERIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/refineria.png');");
            g.getNode("CAMARONES").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/camarones.png');");
            g.getNode("AQUILES_SERDAN").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea7/aquileserdan.png');");

            /***************LINEA 6 (ROJA)***************/

            g.addNode("MARTIN_CARRERA").addAttribute("xy", 0, 7); //MARTIN CARRERA
            g.addNode("LA_VILLA_BASILICA").addAttribute("xy", -1.5, 7);//LA VILLA BASILICA
            g.addNode("LINDA_VISTA").addAttribute("xy", -4, 7); //LINDAVISTA
            g.addNode("VALLEJO").addAttribute("xy", -6, 7); //VALLEJO
            g.addNode("NORTE_45").addAttribute("xy", -7, 7); //NORTE 45
            g.addNode("FERRERIA").addAttribute("xy", -8, 7); //FERRERIA
            g.addNode("AZCAPOTZALCO").addAttribute("xy", -9, 7); //AZCAPOTZALCO
            g.addNode("TEZOZOMOC").addAttribute("xy", -10, 7);//TEZOZOMOC
            g.addNode("EL_ROSARIO").addAttribute("xy", -11, 7);//EL ROSARIO   

            g.getNode("MARTIN_CARRERA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/martincarrera.png');");
            g.getNode("LA_VILLA_BASILICA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/BASILICA.png');");
            g.getNode("LINDA_VISTA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/lindavista.png');"); 
            g.getNode("VALLEJO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/vallejo.png');"); 
            g.getNode("NORTE_45").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/norte45.png');"); 
            g.getNode("FERRERIA").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/arenacdmexico.png');"); 
            g.getNode("AZCAPOTZALCO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/azcapotzalco.png');");
            g.getNode("TEZOZOMOC").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/tezozomoc.png');");
            g.getNode("EL_ROSARIO").addAttribute("ui.style", "fill-mode: image-scaled; fill-image: url('src/metrocdmx/fonts/linea6/rosario.png');");

            /************************ EDGES ***************************/

            /********************LINEA 1*********************/

            g.addEdge("CA_SL", "CANDELARIA", "SAN_LAZARO").addAttribute("length", 1);
            g.addEdge("SL_MO", "SAN_LAZARO", "MOCTEZUMA").addAttribute("length", 1);
            g.addEdge("MO_BB", "MOCTEZUMA", "BALBUENA").addAttribute("length", 1);
            g.addEdge("BB_BP", "BALBUENA", "BOULEVARD_PUERTO_AEREO").addAttribute("length", 1);
            g.addEdge("BP_GO", "BOULEVARD_PUERTO_AEREO", "GOMEZ_FARIAS").addAttribute("length", 1);
            g.addEdge("GO_ZA", "GOMEZ_FARIAS", "ZARAGOZA").addAttribute("length", 1);
            g.addEdge("ZA_PA", "ZARAGOZA", "PANTITLAN").addAttribute("length", 1);
            g.addEdge("CA_ME", "CANDELARIA", "MERCED").addAttribute("length", 1);
            g.addEdge("ME_PS", "MERCED", "PINO_SUAREZ").addAttribute("length", 1);
            g.addEdge("PS_IC", "PINO_SUAREZ", "ISABEL_LA_CATOLICA").addAttribute("length", 1);
            g.addEdge("IC_SD", "ISABEL_LA_CATOLICA", "SALTO_DEL_AGUA").addAttribute("length", 1);
            g.addEdge("SA_BA", "SALTO_DEL_AGUA", "BALDERAS").addAttribute("length", 1);
            g.addEdge("BA_CU", "BALDERAS", "CUAUHTEMOC").addAttribute("length", 1);
            g.addEdge("CU_IN", "CUAUHTEMOC", "INSURGENTES").addAttribute("length", 1);
            g.addEdge("IN_SE", "INSURGENTES", "SEVILLA").addAttribute("length", 1);
            g.addEdge("SE_CH", "SEVILLA", "CHAPULTEPEC").addAttribute("length", 1);
            g.addEdge("CH_JU", "CHAPULTEPEC", "JUANACATLAN").addAttribute("length", 1);
            g.addEdge("JU_TA", "JUANACATLAN", "TACUBAYA").addAttribute("length", 1);
            g.addEdge("TA_OB", "TACUBAYA", "OBSERVATORIO").addAttribute("length", 1);


            g.getEdge("CA_SL").addAttribute("ui.class", "line1");
            g.getEdge("SL_MO").addAttribute("ui.class", "line1");
            g.getEdge("MO_BB").addAttribute("ui.class", "line1");
            g.getEdge("BB_BP").addAttribute("ui.class", "line1");
            g.getEdge("BP_GO").addAttribute("ui.class", "line1");
            g.getEdge("GO_ZA").addAttribute("ui.class", "line1");
            g.getEdge("ZA_PA").addAttribute("ui.class", "line1");
            g.getEdge("CA_ME").addAttribute("ui.class", "line1");
            g.getEdge("ME_PS").addAttribute("ui.class", "line1");
            g.getEdge("PS_IC").addAttribute("ui.class", "line1");
            g.getEdge("IC_SD").addAttribute("ui.class", "line1");
            g.getEdge("SA_BA").addAttribute("ui.class", "line1");
            g.getEdge("BA_CU").addAttribute("ui.class", "line1");
            g.getEdge("CU_IN").addAttribute("ui.class", "line1");
            g.getEdge("IN_SE").addAttribute("ui.class", "line1");
            g.getEdge("SE_CH").addAttribute("ui.class", "line1");
            g.getEdge("CH_JU").addAttribute("ui.class", "line1");
            g.getEdge("JU_TA").addAttribute("ui.class", "line1");
            g.getEdge("TA_OB").addAttribute("ui.class", "line1");
            g.getEdge("CA_SL").addAttribute("ui.class", "line1");

            /********************LINEA 4*********************/

            g.addEdge("CA_FS", "CANDELARIA", "FRAY_SERVANDO").addAttribute("length", 1);
            g.addEdge("FS_JA", "FRAY_SERVANDO", "JAMAICA").addAttribute("length", 1);
            g.addEdge("JA_SN", "JAMAICA", "SANTA_ANITA").addAttribute("length", 1);
            g.addEdge("CA_MO", "CANDELARIA", "MORELOS").addAttribute("length", 1);
            g.addEdge("MO_CN", "MORELOS", "CANAL_DEL_NORTE").addAttribute("length", 1);
            g.addEdge("CN_CO", "CANAL_DEL_NORTE", "CONSULADO").addAttribute("length", 1);
            g.addEdge("CO_BO", "CONSULADO", "BONDOJITO").addAttribute("length", 1);
            g.addEdge("BO_TA", "BONDOJITO", "TALISMAN").addAttribute("length", 1);
            g.addEdge("TA_MC", "TALISMAN", "MARTIN_CARRERA").addAttribute("length", 1);

            g.getEdge("CA_FS").addAttribute("ui.class", "line4");
            g.getEdge("FS_JA").addAttribute("ui.class", "line4");
            g.getEdge("JA_SN").addAttribute("ui.class", "line4");
            g.getEdge("CA_MO").addAttribute("ui.class", "line4");
            g.getEdge("MO_CN").addAttribute("ui.class", "line4");
            g.getEdge("CN_CO").addAttribute("ui.class", "line4");
            g.getEdge("CO_BO").addAttribute("ui.class", "line4");
            g.getEdge("BO_TA").addAttribute("ui.class", "line4");
            g.getEdge("TA_MC").addAttribute("ui.class", "line4");

            /********************LINEA 5*********************/

            g.addEdge("PO_IP", "POLITECNICO", "INSTITUTO_DEL_PETROLEO").addAttribute("length", 1);
            g.addEdge("IP_AN", "INSTITUTO_DEL_PETROLEO", "AUTOBUSES_DEL_NORTE").addAttribute("length", 1);
            g.addEdge("AN_LR", "AUTOBUSES_DEL_NORTE", "LA_RAZA").addAttribute("length", 1);
            g.addEdge("LR_MI", "LA_RAZA", "MISTERIOS").addAttribute("length", 1);
            g.addEdge("MI_VG", "MISTERIOS", "VALLE_GOMEZ").addAttribute("length", 1);
            g.addEdge("VG_CO", "VALLE_GOMEZ", "CONSULADO").addAttribute("length", 1);
            g.addEdge("CO_EM", "CONSULADO", "EDUARDO_MOLINA").addAttribute("length", 1);
            g.addEdge("EM_AR", "EDUARDO_MOLINA", "ARAGON").addAttribute("length", 1);
            g.addEdge("AR_OC", "ARAGON", "OCEANIA").addAttribute("length", 1);
            g.addEdge("OC_TA", "OCEANIA", "TERMINAL_AEREA").addAttribute("length", 1);
            g.addEdge("TA_HA", "TERMINAL_AEREA", "HANGARES").addAttribute("length", 1);
            g.addEdge("HA_PA", "HANGARES", "PANTITLAN").addAttribute("length", 1);

            g.getEdge("PO_IP").addAttribute("ui.class", "line5");
            g.getEdge("IP_AN").addAttribute("ui.class", "line5");
            g.getEdge("AN_LR").addAttribute("ui.class", "line5");
            g.getEdge("LR_MI").addAttribute("ui.class", "line5");
            g.getEdge("MI_VG").addAttribute("ui.class", "line5");
            g.getEdge("VG_CO").addAttribute("ui.class", "line5");
            g.getEdge("CO_EM").addAttribute("ui.class", "line5");
            g.getEdge("EM_AR").addAttribute("ui.class", "line5");
            g.getEdge("AR_OC").addAttribute("ui.class", "line5");
            g.getEdge("OC_TA").addAttribute("ui.class", "line5");
            g.getEdge("TA_HA").addAttribute("ui.class", "line5");
            g.getEdge("HA_PA").addAttribute("ui.class", "line5");


            /********************LINEA 9*********************/

            g.addEdge("TA_PA", "TACUBAYA", "PATRIOTISMO").addAttribute("length", 1);
            g.addEdge("PA_CH", "PATRIOTISMO", "CHILPANCINGO").addAttribute("length", 1);
            g.addEdge("CH_CM", "CHILPANCINGO", "CENTRO_MEDICO").addAttribute("length", 1);
            g.addEdge("CM_LC", "CENTRO_MEDICO", "LAZARO_CARDENAS").addAttribute("length", 1);
            g.addEdge("LC_CH", "LAZARO_CARDENAS", "CHABACANO").addAttribute("length", 1);
            g.addEdge("CH_JA", "CHABACANO", "JAMAICA").addAttribute("length", 1);
            g.addEdge("JA_MI", "JAMAICA", "MIXIUHCA").addAttribute("length", 1);
            g.addEdge("MI_VE", "MIXIUHCA", "VELODROMO").addAttribute("length", 1);
            g.addEdge("VE_CD", "VELODROMO", "CIUDAD_DEPORTIVA").addAttribute("length", 1);
            g.addEdge("CD_PU", "CIUDAD_DEPORTIVA", "PUEBLA").addAttribute("length", 1);
            g.addEdge("PU_PA", "PUEBLA", "PANTITLAN").addAttribute("length", 1);

            g.getEdge("TA_PA").addAttribute("ui.class", "line9");
            g.getEdge("PA_CH").addAttribute("ui.class", "line9");
            g.getEdge("CH_CM").addAttribute("ui.class", "line9");
            g.getEdge("CM_LC").addAttribute("ui.class", "line9");
            g.getEdge("LC_CH").addAttribute("ui.class", "line9");
            g.getEdge("CH_JA").addAttribute("ui.class", "line9");
            g.getEdge("JA_MI").addAttribute("ui.class", "line9");
            g.getEdge("MI_VE").addAttribute("ui.class", "line9");
            g.getEdge("VE_CD").addAttribute("ui.class", "line9");
            g.getEdge("CD_PU").addAttribute("ui.class", "line9");
            g.getEdge("PU_PA").addAttribute("ui.class", "line9");

            /********************LINEA A*********************/

            g.addEdge("PA_AO", "PANTITLAN", "AGRICOLA_ORIENTAL").addAttribute("length", 1);
            g.addEdge("AO_CJ", "AGRICOLA_ORIENTAL", "CANAL_DE_SAN_JUAN").addAttribute("length", 1);
            g.addEdge("CJ_TE", "CANAL_DE_SAN_JUAN", "TEPALCATES").addAttribute("length", 1);
            g.addEdge("TE_GU", "TEPALCATES", "GUELATAO").addAttribute("length", 1);
            g.addEdge("GU_PE", "GUELATAO", "PEÑON_VIEJO").addAttribute("length", 1);
            g.addEdge("PE_AC", "PEÑON_VIEJO", "ACATITLA").addAttribute("length", 1);
            g.addEdge("AC_SM", "ACATITLA", "SANTA_MARTHA").addAttribute("length", 1);
            g.addEdge("SM_LR", "SANTA_MARTHA", "LOS_REYES").addAttribute("length", 1);
            g.addEdge("LR_LP", "LOS_REYES", "LA_PAZ").addAttribute("length", 1);

            g.getEdge("PA_AO").addAttribute("ui.class", "lineA");
            g.getEdge("AO_CJ").addAttribute("ui.class", "lineA");
            g.getEdge("CJ_TE").addAttribute("ui.class", "lineA");
            g.getEdge("TE_GU").addAttribute("ui.class", "lineA");
            g.getEdge("GU_PE").addAttribute("ui.class", "lineA");
            g.getEdge("PE_AC").addAttribute("ui.class", "lineA");
            g.getEdge("AC_SM").addAttribute("ui.class", "lineA");
            g.getEdge("SM_LR").addAttribute("ui.class", "lineA");
            g.getEdge("LR_LP").addAttribute("ui.class", "lineA");

            /********************LINEA 8*********************/

            g.addEdge("GA_BA", "GARIBALDI", "BELLAS_ARTES").addAttribute("length", 1);
            g.addEdge("BA_SJ", "BELLAS_ARTES", "SAN_JUAN_DE_LETRAN").addAttribute("length", 1);
            g.addEdge("SJ_SA", "SAN_JUAN_DE_LETRAN", "SALTO_DEL_AGUA").addAttribute("length", 1);
            g.addEdge("SA_DO", "SALTO_DEL_AGUA", "DOCTORES").addAttribute("length", 1);
            g.addEdge("DO_OB", "DOCTORES", "OBRERA").addAttribute("length", 1);
            g.addEdge("OB_CH", "OBRERA", "CHABACANO").addAttribute("length", 1);
            g.addEdge("CH_LV", "CHABACANO", "LA_VIGA").addAttribute("length", 1);
            g.addEdge("LV_SA", "LA_VIGA", "SANTA_ANITA").addAttribute("length", 1);
            g.addEdge("SA_CO", "SANTA_ANITA", "COYUYA").addAttribute("length", 1);
            g.addEdge("CO_IZ", "COYUYA", "IZTACALCO").addAttribute("length", 1);
            g.addEdge("IZ_AP", "IZTACALCO", "APATLACO").addAttribute("length", 1);
            g.addEdge("AP_AC", "APATLACO", "ACULCO").addAttribute("length", 1);
            g.addEdge("AC_E2", "ACULCO", "ESCUADRON_201").addAttribute("length", 1);
            g.addEdge("E2_AT", "ESCUADRON_201", "ATLALILCO").addAttribute("length", 1);
            g.addEdge("AT_IZ", "ATLALILCO", "IZTAPALAPA").addAttribute("length", 1);
            g.addEdge("IZ_CE", "IZTAPALAPA", "CERRO_DE_LA_ESTRELLA").addAttribute("length", 1);
            g.addEdge("CE_UA", "CERRO_DE_LA_ESTRELLA", "UAM-1").addAttribute("length", 1);
            g.addEdge("UA_19", "UAM-1", "CONSTITUCION_DE_1917").addAttribute("length", 1);

            g.getEdge("GA_BA").addAttribute("ui.class", "line8");
            g.getEdge("BA_SJ").addAttribute("ui.class", "line8");
            g.getEdge("SJ_SA").addAttribute("ui.class", "line8");
            g.getEdge("SA_DO").addAttribute("ui.class", "line8");
            g.getEdge("DO_OB").addAttribute("ui.class", "line8");
            g.getEdge("OB_CH").addAttribute("ui.class", "line8");
            g.getEdge("CH_LV").addAttribute("ui.class", "line8");
            g.getEdge("LV_SA").addAttribute("ui.class", "line8");
            g.getEdge("SA_CO").addAttribute("ui.class", "line8");
            g.getEdge("CO_IZ").addAttribute("ui.class", "line8");
            g.getEdge("IZ_AP").addAttribute("ui.class", "line8");
            g.getEdge("AP_AC").addAttribute("ui.class", "line8");
            g.getEdge("AC_E2").addAttribute("ui.class", "line8");
            g.getEdge("E2_AT").addAttribute("ui.class", "line8");
            g.getEdge("AT_IZ").addAttribute("ui.class", "line8");
            g.getEdge("IZ_CE").addAttribute("ui.class", "line8");
            g.getEdge("CE_UA").addAttribute("ui.class", "line8");
            g.getEdge("UA_19").addAttribute("ui.class", "line8");

            /********************LINEA B*********************/

            g.addEdge("BU_GR", "BUENA_VISTA", "GUERRERO").addAttribute("length", 1);
            g.addEdge("GR_GA", "GUERRERO", "GARIBALDI").addAttribute("length", 1);
            g.addEdge("GA_LA", "GARIBALDI", "LAGUNILLA").addAttribute("length", 1);
            g.addEdge("LA_TP", "LAGUNILLA", "TEPITO").addAttribute("length", 1);
            g.addEdge("TP_MO", "TEPITO", "MORELOS").addAttribute("length", 1);
            g.addEdge("MO_SN", "MORELOS", "SAN_LAZARO").addAttribute("length", 1);
            g.addEdge("SN_RF", "SAN_LAZARO", "RICARDO_FLORES_MAGON").addAttribute("length", 1);
            g.addEdge("RF_RR", "RICARDO_FLORES_MAGON", "ROMERO_RUBIO").addAttribute("length", 1);
            g.addEdge("RR_OC", "ROMERO_RUBIO", "OCEANIA").addAttribute("length", 1);
            g.addEdge("OC_DO", "OCEANIA", "DEPORTIVO_OCEANIA").addAttribute("length", 1);
            g.addEdge("DO_BO", "DEPORTIVO_OCEANIA", "BOSQUE_ARAGON").addAttribute("length", 1);
            g.addEdge("BO_VA", "BOSQUE_ARAGON", "VILLA_DE_ARAGON").addAttribute("length", 1);
            g.addEdge("VA_NE", "VILLA_DE_ARAGON", "NEZAHUALCOYOTL").addAttribute("length", 1);
            g.addEdge("NE_IM", "NEZAHUALCOYOTL", "IMPULSORA").addAttribute("length", 1);
            g.addEdge("IM_RD", "IMPULSORA", "RIO_DE_LOS_REMEDIOS").addAttribute("length", 1);
            g.addEdge("RD_MU", "RIO_DE_LOS_REMEDIOS", "MUZQUIZ").addAttribute("length", 1);
            g.addEdge("MU_EC", "MUZQUIZ", "ECATEPEC").addAttribute("length", 1);
            g.addEdge("EC_OL", "ECATEPEC", "OLIMPICA").addAttribute("length", 1);
            g.addEdge("OL_PZ", "OLIMPICA", "PLAZA_ARAGON").addAttribute("length", 1);
            g.addEdge("PZ_CA", "PLAZA_ARAGON", "CIUDAD_AZTECA").addAttribute("length", 1);


            g.getEdge("BU_GR").addAttribute("ui.class", "lineB");
            g.getEdge("GR_GA").addAttribute("ui.class", "lineB");
            g.getEdge("GA_LA").addAttribute("ui.class", "lineB");
            g.getEdge("LA_TP").addAttribute("ui.class", "lineB");
            g.getEdge("TP_MO").addAttribute("ui.class", "lineB");
            g.getEdge("MO_SN").addAttribute("ui.class", "lineB");
            g.getEdge("SN_RF").addAttribute("ui.class", "lineB");
            g.getEdge("RF_RR").addAttribute("ui.class", "lineB");
            g.getEdge("RR_OC").addAttribute("ui.class", "lineB");
            g.getEdge("OC_DO").addAttribute("ui.class", "lineB");
            g.getEdge("DO_BO").addAttribute("ui.class", "lineB");
            g.getEdge("BO_VA").addAttribute("ui.class", "lineB");
            g.getEdge("VA_NE").addAttribute("ui.class", "lineB");
            g.getEdge("NE_IM").addAttribute("ui.class", "lineB");
            g.getEdge("IM_RD").addAttribute("ui.class", "lineB");
            g.getEdge("RD_MU").addAttribute("ui.class", "lineB");
            g.getEdge("MU_EC").addAttribute("ui.class", "lineB");
            g.getEdge("EC_OL").addAttribute("ui.class", "lineB");
            g.getEdge("OL_PZ").addAttribute("ui.class", "lineB");
            g.getEdge("PZ_CA").addAttribute("ui.class", "lineB");

            /********************LINEA 3*********************/

            g.addEdge("IV_D1", "INDIOS_VERDES", "DEPORTIVO_18_DE_MARZO").addAttribute("length", 1);
            g.addEdge("D1_PO", "DEPORTIVO_18_DE_MARZO", "POTRERO").addAttribute("length", 1);
            g.addEdge("PO_LR", "POTRERO", "LA_RAZA").addAttribute("length", 1);
            g.addEdge("LR_TL", "LA_RAZA", "TLATELOLCO").addAttribute("length", 1);
            g.addEdge("TL_GR", "TLATELOLCO", "GUERRERO").addAttribute("length", 1);
            g.addEdge("GR_HI", "GUERRERO", "HIDALGO").addAttribute("length", 1);
            g.addEdge("HI_JZ", "HIDALGO", "JUAREZ").addAttribute("length", 1);
            g.addEdge("JZ_BA", "JUAREZ", "BALDERAS").addAttribute("length", 1);
            g.addEdge("BA_NH", "BALDERAS", "NIÑOS_HEROES").addAttribute("length", 1);
            g.addEdge("NH_HO", "NIÑOS_HEROES", "HOSPITAL_GENERAL").addAttribute("length", 1);
            g.addEdge("HO_CM", "HOSPITAL_GENERAL", "CENTRO_MEDICO").addAttribute("length", 1);
            g.addEdge("CM_ET", "CENTRO_MEDICO", "ETIOPIA").addAttribute("length", 1);
            g.addEdge("ET_EU", "ETIOPIA", "EUGENIA").addAttribute("length", 1);
            g.addEdge("EU_DN", "EUGENIA", "DIVISION_DEL_NORTE").addAttribute("length", 1);
            g.addEdge("DN_ZA", "DIVISION_DEL_NORTE", "ZAPATA").addAttribute("length", 1);
            g.addEdge("ZA_CO", "ZAPATA", "COYOACAN").addAttribute("length", 1);
            g.addEdge("CO_VI", "COYOACAN", "VIVEROS").addAttribute("length", 1);
            g.addEdge("VI_MQ", "VIVEROS", "M.A._QUEVEDO").addAttribute("length", 1);
            g.addEdge("MQ_CO", "M.A._QUEVEDO", "COPILCO").addAttribute("length", 1);
            g.addEdge("CO_UN", "COPILCO", "UNIVERSIDAD").addAttribute("length", 1);

            g.getEdge("IV_D1").addAttribute("ui.class", "line3");
            g.getEdge("D1_PO").addAttribute("ui.class", "line3");
            g.getEdge("PO_LR").addAttribute("ui.class", "line3");
            g.getEdge("LR_TL").addAttribute("ui.class", "line3");
            g.getEdge("TL_GR").addAttribute("ui.class", "line3");
            g.getEdge("GR_HI").addAttribute("ui.class", "line3");
            g.getEdge("HI_JZ").addAttribute("ui.class", "line3");
            g.getEdge("JZ_BA").addAttribute("ui.class", "line3");
            g.getEdge("BA_NH").addAttribute("ui.class", "line3");
            g.getEdge("NH_HO").addAttribute("ui.class", "line3");
            g.getEdge("HO_CM").addAttribute("ui.class", "line3");
            g.getEdge("CM_ET").addAttribute("ui.class", "line3");
            g.getEdge("ET_EU").addAttribute("ui.class", "line3");
            g.getEdge("EU_DN").addAttribute("ui.class", "line3");
            g.getEdge("DN_ZA").addAttribute("ui.class", "line3");
            g.getEdge("ZA_CO").addAttribute("ui.class", "line3");
            g.getEdge("CO_VI").addAttribute("ui.class", "line3");
            g.getEdge("VI_MQ").addAttribute("ui.class", "line3");
            g.getEdge("MQ_CO").addAttribute("ui.class", "line3");
            g.getEdge("CO_UN").addAttribute("ui.class", "line3");

            /********************LINEA 12*********************/

            g.addEdge("MX_IR", "MIXCOAC", "INSURGENTES_SUR").addAttribute("length", 1);
            g.addEdge("IR_H2", "INSURGENTES_SUR", "HOSPITAL_20_DE_NOVIEMBRE").addAttribute("length", 1);
            g.addEdge("H2_ZA", "HOSPITAL_20_DE_NOVIEMBRE", "ZAPATA").addAttribute("length", 1);
            g.addEdge("ZA_PV", "ZAPATA", "PARQUE_DE_LOS_VENADOS").addAttribute("length", 1);
            g.addEdge("PV_EJ", "PARQUE_DE_LOS_VENADOS", "EJE_CENTRAL").addAttribute("length", 1);
            g.addEdge("EJ_ER", "EJE_CENTRAL", "ERMITA").addAttribute("length", 1);
            g.addEdge("ER_ME", "ERMITA", "MEXICALTZINGO").addAttribute("length", 1);
            g.addEdge("ME_AT", "MEXICALTZINGO", "ATLALILCO").addAttribute("length", 1);
            g.addEdge("AT_CU", "ATLALILCO", "CULHUACAN").addAttribute("length", 1);
            g.addEdge("CU_ST", "CULHUACAN", "SAN_ANDRES_TOMATLAN").addAttribute("length", 1);
            g.addEdge("ST_LE", "SAN_ANDRES_TOMATLAN", "LOMAS_LA_ESTRELLA").addAttribute("length", 1);
            g.addEdge("LE_CA", "LOMAS_LA_ESTRELLA", "CALLE_11").addAttribute("length", 1);
            g.addEdge("CA_PO", "CALLE_11", "PERIFERICO_ORIENTE").addAttribute("length", 1);
            g.addEdge("PO_TZ", "PERIFERICO_ORIENTE", "TEZONCO").addAttribute("length", 1);
            g.addEdge("TZ_OL", "TEZONCO", "OLIVOS").addAttribute("length", 1);
            g.addEdge("OL_NO", "OLIVOS", "NOPALERA").addAttribute("length", 1);
            g.addEdge("NO_ZP", "NOPALERA", "ZAPOTITLAN").addAttribute("length", 1);
            g.addEdge("ZP_TL", "ZAPOTITLAN", "TLALTENCO").addAttribute("length", 1);
            g.addEdge("TL_TL", "TLALTENCO", "TLAHUAC").addAttribute("length", 1);

            g.getEdge("MX_IR").addAttribute("ui.class", "line12");
            g.getEdge("IR_H2").addAttribute("ui.class", "line12");
            g.getEdge("H2_ZA").addAttribute("ui.class", "line12");
            g.getEdge("ZA_PV").addAttribute("ui.class", "line12");
            g.getEdge("PV_EJ").addAttribute("ui.class", "line12");
            g.getEdge("EJ_ER").addAttribute("ui.class", "line12");
            g.getEdge("ER_ME").addAttribute("ui.class", "line12");
            g.getEdge("ME_AT").addAttribute("ui.class", "line12");
            g.getEdge("AT_CU").addAttribute("ui.class", "line12");
            g.getEdge("CU_ST").addAttribute("ui.class", "line12");
            g.getEdge("ST_LE").addAttribute("ui.class", "line12");
            g.getEdge("LE_CA").addAttribute("ui.class", "line12");
            g.getEdge("CA_PO").addAttribute("ui.class", "line12");
            g.getEdge("PO_TZ").addAttribute("ui.class", "line12");
            g.getEdge("TZ_OL").addAttribute("ui.class", "line12");
            g.getEdge("OL_NO").addAttribute("ui.class", "line12");
            g.getEdge("NO_ZP").addAttribute("ui.class", "line12");
            g.getEdge("ZP_TL").addAttribute("ui.class", "line12");
            g.getEdge("TL_TL").addAttribute("ui.class", "line12");

            /********************LINEA 2*********************/

            g.addEdge("4C_PA", "4_CAMINOS", "PANTEONES").addAttribute("length", 1);
            g.addEdge("PA_TA", "PANTEONES", "TACUBA").addAttribute("length", 1);
            g.addEdge("TA_CU", "TACUBA", "CUITLAHUAC").addAttribute("length", 1);
            g.addEdge("CU_PO", "CUITLAHUAC", "POPOTLA").addAttribute("length", 1);
            g.addEdge("PO_CM", "POPOTLA", "COLEGIO_MILITAR").addAttribute("length", 1);
            g.addEdge("CM_NO", "COLEGIO_MILITAR", "NORMAL").addAttribute("length", 1);
            g.addEdge("NO_SC", "NORMAL", "SAN_COSME").addAttribute("length", 1);
            g.addEdge("SN_RE", "SAN_COSME", "REVOLUCION").addAttribute("length", 1);
            g.addEdge("RE_HI", "REVOLUCION", "HIDALGO").addAttribute("length", 1);
            g.addEdge("HI_BA", "HIDALGO", "BELLAS_ARTES").addAttribute("length", 1);
            g.addEdge("BA_AL", "BELLAS_ARTES", "ALLENDE").addAttribute("length", 1);
            g.addEdge("AL_ZO", "ALLENDE", "ZOCALO").addAttribute("length", 1);
            g.addEdge("ZO_PS", "ZOCALO", "PINO_SUAREZ").addAttribute("length", 1);
            g.addEdge("PS_SA", "PINO_SUAREZ", "SAN_ANTONIO_ABAD").addAttribute("length", 1);
            g.addEdge("SA_CH", "SAN_ANTONIO_ABAD", "CHABACANO").addAttribute("length", 1);
            g.addEdge("CH_VI", "CHABACANO", "VIADUCTO").addAttribute("length", 1);
            g.addEdge("VI_XO", "VIADUCTO", "XOLA").addAttribute("length", 1);
            g.addEdge("XO_VI", "XOLA", "VILLA_DE_CORTES").addAttribute("length", 1);
            g.addEdge("VI_NA", "VILLA_DE_CORTES", "NATIVITAS").addAttribute("length", 1);
            g.addEdge("NA_PE", "NATIVITAS", "PORTALES").addAttribute("length", 1);
            g.addEdge("PE_GN", "PORTALES", "GENERAL_ANAYA").addAttribute("length", 1);
            g.addEdge("GN_TÑ", "GENERAL_ANAYA", "TASQUEÑA").addAttribute("length", 1);

            g.getEdge("4C_PA").addAttribute("ui.class", "line2");
            g.getEdge("PA_TA").addAttribute("ui.class", "line2");
            g.getEdge("TA_CU").addAttribute("ui.class", "line2");
            g.getEdge("CU_PO").addAttribute("ui.class", "line2");
            g.getEdge("PO_CM").addAttribute("ui.class", "line2");
            g.getEdge("CM_NO").addAttribute("ui.class", "line2");
            g.getEdge("NO_SC").addAttribute("ui.class", "line2");
            g.getEdge("SN_RE").addAttribute("ui.class", "line2");
            g.getEdge("RE_HI").addAttribute("ui.class", "line2");
            g.getEdge("HI_BA").addAttribute("ui.class", "line2");
            g.getEdge("BA_AL").addAttribute("ui.class", "line2");
            g.getEdge("AL_ZO").addAttribute("ui.class", "line2");
            g.getEdge("ZO_PS").addAttribute("ui.class", "line2");
            g.getEdge("PS_SA").addAttribute("ui.class", "line2");
            g.getEdge("SA_CH").addAttribute("ui.class", "line2");
            g.getEdge("CH_VI").addAttribute("ui.class", "line2");
            g.getEdge("VI_XO").addAttribute("ui.class", "line2");
            g.getEdge("XO_VI").addAttribute("ui.class", "line2");
            g.getEdge("VI_NA").addAttribute("ui.class", "line2");
            g.getEdge("NA_PE").addAttribute("ui.class", "line2");                
            g.getEdge("PE_GN").addAttribute("ui.class", "line2");
            g.getEdge("GN_TÑ").addAttribute("ui.class", "line2");

            /********************LINEA 7*********************/

            g.addEdge("BM_MX", "BARRANCA_DEL_MUERTO", "MIXCOAC").addAttribute("length", 1);
            g.addEdge("MX_SA", "MIXCOAC", "SAN_ANTONIO").addAttribute("length", 1);
            g.addEdge("SA_SP", "SAN_ANTONIO", "SAN_PEDRO_DE_LOS_PINOS").addAttribute("length", 1);
            g.addEdge("SP_TA", "SAN_PEDRO_DE_LOS_PINOS", "TACUBAYA").addAttribute("length", 1);
            g.addEdge("TA_CY", "TACUBAYA", "CONSTITUYENTES").addAttribute("length", 1);
            g.addEdge("CY_AU", "CONSTITUYENTES", "AUDITORIO").addAttribute("length", 1);
            g.addEdge("AU_PC", "AUDITORIO", "POLANCO").addAttribute("length", 1);
            g.addEdge("PC_SJ", "POLANCO", "SAN_JOAQUIN").addAttribute("length", 1);
            g.addEdge("SJ_TA", "SAN_JOAQUIN", "TACUBA").addAttribute("length", 1);
            g.addEdge("TA_RE", "TACUBA", "REFINERIA").addAttribute("length", 1);
            g.addEdge("RE_CE", "REFINERIA", "CAMARONES").addAttribute("length", 1);
            g.addEdge("CE_AQ", "CAMARONES", "AQUILES_SERDAN").addAttribute("length", 1);
            g.addEdge("AQ_RO", "AQUILES_SERDAN", "EL_ROSARIO").addAttribute("length", 1);

            g.getEdge("BM_MX").addAttribute("ui.class", "line7");
            g.getEdge("MX_SA").addAttribute("ui.class", "line7");
            g.getEdge("SA_SP").addAttribute("ui.class", "line7");
            g.getEdge("SP_TA").addAttribute("ui.class", "line7");
            g.getEdge("TA_CY").addAttribute("ui.class", "line7");
            g.getEdge("CY_AU").addAttribute("ui.class", "line7");
            g.getEdge("AU_PC").addAttribute("ui.class", "line7");
            g.getEdge("PC_SJ").addAttribute("ui.class", "line7");
            g.getEdge("SJ_TA").addAttribute("ui.class", "line7");
            g.getEdge("TA_RE").addAttribute("ui.class", "line7");
            g.getEdge("RE_CE").addAttribute("ui.class", "line7");
            g.getEdge("CE_AQ").addAttribute("ui.class", "line7");
            g.getEdge("AQ_RO").addAttribute("ui.class", "line7");

            /********************LINEA 6*********************/

            g.addEdge("MC_VB", "MARTIN_CARRERA", "LA_VILLA_BASILICA").addAttribute("length", 1);
            g.addEdge("VB_D1", "LA_VILLA_BASILICA", "DEPORTIVO_18_DE_MARZO").addAttribute("length", 1);
            g.addEdge("D1_LV", "DEPORTIVO_18_DE_MARZO", "LINDA_VISTA").addAttribute("length", 1);
            g.addEdge("LV_IP", "LINDA_VISTA", "INSTITUTO_DEL_PETROLEO").addAttribute("length", 1);
            g.addEdge("IP_VA", "INSTITUTO_DEL_PETROLEO", "VALLEJO").addAttribute("length", 1);
            g.addEdge("VA_N4", "VALLEJO", "NORTE_45").addAttribute("length", 1);
            g.addEdge("N4_FE", "NORTE_45", "FERRERIA").addAttribute("length", 1);
            g.addEdge("FE_AZ", "FERRERIA", "AZCAPOTZALCO").addAttribute("length", 1);
            g.addEdge("AZ_TE", "AZCAPOTZALCO", "TEZOZOMOC").addAttribute("length", 1);
            g.addEdge("TE_RO", "TEZOZOMOC", "EL_ROSARIO").addAttribute("length", 1);

            g.getEdge("MC_VB").addAttribute("ui.class", "line6");
            g.getEdge("VB_D1").addAttribute("ui.class", "line6");
            g.getEdge("D1_LV").addAttribute("ui.class", "line6");
            g.getEdge("LV_IP").addAttribute("ui.class", "line6");
            g.getEdge("IP_VA").addAttribute("ui.class", "line6");
            g.getEdge("VA_N4").addAttribute("ui.class", "line6");
            g.getEdge("N4_FE").addAttribute("ui.class", "line6");
            g.getEdge("FE_AZ").addAttribute("ui.class", "line6");
            g.getEdge("AZ_TE").addAttribute("ui.class", "line6");
            g.getEdge("TE_RO").addAttribute("ui.class", "line6");


            return g;

	}
    
     
        public static void main(String[] args) {
            
            
		Graph g = exampleGraph();
		g.display(false);
                


	}

        private static Node getNode(String a) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
        public void algoritmo(String Origen, String Destino) {
		Graph g = exampleGraph();
		g.display(false);
                

		// Edge lengths are stored in an attribute called "length"
		// The length of a path is the sum of the lengths of its edges
		Dijkstra dijkstra = new Dijkstra(Dijkstra.Element.EDGE, null, "length");

		// Compute the shortest paths in g from A to all nodes
		dijkstra.init(g);
		dijkstra.setSource(g.getNode(Origen));
		dijkstra.compute();

		// Print the lengths of all the shortest paths
		for (Node node : g)
                    System.out.printf("%s->%s:%10.2f%n", dijkstra.getSource(), node,
                    dijkstra.getPathLength(node));

		// Color in blue all the nodes on the shortest path form A to B
		for (Node node : dijkstra.getPathNodes(g.getNode(Destino)))
                    node.addAttribute("ui.style", "stroke-mode: plain; stroke-width: 7px; stroke-color: red; size: 25px; shape: circle; size: 33px;");

		// Color in red all the edges in the shortest path tree
		for (Edge edge : dijkstra.getTreeEdges())
                    edge.addAttribute("ui.style", "fill-mode: plain; fill-color: blue;");

		// Print the shortest path from A to B
		System.out.println(dijkstra.getPath(g.getNode(Destino)));

		// Build a list containing the nodes in the shortest path from A to B
		// Note that nodes are added at the beginning of the list
		// because the iterator traverses them in reverse order, from B to A
		List<Node> list1 = new ArrayList<Node>();
		for (Node node : dijkstra.getPathNodes(g.getNode(Destino)))
			list1.add(0, node);

		// A shorter but less efficient way to do the same thing
		List<Node> list2 = dijkstra.getPath(g.getNode(Destino)).getNodePath();

		// cleanup to save memory if solutions are no longer needed
		dijkstra.clear();

		// Now compute the shortest path from A to all the other nodes
		// but taking the number of nodes in the path as its length
		dijkstra = new Dijkstra(Dijkstra.Element.NODE, null, null);
		dijkstra.init(g);
		dijkstra.setSource(g.getNode(Origen));
		dijkstra.compute();

		// Print the lengths of the new shortest paths
		for (Node node : g)
			System.out.printf("%s->%s:%10.2f%n", dijkstra.getSource(), node,
					dijkstra.getPathLength(node));

		// Print all the shortest paths between A and F
		Iterator<Path> pathIterator = dijkstra.getAllPathsIterator(g
				.getNode(Origen));
		while (pathIterator.hasNext())
			System.out.println(pathIterator.next());
                

	}
    
        protected static String styleSheet =
    		"edge {"+
    		"	size: 10px;"+
    		"}"+
    		"node {"+
    		"	size: 30px; text-alignment: under; text-color: white; text-background-mode: rounded-box; text-background-color: #222C; text-padding: 3px, 3px; text-offset: 0px, -10px; "+
                "       shape: circle;"+                
                "}"+
                "edge.line1 {"+
                "       fill-color: #e76495;"+
                "}"+
                "edge.line2 {"+
                "       fill-color: #0a66a8;"+
                "}"+
                "edge.line3 {"+
                "       fill-color: #ae9d27;"+
                "}"+
                "edge.line4 {"+
                "       fill-color: #70b7af;"+
                "}"+
                "edge.line5 {"+
                "       fill-color: #fdce24;"+
                "}"+
                "edge.line6 {"+
                "       fill-color: #cc1235;"+
                "}"+
                "edge.line7 {"+
                "       fill-color: #e46825;"+
                "}"+
                "edge.line8 {"+
                "       fill-color: #169d6e;"+
                "}"+
                "edge.line9 {"+
                "       fill-color: #5c2b2a;"+
                "}"+
                "edge.lineA {"+
                "       fill-color: #a4277e;"+
                "}"+
                "edge.lineB {"+
                "       fill-color: #babab4;"+
                "}"+
                "edge.line12 {"+
                "       fill-color: #bf9b4f;"+
                "}";

    void algoritmo(JTextField TextOrigen, JTextField TextDestino) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setEnabled(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

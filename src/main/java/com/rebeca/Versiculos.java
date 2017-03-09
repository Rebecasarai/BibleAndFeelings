package com.rebeca;

import java.io.*;

public class Versiculos {
	private BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));
	//atributos
		private String libro;
		private String numVersiculo;
		private String versiculo;
	
	public Versiculos(String libro, String numVersiculo, String versiculo) {
			super();
			this.libro = libro;
			this.numVersiculo = numVersiculo;
			this.versiculo = versiculo;
		}

	public Versiculos() {
		super();
	}
	
	@Override
	public String toString() {
		return "Versiculos [libro=" + libro + ", numVersiculo=" + numVersiculo + ", versiculo=" + versiculo + "]";
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((libro == null) ? 0 : libro.hashCode());
		result = prime * result + ((numVersiculo == null) ? 0 : numVersiculo.hashCode());
		result = prime * result + ((versiculo == null) ? 0 : versiculo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Versiculos other = (Versiculos) obj;
		if (libro == null) {
			if (other.libro != null)
				return false;
		} else if (!libro.equals(other.libro))
			return false;
		if (numVersiculo == null) {
			if (other.numVersiculo != null)
				return false;
		} else if (!numVersiculo.equals(other.numVersiculo))
			return false;
		if (versiculo == null) {
			if (other.versiculo != null)
				return false;
		} else if (!versiculo.equals(other.versiculo))
			return false;
		return true;
	}

	public void pedirVersiculo() throws IOException{
		System.out.println("Indique el libro al que pertenece el versiculo.");
		this.libro = teclado.readLine();
		System.out.println("Indique el cápitulo y número");
		this.numVersiculo = teclado.readLine();
		System.out.println("Escriba el versiculo");
		this.versiculo = teclado.readLine();
		
	}
	public String getLibro() {
		return libro;
	}

	public void setLibro(String libro) {
		this.libro = libro;
	}

	public String getNumVersiculo() {
		return numVersiculo;
	}

	public void setNumVersiculo(String numVersiculo) {
		this.numVersiculo = numVersiculo;
	}

	public String getVersiculo() {
		return versiculo;
	}

	public void setVersiculo(String versiculo) {
		this.versiculo = versiculo;
	}

	public static String[] getEsperanza() {
		return ESPERANZA;
	}

	public static String[] getFe() {
		return FE;
	}

	public static String[] getAmor() {
		return AMOR;
	}

	public static String[] getAnimo() {
		return ANIMO;
	}

	public static String[] getValentia() {
		return VALENTIA;
	}

	public static String[] getDeletecelos() {
		return DELETECELOS;
	}

	public static String[] getDeletetristeza() {
		return DELETETRISTEZA;
	}





	public static final String  ESPERANZA[] = {
            "Pero los que confían en el Señor\nrenovarán sus fuerzas;\nvolarán como las águilas:\ncorrerán y no se fatigarán,\ncaminarán y no se cansarán.\n― Isaías 40:31",
            "El Señor te protegerá;\nde todo mal protegerá tu vida.\nEl Señor te cuidará en el hogar y en el camino,\ndesde ahora y para siempre.― Salmos 121:7-8",
            "Que el Dios de la esperanza los llene de toda alegría y paz a ustedes que creen en él, para que rebosen de esperanza por el poder del Espíritu Santo.\n- Romanos 15:13 ",
            "Ahora bien, la fe es la garantía de lo que se espera, la certeza de lo que no se ve.\n- Hebreos 11:1",
            "Vengan a mí todos ustedes que están cansados y agobiados, y yo les daré descanso―\n Mateo 11:28",
            "Mantengamos firme la esperanza que profesamos, porque fiel es el que hizo la promesa.\n― Hebreos 10:23",
            "¡Alabado sea Dios, Padre de nuestro Señor Jesucristo! Por su gran misericordia, nos ha hecho nacer de nuevo mediante la resurrección de Jesucristo, para que tengamos una esperanza viva.\n― 1 Pedro 1:3",
            "A éstos Dios se propuso dar a conocer cuál es la gloriosa riqueza de este misterio entre las naciones, que es Cristo en ustedes, la esperanza de gloria.\n ― Colosenses 1:27",                     
            };   
	public static final String  FE[] = {
            "Por eso les digo: Crean que ya han recibido todo lo que estén pidiendo en oración, y lo obtendrán.\n-Marcos 11:24",
            "Ahora bien, la fe es la garantía de lo que se espera, la certeza de lo que no se ve.\n-Hebreos 11:1",
            "Pero que pida con fe, sin dudar, porque quien duda es como las olas del mar, agitadas y llevadas de un lado a otro por el viento.\n-Santiago 1:6",
            "—¿Cómo que si puedo? Para el que cree, todo es posible.\n-Marcos 9:23",
            "Les aseguro que si alguno le dice a este monte: “Quítate de ahí y tírate al mar”, creyendo, sin abrigar la menor duda de que lo que dice sucederá, lo obtendrá.\n-Marcos 11:23",
                       
            };   
	public static final String  AMOR[] = {
            "Por encima de todo, vístanse de amor, que es el vínculo perfecto. \n-Colosenses 3:14",
            "Y nosotros hemos llegado a saber y creer que Dios nos ama. Dios es amor. El que permanece en amor, permanece en Dios, y Dios en él. \n-1 Juan 4:16",
            "Y éste es mi mandamiento: que se amen los unos a los otros, como yo los he amado. \n -Juan 15:12",
            "Si alguien afirma: «Yo amo a Dios», pero odia a su hermano, es un mentiroso; pues el que no ama a su hermano, a quien ha visto, no puede amar a Dios, a quien no ha visto. -1 Juan 4:20",
            "Hagan todo con amor. \n -1 Corintios 16:14",
            "El amor es paciente, es bondadoso. El amor no es envidioso ni jactancioso ni orgulloso. No se comporta con rudeza, no es egoísta, no se enoja fácilmente, no guarda rencor. \n-1 Corintios 13:4-5",
            "Ahora, pues, permanecen estas tres virtudes: la fe, la esperanza y el amor. Pero la más excelente de ellas es el amor. \n-1 Corintios 13:13",
            "El odio es motivo de disensiones,\npero el amor cubre todas las faltas.\n-Proverbios 10:12",
            "El segundo es: “Ama a tu prójimo como a ti mismo.” No hay otro mandamiento más importante que éstos.\n-Marcos 12:31",
            "Si hablo en lenguas humanas y angelicales, pero no tengo amor, no soy más que un metal que resuena o un platillo que hace ruido. \n-1 Corintios 13:1",
            "El que no ama no conoce a Dios, porque Dios es amor. \n-1 Juan 4:8",                          
            };   
	public static final String  ANIMO[] = {
            "No tengas miedo, que yo estoy contigo; no te desanimes, que yo soy tu Dios. Yo soy quien te da fuerzas, y siempre te ayudaré; siempre te sostendré con mi justiciera mano derecha. \n-Isaías 41:10 ",
            "No se turbe su corazón. Ustedes creen en Dios; crean también en mí.\n-Juan 14:1",
            "¡Todo lo puedo en Cristo que me fortalece!\n -Filipenses 4:13",
            "El Señor es bueno;\nes un refugio en el día de la angustia.\nEl Señor conoce a los que en él confían,\n-Nahúm 1:7",
            "Ya te lo he ordenado: ¡Sé fuerte y valiente! ¡No tengas miedo ni te desanimes! Porque el Señor tu Dios te acompañará donde quiera que vayas.\n-Josué 1:9",
                   
            };   
	public static final String  VALENTIA[] = {
            "No tengas miedo, que yo estoy contigo; no te desanimes, que yo soy tu Dios. Yo soy quien te da fuerzas, y siempre te ayudaré; siempre te sostendré con mi justiciera mano derecha. \n-Isaías 41:10 ",
            "No se turbe su corazón. Ustedes creen en Dios; crean también en mí.\n-Juan 14:1",
            "¡Todo lo puedo en Cristo que me fortalece!\n -Filipenses 4:13",
            "El Señor es bueno;\nes un refugio en el día de la angustia.\nEl Señor conoce a los que en él confían,\n-Nahúm 1:7",
            "Ya te lo he ordenado: ¡Sé fuerte y valiente! ¡No tengas miedo ni te desanimes! Porque el Señor tu Dios te acompañará donde quiera que vayas.\n-Josué 1:9",
                   
            };   
	public static final String  DELETECELOS[] = {
            "No envidie tu corazón a los pecadores, antes {vive} siempre en el temor del Señor;\n-Proverbios 23:17",
            "Porque nosotros también en otro tiempo éramos necios, desobedientes, extraviados, esclavos de deleites y placeres diversos, viviendo en malicia y envidia, aborrecibles {y} odiándonos unos a otros.\n-Tito 3:3",
            "El amor es paciente, es bondadoso; el amor no tiene envidia; el amor no es jactancioso, no es arrogante;\n-1 Corintios 13:4",
            "Por tanto, desechando toda malicia y todo engaño, e hipocresías, envidias y toda difamación,\n-1 Pedro 2:1",
                 
            };  
	public static final String  DELETETRISTEZA[] = {
            "Echa sobre Jehová tu carga, y él te sustentará;\nNo dejará para siempre caído al justo.\n-Salmos 55:22",
            "Y Jehová va delante de ti; él estará contigo, no te dejará, ni te desamparará; no temas ni te intimides\n-Deuteronomio 31:8",
            "Mejor es la tristeza que la risa, porque cuando el rostro está triste el corazón puede estar contento.\n-Eclesiastés 7:3",
            "Cercano está el SEÑOR a los quebrantados de corazón, y salva a los abatidos de espíritu.\n-Salmos 34:18",
              
            }; 
	
	
	
}

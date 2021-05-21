package com.salesianostriana.dam;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Component;

import com.salesianostriana.dam.modelo.Bicicleta;
import com.salesianostriana.dam.modelo.Categoria;
import com.salesianostriana.dam.servicios.BicicletaService;
import com.salesianostriana.dam.servicios.CategoriaService;


import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class InitData {

	private final BicicletaService bici;
	private final CategoriaService servi;

	@PostConstruct
	public void initData() {

		Categoria ca1 = new Categoria ("Rally");
		Categoria ca2 = new Categoria ("All Mountain");
		Categoria ca3 = new Categoria  ("Enduro");
		Categoria ca4 = new Categoria ("Descenso");

		servi.save(ca1);
		servi.save(ca2);
		servi.save(ca3);
		servi.save(ca4);
	

		
		Bicicleta b1 = new Bicicleta ("Canyon Spectral cf-7-2021","La Spectral se mueve muy bien hacia arriba y hacia abajo, en los senderos más rotos y empinados o en los más rápidos y llenos de flow.Una bicicleta ágil con ruedas grandes y geometría progresiva para un máximo control a altas velocidades","2021","true","false","M",2999.00,"https://www.bikezona.com/todobici/fotosbicig/Zesty-214.jpg");
		Bicicleta b2 = new Bicicleta ("Cube Reaction Pro-2021","Con Reaction Pro, queríamos la combinación perfecta de función, confiabilidad y rendimiento. Así que comenzamos con los componentes SLX y XT de Shimano para la transmisión 1x12, porque ofrecen una amplia gama y una reputación incomparable de precisión. Agregamos frenos de disco hidráulicos Shimano XT para un excelente rendimiento de frenado en todo clima, ya sea que esté en las colinas o luchando en la ciudad. Y terminó con la horquilla de aire RockShox Judy Silver, que combina un fácil ajuste con una rapidez que suaviza los senderos.","2021","true","false","M",1299.00,"https://s14761.pcdn.co/wp-content/uploads/sites/2/2020/03/Lapierre-Overvolt-GLP2-E-Mountainbike-Review-Test-2020-078-1140x760.jpg");
		Bicicleta b3 = new Bicicleta ("Trek Procaliber-98-2021","La Procaliber 9.8 es la campeona de la familia.Es una rígida de cross country diseñada para los ciclistas que compiten para ganar, con un cuadro de carbono con IsoSpeed que absorbe los baches de los senderos sin sacrificar la eficiencia, una horquilla ligera FOX que rinde al máximo en los descensos técnicos y una transmisión Shimano XT suave.","2021","true","false","M",3599.00," https://www.biobike.es/wp-content/uploads/2021/01/LP_Overvolt_AM_66_01_byBioBike.jpg");
		Bicicleta b4 = new Bicicleta ("Lapierre Zesty am fit-40-2020","A medio camino entre una XC bi-suspensión y una enduro, con 150 mm de recorrido en el chasis de 27.5 y 140 mm en el chasis de 29. Mejorará las sensaciones cuesta arriba en comparación con una bicicleta de enduro pura y, sin embargo, será más estable cuesta abajo que una bicicleta XC. En resumen, una bicicleta inflexible.","2021","true","false","M",2599.00," https://esmtb.com/wp-content/uploads/2018/09/lapierre_04.jpg");
		Bicicleta b5 = new Bicicleta ("Lapierre Overvolt AM 8.6-2021","Escale montañas mientras disfruta del paisaje. Disfrute de maravillosos descensos mientras se concentra únicamente en el horizonte. Eso es lo que ofrece nuestra Overvolt AM 8.6. Puede atravesar montañas y marcar nuevos límites para usted. Con una altura libre de 150 o 160 mm sobre la rueda, podrá afrontar las rutas más técnicas gracias a una BTT eléctrica desarrollada con un centro de gravedad más bajo y centralizado. El resultado es un placer inagotable, un sueño de bicicleta.","2021","true","false","M",6399.00," http://maillot.estaticos1mas1.com/files/maillot-mag-lapierre-pulsium_01.jpg");
		Bicicleta b6 = new Bicicleta ("Kona Operator CR sunset-2021","La Kona Operator siempre ha sido una bicicleta downhill de primera clase. En todos los parques de bicicletas del mundo conocerás a los fieles seguidores de las Kona para downhill. Después de una fase de prueba más larga, la Operator ha sido ajustada consistentemente a ruedas de 29 pulgadas y la geometría se adaptó en consecuencia. Con una cola muy corta para una bicicleta de descenso de 29 y rodamientos extremadamente robustos, la Operator sigue siendo un cohete juguetón en el parque de bicicletas y se siente como en casa en los empinados y técnicos senderos de la región del Noroeste del Pacífico. Los protectores del cuadro integrados para amortiguar los impactos de la horquilla del doble puente, los impactos de la cadena y las piedras lanzadas contra el tubo inferior garantizan que el cuadro la Operator pueda soportar sin problemas las duras bajadas de las colinas.","2021","true","false","M",6118.99," https://img2.storyblok.com/900x589/smart/filters:quality(80)/f/89374/7352x4808/30e94b5d32/design-and-innovation-award-hero.jpg");
		Bicicleta b7 = new Bicicleta ("Specialized-sworks-epic-2021","El uso del carbono FACT 12m con la nueva geometría Modern XC Race Geometry, hacen a la S-Works Epic 2021 la más ligera en su gama superando incluso a las versiones anteriores, la horquilla RockShox SID SL Ultimate BRAIN es la perfecta supensión de las carreras XC.El nuevo cuadro de la SWorks Epic 2021 introduce un nuevo Brain que es capaz de ofrecer 100mm de recorrido efectivo, además se ha mejorado su funcionamiento para que lo haga de una manera más suave, todo ello hay que combinarlo con el nuevo diseño del basculante de la SWorks que, junto con una extensión del amortiguador en carbono, es capaz de dotar de una mayor rigidez al cuadro, además ser la Specialized Epic más ligera jamás fabricada.","2021","true","false","M",11599.00," https://lapierre-shopware.accell.cloud/thumbnail/9d/f3/4f/1606920903/Zesty%20TR%205.9%20-%20View%20(1)_800x800.jpg");
		Bicicleta b8 = new Bicicleta ("Specialized Demo Race-2021","El cuadro de aluminio M5 Demo Race está optimizado para aprovechar los beneficios de tracción de una rueda delantera de 29 pulgadas y la mayor capacidad de maniobra de una rueda trasera de 27.5 pulgadas.El amortiguador Rockshox Super Deluxe Ultimate DH ofrece compresión externa de baja velocidad y ajuste de rebote,mientras que el montaje Trunnion ofrece una mayor durabilidad.Horquilla Boxxer Ultimate 29 , incluye el cartucho Charger 2.1, pistón neumático DebonAir y 200 mm de recorrido.","2021","true","false","M",11599.00," https://www.mtbpro.es/sites/default/files/fotosprincipales/lapierre_overvolt_bosch_gen4_0001.jpg");
		Bicicleta b9 = new Bicicleta ("Canyon Neuron 7-2021","Una suspensión FOX sensible, cambios de gran precisión Shimano, cubiertas Schwalbe de excelente agarre y una tija telescópica fácil de usar: esta bicicleta viene equipada con todo lo que necesitas para salir a rodar por la montaña.","2021","true","false","M",2399.00," https://evolutionbikes.it/wp-content/uploads/2019/10/Lapierre-Spicy-Team-ultimate-29-4.jpg");

		
		bici.save(b1);
		bici.save(b2);
		bici.save(b3);
		bici.save(b4);
		bici.save(b5);
		bici.save(b6);
		bici.save(b7);
		bici.save(b8);
		bici.save(b9);
		
		bici.edit(b1);
		bici.edit(b2);
		bici.edit(b3);
		bici.edit(b4);
		bici.edit(b5);
		bici.edit(b6);
		bici.edit(b7);
		bici.edit(b8);
		bici.edit(b9);

	}

}

$(document).ready(function(){

	var carta = $('.carta'); //para obtener el div de la carta y no llamarlo siempre
	
	//destinatario nombre

	$('.nombre-destinatario').keyup(function(){

		$('#destinatario').text($(this).val());
		
	});

	//precio

	$('#monto').keyup(function(){

		$('#precio').text('$'+$(this).val());
		
	});

	//fuente color

	$('#celeste').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'color': '#74b8ff'});
		}
	});
	$('#violeta').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'color': '#a19bfd'});
		}
	});
	$('#verde').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'color': '#4edab3'});
		}
	});
	$('#amarillo').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'color': '#fdca6e'});
		}
	});
	$('#naranja').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'color': '#fab1a0'});
		}
	});

	//tamaño de fuentes

	$('#fuente1').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'width':'300px','height':'300px'});
			$('.destinatario').css({'font-size': '20px'});
		}
	});
	$('#fuente2').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'width':'300px','height':'300px'});
			$('.destinatario').css({'font-size': '22px'});
		}
	});
	$('#fuente3').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'width':'300px','height':'300px'});
			$('.destinatario').css({'font-size': '24px'});
		}
	});
	$('#fuente4').on('change', function(){
		if($(this).is(':checked')){
			//carta.css({'width':'400px','height':'400px'});
			$('.destinatario').css({'font-size': '28px'});
		}
	});
	$('#fuente5').on('change', function(){
		if($(this).is(':checked')){
			//carta.css({'width':'500px','height':'500px'});
			$('.destinatario').css({'font-size': '30px'});
		}
	});

	//position 
	$('#ubicacion1').on('change', function(){
		if($(this).is(':checked')){
			$('.dato-carta').css({'top':'76%','left':'72%','margin':'-17% 0 0 -27%'});
		}
	});
	$('#ubicacion2').on('change', function(){
		if($(this).is(':checked')){
			$('.dato-carta').css({'top':'19%','left':'32%','margin':'-17% 0 0 -27%'});
		}
	});
	$('#ubicacion3').on('change', function(){
		if($(this).is(':checked')){
			$('.dato-carta').css({'top':'19%','left':'75%','margin':'-15% 0 0 -29%'});
		}
	});
	
		
	//fondo de color

	$('#fondo1').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'background': '#74b8ff'});
		}
	});
	$('#fondo2').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'background': '#a19bfd'});
		}
	});
	$('#fondo3').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'background': '#4edab3'});
		}
	});
	$('#fondo4').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'background': '#fdca6e'});
		}
	});
	$('#fondo5').on('change', function(){
		if($(this).is(':checked')){
			carta.css({'background': '#fab1a0'});
		}
	});
	
});
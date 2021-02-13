$(document).ready(function(){	

	if(window.location.href.indexOf('index')>-1){
		$('.galeria').bxSlider({
		mode:'fade',
		captions:true,
		slideWidth:1200,
		responsive:true
	});
	}
});
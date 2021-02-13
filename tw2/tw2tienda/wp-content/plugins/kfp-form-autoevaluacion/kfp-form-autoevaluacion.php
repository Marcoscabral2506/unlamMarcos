<?php
/**
* Plugin Name: KFP Form Autoevaluacion
*/
 register_activation_hook(__FILE__, 'Kfp_Aspirante_init');
function Kfp_Aspirante_init() 
{
    global $wpdb; // Este objeto global permite acceder a la base de datos de WP
    // Crea la tabla sólo si no existe
    // Utiliza el mismo prefijo del resto de tablas
    $tabla_aspirantes = $wpdb->prefix . 'testeomarcos';
    // Utiliza el mismo tipo de orden de la base de datos
    $charset_collate = $wpdb->get_charset_collate();
    // Prepara la consulta
    $query = "CREATE TABLE IF NOT EXISTS $tabla_aspirantes (
        id mediumint(9) NOT NULL AUTO_INCREMENT,
        nombre varchar(40) NOT NULL,
        precio int NOT NULL,
        id_categoria int not null,
        UNIQUE (id)
        ) $charset_collate;";
    // La función dbDelta permite crear tablas de manera segura se
    // define en el archivo upgrade.php que se incluye a continuación
    include_once ABSPATH . 'wp-admin/includes/upgrade.php';
    dbDelta($query); // Lanza la consulta para crear la tabla de manera segura
}
// Define el shortcode y lo asocia a una función
add_shortcode('kfp_aspirante_form', 'Kfp_Aspirante_form');
 
/** 
 * Define la función que ejecutará el shortcode
 * De momento sólo pinta un formulario que no hace nada
 * 
 * @return string
 */
function Kfp_Aspirante_form() 
{
    wp_enqueue_style('css_aspirante', plugins_url('style.css', __FILE__));
    global $wpdb; // Este objeto global permite acceder a la base de datos de WP
    // Si viene del formulario  graba en la base de datos
    // Cuidado con el último igual de la condición del if que es doble
    if ($_POST['nombre'] != '') {
        $tabla_aspirantes = $wpdb->prefix . 'testeomarcos'; 
        $nombre = sanitize_text_field($_POST['nombre']);
        $precio = (int)$_POST['precio'];
        $id_categoria = (int)$_POST['id_categoria'];        
        $wpdb->insert(
            $tabla_aspirantes,
            array(
                'nombre' => $nombre,
                'precio' => $precio,
                'id_categoria' => $id_categoria               
            )
        );
    }
    // Esta función de PHP activa el almacenamiento en búfer de salida (output buffer)
    // Cuando termine el formulario lo imprime con la función ob_get_clean
    ob_start();
    ?>
    <form action="http://localhost:4000/crearProducto" method="post" id="form_aspirante"
class="cuestionario">
        <div class="form-input">
            <div class="form-input">
            <label for='id_categoria'>Categoria</label>
            <input type="number" name="id_categoria" placeholder="Precio" class="form-control">
        </div>
            <label for="nombre">Nombre</label>
           <input type="text" name="nombre" placeholder="Nombre" class="form-control">
        </div>
        <div class="form-input">
            <label for='precio'>Precio</label>
            <input type="number" name="precio" placeholder="Precio" class="form-control">
        </div>
        
        <div class="form-input">
            <input type="submit" value="Enviar">
        </div>
    </form>
    <?php
     
    // Devuelve el contenido del buffer de salida
    return ob_get_clean();
}
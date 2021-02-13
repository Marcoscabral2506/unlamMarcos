<?php
/**
 * The base configuration for WordPress
 *
 * The wp-config.php creation script uses this file during the
 * installation. You don't have to use the web site, you can
 * copy this file to "wp-config.php" and fill in the values.
 *
 * This file contains the following configurations:
 *
 * * MySQL settings
 * * Secret keys
 * * Database table prefix
 * * ABSPATH
 *
 * @link https://wordpress.org/support/article/editing-wp-config-php/
 *
 * @package WordPress
 */

// ** MySQL settings - You can get this info from your web host ** //
/** The name of the database for WordPress */
define( 'DB_NAME', 'tw2tiendaWwp' );

/** MySQL database username */
define( 'DB_USER', 'root' );

/** MySQL database password */
define( 'DB_PASSWORD', '1234' );

/** MySQL hostname */
define( 'DB_HOST', '127.0.0.1:3306' );

/** Database Charset to use in creating database tables. */
define( 'DB_CHARSET', 'utf8mb4' );

/** The Database Collate type. Don't change this if in doubt. */
define( 'DB_COLLATE', '' );

/**#@+
 * Authentication Unique Keys and Salts.
 *
 * Change these to different unique phrases!
 * You can generate these using the {@link https://api.wordpress.org/secret-key/1.1/salt/ WordPress.org secret-key service}
 * You can change these at any point in time to invalidate all existing cookies. This will force all users to have to log in again.
 *
 * @since 2.6.0
 */
define( 'AUTH_KEY',         'f+rN4ca{bgJXa-<,)#_-Pux#{hxF|b1_N#0:~jb6KE cwd7RYy)zH2(yKu52&7(:' );
define( 'SECURE_AUTH_KEY',  'D+@_4Yg`uS_<Za9~5+UyIf-lp  XhJA)y=$~7&DN[H~A-m~>GbAxF}/Z5y^+6P2t' );
define( 'LOGGED_IN_KEY',    'mc[%?PUUPTp2l!wv#cBPJf|E5F[OBXb163@RA;<d6E7xGi;8,*nd:_fNKFvDkE.Q' );
define( 'NONCE_KEY',        'Y`[ezVsn0IstE-Ce<k6+#tUtyctSA,3iNe )bG3=ULGghc8Y<yUuEJ[ykT4Q83W3' );
define( 'AUTH_SALT',        'W<_5U{;4LzCTHl&GUl ,MtC^fvMkRa-z9)(Ld)[q.O4S&C+{@Q gKN7=0^ic{i[O' );
define( 'SECURE_AUTH_SALT', '>zaX+]O7CR_CWIm*fV;GuU.{)`Z(=*TjO-C9I+GJ*T$K]c_p,0G[F{zWNTJ{=soj' );
define( 'LOGGED_IN_SALT',   '4g8[QGRL+n_Z1F}IcO|}Gr}T*k/$qYE6t^l;RQ6$/#DA;(TiQM1Djj~/6*R>ulT=' );
define( 'NONCE_SALT',       '9u!.t<U1i#qf@,8ppGrjFG0):)Wp3Q`UpVx;TLc1A7e/<Jm&KoMK8=g2^0w3,o%.' );
define('JWT_AUTH_SECRET_KEY', '1234');
define('JWT_AUTH_CORS_ENABLE', true);
/**#@-*/

/**
 * WordPress Database Table prefix.
 *
 * You can have multiple installations in one database if you give each
 * a unique prefix. Only numbers, letters, and underscores please!
 */
$table_prefix = 'wp_';

/**
 * For developers: WordPress debugging mode.
 *
 * Change this to true to enable the display of notices during development.
 * It is strongly recommended that plugin and theme developers use WP_DEBUG
 * in their development environments.
 *
 * For information on other constants that can be used for debugging,
 * visit the documentation.
 *
 * @link https://wordpress.org/support/article/debugging-in-wordpress/
 */
define( 'WP_DEBUG', false );

/* That's all, stop editing! Happy publishing. */

/** Absolute path to the WordPress directory. */
if ( ! defined( 'ABSPATH' ) ) {
	define( 'ABSPATH', __DIR__ . '/' );
}

/** Sets up WordPress vars and included files. */
require_once ABSPATH . 'wp-settings.php';

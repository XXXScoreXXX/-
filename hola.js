// Obtener todas las imágenes con la clase 'moto-img'
const imagenes = document.querySelectorAll('.moto-img');

// Añadir eventos de hover a cada imagen
imagenes.forEach(imagen => {
    imagen.addEventListener("mouseover", function() {
        imagen.style.transform = "scale(1.1)"; // Aumenta el tamaño de la imagen
        imagen.style.filter = "brightness(1.2)"; // Aumenta el brillo de la imagen
    });

    imagen.addEventListener("mouseout", function() {
        imagen.style.transform = "scale(1)"; // Restaura el tamaño original de la imagen
        imagen.style.filter = "brightness(1)"; // Restaura el brillo original
    });
});

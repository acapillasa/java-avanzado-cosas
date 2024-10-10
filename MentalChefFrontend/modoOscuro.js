// Obtener el botón
const darkModeBtn = document.querySelector('.btn-oscuro');

// Verificar si el usuario ya tiene una preferencia almacenada
let darkMode = localStorage.getItem('darkMode'); // Cambiar a let

// Función para activar el modo oscuro
const enableDarkMode = () => {
  document.body.classList.add('dark-mode'); // Activar modo oscuro en el body
  const divs = document.querySelectorAll('div'); // Seleccionar todos los divs
  divs.forEach(div => {
    div.classList.add('dark-mode'); // Agregar la clase dark-mode a cada div
  });
  localStorage.setItem('darkMode', 'enabled'); // Guardar preferencia
}

// Función para desactivar el modo oscuro
const disableDarkMode = () => {
  document.body.classList.remove('dark-mode'); // Desactivar modo oscuro en el body
  const divs = document.querySelectorAll('div'); // Seleccionar todos los divs
  divs.forEach(div => {
    div.classList.remove('dark-mode'); // Remover la clase dark-mode de cada div
  });
  localStorage.setItem('darkMode', null); // Guardar preferencia
}

// Comprobar la preferencia al cargar la página
if (darkMode === 'enabled') {
  enableDarkMode();
}

// Escuchar el clic en el botón para alternar modos
darkModeBtn.addEventListener('click', () => {
  darkMode = localStorage.getItem('darkMode'); // Volver a obtener el valor
  
  if (darkMode !== 'enabled') {
    enableDarkMode(); // Activar modo oscuro
  } else {
    disableDarkMode(); // Desactivar modo oscuro
  }
});

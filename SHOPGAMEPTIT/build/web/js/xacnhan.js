const xacnhanBtn = document.getElementById('xacnhan');
console.log(xacnhanBtn)
const overlay = document.getElementById('abc');

xacnhanBtn.addEventListener('click', () => {
    overlay.style.display = 'block';
});

function closeForm() {
    overlay.style.display = 'none';
}

const form = document.querySelector('form');
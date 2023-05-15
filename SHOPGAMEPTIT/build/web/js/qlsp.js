const addBtn = document.getElementById('addsp');
console.log(addBtn)
const overlay = document.getElementById('overlay');

addBtn.addEventListener('click', () => {
    overlay.style.display = 'block';
});

function closeForm() {
    overlay.style.display = 'none';
}

const form = document.querySelector('form');

//form.addEventListener('submit', (e) => {
//    e.preventDefault();
//
//    // Get form values
//    const image = form.image.value.trim();
//    const id = form.id.value.trim();
//    const description = form.description.value.trim();
//    const rank = form.rank.value.trim();
//    const ngoc = form.ngoc.value.trim();
//    const tuong = form.tuong.value.trim();
//    const trangPhuc = form['trang-phuc'].value.trim();
//    const loaiNick = form['loai-nick'].value.trim();
//    const price = form.price.value.trim();
//
//    // Create new table row
//    const newRow = document.createElement('tr');
//
//    // Add image column
//    const imageCell = document.createElement('td');
//    const imageElem = document.createElement('img');
//    imageElem.src = image;
//    imageElem.alt = '';
//    imageElem.style.width = '100px';
//    imageElem.style.height = '100px';
//    imageCell.appendChild(imageElem);
//    newRow.appendChild(imageCell);
//
//    // Add ID column
//    const idCell = document.createElement('td');
//    idCell.textContent = id;
//    newRow.appendChild(idCell);
//
//    // Add description column
//    const descCell = document.createElement('td');
//    descCell.textContent = description;
//    newRow.appendChild(descCell);
//
//    // Add rank column
//    const rankCell = document.createElement('td');
//    rankCell.textContent = rank;
//    newRow.appendChild(rankCell);
//
//    // Add ngoc column
//    const ngocCell = document.createElement('td');
//    ngocCell.textContent = ngoc;
//    newRow.appendChild(ngocCell);
//
//    // Add tuong column
//    const tuongCell = document.createElement('td');
//    tuongCell.textContent = tuong;
//    newRow.appendChild(tuongCell);
//
//    // Add trang phuc column
//    const trangPhucCell = document.createElement('td');
//    trangPhucCell.textContent = trangPhuc;
//    newRow.appendChild(trangPhucCell);
//
//    // Add loai nick column
//    const loaiNickCell = document.createElement('td');
//    loaiNickCell.textContent = loaiNick;
//    newRow.appendChild(loaiNickCell);
//
//    // Add price column
//    const priceCell = document.createElement('td');
//    priceCell.textContent = price;
//    newRow.appendChild(priceCell);
//
//    // Add action column
//    const actionCell = document.createElement('td');
//    const editBtn = document.createElement('button');
//    editBtn.textContent = 'Edit';
//    const deleteBtn = document.createElement('button');
//    deleteBtn.textContent = 'Delete';
//
//    actionCell.appendChild(editBtn);
//    actionCell.appendChild(deleteBtn);
//
//    newRow.appendChild(actionCell);
//
//    // Add row to table
//    const table = document.querySelector('table');
//    table.appendChild(newRow);
//
//    // Clear form values
//    form.reset();
//
//    // Close form
//    closeForm();
//});
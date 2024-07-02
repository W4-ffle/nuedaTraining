document.addEventListener('DOMContentLoaded', function() {
    getAllAccounts();
});

function getAllAccounts() {
    fetch('/api/accounts')
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.json();
        })
        .then(data => {
            populateTable(data);
        })
        .catch(error => {
            console.error('There was a problem with the fetch operation:', error);
        });
}

function populateTable(accounts) {
    const tableBody = document.querySelector('#accountsTable tbody');
    tableBody.innerHTML = ''; // Clear existing rows

    accounts.forEach(account => {
        const row = document.createElement('tr');

        const nameCell = document.createElement('td');
        nameCell.textContent = account.name;
        row.appendChild(nameCell);

        const addressCell = document.createElement('td');
        addressCell.textContent = account.address;
        row.appendChild(addressCell);

        const balanceCell = document.createElement('td');
        balanceCell.textContent = account.balance;
        row.appendChild(balanceCell);

        tableBody.appendChild(row);
    });
}

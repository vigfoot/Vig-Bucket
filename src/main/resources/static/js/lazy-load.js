window.onload = () => {
    let xhr = new XMLHttpRequest();
    xhr.open('POST', '/bucket');
    xhr.onreadystatechange = function (e) {
        if (xhr.status === 200 && xhr.readyState === 4) {
            const component = document.querySelector('#component');

            const resultSet = JSON.parse(xhr.responseText);

            console.log(resultSet)

            for (let key in resultSet) {
                let container = document.createElement('div');
                let fileName = document.createElement('h3');
                let fileContents = document.createElement('p');

                fileName.innerText = resultSet[key].name;
                fileContents.innerHTML = JSON.stringify(resultSet[key], null, 2);

                container.append(fileName);
                container.append(fileContents);
                component.append(container);
            }

        }
    }

    xhr.send(document.querySelector('header').dataset.directory);
};

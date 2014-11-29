var bookLibrary = angular.module('bookLibrary', []);

bookLibrary.controller('BookCtrl', function($scope) {
    $scope.books = [{'name': 'El Principito', 'author': 'Desconocido'},
                    {'name': 'Rebelion en la granga', 'author': 'George Orwell'},
                    {'name': 'Cuentos escritos en el exilio', 'author': 'Juan Bosh'}];
});


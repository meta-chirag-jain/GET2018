var myApp = angular.module('userManagementApp', []);
myApp.controller('userDetailController', userDetailController);

function userDetailController($scope, $http) {
    $http.get('http://localhost:3000/users').then(function (response) {
        $scope.users = response.data;
    });

    $scope.addUser = function () {
        if (/^[a-zA-Z\s]+$/.test($scope.userName)) {
            $scope.userNameError = '';
            if (/^[0-9]{10}$/.test($scope.userPhone)) {
                $scope.userPhoneError = '';
                if (/^[a-zA-z\s]+$/.test($scope.userCity)) {
                    $scope.userCityError = '';
                    var user = {
                        'id': $scope.users.length + 1,
                        'name': $scope.userName,
                        'phone': $scope.userPhone,
                        'city': $scope.userCity
                    };

                    $scope.users.push(user);
                    $http.post('http://localhost:3000/users', user);
                } else {
                    $scope.userCityError = 'Enter a valid city name';
                }
            } else {
                $scope.userPhoneError = 'Enter a valid Phone number of length exactly 10'
            }
        } else {
            $scope.userNameError = 'Enter a valid name without any special character and digits'
        }
    };

    $scope.clearAll = function () {
        $scope.userName = '';
        $scope.userPhone = '';
        $scope.userCity = '';
    }

    $scope.setUserId = function (key) {
        $scope.users.forEach(element => {
            if (key === element.id) {
                $scope.id = element.id;
                $scope.userName = element.name;
                $scope.userPhone = element.phone;
                $scope.userCity = element.city;
            }
        });
    }

    $scope.editUser = function () {
        $scope.users.forEach(element => {
            if (element.id == $scope.id) {
                element.name = $scope.userName;
                element.phone = $scope.userPhone;
                element.city = $scope.userCity;
            }
        });
        var user = {
            'id': $scope.id,
            'name': $scope.userName,
            'phone': $scope.userPhone,
            'city': $scope.userCity
        };
        $http.put('http://localhost:3000/users/' + $scope.id, user);
    }

}

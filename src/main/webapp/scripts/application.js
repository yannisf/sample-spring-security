'use strict';

angular.module('app', [])

    .value('user', user)

    .service('ResourceService', ['$http', function ($http) {
        return {
            view: function () {
                return $http.get('../api/resource').then(function (response) {
                    return response.data;
                });
            },
            edit: function () {
                return $http.post('../api/resource').then(function (response) {
                    return response.data;
                });
            }
        };
    }
    ])

    .controller('ResourceController', ['$scope', 'ResourceService', 'user', function($scope, ResourceService, user) {
        angular.extend($scope, {
            view: function() {
                ResourceService.view().then(function (response) {
                    console.log('Invoked view: ', response.message);
                });
            },
            edit: function() {
                ResourceService.edit().then(function (response) {
                    console.log('Invoked edit: ', response.message);
                });
            },
            isAdmin: function () {
                return this.user.roles.indexOf('ROLE_ADMIN') > 0;
            },
            user: user
        })
    }]);

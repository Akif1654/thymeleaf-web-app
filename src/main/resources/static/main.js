$('document').ready(function () {

    $('.table .btn-warning').on('click', function (event) {

        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (student, status) {
            $('#Id_Edit').val(student.id)
            $('#name_Edit').val(student.name);
            $('#department_Edit').val(student.department);
            $('#updatedBy_Edit').val(student.updatedBy);
            $('#updatedOn_Edit').val(student.updatedOn.substr(0, 10));
        });

        $('#editModal').modal();

    });

    $('.table #deleteButton').on('click', function (event) {

        event.preventDefault();
        var href = $(this).attr('href');
        $('#deleteModal #delRef').attr('href', href);
        $('#deleteModal').modal();
    })


});
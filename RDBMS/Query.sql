/*
* RDBMS question 1
*/
select noOfCopies # retrieve the number of copies
from tbl_book, tbl_book_copies, tbl_library_branch # necessary tables to search
where tbl_book.bookId = tbl_book_copies.bookId # check if the book Id's match
and tbl_book_copies.branchId = tbl_library_branch.branchId # check if branchId's match
and tbl_book.title = 'The Lost Tribe'; # check for correct book

/*
* RDBMS question 2
*/
select branchName, noOfCopies # fields we want to retrieve
from tbl_book, tbl_book_copies, tbl_library_branch # necessary tables to search
where tbl_book.bookId = tbl_book_copies.bookId # check if the book Id's match
and tbl_book_copies.branchId = tbl_library_branch.branchId # check if the brand Id's match
and tbl_book.title = 'The Lost Tribe'; # check if the title is correct

/*
* RDBMS question 3
*/
select name # retrieve the names
from tbl_borrower # necessary table to search
where cardNo # cardNo is only field overlapping in these two tables
not in (select cardNo from tbl_book_loans); # must use select cardNo to know which column to check

/*
* RDBMS question 4
*/
select tbl_book.title, tbl_borrower.name, tbl_borrower.address # retrieve the necessary fields
from tbl_book_loans # table to continuously join on
	inner join tbl_library_branch on tbl_book_loans.branchId = tbl_library_branch.branchId # join tables and check branchId
    inner join tbl_borrower on tbl_book_loans.cardNo = tbl_borrower.cardNo # join tables and check card number
    inner join tbl_book on tbl_book_loans.bookId = tbl_book.bookId # join tables and check book Id
where tbl_library_branch.branchName = 'Sharpstown' # check if correct branch name
and tbl_book_loans.dueDate = '2021-10-31'; # check if correct date

/*
* RDBMS question 5
*/
select tbl_library_branch.branchName, count(tbl_book_loans.bookId) # retrieve necessary fields. count adds up all rows that matches criteria inside ()
from tbl_library_branch # table to search
	inner join tbl_book_loans on tbl_library_branch.branchId = tbl_book_loans.branchId #join with this table and comparing this column
group by tbl_library_branch.branchName; # group by or else there will be one branch id and one integer from count

/*
* RDBMS question 6
*/
select tbl_borrower.name, tbl_borrower.address, tbl_borrower.cardNo, count(tbl_book_loans.bookId) # retrieve these fields
from tbl_borrower, tbl_book_loans # tables to search
where tbl_borrower.cardNo = tbl_book_loans.cardNo # check if card numbers match
group by tbl_borrower.cardNo having count(tbl_book_loans.bookId) > 5; # make sure count is greater than 5

/*
* RDBMS question 7
*/
select tbl_book.title, tbl_book_copies.noOfCopies # retrieve necessary fields
from (((tbl_author natural join tbl_book) natural join tbl_book_copies) natural join tbl_library_branch) # natural join extracts all values that match across each table
where tbl_author.authorName = 'Stephen King' # searching for stephen king as author
and tbl_library_branch.branchName = 'Central'; # searching for central library branch


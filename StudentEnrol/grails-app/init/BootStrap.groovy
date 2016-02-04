import com.studentenrol.*

class BootStrap {

    def init = { servletContext ->

	def course1 = new Course(title:'Interactive Media with Animation',
				
				department:'Computing',

				description:'"Lorem ipsum dolor sit amet, ad sea solum brute sensibus, te summo senserit vix, mel reque corpra vulputate ei."',
				
				leader:'Joe Jojo',

				code:'IMA101',

				startDate:new Date('19/01/2015'),
		
				endDate:new Date('19/01/2020')).save()



	def student1 = new Student(name:'Robert Urry',
	
				  studentid:'22024136',

				  dob:new Date('16/11/1992'),

			  	  email:'robert_urry@live.co.uk',
			
				  username:'B2024136',

			   	  password:'password',

				  course:'Interactive Media with Animation').save()



	def lecturer1 = new Lecturer(name:'Example Name',

				    post:'Example Address',

				    email:'Example Email',

				    department:'Example Department',

				    subject:'Example Subject',

				    research:'Example Research',).save()


    }
    def destroy = {
    }
}

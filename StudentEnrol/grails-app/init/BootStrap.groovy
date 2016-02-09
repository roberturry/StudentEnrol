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


	def leader1 = new Leader(fullName:'Dr Anne Roberts',

				post:'Senior Lecturer',

				subject:'Animation',

				email:'a.d.roberts@theUni.ac.uk',

				office:'Room 1234',

				bio:'"Lorem ipsum dolor sit amet, an ullum epicurei definitionem"').save()



	def module1 = new Module(title:'Web Architectures',

				code:'WA234',

				credits:'5',

				lecturer:'Dr Steve Crossbar',

				description:'"Lorem ipsum dolor sit amet, ludus contentiones ut nam, quaeque dolores facilisi in nec"').save()

	


    }
    def destroy = {
    }
}

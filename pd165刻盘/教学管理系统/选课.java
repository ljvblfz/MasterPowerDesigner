/***********************************************************************
 * Module:  选课.java
 * Author:  coco
 * Purpose: Defines the Class 选课
 ***********************************************************************/

import java.util.*;

/** @pdOid bb1a242a-66a6-4fdd-88f7-a9ad0073afa6 */
public class 选课 {
   /** @pdRoleInfo migr=no name=课程 assc=课程选课 mult=1..1 side=A */
   public 课程 课程;
   /** @pdRoleInfo migr=no name=学生 assc=学生选课 mult=1..1 side=A */
   public 学生 学生;
   /** @pdRoleInfo migr=no name=教师 assc=教师选课 mult=1..1 side=A */
   public 教师 教师;
   
   
   /** @pdGenerated default parent getter */
   public 课程 get课程() {
      return 课程;
   }
   
   /** @pdGenerated default parent setter
     * @param new课程 */
   public void set课程(课程 new课程) {
      if (this.课程 == null || !this.课程.equals(new课程))
      {
         if (this.课程 != null)
         {
            课程 old课程 = this.课程;
            this.课程 = null;
            old课程.remove选课(this);
         }
         if (new课程 != null)
         {
            this.课程 = new课程;
            this.课程.add选课(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 学生 get学生() {
      return 学生;
   }
   
   /** @pdGenerated default parent setter
     * @param new学生 */
   public void set学生(学生 new学生) {
      if (this.学生 == null || !this.学生.equals(new学生))
      {
         if (this.学生 != null)
         {
            学生 old学生 = this.学生;
            this.学生 = null;
            old学生.remove选课(this);
         }
         if (new学生 != null)
         {
            this.学生 = new学生;
            this.学生.add选课(this);
         }
      }
   }
   /** @pdGenerated default parent getter */
   public 教师 get教师() {
      return 教师;
   }
   
   /** @pdGenerated default parent setter
     * @param new教师 */
   public void set教师(教师 new教师) {
      if (this.教师 == null || !this.教师.equals(new教师))
      {
         if (this.教师 != null)
         {
            教师 old教师 = this.教师;
            this.教师 = null;
            old教师.remove选课(this);
         }
         if (new教师 != null)
         {
            this.教师 = new教师;
            this.教师.add选课(this);
         }
      }
   }

}
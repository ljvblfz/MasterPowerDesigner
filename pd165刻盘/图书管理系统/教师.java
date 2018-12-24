/***********************************************************************
 * Module:  教师.java
 * Author:  Administrator
 * Purpose: Defines the Class 教师
 ***********************************************************************/

import java.util.*;

/** @pdOid aacc2e05-0e29-46dd-a986-89e36f68d51f */
public class 教师 {
   /** @pdOid 062eceb2-b2ab-4ad5-a30d-42456c66a426 */
   public java.lang.String 教师姓名;
   /** @pdOid 0b1a71fb-6dfb-4fe8-8598-38c0f48b2242 */
   public java.lang.String 教师性别;
   /** @pdOid 8453a19d-9660-4102-8211-a1f3a4419d29 */
   public java.lang.String 教师民族;
   /** @pdOid 5d85b2f5-e3c7-4c02-b76d-b6e3bfbe3ea9 */
   public java.lang.String 职称;
   /** @pdOid ac76e87e-2482-4ad6-a088-b247e0e8a413 */
   public java.util.Date 教师出生日期;
   /** @pdOid 3d08051e-f266-465f-9aab-45a251f25d95 */
   public java.lang.String 教师政治面貌;
   
   /** @pdRoleInfo migr=no name=部门 assc=部门教师 mult=1..1 side=A */
   public 部门 部门;
   /** @pdRoleInfo migr=no name=读者 assc=读者7 mult=1..1 side=A */
   public 读者 读者;
   
   
   /** @pdGenerated default parent getter */
   public 部门 get部门() {
      return 部门;
   }
   
   /** @pdGenerated default parent setter
     * @param new部门 */
   public void set部门(部门 new部门) {
      if (this.部门 == null || !this.部门.equals(new部门))
      {
         if (this.部门 != null)
         {
            部门 old部门 = this.部门;
            this.部门 = null;
            old部门.remove教师(this);
         }
         if (new部门 != null)
         {
            this.部门 = new部门;
            this.部门.add教师(this);
         }
      }
   }

}
package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Folder-simple-user-bold`: ImageVector
    get() {
        if (`_folder-simple-user-bold` != null) {
            return `_folder-simple-user-bold`!!
        }
        `_folder-simple-user-bold` = Builder(name = "Folder-simple-user-bold", defaultWidth =
                256.0.dp, defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight =
                256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.51f, 197.94f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -57.0f, 0.0f)
                arcToRelative(43.75f, 43.75f, 0.0f, false, false, -15.08f, 23.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.52f, 14.67f)
                arcTo(11.77f, 11.77f, 0.0f, false, false, 160.0f, 236.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.59f, -8.92f)
                curveTo(174.0f, 218.2f, 182.35f, 212.0f, 192.0f, 212.0f)
                reflectiveCurveToRelative(18.0f, 6.2f, 20.4f, 15.08f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.19f, -6.17f)
                arcTo(43.7f, 43.7f, 0.0f, false, false, 220.51f, 197.94f)
                close()
                moveTo(192.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 192.0f, 164.0f)
                close()
                moveTo(236.0f, 88.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(212.0f, 92.0f)
                lineTo(130.67f, 92.0f)
                arcToRelative(20.1f, 20.1f, 0.0f, false, true, -12.0f, -4.0f)
                lineTo(92.0f, 68.0f)
                lineTo(44.0f, 68.0f)
                lineTo(44.0f, 196.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                lineTo(40.0f, 220.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(20.0f, 64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(93.33f, 44.0f)
                arcToRelative(20.12f, 20.12f, 0.0f, false, true, 12.0f, 4.0f)
                lineTo(132.0f, 68.0f)
                horizontalLineToRelative(84.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 236.0f, 88.0f)
                close()
            }
        }
        .build()
        return `_folder-simple-user-bold`!!
    }

private var `_folder-simple-user-bold`: ImageVector? = null

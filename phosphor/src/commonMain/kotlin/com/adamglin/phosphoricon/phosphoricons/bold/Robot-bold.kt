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

public val BoldGroup.`Robot-bold`: ImageVector
    get() {
        if (`_robot-bold` != null) {
            return `_robot-bold`!!
        }
        `_robot-bold` = Builder(name = "Robot-bold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(72.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, true, 16.0f, 16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 104.0f)
                close()
                moveTo(168.0f, 120.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, true, false, -16.0f, -16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 168.0f, 120.0f)
                close()
                moveTo(236.0f, 80.0f)
                lineTo(236.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, 36.0f)
                lineTo(56.0f, 228.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, -36.0f, -36.0f)
                lineTo(20.0f, 80.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 56.0f, 44.0f)
                horizontalLineToRelative(60.0f)
                lineTo(116.0f, 16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                lineTo(140.0f, 44.0f)
                horizontalLineToRelative(60.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 236.0f, 80.0f)
                close()
                moveTo(212.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(56.0f, 68.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 44.0f, 80.0f)
                lineTo(44.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(200.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                close()
                moveTo(200.0f, 162.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, -30.0f, 30.0f)
                lineTo(86.0f, 192.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, -60.0f)
                horizontalLineToRelative(84.0f)
                arcTo(30.0f, 30.0f, 0.0f, false, true, 200.0f, 162.0f)
                close()
                moveTo(120.0f, 156.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(16.0f)
                lineTo(136.0f, 156.0f)
                close()
                moveTo(86.0f, 168.0f)
                lineTo(96.0f, 168.0f)
                lineTo(96.0f, 156.0f)
                lineTo(86.0f, 156.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                close()
                moveTo(176.0f, 162.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -6.0f)
                lineTo(160.0f, 156.0f)
                verticalLineToRelative(12.0f)
                horizontalLineToRelative(10.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 176.0f, 162.0f)
                close()
            }
        }
        .build()
        return `_robot-bold`!!
    }

private var `_robot-bold`: ImageVector? = null

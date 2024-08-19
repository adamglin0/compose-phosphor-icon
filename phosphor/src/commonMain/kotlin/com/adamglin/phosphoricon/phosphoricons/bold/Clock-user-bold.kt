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

public val BoldGroup.`Clock-user-bold`: ImageVector
    get() {
        if (`_clock-user-bold` != null) {
            return `_clock-user-bold`!!
        }
        `_clock-user-bold` = Builder(name = "Clock-user-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(181.36f, 114.73f)
                lineToRelative(-48.0f, 24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 128.0f)
                lineTo(116.0f, 72.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(36.58f)
                lineToRelative(30.63f, -15.31f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 10.73f, 21.46f)
                close()
                moveTo(227.08f, 235.59f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -14.68f, -8.51f)
                curveTo(210.0f, 218.2f, 201.65f, 212.0f, 192.0f, 212.0f)
                reflectiveCurveToRelative(-18.0f, 6.2f, -20.4f, 15.08f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 160.0f, 236.0f)
                arcToRelative(11.77f, 11.77f, 0.0f, false, true, -3.09f, -0.41f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.52f, -14.68f)
                arcToRelative(43.76f, 43.76f, 0.0f, false, true, 15.08f, -23.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 57.0f, 0.0f)
                arcToRelative(43.7f, 43.7f, 0.0f, false, true, 15.08f, 23.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 227.08f, 235.59f)
                close()
                moveTo(180.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 180.0f, 176.0f)
                close()
                moveTo(117.48f, 211.35f)
                arcToRelative(84.0f, 84.0f, 0.0f, true, true, 93.87f, -93.87f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 23.81f, -3.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, false, 114.51f, 235.16f)
                arcToRelative(11.0f, 11.0f, 0.0f, false, false, 1.5f, 0.1f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 1.47f, -23.91f)
                close()
            }
        }
        .build()
        return `_clock-user-bold`!!
    }

private var `_clock-user-bold`: ImageVector? = null

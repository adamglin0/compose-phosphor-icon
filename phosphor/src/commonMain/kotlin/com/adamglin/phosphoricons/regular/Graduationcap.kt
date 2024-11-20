package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) {
            return _graduationCap!!
        }
        _graduationCap = Builder(name = "GraduationCap", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.76f, 88.94f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 14.12f)
                lineTo(32.0f, 117.87f)
                verticalLineToRelative(48.42f)
                arcToRelative(15.91f, 15.91f, 0.0f, false, false, 4.06f, 10.65f)
                curveTo(49.16f, 191.53f, 78.51f, 216.0f, 128.0f, 216.0f)
                arcToRelative(130.0f, 130.0f, 0.0f, false, false, 48.0f, -8.76f)
                lineTo(176.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(192.0f, 199.51f)
                arcToRelative(115.63f, 115.63f, 0.0f, false, false, 27.94f, -22.57f)
                arcTo(15.91f, 15.91f, 0.0f, false, false, 224.0f, 166.29f)
                lineTo(224.0f, 117.87f)
                lineToRelative(27.76f, -14.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -14.12f)
                close()
                moveTo(128.0f, 200.0f)
                curveToRelative(-43.27f, 0.0f, -68.72f, -21.14f, -80.0f, -33.71f)
                lineTo(48.0f, 126.4f)
                lineToRelative(76.24f, 40.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 7.52f, 0.0f)
                lineTo(176.0f, 143.47f)
                verticalLineToRelative(46.34f)
                curveTo(163.4f, 195.69f, 147.52f, 200.0f, 128.0f, 200.0f)
                close()
                moveTo(208.0f, 166.25f)
                arcToRelative(97.83f, 97.83f, 0.0f, false, true, -16.0f, 14.25f)
                lineTo(192.0f, 134.93f)
                lineToRelative(16.0f, -8.53f)
                close()
                moveTo(188.0f, 118.94f)
                lineToRelative(-0.22f, -0.13f)
                lineToRelative(-56.0f, -29.87f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.52f, 14.12f)
                lineTo(171.0f, 128.0f)
                lineToRelative(-43.0f, 22.93f)
                lineTo(25.0f, 96.0f)
                lineTo(128.0f, 41.07f)
                lineTo(231.0f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null

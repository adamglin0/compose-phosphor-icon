package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Videoconference: ImageVector
    get() {
        if (_videoconference != null) {
            return _videoconference!!
        }
        _videoconference = Builder(name = "Videoconference", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 44.0f)
                lineTo(40.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 56.0f)
                lineTo(28.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(216.0f, 212.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 44.0f)
                close()
                moveTo(220.0f, 56.0f)
                verticalLineToRelative(68.0f)
                lineTo(164.0f, 124.0f)
                lineTo(164.0f, 52.0f)
                horizontalLineToRelative(52.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
                moveTo(36.0f, 200.0f)
                lineTo(36.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(156.0f, 52.0f)
                lineTo(156.0f, 204.0f)
                lineTo(40.0f, 204.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 36.0f, 200.0f)
                close()
                moveTo(216.0f, 204.0f)
                lineTo(164.0f, 204.0f)
                lineTo(164.0f, 132.0f)
                horizontalLineToRelative(56.0f)
                verticalLineToRelative(68.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 216.0f, 204.0f)
                close()
                moveTo(184.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 184.0f, 88.0f)
                close()
                moveTo(200.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 168.0f)
                close()
                moveTo(131.87f, 167.0f)
                arcToRelative(36.2f, 36.2f, 0.0f, false, false, -20.43f, -23.67f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -30.88f, 0.0f)
                arcTo(36.28f, 36.28f, 0.0f, false, false, 60.13f, 167.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 63.0f, 171.87f)
                arcToRelative(3.87f, 3.87f, 0.0f, false, false, 1.0f, 0.13f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.87f, -3.0f)
                curveTo(71.0f, 157.0f, 83.05f, 148.0f, 96.0f, 148.0f)
                reflectiveCurveToRelative(25.06f, 9.0f, 28.13f, 21.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.74f, -2.0f)
                close()
                moveTo(76.0f, 120.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 76.0f, 120.0f)
                close()
            }
        }
        .build()
        return _videoconference!!
    }

private var _videoconference: ImageVector? = null

package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Student: ImageVector
    get() {
        if (_student != null) {
            return _student!!
        }
        _student = Builder(name = "Student", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(225.9f, 58.31f)
                lineToRelative(-96.0f, -32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -3.8f, 0.0f)
                lineToRelative(-96.0f, 32.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 26.0f, 64.0f)
                verticalLineToRelative(80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 12.0f, 0.0f)
                verticalLineTo(72.32f)
                lineToRelative(38.68f, 12.9f)
                arcTo(62.0f, 62.0f, 0.0f, false, false, 99.0f, 174.75f)
                curveToRelative(-19.25f, 6.53f, -36.0f, 19.59f, -48.0f, 38.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 61.0f, 219.28f)
                curveTo(76.47f, 195.59f, 100.88f, 182.0f, 128.0f, 182.0f)
                reflectiveCurveToRelative(51.53f, 13.59f, 67.0f, 37.28f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 205.0f, 212.72f)
                curveToRelative(-12.0f, -18.38f, -28.73f, -31.44f, -48.0f, -38.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, false, 22.27f, -89.53f)
                lineTo(225.9f, 69.69f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.38f)
                close()
                moveTo(178.0f, 120.0f)
                arcTo(50.0f, 50.0f, 0.0f, true, true, 88.63f, 89.2f)
                lineToRelative(37.47f, 12.49f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 3.8f, 0.0f)
                lineTo(167.37f, 89.2f)
                arcTo(49.78f, 49.78f, 0.0f, false, true, 178.0f, 120.0f)
                close()
                moveTo(128.0f, 89.68f)
                lineTo(51.0f, 64.0f)
                lineToRelative(77.0f, -25.68f)
                lineTo(205.0f, 64.0f)
                close()
            }
        }
        .build()
        return _student!!
    }

private var _student: ImageVector? = null

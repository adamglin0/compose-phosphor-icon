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

public val LightGroup.Steeringwheel: ImageVector
    get() {
        if (_steeringwheel != null) {
            return _steeringwheel!!
        }
        _steeringwheel = Builder(name = "Steeringwheel", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 230.0f, 128.0f)
                arcTo(102.12f, 102.12f, 0.0f, false, false, 128.0f, 26.0f)
                close()
                moveTo(46.43f, 166.0f)
                horizontalLineToRelative(44.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.87f, 1.3f)
                lineToRelative(18.33f, 49.0f)
                arcTo(90.3f, 90.3f, 0.0f, false, true, 46.43f, 166.0f)
                close()
                moveTo(145.3f, 216.32f)
                lineTo(163.67f, 167.32f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 1.88f, -1.3f)
                horizontalLineToRelative(44.0f)
                arcTo(90.29f, 90.29f, 0.0f, false, true, 145.3f, 216.32f)
                close()
                moveTo(214.17f, 154.0f)
                lineTo(165.55f, 154.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, -13.11f, 9.09f)
                lineToRelative(-20.55f, 54.82f)
                curveToRelative(-1.29f, 0.06f, -2.59f, 0.09f, -3.89f, 0.09f)
                reflectiveCurveToRelative(-2.63f, 0.0f, -3.94f, -0.09f)
                lineToRelative(-20.5f, -54.81f)
                arcTo(14.06f, 14.06f, 0.0f, false, false, 90.45f, 154.0f)
                lineTo(41.83f, 154.0f)
                curveToRelative(-0.65f, -2.17f, -1.23f, -4.37f, -1.72f, -6.61f)
                arcToRelative(122.0f, 122.0f, 0.0f, false, true, 175.78f, 0.0f)
                curveTo(215.4f, 149.63f, 214.82f, 151.83f, 214.17f, 154.0f)
                close()
                moveTo(128.0f, 98.0f)
                arcToRelative(134.38f, 134.38f, 0.0f, false, false, -89.88f, 34.64f)
                curveTo(38.0f, 131.1f, 38.0f, 129.56f, 38.0f, 128.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, 180.0f, 0.0f)
                curveToRelative(0.0f, 1.56f, 0.0f, 3.1f, -0.12f, 4.64f)
                arcTo(134.38f, 134.38f, 0.0f, false, false, 128.0f, 98.0f)
                close()
                moveTo(138.0f, 140.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 140.0f)
                close()
            }
        }
        .build()
        return _steeringwheel!!
    }

private var _steeringwheel: ImageVector? = null

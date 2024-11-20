package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Cylinder: ImageVector
    get() {
        if (_cylinder != null) {
            return _cylinder!!
        }
        _cylinder = Builder(name = "Cylinder", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(179.14f, 24.08f)
                curveTo(165.28f, 16.29f, 147.12f, 12.0f, 128.0f, 12.0f)
                reflectiveCurveTo(90.72f, 16.29f, 76.86f, 24.08f)
                curveTo(60.83f, 33.1f, 52.0f, 45.86f, 52.0f, 60.0f)
                lineTo(52.0f, 196.0f)
                curveToRelative(0.0f, 14.14f, 8.83f, 26.9f, 24.86f, 35.92f)
                curveTo(90.72f, 239.71f, 108.88f, 244.0f, 128.0f, 244.0f)
                reflectiveCurveToRelative(37.28f, -4.29f, 51.14f, -12.08f)
                curveToRelative(16.0f, -9.0f, 24.86f, -21.78f, 24.86f, -35.92f)
                lineTo(204.0f, 60.0f)
                curveTo(204.0f, 45.86f, 195.17f, 33.1f, 179.14f, 24.08f)
                close()
                moveTo(88.63f, 45.0f)
                curveToRelative(10.17f, -5.72f, 24.52f, -9.0f, 39.37f, -9.0f)
                reflectiveCurveToRelative(29.2f, 3.28f, 39.37f, 9.0f)
                curveToRelative(8.0f, 4.52f, 12.63f, 10.0f, 12.63f, 15.0f)
                reflectiveCurveToRelative(-4.6f, 10.48f, -12.63f, 15.0f)
                curveToRelative(-10.17f, 5.72f, -24.52f, 9.0f, -39.37f, 9.0f)
                reflectiveCurveToRelative(-29.2f, -3.28f, -39.37f, -9.0f)
                curveTo(80.6f, 70.48f, 76.0f, 65.0f, 76.0f, 60.0f)
                reflectiveCurveTo(80.6f, 49.52f, 88.63f, 45.0f)
                close()
                moveTo(167.37f, 211.0f)
                curveToRelative(-10.17f, 5.72f, -24.52f, 9.0f, -39.37f, 9.0f)
                reflectiveCurveToRelative(-29.2f, -3.28f, -39.37f, -9.0f)
                curveTo(80.6f, 206.48f, 76.0f, 201.0f, 76.0f, 196.0f)
                lineTo(76.0f, 95.4f)
                lineToRelative(0.86f, 0.52f)
                curveTo(90.72f, 103.71f, 108.88f, 108.0f, 128.0f, 108.0f)
                reflectiveCurveToRelative(37.28f, -4.29f, 51.14f, -12.08f)
                lineToRelative(0.86f, -0.52f)
                lineTo(180.0f, 196.0f)
                curveTo(180.0f, 201.0f, 175.4f, 206.48f, 167.37f, 211.0f)
                close()
            }
        }
        .build()
        return _cylinder!!
    }

private var _cylinder: ImageVector? = null

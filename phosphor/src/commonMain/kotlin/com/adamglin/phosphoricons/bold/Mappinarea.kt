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

public val BoldGroup.Mappinarea: ImageVector
    get() {
        if (_mappinarea != null) {
            return _mappinarea!!
        }
        _mappinarea = Builder(name = "Mappinarea", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(108.0f, 80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 108.0f, 80.0f)
                close()
                moveTo(60.0f, 80.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, 136.0f, 0.0f)
                curveToRelative(0.0f, 62.25f, -59.51f, 97.0f, -62.05f, 98.42f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -11.9f, 0.0f)
                curveTo(119.51f, 177.0f, 60.0f, 142.25f, 60.0f, 80.0f)
                close()
                moveTo(84.0f, 80.0f)
                curveToRelative(0.0f, 38.2f, 30.71f, 64.2f, 44.0f, 73.64f)
                curveTo(141.21f, 144.15f, 172.0f, 118.0f, 172.0f, 80.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                close()
                moveTo(208.57f, 145.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.14f, 22.19f)
                curveTo(213.56f, 173.61f, 220.0f, 180.27f, 220.0f, 184.0f)
                curveToRelative(0.0f, 4.0f, -7.13f, 11.07f, -22.77f, 17.08f)
                curveToRelative(-18.3f, 7.0f, -42.89f, 10.92f, -69.23f, 10.92f)
                reflectiveCurveToRelative(-50.93f, -3.88f, -69.23f, -10.92f)
                curveTo(43.12f, 195.07f, 36.0f, 188.0f, 36.0f, 184.0f)
                curveToRelative(0.0f, -3.73f, 6.44f, -10.39f, 20.57f, -16.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -9.14f, -22.19f)
                curveTo(31.27f, 152.25f, 12.0f, 164.31f, 12.0f, 184.0f)
                curveToRelative(0.0f, 34.14f, 58.36f, 52.0f, 116.0f, 52.0f)
                curveToRelative(29.22f, 0.0f, 56.86f, -4.44f, 77.85f, -12.52f)
                curveTo(220.1f, 218.0f, 244.0f, 205.59f, 244.0f, 184.0f)
                curveTo(244.0f, 164.31f, 224.73f, 152.25f, 208.57f, 145.6f)
                close()
            }
        }
        .build()
        return _mappinarea!!
    }

private var _mappinarea: ImageVector? = null

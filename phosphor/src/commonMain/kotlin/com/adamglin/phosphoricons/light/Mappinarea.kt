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

public val LightGroup.Mappinarea: ImageVector
    get() {
        if (_mappinarea != null) {
            return _mappinarea!!
        }
        _mappinarea = Builder(name = "Mappinarea", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(114.0f, 80.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, true, true, 14.0f, 14.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, true, 114.0f, 80.0f)
                close()
                moveTo(66.0f, 80.0f)
                arcToRelative(62.0f, 62.0f, 0.0f, false, true, 124.0f, 0.0f)
                curveToRelative(0.0f, 58.81f, -56.61f, 91.83f, -59.0f, 93.21f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                curveTo(122.61f, 171.83f, 66.0f, 138.81f, 66.0f, 80.0f)
                close()
                moveTo(78.0f, 80.0f)
                curveToRelative(0.0f, 44.52f, 38.81f, 73.49f, 50.0f, 80.91f)
                curveToRelative(11.18f, -7.42f, 50.0f, -36.38f, 50.0f, -80.91f)
                arcTo(50.0f, 50.0f, 0.0f, false, false, 78.0f, 80.0f)
                close()
                moveTo(202.08f, 149.51f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.16f, 11.25f)
                curveTo(215.5f, 167.25f, 226.0f, 175.94f, 226.0f, 184.0f)
                curveToRelative(0.0f, 16.08f, -40.25f, 34.0f, -98.0f, 34.0f)
                reflectiveCurveToRelative(-98.0f, -17.92f, -98.0f, -34.0f)
                curveToRelative(0.0f, -8.06f, 10.5f, -16.75f, 28.08f, -23.24f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, false, -4.16f, -11.25f)
                curveTo(30.76f, 158.06f, 18.0f, 170.31f, 18.0f, 184.0f)
                curveToRelative(0.0f, 13.34f, 12.18f, 25.38f, 34.31f, 33.88f)
                curveTo(72.62f, 225.7f, 99.5f, 230.0f, 128.0f, 230.0f)
                reflectiveCurveToRelative(55.38f, -4.3f, 75.69f, -12.12f)
                curveTo(225.82f, 209.38f, 238.0f, 197.34f, 238.0f, 184.0f)
                curveTo(238.0f, 170.31f, 225.24f, 158.06f, 202.08f, 149.51f)
                close()
            }
        }
        .build()
        return _mappinarea!!
    }

private var _mappinarea: ImageVector? = null

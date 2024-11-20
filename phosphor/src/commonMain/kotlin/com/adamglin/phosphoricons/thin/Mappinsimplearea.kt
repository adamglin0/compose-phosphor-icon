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

public val ThinGroup.MapPinSimpleArea: ImageVector
    get() {
        if (_mapPinSimpleArea != null) {
            return _mapPinSimpleArea!!
        }
        _mapPinSimpleArea = Builder(name = "MapPinSimpleArea", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(124.0f, 99.77f)
                verticalLineTo(176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(99.77f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, -8.0f, 0.0f)
                close()
                moveTo(128.0f, 36.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, -28.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 128.0f, 36.0f)
                close()
                moveTo(236.0f, 176.0f)
                curveToRelative(0.0f, 12.46f, -11.73f, 23.83f, -33.0f, 32.0f)
                curveToRelative(-20.09f, 7.73f, -46.72f, 12.0f, -75.0f, 12.0f)
                reflectiveCurveToRelative(-54.89f, -4.25f, -75.0f, -12.0f)
                curveToRelative(-21.29f, -8.19f, -33.0f, -19.56f, -33.0f, -32.0f)
                curveToRelative(0.0f, -18.55f, 25.81f, -34.22f, 67.37f, -40.88f)
                arcTo(4.0f, 4.0f, 0.0f, true, true, 88.63f, 143.0f)
                curveTo(52.93f, 148.74f, 28.0f, 162.3f, 28.0f, 176.0f)
                curveToRelative(0.0f, 17.39f, 40.18f, 36.0f, 100.0f, 36.0f)
                reflectiveCurveToRelative(100.0f, -18.61f, 100.0f, -36.0f)
                curveToRelative(0.0f, -13.7f, -24.93f, -27.26f, -60.63f, -33.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 1.26f, -7.89f)
                curveTo(210.19f, 141.78f, 236.0f, 157.45f, 236.0f, 176.0f)
                close()
            }
        }
        .build()
        return _mapPinSimpleArea!!
    }

private var _mapPinSimpleArea: ImageVector? = null

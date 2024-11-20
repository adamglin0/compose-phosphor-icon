package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Clover: ImageVector
    get() {
        if (_clover != null) {
            return _clover!!
        }
        _clover = Builder(name = "Clover", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 120.0f)
                curveToRelative(0.0f, 22.63f, -6.0f, 36.72f, -17.93f, 41.87f)
                arcToRelative(27.3f, 27.3f, 0.0f, false, true, -11.0f, 2.13f)
                arcToRelative(41.75f, 41.75f, 0.0f, false, true, -8.4f, -0.93f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, -2.52f, -1.64f)
                arcToRelative(368.49f, 368.49f, 0.0f, false, false, -47.75f, -55.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.0f, 11.62f)
                curveToRelative(14.84f, 13.91f, 64.13f, 63.49f, 78.32f, 120.27f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.82f, 9.7f)
                arcTo(8.13f, 8.13f, 0.0f, false, true, 200.0f, 248.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.75f, -6.06f)
                curveToRelative(-4.12f, -16.47f, -11.65f, -32.48f, -20.46f, -47.09f)
                arcToRelative(25.85f, 25.85f, 0.0f, false, true, -1.9f, 7.21f)
                curveTo(164.72f, 214.0f, 150.63f, 220.0f, 128.0f, 220.0f)
                reflectiveCurveToRelative(-36.72f, -6.0f, -41.88f, -17.94f)
                curveToRelative(-5.45f, -12.58f, -0.39f, -30.82f, 15.0f, -54.21f)
                curveToRelative(0.68f, -1.0f, 1.36f, -2.0f, 2.0f, -3.0f)
                lineToRelative(-3.0f, 2.0f)
                curveTo(82.84f, 158.27f, 68.35f, 164.0f, 56.89f, 164.0f)
                arcToRelative(27.3f, 27.3f, 0.0f, false, true, -11.0f, -2.13f)
                curveTo(34.0f, 156.72f, 28.0f, 142.63f, 28.0f, 120.0f)
                reflectiveCurveToRelative(6.0f, -36.72f, 17.93f, -41.88f)
                curveToRelative(12.59f, -5.45f, 30.83f, -0.39f, 54.22f, 15.0f)
                lineToRelative(3.0f, 2.0f)
                quadToRelative(-1.0f, -1.5f, -2.0f, -3.0f)
                curveToRelative(-15.41f, -23.39f, -20.47f, -41.63f, -15.0f, -54.22f)
                curveTo(91.28f, 26.0f, 105.37f, 20.0f, 128.0f, 20.0f)
                reflectiveCurveToRelative(36.72f, 6.0f, 41.88f, 17.93f)
                curveToRelative(5.45f, 12.59f, 0.39f, 30.83f, -15.0f, 54.22f)
                quadToRelative(-1.0f, 1.53f, -2.0f, 3.0f)
                lineToRelative(3.0f, -2.0f)
                curveToRelative(23.39f, -15.41f, 41.63f, -20.47f, 54.22f, -15.0f)
                curveTo(222.0f, 83.28f, 228.0f, 97.37f, 228.0f, 120.0f)
                close()
            }
        }
        .build()
        return _clover!!
    }

private var _clover: ImageVector? = null

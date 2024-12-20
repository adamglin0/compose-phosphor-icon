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

public val FillGroup.Eyes: ImageVector
    get() {
        if (_eyes != null) {
            return _eyes!!
        }
        _eyes = Builder(name = "Eyes", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 32.0f)
                curveToRelative(-20.61f, 0.0f, -38.28f, 18.16f, -48.0f, 45.85f)
                curveTo(118.28f, 50.16f, 100.61f, 32.0f, 80.0f, 32.0f)
                curveToRelative(-31.4f, 0.0f, -56.0f, 42.17f, -56.0f, 96.0f)
                reflectiveCurveToRelative(24.6f, 96.0f, 56.0f, 96.0f)
                curveToRelative(20.61f, 0.0f, 38.28f, -18.16f, 48.0f, -45.85f)
                curveToRelative(9.72f, 27.69f, 27.39f, 45.85f, 48.0f, 45.85f)
                curveToRelative(31.4f, 0.0f, 56.0f, -42.17f, 56.0f, -96.0f)
                reflectiveCurveTo(207.4f, 32.0f, 176.0f, 32.0f)
                close()
                moveTo(106.92f, 186.39f)
                curveTo(99.43f, 200.12f, 89.62f, 208.0f, 80.0f, 208.0f)
                reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f)
                arcToRelative(104.81f, 104.81f, 0.0f, false, true, -10.24f, -29.23f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -58.32f)
                arcTo(104.81f, 104.81f, 0.0f, false, true, 53.08f, 69.61f)
                curveTo(60.57f, 55.88f, 70.38f, 48.0f, 80.0f, 48.0f)
                reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f)
                curveTo(115.35f, 85.07f, 120.0f, 105.81f, 120.0f, 128.0f)
                reflectiveCurveTo(115.35f, 170.93f, 106.92f, 186.39f)
                close()
                moveTo(202.92f, 186.39f)
                curveTo(195.43f, 200.12f, 185.62f, 208.0f, 176.0f, 208.0f)
                reflectiveCurveToRelative(-19.43f, -7.88f, -26.92f, -21.61f)
                arcToRelative(104.81f, 104.81f, 0.0f, false, true, -10.24f, -29.23f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, false, 0.0f, -58.32f)
                arcToRelative(104.81f, 104.81f, 0.0f, false, true, 10.24f, -29.23f)
                curveTo(156.57f, 55.88f, 166.38f, 48.0f, 176.0f, 48.0f)
                reflectiveCurveToRelative(19.43f, 7.88f, 26.92f, 21.61f)
                curveTo(211.35f, 85.07f, 216.0f, 105.81f, 216.0f, 128.0f)
                reflectiveCurveTo(211.35f, 170.93f, 202.92f, 186.39f)
                close()
            }
        }
        .build()
        return _eyes!!
    }

private var _eyes: ImageVector? = null

package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.ApproximateEquals: ImageVector
    get() {
        if (_approximateEquals != null) {
            return _approximateEquals!!
        }
        _approximateEquals = Builder(name = "ApproximateEquals", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 56.0f)
                verticalLineTo(200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                horizontalLineTo(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineTo(56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 56.0f, 40.0f)
                horizontalLineTo(200.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 216.0f, 56.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.16f, 153.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 11.25f)
                curveToRelative(-17.36f, 14.38f, -32.86f, 19.49f, -47.0f, 19.49f)
                curveToRelative(-18.58f, 0.0f, -34.82f, -8.81f, -49.93f, -17.0f)
                curveToRelative(-25.35f, -13.75f, -47.24f, -25.63f, -79.07f, 0.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.22f, -12.3f)
                curveToRelative(40.17f, -33.27f, 70.32f, -16.92f, 96.93f, -2.48f)
                curveToRelative(25.35f, 13.75f, 47.24f, 25.62f, 79.07f, -0.75f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 222.16f, 153.26f)
                close()
                moveTo(45.16f, 103.8f)
                curveToRelative(31.83f, -26.37f, 53.72f, -14.5f, 79.07f, -0.75f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f)
                curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.3f)
                curveToRelative(-31.83f, 26.37f, -53.72f, 14.49f, -79.07f, 0.74f)
                curveToRelative(-26.61f, -14.43f, -56.76f, -30.79f, -96.93f, 2.48f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 45.11f, 103.8f)
                close()
            }
        }
        .build()
        return _approximateEquals!!
    }

private var _approximateEquals: ImageVector? = null

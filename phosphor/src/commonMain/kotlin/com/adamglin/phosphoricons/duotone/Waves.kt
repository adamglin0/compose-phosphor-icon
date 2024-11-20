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

public val DuotoneGroup.Waves: ImageVector
    get() {
        if (_waves != null) {
            return _waves!!
        }
        _waves = Builder(name = "Waves", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(216.0f, 70.39f)
                verticalLineToRelative(112.0f)
                curveToRelative(-72.0f, 59.69f, -104.0f, -56.47f, -176.0f, 3.22f)
                verticalLineToRelative(-112.0f)
                curveTo(112.0f, 13.92f, 144.0f, 130.08f, 216.0f, 70.39f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.16f, 177.25f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.0f, 11.25f)
                curveToRelative(-17.36f, 14.39f, -32.86f, 19.5f, -47.0f, 19.5f)
                curveToRelative(-18.58f, 0.0f, -34.82f, -8.82f, -49.93f, -17.0f)
                curveToRelative(-25.35f, -13.76f, -47.24f, -25.64f, -79.07f, 0.74f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -10.22f, -12.31f)
                curveToRelative(40.17f, -33.28f, 70.32f, -16.92f, 96.93f, -2.48f)
                curveToRelative(25.35f, 13.75f, 47.24f, 25.63f, 79.07f, -0.74f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 222.16f, 177.25f)
                close()
                moveTo(210.89f, 120.25f)
                curveToRelative(-31.83f, 26.38f, -53.72f, 14.5f, -79.07f, 0.74f)
                curveToRelative(-26.61f, -14.43f, -56.76f, -30.79f, -96.93f, 2.49f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 10.22f, 12.31f)
                curveToRelative(31.83f, -26.38f, 53.72f, -14.5f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.19f, 31.35f, 17.0f, 49.93f, 17.0f)
                curveToRelative(14.14f, 0.0f, 29.64f, -5.11f, 47.0f, -19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f)
                close()
                moveTo(45.11f, 79.8f)
                curveToRelative(31.83f, -26.37f, 53.72f, -14.49f, 79.07f, -0.74f)
                curveToRelative(15.11f, 8.2f, 31.35f, 17.0f, 49.93f, 17.0f)
                curveToRelative(14.14f, 0.0f, 29.64f, -5.12f, 47.0f, -19.5f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, -10.22f, -12.31f)
                curveToRelative(-31.83f, 26.38f, -53.72f, 14.5f, -79.07f, 0.74f)
                curveTo(105.21f, 50.58f, 75.06f, 34.22f, 34.89f, 67.5f)
                arcTo(8.0f, 8.0f, 0.0f, true, false, 45.11f, 79.8f)
                close()
            }
        }
        .build()
        return _waves!!
    }

private var _waves: ImageVector? = null

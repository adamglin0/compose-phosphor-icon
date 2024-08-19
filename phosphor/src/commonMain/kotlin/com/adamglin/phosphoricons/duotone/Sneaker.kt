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

public val DuotoneGroup.Sneaker: ImageVector
    get() {
        if (_sneaker != null) {
            return _sneaker!!
        }
        _sneaker = Builder(name = "Sneaker", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(248.0f, 167.06f)
                verticalLineTo(168.0f)
                horizontalLineTo(32.0f)
                verticalLineTo(75.54f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 37.27f, 68.0f)
                lineTo(113.0f, 40.48f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.0f, 4.27f)
                lineTo(146.27f, 99.1f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 19.12f, 17.36f)
                lineToRelative(60.73f, 20.25f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 248.0f, 167.06f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.65f, 129.11f)
                lineToRelative(-60.73f, -20.24f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, -14.32f, -13.0f)
                lineTo(130.39f, 41.6f)
                reflectiveCurveToRelative(0.0f, -0.07f, 0.0f, -0.1f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 110.25f, 33.0f)
                lineTo(34.53f, 60.49f)
                arcTo(16.05f, 16.05f, 0.0f, false, false, 24.0f, 75.53f)
                verticalLineTo(192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineTo(240.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                verticalLineTo(167.06f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 228.65f, 129.11f)
                close()
                moveTo(40.0f, 75.53f)
                lineTo(115.72f, 48.0f)
                lineToRelative(7.11f, 16.63f)
                lineToRelative(-21.56f, 7.85f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 104.0f, 88.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f)
                lineToRelative(22.4f, -8.14f)
                lineToRelative(4.74f, 11.07f)
                lineToRelative(-16.6f, 6.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 120.0f, 112.0f)
                arcToRelative(7.91f, 7.91f, 0.0f, false, false, 2.73f, -0.49f)
                lineToRelative(17.6f, -6.4f)
                arcToRelative(40.06f, 40.06f, 0.0f, false, false, 7.68f, 10.0f)
                lineToRelative(-14.74f, 5.36f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 136.0f, 136.0f)
                arcToRelative(8.14f, 8.14f, 0.0f, false, false, 2.73f, -0.48f)
                lineToRelative(28.0f, -10.18f)
                lineToRelative(56.87f, 18.95f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 238.93f, 160.0f)
                horizontalLineTo(40.0f)
                close()
                moveTo(240.0f, 192.0f)
                horizontalLineTo(40.0f)
                verticalLineTo(176.0f)
                horizontalLineTo(240.0f)
                close()
            }
        }
        .build()
        return _sneaker!!
    }

private var _sneaker: ImageVector? = null

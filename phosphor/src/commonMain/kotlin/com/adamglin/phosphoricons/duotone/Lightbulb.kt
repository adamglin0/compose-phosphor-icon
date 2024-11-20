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

public val DuotoneGroup.Lightbulb: ImageVector
    get() {
        if (_lightbulb != null) {
            return _lightbulb!!
        }
        _lightbulb = Builder(name = "Lightbulb", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(208.0f, 104.0f)
                arcToRelative(79.86f, 79.86f, 0.0f, false, true, -30.59f, 62.92f)
                arcTo(24.29f, 24.29f, 0.0f, false, false, 168.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(24.11f, 24.11f, 0.0f, false, false, -9.3f, -19.0f)
                arcTo(79.87f, 79.87f, 0.0f, false, true, 48.0f, 104.45f)
                curveTo(47.76f, 61.09f, 82.72f, 25.0f, 126.07f, 24.0f)
                arcTo(80.0f, 80.0f, 0.0f, false, true, 208.0f, 104.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, true, -33.64f, 69.21f)
                arcTo(16.24f, 16.24f, 0.0f, false, false, 176.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.23f, -12.66f)
                arcTo(87.59f, 87.59f, 0.0f, false, true, 40.0f, 104.49f)
                curveTo(39.74f, 56.83f, 78.26f, 17.14f, 125.88f, 16.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 104.0f)
                close()
                moveTo(200.0f, 104.0f)
                arcToRelative(72.0f, 72.0f, 0.0f, false, false, -73.74f, -72.0f)
                curveToRelative(-39.0f, 0.92f, -70.47f, 33.39f, -70.26f, 72.39f)
                arcToRelative(71.65f, 71.65f, 0.0f, false, false, 27.64f, 56.3f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 96.0f, 186.0f)
                verticalLineToRelative(6.0f)
                horizontalLineToRelative(64.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(32.15f, 32.15f, 0.0f, false, true, 12.47f, -25.35f)
                arcTo(71.65f, 71.65f, 0.0f, false, false, 200.0f, 104.0f)
                close()
                moveTo(183.89f, 94.66f)
                arcToRelative(57.6f, 57.6f, 0.0f, false, false, -46.56f, -46.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -2.66f, 15.78f)
                curveToRelative(16.57f, 2.79f, 30.63f, 16.85f, 33.44f, 33.45f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 176.0f, 104.0f)
                arcToRelative(9.0f, 9.0f, 0.0f, false, false, 1.35f, -0.11f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 183.89f, 94.66f)
                close()
            }
        }
        .build()
        return _lightbulb!!
    }

private var _lightbulb: ImageVector? = null

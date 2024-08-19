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

public val ThinGroup.Wheelchair: ImageVector
    get() {
        if (_wheelchair != null) {
            return _wheelchair!!
        }
        _wheelchair = Builder(name = "Wheelchair", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(251.79f, 190.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.06f, -2.52f)
                lineToRelative(-20.7f, 6.9f)
                lineToRelative(-30.45f, -60.9f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 192.0f, 132.0f)
                horizontalLineTo(108.0f)
                verticalLineTo(100.15f)
                curveToRelative(1.32f, -0.09f, 2.65f, -0.15f, 4.0f, -0.15f)
                horizontalLineToRelative(56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                horizontalLineTo(112.0f)
                curveToRelative(-1.34f, 0.0f, -2.68f, 0.0f, -4.0f, 0.13f)
                verticalLineTo(75.71f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, false, -8.0f, 0.0f)
                verticalLineTo(93.08f)
                arcTo(68.0f, 68.0f, 0.0f, false, false, 112.0f, 228.0f)
                curveToRelative(31.72f, 0.0f, 60.27f, -21.45f, 67.87f, -51.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -7.74f, -2.0f)
                curveToRelative(-6.71f, 26.08f, -32.0f, 45.0f, -60.13f, 45.0f)
                arcToRelative(60.0f, 60.0f, 0.0f, false, true, -12.0f, -118.79f)
                verticalLineTo(136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(85.53f)
                lineToRelative(30.89f, 61.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 224.0f, 204.0f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, false, 1.26f, -0.21f)
                lineToRelative(24.0f, -8.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 251.79f, 190.73f)
                close()
                moveTo(84.0f, 48.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, 20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 84.0f, 48.0f)
                close()
            }
        }
        .build()
        return _wheelchair!!
    }

private var _wheelchair: ImageVector? = null

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

public val ThinGroup.Graduationcap: ImageVector
    get() {
        if (_graduationcap != null) {
            return _graduationcap!!
        }
        _graduationcap = Builder(name = "Graduationcap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.88f, 92.47f)
                lineToRelative(-120.0f, -64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, 0.0f)
                lineToRelative(-120.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 7.06f)
                lineTo(36.0f, 115.47f)
                verticalLineToRelative(50.82f)
                arcToRelative(11.92f, 11.92f, 0.0f, false, false, 3.0f, 8.0f)
                curveToRelative(12.65f, 14.09f, 41.0f, 37.73f, 89.0f, 37.73f)
                curveToRelative(21.0f, 0.0f, 38.2f, -4.52f, 52.0f, -10.79f)
                lineTo(180.0f, 240.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(188.0f, 197.18f)
                arcToRelative(111.64f, 111.64f, 0.0f, false, false, 29.0f, -22.91f)
                arcToRelative(11.94f, 11.94f, 0.0f, false, false, 3.0f, -8.0f)
                lineTo(220.0f, 115.47f)
                lineToRelative(29.88f, -15.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -7.06f)
                close()
                moveTo(128.0f, 204.0f)
                curveToRelative(-44.83f, 0.0f, -71.25f, -22.0f, -83.0f, -35.08f)
                arcToRelative(3.92f, 3.92f, 0.0f, false, true, -1.0f, -2.63f)
                lineTo(44.0f, 119.73f)
                lineToRelative(82.12f, 43.8f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.76f, 0.0f)
                lineTo(180.0f, 136.8f)
                verticalLineToRelative(55.53f)
                curveTo(166.58f, 199.0f, 149.39f, 204.0f, 128.0f, 204.0f)
                close()
                moveTo(212.0f, 166.29f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.0f, 2.64f)
                arcToRelative(103.32f, 103.32f, 0.0f, false, true, -23.0f, 19.0f)
                verticalLineToRelative(-55.4f)
                lineToRelative(24.0f, -12.8f)
                close()
                moveTo(187.41f, 123.78f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.53f, -1.44f)
                lineToRelative(-56.0f, -29.87f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.76f, 7.06f)
                lineTo(179.5f, 128.0f)
                lineTo(128.0f, 155.47f)
                lineTo(16.5f, 96.0f)
                lineTo(128.0f, 36.53f)
                lineTo(239.5f, 96.0f)
                close()
            }
        }
        .build()
        return _graduationcap!!
    }

private var _graduationcap: ImageVector? = null

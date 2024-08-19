package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Graduationcap: ImageVector
    get() {
        if (_graduationcap != null) {
            return _graduationcap!!
        }
        _graduationcap = Builder(name = "Graduationcap", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.8f, 85.49f)
                lineToRelative(-116.0f, -64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, 0.0f)
                lineToRelative(-116.0f, 64.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 21.0f)
                lineToRelative(21.8f, 12.0f)
                verticalLineToRelative(47.76f)
                arcToRelative(19.89f, 19.89f, 0.0f, false, false, 5.09f, 13.32f)
                curveTo(46.63f, 194.7f, 77.0f, 220.0f, 128.0f, 220.0f)
                arcToRelative(136.88f, 136.88f, 0.0f, false, false, 40.0f, -5.75f)
                lineTo(168.0f, 240.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                lineTo(192.0f, 204.12f)
                arcToRelative(119.53f, 119.53f, 0.0f, false, false, 30.91f, -24.51f)
                arcTo(19.89f, 19.89f, 0.0f, false, false, 228.0f, 166.29f)
                lineTo(228.0f, 118.53f)
                lineToRelative(21.8f, -12.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -21.0f)
                close()
                moveTo(128.0f, 45.71f)
                lineTo(219.16f, 96.0f)
                lineTo(186.0f, 114.3f)
                arcToRelative(1.88f, 1.88f, 0.0f, false, true, -0.18f, -0.12f)
                lineToRelative(-52.0f, -28.69f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.6f, 21.0f)
                lineToRelative(39.0f, 21.49f)
                lineTo(128.0f, 146.3f)
                lineTo(36.84f, 96.0f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-40.42f, 0.0f, -64.65f, -19.07f, -76.0f, -31.27f)
                verticalLineToRelative(-33.0f)
                lineToRelative(70.2f, 38.74f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.6f, 0.0f)
                lineTo(168.0f, 151.64f)
                verticalLineToRelative(37.23f)
                arcTo(110.46f, 110.46f, 0.0f, false, true, 128.0f, 196.0f)
                close()
                moveTo(204.0f, 164.73f)
                arcToRelative(93.21f, 93.21f, 0.0f, false, true, -12.0f, 10.81f)
                lineTo(192.0f, 138.39f)
                lineToRelative(12.0f, -6.62f)
                close()
            }
        }
        .build()
        return _graduationcap!!
    }

private var _graduationcap: ImageVector? = null

package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.CompassRose: ImageVector
    get() {
        if (_compassRose != null) {
            return _compassRose!!
        }
        _compassRose = Builder(name = "CompassRose", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(249.46f, 122.18f)
                lineToRelative(-28.34f, -7.09f)
                arcTo(93.87f, 93.87f, 0.0f, false, false, 140.9f, 34.88f)
                lineTo(133.82f, 6.54f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -11.64f, 0.0f)
                lineTo(115.1f, 34.88f)
                arcToRelative(93.87f, 93.87f, 0.0f, false, false, -80.22f, 80.21f)
                lineTo(6.54f, 122.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 11.64f)
                lineToRelative(28.34f, 7.09f)
                arcToRelative(93.87f, 93.87f, 0.0f, false, false, 80.22f, 80.21f)
                lineToRelative(7.08f, 28.34f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 11.64f, 0.0f)
                lineToRelative(7.08f, -28.34f)
                arcToRelative(93.87f, 93.87f, 0.0f, false, false, 80.22f, -80.21f)
                lineToRelative(28.34f, -7.09f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -11.64f)
                close()
                moveTo(208.41f, 111.92f)
                lineTo(157.0f, 99.05f)
                lineTo(144.08f, 47.59f)
                arcTo(81.87f, 81.87f, 0.0f, false, true, 208.41f, 111.92f)
                close()
                moveTo(145.41f, 102.16f)
                lineTo(128.0f, 119.51f)
                lineToRelative(-17.36f, -17.35f)
                lineTo(128.0f, 32.74f)
                close()
                moveTo(111.92f, 47.59f)
                lineTo(99.05f, 99.05f)
                lineTo(47.59f, 111.92f)
                arcTo(81.87f, 81.87f, 0.0f, false, true, 111.92f, 47.59f)
                close()
                moveTo(102.16f, 110.65f)
                lineTo(119.52f, 128.0f)
                lineToRelative(-17.36f, 17.35f)
                lineTo(32.74f, 128.0f)
                close()
                moveTo(47.59f, 144.08f)
                lineTo(99.05f, 157.0f)
                lineToRelative(12.87f, 51.46f)
                arcTo(81.87f, 81.87f, 0.0f, false, true, 47.59f, 144.08f)
                close()
                moveTo(110.64f, 153.84f)
                lineTo(128.0f, 136.49f)
                lineToRelative(17.36f, 17.35f)
                lineTo(128.0f, 223.26f)
                close()
                moveTo(144.08f, 208.41f)
                lineTo(157.0f, 157.0f)
                lineToRelative(51.46f, -12.87f)
                arcTo(81.87f, 81.87f, 0.0f, false, true, 144.08f, 208.41f)
                close()
                moveTo(153.84f, 145.35f)
                lineTo(136.48f, 128.0f)
                lineToRelative(17.36f, -17.35f)
                lineTo(223.26f, 128.0f)
                close()
            }
        }
        .build()
        return _compassRose!!
    }

private var _compassRose: ImageVector? = null

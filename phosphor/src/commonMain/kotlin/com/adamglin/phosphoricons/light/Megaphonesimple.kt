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

public val LightGroup.Megaphonesimple: ImageVector
    get() {
        if (_megaphonesimple != null) {
            return _megaphonesimple!!
        }
        _megaphonesimple = Builder(name = "Megaphonesimple", defaultWidth = 256.0.dp, defaultHeight
                = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 88.59f)
                lineToRelative(-176.08f, -54.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 34.0f, 48.0f)
                lineTo(34.0f, 192.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                arcToRelative(14.59f, 14.59f, 0.0f, false, false, 4.0f, -0.59f)
                lineTo(138.0f, 179.0f)
                verticalLineToRelative(13.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(198.0f, 160.62f)
                lineToRelative(30.0f, -9.19f)
                arcTo(14.07f, 14.07f, 0.0f, false, false, 238.0f, 138.0f)
                lineTo(238.0f, 102.0f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 228.0f, 88.59f)
                close()
                moveTo(48.56f, 193.92f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.76f, -0.32f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 46.0f, 192.0f)
                lineTo(46.0f, 48.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, 0.8f, -1.6f)
                arcTo(2.05f, 2.05f, 0.0f, false, true, 48.0f, 46.0f)
                arcToRelative(1.79f, 1.79f, 0.0f, false, true, 0.49f, 0.08f)
                lineTo(138.0f, 73.53f)
                verticalLineToRelative(92.95f)
                close()
                moveTo(186.0f, 192.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(152.0f, 194.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(150.0f, 175.35f)
                lineToRelative(36.0f, -11.0f)
                close()
                moveTo(226.0f, 138.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.44f, 1.92f)
                lineToRelative(-0.08f, 0.0f)
                lineTo(150.0f, 162.8f)
                lineTo(150.0f, 77.21f)
                lineToRelative(74.56f, 22.87f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 226.0f, 102.0f)
                close()
            }
        }
        .build()
        return _megaphonesimple!!
    }

private var _megaphonesimple: ImageVector? = null

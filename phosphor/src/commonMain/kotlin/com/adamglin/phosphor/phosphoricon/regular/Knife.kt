package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Knife: ImageVector
    get() {
        if (_knife != null) {
            return _knife!!
        }
        _knife = Builder(name = "Knife", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(231.87f, 32.13f)
                arcToRelative(27.84f, 27.84f, 0.0f, false, false, -39.32f, 0.0f)
                lineTo(18.34f, 206.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 3.86f, 13.45f)
                arcTo(160.67f, 160.67f, 0.0f, false, false, 58.4f, 224.0f)
                curveToRelative(32.95f, 0.0f, 65.92f, -10.2f, 96.95f, -30.23f)
                curveToRelative(31.76f, -20.5f, 50.19f, -43.82f, 51.0f, -44.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -0.64f, -10.59f)
                lineTo(185.32f, 118.0f)
                lineToRelative(46.55f, -46.56f)
                arcTo(27.85f, 27.85f, 0.0f, false, false, 231.87f, 32.13f)
                close()
                moveTo(189.1f, 144.44f)
                arcToRelative(220.41f, 220.41f, 0.0f, false, true, -42.86f, 36.16f)
                curveToRelative(-34.43f, 22.1f, -69.94f, 30.92f, -105.77f, 26.3f)
                lineTo(146.0f, 101.33f)
                close()
                moveTo(220.56f, 60.14f)
                lineTo(174.0f, 106.7f)
                lineTo(157.32f, 90.0f)
                lineToRelative(46.55f, -46.56f)
                arcToRelative(11.8f, 11.8f, 0.0f, false, true, 16.69f, 16.69f)
                close()
            }
        }
        .build()
        return _knife!!
    }

private var _knife: ImageVector? = null

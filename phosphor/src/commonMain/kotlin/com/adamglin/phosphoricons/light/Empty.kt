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

public val LightGroup.Empty: ImageVector
    get() {
        if (_empty != null) {
            return _empty!!
        }
        _empty = Builder(name = "Empty", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(195.51f, 62.66f)
                lineTo(212.44f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 203.56f, 36.0f)
                lineTo(186.63f, 54.58f)
                arcTo(94.0f, 94.0f, 0.0f, false, false, 60.49f, 193.34f)
                lineTo(43.56f, 212.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f)
                lineToRelative(16.93f, -18.62f)
                arcTo(94.0f, 94.0f, 0.0f, false, false, 195.51f, 62.66f)
                close()
                moveTo(46.0f, 128.0f)
                arcTo(81.93f, 81.93f, 0.0f, false, true, 178.53f, 63.49f)
                lineTo(68.59f, 184.43f)
                arcTo(81.69f, 81.69f, 0.0f, false, true, 46.0f, 128.0f)
                close()
                moveTo(128.0f, 210.0f)
                arcToRelative(81.57f, 81.57f, 0.0f, false, true, -50.53f, -17.49f)
                lineTo(187.41f, 71.57f)
                arcTo(81.94f, 81.94f, 0.0f, false, true, 128.0f, 210.0f)
                close()
            }
        }
        .build()
        return _empty!!
    }

private var _empty: ImageVector? = null

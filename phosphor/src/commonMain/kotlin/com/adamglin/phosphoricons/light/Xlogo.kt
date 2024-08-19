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

public val LightGroup.Xlogo: ImageVector
    get() {
        if (_xlogo != null) {
            return _xlogo!!
        }
        _xlogo = Builder(name = "Xlogo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.06f, 212.78f)
                lineToRelative(-63.42f, -99.66f)
                lineTo(212.44f, 44.0f)
                arcTo(6.0f, 6.0f, 0.0f, true, false, 203.56f, 36.0f)
                lineTo(143.0f, 102.62f)
                lineToRelative(-41.9f, -65.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 96.0f, 34.0f)
                horizontalLineTo(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -5.06f, 9.22f)
                lineToRelative(63.42f, 99.66f)
                lineTo(43.56f, 212.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 52.44f, 220.0f)
                lineTo(113.0f, 153.38f)
                lineToRelative(41.9f, 65.84f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 160.0f, 222.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.06f, -9.22f)
                close()
                moveTo(163.29f, 210.0f)
                lineTo(58.93f, 46.0f)
                horizontalLineTo(92.71f)
                lineTo(197.07f, 210.0f)
                close()
            }
        }
        .build()
        return _xlogo!!
    }

private var _xlogo: ImageVector? = null

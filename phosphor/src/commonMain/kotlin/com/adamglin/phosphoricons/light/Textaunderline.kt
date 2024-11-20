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

public val LightGroup.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) {
            return _textAUnderline!!
        }
        _textAUnderline = Builder(name = "TextAUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(61.45f, 173.43f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.0f, -2.88f)
                lineTo(86.63f, 134.0f)
                horizontalLineToRelative(82.74f)
                lineToRelative(17.2f, 36.55f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 192.0f, 174.0f)
                arcToRelative(5.92f, 5.92f, 0.0f, false, false, 2.55f, -0.57f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 2.88f, -8.0f)
                lineToRelative(-64.0f, -136.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -10.86f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 61.45f, 173.43f)
                close()
                moveTo(128.0f, 46.09f)
                lineTo(163.72f, 122.0f)
                horizontalLineTo(92.28f)
                close()
                moveTo(222.0f, 216.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                horizontalLineTo(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineTo(216.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 222.0f, 216.0f)
                close()
            }
        }
        .build()
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null

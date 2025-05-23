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

public val BoldGroup.TextAUnderline: ImageVector
    get() {
        if (_textAUnderline != null) {
            return _textAUnderline!!
        }
        _textAUnderline = Builder(name = "TextAUnderline", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(58.89f, 178.86f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.0f, -5.75f)
                lineTo(90.44f, 140.0f)
                horizontalLineToRelative(75.12f)
                lineToRelative(15.58f, 33.11f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 21.72f, -10.22f)
                lineToRelative(-64.0f, -136.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -21.72f, 0.0f)
                lineToRelative(-64.0f, 136.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 58.89f, 178.86f)
                close()
                moveTo(128.0f, 60.18f)
                lineTo(154.27f, 116.0f)
                horizontalLineTo(101.73f)
                close()
                moveTo(228.0f, 216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                horizontalLineTo(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineTo(216.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 216.0f)
                close()
            }
        }
        .build()
        return _textAUnderline!!
    }

private var _textAUnderline: ImageVector? = null

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

public val LightGroup.TextB: ImageVector
    get() {
        if (_textB != null) {
            return _textB!!
        }
        _textB = Builder(name = "TextB", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(174.69f, 116.41f)
                arcTo(42.0f, 42.0f, 0.0f, false, false, 148.0f, 42.0f)
                lineTo(80.0f, 42.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 6.0f)
                lineTo(74.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 6.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(46.0f, 46.0f, 0.0f, false, false, 14.69f, -89.59f)
                close()
                moveTo(86.0f, 54.0f)
                horizontalLineToRelative(62.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 0.0f, 60.0f)
                lineTo(86.0f, 114.0f)
                close()
                moveTo(160.0f, 194.0f)
                lineTo(86.0f, 194.0f)
                lineTo(86.0f, 126.0f)
                horizontalLineToRelative(74.0f)
                arcToRelative(34.0f, 34.0f, 0.0f, false, true, 0.0f, 68.0f)
                close()
            }
        }
        .build()
        return _textB!!
    }

private var _textB: ImageVector? = null

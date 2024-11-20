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

public val BoldGroup.TextB: ImageVector
    get() {
        if (_textB != null) {
            return _textB!!
        }
        _textB = Builder(name = "TextB", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(185.08f, 114.46f)
                arcTo(48.0f, 48.0f, 0.0f, false, false, 148.0f, 36.0f)
                lineTo(80.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 48.0f)
                lineTo(68.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 25.08f, -97.54f)
                close()
                moveTo(92.0f, 60.0f)
                horizontalLineToRelative(56.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, true, 0.0f, 48.0f)
                lineTo(92.0f, 108.0f)
                close()
                moveTo(160.0f, 188.0f)
                lineTo(92.0f, 188.0f)
                lineTo(92.0f, 132.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                close()
            }
        }
        .build()
        return _textB!!
    }

private var _textB: ImageVector? = null

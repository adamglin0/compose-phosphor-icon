package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.TextB: ImageVector
    get() {
        if (_textB != null) {
            return _textB!!
        }
        _textB = Builder(name = "TextB", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(178.48f, 115.7f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 148.0f, 40.0f)
                lineTo(80.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                lineTo(72.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(80.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 18.48f, -92.3f)
                close()
                moveTo(88.0f, 56.0f)
                horizontalLineToRelative(60.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 0.0f, 56.0f)
                lineTo(88.0f, 112.0f)
                close()
                moveTo(160.0f, 192.0f)
                lineTo(88.0f, 192.0f)
                lineTo(88.0f, 128.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, 0.0f, 64.0f)
                close()
            }
        }
        .build()
        return _textB!!
    }

private var _textB: ImageVector? = null

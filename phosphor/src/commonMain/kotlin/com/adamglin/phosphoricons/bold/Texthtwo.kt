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

public val BoldGroup.Texthtwo: ImageVector
    get() {
        if (_texthtwo != null) {
            return _texthtwo!!
        }
        _texthtwo = Builder(name = "Texthtwo", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(156.0f, 56.0f)
                lineTo(156.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(132.0f, 128.0f)
                lineTo(52.0f, 128.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(28.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                verticalLineToRelative(48.0f)
                horizontalLineToRelative(80.0f)
                lineTo(132.0f, 56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 24.0f, 0.0f)
                close()
                moveTo(240.0f, 196.0f)
                lineTo(216.0f, 196.0f)
                lineToRelative(28.74f, -38.33f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 182.05f, 124.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 22.63f, 8.0f)
                arcToRelative(11.67f, 11.67f, 0.0f, false, true, 1.73f, -3.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 19.15f, 14.46f)
                lineTo(182.4f, 200.8f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 192.0f, 220.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
            }
        }
        .build()
        return _texthtwo!!
    }

private var _texthtwo: ImageVector? = null

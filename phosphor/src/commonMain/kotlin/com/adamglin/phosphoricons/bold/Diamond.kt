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

public val BoldGroup.Diamond: ImageVector
    get() {
        if (_diamond != null) {
            return _diamond!!
        }
        _diamond = Builder(name = "Diamond", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.16f, 113.89f)
                lineTo(142.1f, 17.83f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.21f, 0.0f)
                lineToRelative(-96.0f, 96.06f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, 28.22f)
                lineToRelative(96.05f, 96.06f)
                horizontalLineToRelative(0.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 28.21f, 0.0f)
                lineToRelative(96.0f, -96.06f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -28.22f)
                close()
                moveTo(128.0f, 218.33f)
                lineTo(37.68f, 128.0f)
                lineTo(128.0f, 37.67f)
                lineTo(218.32f, 128.0f)
                close()
            }
        }
        .build()
        return _diamond!!
    }

private var _diamond: ImageVector? = null

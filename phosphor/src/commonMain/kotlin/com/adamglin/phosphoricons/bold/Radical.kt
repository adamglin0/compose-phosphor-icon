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

public val BoldGroup.Radical: ImageVector
    get() {
        if (_radical != null) {
            return _radical!!
        }
        _radical = Builder(name = "Radical", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 80.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                verticalLineTo(92.0f)
                horizontalLineTo(136.32f)
                lineTo(91.24f, 212.21f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -22.47f, 0.0f)
                lineToRelative(-48.0f, -128.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 22.47f, -8.43f)
                lineToRelative(36.76f, 98.0f)
                lineToRelative(36.77f, -98.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 128.0f, 68.0f)
                horizontalLineTo(240.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 252.0f, 80.0f)
                close()
            }
        }
        .build()
        return _radical!!
    }

private var _radical: ImageVector? = null

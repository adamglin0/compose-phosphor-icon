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

public val RegularGroup.Peace: ImageVector
    get() {
        if (_peace != null) {
            return _peace!!
        }
        _peace = Builder(name = "Peace", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(87.48f, 87.48f, 0.0f, false, true, -11.64f, 43.7f)
                lineTo(136.0f, 123.84f)
                lineTo(136.0f, 40.37f)
                arcTo(88.11f, 88.11f, 0.0f, false, true, 216.0f, 128.0f)
                close()
                moveTo(120.0f, 40.37f)
                verticalLineToRelative(83.47f)
                lineTo(51.64f, 171.7f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 120.0f, 40.37f)
                close()
                moveTo(60.84f, 184.79f)
                lineTo(120.0f, 143.37f)
                verticalLineToRelative(72.26f)
                arcTo(87.85f, 87.85f, 0.0f, false, true, 60.84f, 184.79f)
                close()
                moveTo(136.0f, 215.63f)
                lineTo(136.0f, 143.37f)
                lineToRelative(59.16f, 41.42f)
                arcTo(87.85f, 87.85f, 0.0f, false, true, 136.0f, 215.63f)
                close()
            }
        }
        .build()
        return _peace!!
    }

private var _peace: ImageVector? = null

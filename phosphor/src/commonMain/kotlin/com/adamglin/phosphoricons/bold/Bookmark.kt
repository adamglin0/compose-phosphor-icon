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

public val BoldGroup.Bookmark: ImageVector
    get() {
        if (_bookmark != null) {
            return _bookmark!!
        }
        _bookmark = Builder(name = "Bookmark", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 52.0f, 48.0f)
                lineTo(52.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 18.36f, 10.18f)
                lineToRelative(57.63f, -36.0f)
                lineToRelative(57.65f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 204.0f, 224.0f)
                lineTo(204.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(180.0f, 52.0f)
                lineTo(180.0f, 154.35f)
                lineToRelative(-45.65f, -28.53f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.72f, 0.0f)
                lineTo(76.0f, 154.35f)
                lineTo(76.0f, 52.0f)
                close()
                moveTo(134.35f, 173.82f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.72f, 0.0f)
                lineTo(76.0f, 202.35f)
                verticalLineToRelative(-19.7f)
                lineToRelative(52.0f, -32.5f)
                lineToRelative(52.0f, 32.5f)
                verticalLineToRelative(19.7f)
                close()
            }
        }
        .build()
        return _bookmark!!
    }

private var _bookmark: ImageVector? = null

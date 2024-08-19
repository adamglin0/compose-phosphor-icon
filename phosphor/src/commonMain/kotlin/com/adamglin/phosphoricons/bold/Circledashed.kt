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

public val BoldGroup.Circledashed: ImageVector
    get() {
        if (_circledashed != null) {
            return _circledashed!!
        }
        _circledashed = Builder(name = "Circledashed", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(92.38f, 38.05f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 101.0f, 23.42f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, true, 54.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -6.0f, 23.23f)
                arcToRelative(84.11f, 84.11f, 0.0f, false, false, -42.0f, 0.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 92.38f, 38.05f)
                close()
                moveTo(50.94f, 52.34f)
                arcToRelative(108.1f, 108.1f, 0.0f, false, false, -27.0f, 46.76f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 8.37f, 14.77f)
                arcToRelative(12.2f, 12.2f, 0.0f, false, false, 3.2f, 0.43f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 11.56f, -8.8f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, 21.0f, -36.35f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 50.94f, 52.34f)
                close()
                moveTo(47.06f, 150.48f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -23.12f, 6.42f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 27.0f, 46.78f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 186.85f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 47.06f, 150.48f)
                close()
                moveTo(149.0f, 209.35f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -42.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -6.0f, 23.23f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, 54.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, -6.0f, -23.23f)
                close()
                moveTo(223.72f, 142.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 209.0f, 150.5f)
                arcToRelative(84.0f, 84.0f, 0.0f, false, true, -21.0f, 36.35f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.12f, 16.82f)
                arcToRelative(108.19f, 108.19f, 0.0f, false, false, 27.0f, -46.77f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 223.71f, 142.13f)
                close()
                moveTo(208.95f, 105.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 23.12f, -6.42f)
                arcToRelative(108.0f, 108.0f, 0.0f, false, false, -27.0f, -46.78f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 188.0f, 69.15f)
                arcTo(84.0f, 84.0f, 0.0f, false, true, 208.94f, 105.52f)
                close()
            }
        }
        .build()
        return _circledashed!!
    }

private var _circledashed: ImageVector? = null

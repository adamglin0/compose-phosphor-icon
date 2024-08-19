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

public val BoldGroup.Thumbsdown: ImageVector
    get() {
        if (_thumbsdown != null) {
            return _thumbsdown!!
        }
        _thumbsdown = Builder(name = "Thumbsdown", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(243.78f, 156.53f)
                lineToRelative(-12.0f, -96.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 204.0f, 36.0f)
                lineTo(32.0f, 36.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 56.0f)
                verticalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(72.58f, 164.0f)
                lineToRelative(36.69f, 73.37f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 120.0f, 244.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(164.0f, 188.0f)
                horizontalLineToRelative(52.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 27.78f, -31.47f)
                close()
                moveTo(68.0f, 140.0f)
                lineTo(36.0f, 140.0f)
                lineTo(36.0f, 60.0f)
                lineTo(68.0f, 60.0f)
                close()
                moveTo(219.0f, 162.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.0f, 1.35f)
                lineTo(152.0f, 164.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -13.18f, 18.8f)
                lineTo(92.0f, 149.17f)
                lineTo(92.0f, 60.0f)
                lineTo(204.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 3.5f)
                lineToRelative(12.0f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 219.0f, 162.65f)
                close()
            }
        }
        .build()
        return _thumbsdown!!
    }

private var _thumbsdown: ImageVector? = null

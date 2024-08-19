package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Chatscircle: ImageVector
    get() {
        if (_chatscircle != null) {
            return _chatscircle!!
        }
        _chatscircle = Builder(name = "Chatscircle", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.79f, 186.39f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, -61.0f, -110.07f)
                arcTo(76.0f, 76.0f, 0.0f, true, false, 28.21f, 138.39f)
                lineTo(20.5f, 164.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, 14.9f)
                lineToRelative(26.21f, -7.71f)
                arcToRelative(75.93f, 75.93f, 0.0f, false, false, 27.6f, 7.9f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 105.18f, 40.1f)
                lineToRelative(26.21f, 7.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 14.9f, -14.9f)
                close()
                moveTo(60.9f, 163.66f)
                lineToRelative(-27.76f, 8.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.0f, -5.0f)
                lineToRelative(8.17f, -27.76f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.31f, -3.0f)
                arcTo(68.0f, 68.0f, 0.0f, true, true, 63.92f, 164.0f)
                arcTo(4.06f, 4.06f, 0.0f, false, false, 60.9f, 163.66f)
                close()
                moveTo(226.82f, 218.82f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 1.0f)
                lineToRelative(-27.76f, -8.17f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -3.0f, 0.31f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 98.0f, 180.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, false, 71.5f, -95.28f)
                arcTo(68.0f, 68.0f, 0.0f, false, true, 220.0f, 184.08f)
                arcToRelative(4.07f, 4.07f, 0.0f, false, false, -0.31f, 3.0f)
                lineToRelative(8.17f, 27.76f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 226.82f, 218.82f)
                close()
            }
        }
        .build()
        return _chatscircle!!
    }

private var _chatscircle: ImageVector? = null

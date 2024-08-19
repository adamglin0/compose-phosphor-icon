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

public val ThinGroup.Chatdots: ImageVector
    get() {
        if (_chatdots != null) {
            return _chatdots!!
        }
        _chatdots = Builder(name = "Chatdots", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 128.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 136.0f, 128.0f)
                close()
                moveTo(84.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 84.0f, 120.0f)
                close()
                moveTo(172.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 8.0f, 8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 172.0f, 120.0f)
                close()
                moveTo(228.0f, 64.0f)
                lineTo(228.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(81.49f, 204.0f)
                lineTo(47.76f, 233.13f)
                lineToRelative(0.0f, 0.0f)
                arcTo(11.89f, 11.89f, 0.0f, false, true, 40.0f, 236.0f)
                arcToRelative(12.17f, 12.17f, 0.0f, false, true, -5.1f, -1.14f)
                arcTo(11.89f, 11.89f, 0.0f, false, true, 28.0f, 224.0f)
                lineTo(28.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 52.0f)
                lineTo(216.0f, 52.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 64.0f)
                close()
                moveTo(220.0f, 64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.56f, 3.08f)
                lineTo(77.38f, 197.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 80.0f, 196.0f)
                lineTo(216.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _chatdots!!
    }

private var _chatdots: ImageVector? = null

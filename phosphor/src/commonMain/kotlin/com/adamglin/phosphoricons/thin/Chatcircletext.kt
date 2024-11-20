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

public val ThinGroup.ChatCircleText: ImageVector
    get() {
        if (_chatCircleText != null) {
            return _chatCircleText!!
        }
        _chatCircleText = Builder(name = "ChatCircleText", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 112.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 112.0f)
                close()
                moveTo(160.0f, 140.0f)
                lineTo(96.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 128.0f)
                arcTo(100.0f, 100.0f, 0.0f, false, true, 79.5f, 215.47f)
                lineToRelative(-35.69f, 11.9f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -15.18f, -15.18f)
                lineToRelative(11.9f, -35.69f)
                arcTo(100.0f, 100.0f, 0.0f, true, true, 228.0f, 128.0f)
                close()
                moveTo(220.0f, 128.0f)
                arcTo(92.0f, 92.0f, 0.0f, true, false, 48.35f, 174.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.33f, 3.27f)
                lineTo(36.22f, 214.72f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.06f, 5.06f)
                lineToRelative(37.38f, -12.46f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, true, 1.27f, -0.21f)
                arcToRelative(4.05f, 4.05f, 0.0f, false, true, 2.0f, 0.54f)
                arcTo(92.0f, 92.0f, 0.0f, false, false, 220.0f, 128.0f)
                close()
            }
        }
        .build()
        return _chatCircleText!!
    }

private var _chatCircleText: ImageVector? = null

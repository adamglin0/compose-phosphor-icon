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

public val ThinGroup.ChatCenteredText: ImageVector
    get() {
        if (_chatCenteredText != null) {
            return _chatCenteredText!!
        }
        _chatCenteredText = Builder(name = "ChatCenteredText", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(164.0f, 104.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(96.0f, 108.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(64.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 164.0f, 104.0f)
                close()
                moveTo(160.0f, 132.0f)
                lineTo(96.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(228.0f, 56.0f)
                lineTo(228.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, 12.0f)
                lineTo(153.25f, 196.0f)
                lineTo(138.42f, 222.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.84f, 0.0f)
                lineTo(102.75f, 196.0f)
                lineTo(40.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -12.0f, -12.0f)
                lineTo(28.0f, 56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 40.0f, 44.0f)
                lineTo(216.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 56.0f)
                close()
                moveTo(220.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(40.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(36.0f, 184.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(65.07f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.47f, 2.0f)
                lineToRelative(16.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.94f, 0.0f)
                lineToRelative(16.0f, -28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 3.47f, -2.0f)
                lineTo(216.0f, 188.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                close()
            }
        }
        .build()
        return _chatCenteredText!!
    }

private var _chatCenteredText: ImageVector? = null

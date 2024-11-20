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

public val BoldGroup.ChatTeardropSlash: ImageVector
    get() {
        if (_chatTeardropSlash != null) {
            return _chatTeardropSlash!!
        }
        _chatTeardropSlash = Builder(name = "ChatTeardropSlash", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(50.0f, 60.0f)
                arcToRelative(103.37f, 103.37f, 0.0f, false, false, -22.0f, 64.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(104.32f, 104.32f, 0.0f, false, false, 55.87f, -16.31f)
                lineToRelative(11.25f, 12.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.76f, -16.14f)
                close()
                moveTo(132.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 124.0f)
                arcTo(79.51f, 79.51f, 0.0f, false, true, 66.46f, 78.14f)
                lineToRelative(105.0f, 115.49f)
                arcTo(79.08f, 79.08f, 0.0f, false, true, 132.0f, 204.0f)
                close()
                moveTo(236.0f, 124.0f)
                arcToRelative(102.9f, 102.9f, 0.0f, false, true, -10.36f, 45.29f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 204.0f, 158.83f)
                arcTo(79.25f, 79.25f, 0.0f, false, false, 212.0f, 124.0f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 104.16f, 49.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -8.35f, -22.5f)
                arcTo(104.07f, 104.07f, 0.0f, false, true, 236.0f, 124.0f)
                close()
            }
        }
        .build()
        return _chatTeardropSlash!!
    }

private var _chatTeardropSlash: ImageVector? = null

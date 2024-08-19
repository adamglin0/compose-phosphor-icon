package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Chatteardropslash: ImageVector
    get() {
        if (_chatteardropslash != null) {
            return _chatteardropslash!!
        }
        _chatteardropslash = Builder(name = "Chatteardropslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(213.92f, 210.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -11.84f, 10.76f)
                lineToRelative(-13.57f, -14.92f)
                arcTo(99.4f, 99.4f, 0.0f, false, true, 132.0f, 224.0f)
                lineTo(48.0f, 224.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(32.0f, 124.0f)
                arcTo(99.54f, 99.54f, 0.0f, false, true, 55.29f, 59.92f)
                lineTo(42.08f, 45.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.72f, -11.46f)
                arcToRelative(8.22f, 8.22f, 0.0f, false, true, 11.34f, 0.95f)
                close()
                moveTo(208.35f, 180.71f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.24f, -0.4f)
                arcTo(100.0f, 100.0f, 0.0f, false, false, 83.78f, 36.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.0f, 6.18f)
                close()
            }
        }
        .build()
        return _chatteardropslash!!
    }

private var _chatteardropslash: ImageVector? = null

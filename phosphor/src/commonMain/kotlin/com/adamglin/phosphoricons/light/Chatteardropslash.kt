package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Chatteardropslash: ImageVector
    get() {
        if (_chatteardropslash != null) {
            return _chatteardropslash!!
        }
        _chatteardropslash = Builder(name = "Chatteardropslash", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(52.44f, 36.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 43.56f, 44.0f)
                lineToRelative(14.37f, 15.8f)
                arcTo(97.42f, 97.42f, 0.0f, false, false, 34.0f, 124.0f)
                verticalLineToRelative(84.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(98.24f, 98.24f, 0.0f, false, false, 56.82f, -18.18f)
                lineTo(203.56f, 220.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 8.88f, -8.08f)
                close()
                moveTo(132.0f, 210.0f)
                lineTo(48.0f, 210.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(46.0f, 124.0f)
                arcTo(85.46f, 85.46f, 0.0f, false, true, 66.08f, 68.8f)
                lineTo(180.7f, 194.88f)
                arcTo(84.91f, 84.91f, 0.0f, false, true, 132.0f, 210.0f)
                close()
                moveTo(230.0f, 124.0f)
                arcToRelative(97.86f, 97.86f, 0.0f, false, true, -14.06f, 50.61f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.15f, 2.9f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -5.12f, -9.1f)
                arcToRelative(86.0f, 86.0f, 0.0f, false, false, -110.88f, -122.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -5.2f, -10.81f)
                arcTo(97.09f, 97.09f, 0.0f, false, true, 132.0f, 26.0f)
                arcTo(98.11f, 98.11f, 0.0f, false, true, 230.0f, 124.0f)
                close()
            }
        }
        .build()
        return _chatteardropslash!!
    }

private var _chatteardropslash: ImageVector? = null

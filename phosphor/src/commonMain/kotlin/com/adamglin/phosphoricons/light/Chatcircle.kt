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

public val LightGroup.ChatCircle: ImageVector
    get() {
        if (_chatCircle != null) {
            return _chatCircle!!
        }
        _chatCircle = Builder(name = "ChatCircle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 26.0f)
                arcTo(102.0f, 102.0f, 0.0f, false, false, 38.35f, 176.69f)
                lineTo(26.73f, 211.56f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 17.71f, 17.71f)
                lineToRelative(34.87f, -11.62f)
                arcTo(102.0f, 102.0f, 0.0f, true, false, 128.0f, 26.0f)
                close()
                moveTo(128.0f, 218.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, false, true, -45.06f, -12.08f)
                arcToRelative(6.09f, 6.09f, 0.0f, false, false, -3.0f, -0.81f)
                arcToRelative(6.2f, 6.2f, 0.0f, false, false, -1.9f, 0.31f)
                lineTo(40.65f, 217.88f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.53f, -2.53f)
                lineTo(50.58f, 178.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -0.5f, -4.91f)
                arcTo(90.0f, 90.0f, 0.0f, true, true, 128.0f, 218.0f)
                close()
            }
        }
        .build()
        return _chatCircle!!
    }

private var _chatCircle: ImageVector? = null

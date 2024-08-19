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

public val LightGroup.Telegramlogo: ImageVector
    get() {
        if (_telegramlogo != null) {
            return _telegramlogo!!
        }
        _telegramlogo = Builder(name = "Telegramlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(227.57f, 27.7f)
                arcToRelative(7.0f, 7.0f, 0.0f, false, false, -7.13f, -1.22f)
                lineTo(17.78f, 105.79f)
                arcToRelative(12.23f, 12.23f, 0.0f, false, false, 2.1f, 23.39f)
                lineTo(74.0f, 139.81f)
                lineTo(74.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 24.08f, 9.71f)
                lineToRelative(26.64f, -27.63f)
                lineToRelative(41.58f, 36.45f)
                arcToRelative(13.9f, 13.9f, 0.0f, false, false, 9.2f, 3.49f)
                arcToRelative(14.33f, 14.33f, 0.0f, false, false, 4.36f, -0.69f)
                arcToRelative(13.86f, 13.86f, 0.0f, false, false, 9.34f, -10.17f)
                lineTo(229.82f, 34.57f)
                arcTo(7.0f, 7.0f, 0.0f, false, false, 227.57f, 27.7f)
                close()
                moveTo(22.05f, 117.37f)
                horizontalLineToRelative(0.0f)
                arcToRelative(0.46f, 0.46f, 0.0f, false, true, 0.0f, -0.32f)
                arcToRelative(0.51f, 0.51f, 0.0f, false, true, 0.15f, -0.08f)
                lineTo(181.91f, 54.45f)
                lineToRelative(-103.3f, 74.0f)
                lineTo(22.2f, 117.41f)
                close()
                moveTo(89.44f, 201.37f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 86.0f, 200.0f)
                lineTo(86.0f, 148.11f)
                lineToRelative(29.69f, 26.0f)
                close()
                moveTo(177.51f, 208.45f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.34f, 1.44f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -0.4f)
                lineTo(89.64f, 135.34f)
                lineTo(215.0f, 45.5f)
                close()
            }
        }
        .build()
        return _telegramlogo!!
    }

private var _telegramlogo: ImageVector? = null

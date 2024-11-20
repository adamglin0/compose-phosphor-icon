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

public val BoldGroup.PushPinSlash: ImageVector
    get() {
        if (_pushPinSlash != null) {
            return _pushPinSlash!!
        }
        _pushPinSlash = Builder(name = "PushPinSlash", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(56.88f, 31.93f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 39.12f, 48.07f)
                lineTo(60.0f, 71.0f)
                arcTo(76.0f, 76.0f, 0.0f, false, false, 35.46f, 84.51f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -1.6f, 29.73f)
                lineToRelative(45.46f, 45.47f)
                lineToRelative(-39.8f, 39.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 17.0f, 17.0f)
                lineToRelative(39.8f, -39.81f)
                lineToRelative(45.47f, 45.46f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 155.9f, 228.0f)
                curveToRelative(0.47f, 0.0f, 0.94f, 0.0f, 1.41f, -0.05f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 171.87f, 220.0f)
                arcToRelative(97.47f, 97.47f, 0.0f, false, false, 9.54f, -15.46f)
                lineToRelative(17.72f, 19.49f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 17.76f, -16.14f)
                close()
                moveTo(155.37f, 201.81f)
                lineTo(54.08f, 100.52f)
                curveTo(62.0f, 95.0f, 70.31f, 92.12f, 78.91f, 91.83f)
                lineToRelative(84.51f, 93.0f)
                arcTo(62.0f, 62.0f, 0.0f, false, true, 155.37f, 201.81f)
                close()
                moveTo(238.15f, 106.81f)
                lineTo(199.15f, 145.92f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -17.0f, -16.95f)
                lineToRelative(36.19f, -36.3f)
                lineToRelative(-55.0f, -55.0f)
                lineTo(130.59f, 70.5f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -17.0f, -16.94f)
                lineToRelative(35.57f, -35.69f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.3f, 0.0f)
                lineToRelative(60.69f, 60.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 238.15f, 106.83f)
                close()
            }
        }
        .build()
        return _pushPinSlash!!
    }

private var _pushPinSlash: ImageVector? = null

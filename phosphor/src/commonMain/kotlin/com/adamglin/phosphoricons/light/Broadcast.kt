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

public val LightGroup.Broadcast: ImageVector
    get() {
        if (_broadcast != null) {
            return _broadcast!!
        }
        _broadcast = Builder(name = "Broadcast", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 90.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, true, false, 38.0f, 38.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 128.0f, 90.0f)
                close()
                moveTo(128.0f, 154.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, true, true, 26.0f, -26.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 128.0f, 154.0f)
                close()
                moveTo(206.0f, 128.0f)
                arcToRelative(77.74f, 77.74f, 0.0f, false, true, -19.86f, 52.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.94f, -8.0f)
                arcToRelative(65.93f, 65.93f, 0.0f, false, false, 0.0f, -88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.94f, -8.0f)
                arcTo(77.74f, 77.74f, 0.0f, false, true, 206.0f, 128.0f)
                close()
                moveTo(67.18f, 102.31f)
                arcTo(65.93f, 65.93f, 0.0f, false, false, 78.8f, 172.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -0.47f, 8.47f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.47f, -0.47f)
                arcToRelative(77.93f, 77.93f, 0.0f, false, true, 0.0f, -104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.94f, 8.0f)
                arcTo(66.21f, 66.21f, 0.0f, false, false, 67.18f, 102.31f)
                close()
                moveTo(246.0f, 128.0f)
                arcToRelative(117.71f, 117.71f, 0.0f, false, true, -33.71f, 82.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.58f, -8.4f)
                arcToRelative(105.88f, 105.88f, 0.0f, false, false, 0.0f, -148.36f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 8.58f, -8.4f)
                arcTo(117.71f, 117.71f, 0.0f, false, true, 246.0f, 128.0f)
                close()
                moveTo(52.29f, 202.18f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -8.58f, 8.4f)
                arcToRelative(117.92f, 117.92f, 0.0f, false, true, 0.0f, -165.16f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, 8.58f, 8.4f)
                arcToRelative(105.88f, 105.88f, 0.0f, false, false, 0.0f, 148.36f)
                close()
            }
        }
        .build()
        return _broadcast!!
    }

private var _broadcast: ImageVector? = null

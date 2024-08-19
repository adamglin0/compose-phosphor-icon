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

public val FillGroup.Wifihigh: ImageVector
    get() {
        if (_wifihigh != null) {
            return _wifihigh!!
        }
        _wifihigh = Builder(name = "Wifihigh", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(244.35f, 92.8f)
                lineToRelative(-104.0f, 125.43f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 128.0f, 224.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, -12.31f, -5.77f)
                lineTo(11.65f, 92.8f)
                arcTo(15.65f, 15.65f, 0.0f, false, true, 8.11f, 80.91f)
                arcTo(15.93f, 15.93f, 0.0f, false, true, 14.28f, 70.1f)
                arcTo(186.67f, 186.67f, 0.0f, false, true, 128.0f, 32.0f)
                arcTo(186.67f, 186.67f, 0.0f, false, true, 241.72f, 70.1f)
                arcToRelative(15.93f, 15.93f, 0.0f, false, true, 6.17f, 10.81f)
                arcTo(15.65f, 15.65f, 0.0f, false, true, 244.35f, 92.8f)
                close()
            }
        }
        .build()
        return _wifihigh!!
    }

private var _wifihigh: ImageVector? = null

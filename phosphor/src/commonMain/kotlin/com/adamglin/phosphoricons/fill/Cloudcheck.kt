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

public val FillGroup.CloudCheck: ImageVector
    get() {
        if (_cloudCheck != null) {
            return _cloudCheck!!
        }
        _cloudCheck = Builder(name = "CloudCheck", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(247.93f, 124.52f)
                curveTo(246.11f, 77.54f, 207.07f, 40.0f, 160.06f, 40.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 81.29f, 88.67f)
                horizontalLineToRelative(0.0f)
                arcTo(87.48f, 87.48f, 0.0f, false, false, 72.0f, 127.73f)
                arcTo(8.18f, 8.18f, 0.0f, false, true, 64.57f, 136.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 128.0f)
                arcToRelative(103.66f, 103.66f, 0.0f, false, true, 5.34f, -32.92f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.75f, -5.18f)
                arcTo(64.09f, 64.09f, 0.0f, false, false, 8.0f, 152.0f)
                curveToRelative(0.0f, 35.19f, 29.75f, 64.0f, 65.0f, 64.0f)
                lineTo(160.0f, 216.0f)
                arcTo(88.09f, 88.09f, 0.0f, false, false, 247.93f, 124.52f)
                close()
                moveTo(197.66f, 117.66f)
                lineTo(149.66f, 165.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 0.0f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(144.0f, 148.69f)
                lineToRelative(42.34f, -42.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                close()
            }
        }
        .build()
        return _cloudCheck!!
    }

private var _cloudCheck: ImageVector? = null

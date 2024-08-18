package com.adamglin.phosphor.phosphoricon.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.FillGroup

public val FillGroup.`Pinterest-logo-fill`: ImageVector
    get() {
        if (`_pinterest-logo-fill` != null) {
            return `_pinterest-logo-fill`!!
        }
        `_pinterest-logo-fill` = Builder(name = "Pinterest-logo-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 128.7f)
                curveToRelative(-0.38f, 56.49f, -46.46f, 102.73f, -102.94f, 103.29f)
                arcToRelative(104.16f, 104.16f, 0.0f, false, true, -25.94f, -3.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.91f, -4.86f)
                lineToRelative(8.64f, -34.55f)
                arcTo(60.57f, 60.57f, 0.0f, false, false, 144.0f, 196.0f)
                curveToRelative(37.0f, 0.0f, 66.7f, -33.45f, 63.81f, -73.36f)
                arcTo(72.0f, 72.0f, 0.0f, true, false, 69.24f, 155.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 80.0f, 159.29f)
                arcToRelative(8.19f, 8.19f, 0.0f, false, false, 4.0f, -10.49f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, 107.86f, -24.93f)
                curveTo(194.0f, 154.4f, 171.73f, 180.0f, 144.0f, 180.0f)
                arcToRelative(44.87f, 44.87f, 0.0f, false, true, -23.14f, -6.44f)
                lineToRelative(14.9f, -59.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -15.52f, -3.88f)
                lineTo(93.38f, 217.51f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.71f, 2.59f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 32.0f, 126.88f)
                curveTo(32.6f, 70.52f, 78.67f, 24.52f, 135.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, true, 240.0f, 128.7f)
                close()
            }
        }
        .build()
        return `_pinterest-logo-fill`!!
    }

private var `_pinterest-logo-fill`: ImageVector? = null

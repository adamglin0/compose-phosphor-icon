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

public val BoldGroup.WebhooksLogo: ImageVector
    get() {
        if (_webhooksLogo != null) {
            return _webhooksLogo!!
        }
        _webhooksLogo = Builder(name = "WebhooksLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(192.0f, 180.0f)
                lineTo(118.71f, 180.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, true, true, -104.6f, -37.46f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 21.37f, 10.92f)
                arcTo(31.64f, 31.64f, 0.0f, false, false, 32.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 12.0f, -12.0f)
                horizontalLineToRelative(84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                close()
                moveTo(192.0f, 112.0f)
                arcToRelative(55.9f, 55.9f, 0.0f, false, false, -18.45f, 3.12f)
                lineTo(138.22f, 57.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -20.44f, 12.58f)
                lineToRelative(40.94f, 66.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.52f, 3.93f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 19.68f, 59.13f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 223.82f)
                arcToRelative(10.05f, 10.05f, 0.0f, false, false, 1.09f, 0.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 192.0f, 112.0f)
                close()
                moveTo(57.71f, 178.22f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 16.51f, -3.93f)
                lineToRelative(40.94f, -66.52f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -3.92f, -16.51f)
                arcToRelative(32.0f, 32.0f, 0.0f, true, true, 45.28f, -41.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 21.37f, -10.92f)
                arcTo(56.0f, 56.0f, 0.0f, true, false, 89.1f, 104.32f)
                lineTo(53.78f, 161.71f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 57.71f, 178.22f)
                close()
            }
        }
        .build()
        return _webhooksLogo!!
    }

private var _webhooksLogo: ImageVector? = null

package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Webhookslogo: ImageVector
    get() {
        if (_webhookslogo != null) {
            return _webhookslogo!!
        }
        _webhookslogo = Builder(name = "Webhookslogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(180.7f, 172.0f)
                lineTo(107.81f, 172.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, -79.0f, -30.41f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, 4.81f)
                arcTo(35.67f, 35.67f, 0.0f, false, false, 28.0f, 168.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 72.0f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(76.7f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 0.0f, 8.0f)
                close()
                moveTo(64.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 9.33f, -19.54f)
                lineToRelative(37.11f, -60.3f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -1.31f, -5.51f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 161.0f, 49.58f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 7.33f, -3.19f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, -66.71f, 52.83f)
                lineToRelative(-35.1f, 57.05f)
                arcTo(11.58f, 11.58f, 0.0f, false, false, 64.0f, 156.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                close()
                moveTo(192.0f, 124.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -19.56f, 4.58f)
                lineToRelative(-35.11f, -57.0f)
                arcTo(12.0f, 12.0f, 0.0f, true, false, 128.0f, 76.0f)
                arcToRelative(12.24f, 12.24f, 0.0f, false, false, 2.52f, -0.27f)
                lineTo(167.63f, 136.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.5f, 1.31f)
                arcTo(36.0f, 36.0f, 0.0f, true, true, 192.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, 0.0f, -88.0f)
                close()
            }
        }
        .build()
        return _webhookslogo!!
    }

private var _webhookslogo: ImageVector? = null

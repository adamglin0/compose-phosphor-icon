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

public val ThinGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(234.83f, 181.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 5.66f)
                lineToRelative(-24.0f, 24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -5.66f, -5.66f)
                lineTo(222.34f, 188.0f)
                horizontalLineToRelative(-21.4f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, true, -55.34f, -28.48f)
                lineToRelative(-41.71f, -58.39f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 55.06f, 76.0f)
                lineTo(32.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(55.06f, 68.0f)
                arcTo(68.15f, 68.15f, 0.0f, false, true, 110.4f, 96.48f)
                lineToRelative(41.71f, 58.39f)
                arcTo(60.11f, 60.11f, 0.0f, false, false, 200.94f, 180.0f)
                horizontalLineToRelative(21.4f)
                lineToRelative(-17.17f, -17.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 5.66f, -5.66f)
                close()
                moveTo(145.34f, 103.73f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.58f, -0.93f)
                lineToRelative(1.19f, -1.67f)
                arcTo(60.11f, 60.11f, 0.0f, false, true, 200.94f, 76.0f)
                horizontalLineToRelative(21.4f)
                lineTo(205.17f, 93.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineToRelative(24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineToRelative(-24.0f, -24.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(222.34f, 68.0f)
                horizontalLineToRelative(-21.4f)
                arcTo(68.15f, 68.15f, 0.0f, false, false, 145.6f, 96.48f)
                lineToRelative(-1.19f, 1.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 145.34f, 103.73f)
                close()
                moveTo(110.66f, 152.27f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.58f, 0.93f)
                lineToRelative(-1.19f, 1.67f)
                arcTo(60.11f, 60.11f, 0.0f, false, true, 55.06f, 180.0f)
                lineTo(32.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(55.06f, 188.0f)
                arcToRelative(68.15f, 68.15f, 0.0f, false, false, 55.34f, -28.48f)
                lineToRelative(1.19f, -1.67f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 110.66f, 152.27f)
                close()
            }
        }
        .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null

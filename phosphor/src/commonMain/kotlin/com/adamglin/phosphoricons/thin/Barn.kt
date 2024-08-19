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

public val ThinGroup.Barn: ImageVector
    get() {
        if (_barn != null) {
            return _barn!!
        }
        _barn = Builder(name = "Barn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 196.0f)
                lineTo(228.0f, 196.0f)
                lineTo(228.0f, 118.08f)
                lineToRelative(8.74f, 12.25f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 240.0f, 132.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.25f, -6.32f)
                lineToRelative(-40.0f, -56.0f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -1.0f, -1.0f)
                lineTo(134.66f, 22.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -13.37f, 0.0f)
                lineTo(53.73f, 68.71f)
                arcToRelative(3.77f, 3.77f, 0.0f, false, false, -1.0f, 1.0f)
                lineToRelative(-40.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.51f, 4.65f)
                lineTo(28.0f, 118.08f)
                lineTo(28.0f, 196.0f)
                lineTo(16.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                lineTo(240.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(36.0f, 106.88f)
                lineToRelative(22.85f, -32.0f)
                lineToRelative(66.93f, -46.23f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.38f, 0.0f)
                lineToRelative(67.0f, 46.26f)
                lineToRelative(22.85f, 32.0f)
                lineTo(220.01f, 196.0f)
                lineTo(188.0f, 196.0f)
                lineTo(188.0f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(72.0f, 116.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                verticalLineToRelative(76.0f)
                lineTo(36.0f, 196.0f)
                close()
                moveTo(128.0f, 155.08f)
                lineTo(84.48f, 124.0f)
                horizontalLineToRelative(87.0f)
                close()
                moveTo(180.0f, 127.77f)
                verticalLineToRelative(64.46f)
                lineTo(134.88f, 160.0f)
                close()
                moveTo(121.12f, 160.0f)
                lineTo(76.0f, 192.23f)
                lineTo(76.0f, 127.77f)
                close()
                moveTo(128.0f, 164.92f)
                lineTo(171.52f, 196.0f)
                horizontalLineToRelative(-87.0f)
                close()
                moveTo(108.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, 8.0f)
                lineTo(112.0f, 92.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 108.0f, 88.0f)
                close()
            }
        }
        .build()
        return _barn!!
    }

private var _barn: ImageVector? = null

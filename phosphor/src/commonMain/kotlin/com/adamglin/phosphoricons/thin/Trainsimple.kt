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

public val ThinGroup.TrainSimple: ImageVector
    get() {
        if (_trainSimple != null) {
            return _trainSimple!!
        }
        _trainSimple = Builder(name = "TrainSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 44.0f, 56.0f)
                lineTo(44.0f, 184.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, 28.0f)
                lineTo(88.0f, 212.0f)
                lineTo(68.8f, 237.6f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 6.4f, 4.8f)
                lineTo(98.0f, 212.0f)
                horizontalLineToRelative(60.0f)
                lineToRelative(22.8f, 30.4f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.4f, -4.8f)
                lineTo(168.0f, 212.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 28.0f, -28.0f)
                lineTo(212.0f, 56.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(72.0f, 36.0f)
                lineTo(184.0f, 36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(68.0f)
                lineTo(52.0f, 124.0f)
                lineTo(52.0f, 56.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 36.0f)
                close()
                moveTo(184.0f, 204.0f)
                lineTo(72.0f, 204.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(52.0f, 132.0f)
                lineTo(204.0f, 132.0f)
                verticalLineToRelative(52.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 184.0f, 204.0f)
                close()
                moveTo(92.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 92.0f, 172.0f)
                close()
                moveTo(180.0f, 172.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 180.0f, 172.0f)
                close()
            }
        }
        .build()
        return _trainSimple!!
    }

private var _trainSimple: ImageVector? = null

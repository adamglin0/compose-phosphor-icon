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

public val ThinGroup.Graphicscard: ImageVector
    get() {
        if (_graphicscard != null) {
            return _graphicscard!!
        }
        _graphicscard = Builder(name = "Graphicscard", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 52.0f)
                lineTo(16.0f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(12.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(20.0f, 188.0f)
                lineTo(44.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(52.0f, 188.0f)
                lineTo(76.0f, 188.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(84.0f, 188.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(20.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                lineTo(116.0f, 188.0f)
                lineTo(232.0f, 188.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(244.0f, 64.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 232.0f, 52.0f)
                close()
                moveTo(236.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(20.0f, 180.0f)
                lineTo(20.0f, 60.0f)
                lineTo(232.0f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(176.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 176.0f, 84.0f)
                close()
                moveTo(148.0f, 120.0f)
                arcToRelative(27.89f, 27.89f, 0.0f, false, true, 5.58f, -16.76f)
                lineToRelative(39.18f, 39.18f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 148.0f, 120.0f)
                close()
                moveTo(198.42f, 136.76f)
                lineTo(159.24f, 97.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.18f, 39.18f)
                close()
                moveTo(80.0f, 84.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, false, 36.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 80.0f, 84.0f)
                close()
                moveTo(52.0f, 120.0f)
                arcToRelative(27.89f, 27.89f, 0.0f, false, true, 5.58f, -16.76f)
                lineToRelative(39.18f, 39.18f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 52.0f, 120.0f)
                close()
                moveTo(102.42f, 136.76f)
                lineTo(63.24f, 97.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 39.18f, 39.18f)
                close()
            }
        }
        .build()
        return _graphicscard!!
    }

private var _graphicscard: ImageVector? = null

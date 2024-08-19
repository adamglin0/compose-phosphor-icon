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

public val ThinGroup.Plugs: ImageVector
    get() {
        if (_plugs != null) {
            return _plugs!!
        }
        _plugs = Builder(name = "Plugs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.83f, 141.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(120.0f, 162.34f)
                lineTo(93.66f, 136.0f)
                lineToRelative(21.17f, -21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, -5.66f)
                lineTo(88.0f, 130.34f)
                lineTo(66.83f, 109.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineTo(70.34f, 124.0f)
                lineTo(44.2f, 150.14f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, 39.6f)
                lineToRelative(8.2f, 8.2f)
                lineTo(21.17f, 229.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, 5.66f)
                lineTo(58.06f, 203.6f)
                lineToRelative(8.2f, 8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 39.6f, 0.0f)
                lineTo(132.0f, 185.66f)
                lineToRelative(9.17f, 9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(125.66f, 168.0f)
                lineToRelative(21.17f, -21.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 146.83f, 141.17f)
                close()
                moveTo(100.2f, 206.17f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -28.28f, 0.0f)
                lineTo(49.86f, 184.08f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 0.0f, -28.28f)
                lineTo(76.0f, 129.66f)
                lineTo(126.34f, 180.0f)
                close()
                moveTo(234.83f, 21.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 0.0f)
                lineTo(197.94f, 52.4f)
                lineToRelative(-8.2f, -8.2f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -39.6f, 0.0f)
                lineTo(124.0f, 70.34f)
                lineToRelative(-9.17f, -9.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -5.66f, 5.66f)
                lineToRelative(80.0f, 80.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 5.66f, -5.66f)
                lineTo(185.66f, 132.0f)
                lineToRelative(26.14f, -26.14f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 0.0f, -39.6f)
                lineToRelative(-8.2f, -8.2f)
                lineToRelative(31.23f, -31.23f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 234.83f, 21.17f)
                close()
                moveTo(212.0f, 86.06f)
                arcToRelative(19.86f, 19.86f, 0.0f, false, true, -5.86f, 14.14f)
                lineTo(180.0f, 126.34f)
                lineTo(129.66f, 76.0f)
                lineTo(155.8f, 49.86f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 28.28f, 0.0f)
                lineToRelative(22.06f, 22.06f)
                arcTo(19.85f, 19.85f, 0.0f, false, true, 212.0f, 86.06f)
                close()
            }
        }
        .build()
        return _plugs!!
    }

private var _plugs: ImageVector? = null

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

public val ThinGroup.Carprofile: ImageVector
    get() {
        if (_carprofile != null) {
            return _carprofile!!
        }
        _carprofile = Builder(name = "Carprofile", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 116.0f)
                lineTo(209.66f, 116.0f)
                lineTo(165.17f, 71.52f)
                arcTo(11.9f, 11.9f, 0.0f, false, false, 156.69f, 68.0f)
                lineTo(44.28f, 68.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.0f, 5.34f)
                lineTo(4.67f, 117.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 4.0f, 120.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(36.29f, 180.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                horizontalLineToRelative(72.58f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, 55.42f, 0.0f)
                lineTo(240.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(252.0f, 128.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 240.0f, 116.0f)
                close()
                moveTo(41.0f, 77.78f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 44.28f, 76.0f)
                lineTo(156.69f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 2.82f, 1.17f)
                lineTo(198.34f, 116.0f)
                lineTo(15.47f, 116.0f)
                close()
                moveTo(64.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 64.0f, 196.0f)
                close()
                moveTo(192.0f, 196.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, true, 20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 192.0f, 196.0f)
                close()
                moveTo(244.0f, 168.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(219.71f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(91.71f, 172.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, false, -55.42f, 0.0f)
                lineTo(16.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(12.0f, 124.0f)
                lineTo(240.0f, 124.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
            }
        }
        .build()
        return _carprofile!!
    }

private var _carprofile: ImageVector? = null

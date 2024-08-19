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

public val ThinGroup.Subway: ImageVector
    get() {
        if (_subway != null) {
            return _subway!!
        }
        _subway = Builder(name = "Subway", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 96.0f)
                lineTo(220.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(212.0f, 96.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                lineTo(104.0f, 36.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 44.0f, 96.0f)
                lineTo(44.0f, 208.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(36.0f, 96.0f)
                arcToRelative(68.07f, 68.07f, 0.0f, false, true, 68.0f, -68.0f)
                horizontalLineToRelative(48.0f)
                arcTo(68.07f, 68.07f, 0.0f, false, true, 220.0f, 96.0f)
                close()
                moveTo(180.0f, 96.0f)
                verticalLineToRelative(72.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                horizontalLineToRelative(-1.53f)
                lineToRelative(5.11f, 10.21f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, 5.37f)
                arcTo(4.12f, 4.12f, 0.0f, false, true, 160.0f, 204.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.58f, -2.21f)
                lineTo(149.53f, 188.0f)
                lineTo(106.47f, 188.0f)
                lineToRelative(-6.89f, 13.79f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 96.0f, 204.0f)
                arcToRelative(4.12f, 4.12f, 0.0f, false, true, -1.79f, -0.42f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.79f, -5.37f)
                lineTo(97.53f, 188.0f)
                lineTo(96.0f, 188.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                lineTo(76.0f, 96.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 96.0f, 76.0f)
                horizontalLineToRelative(64.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 180.0f, 96.0f)
                close()
                moveTo(84.0f, 96.0f)
                verticalLineToRelative(52.0f)
                horizontalLineToRelative(88.0f)
                lineTo(172.0f, 96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, -12.0f)
                lineTo(96.0f, 84.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 84.0f, 96.0f)
                close()
                moveTo(116.0f, 156.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(24.0f)
                lineTo(140.0f, 156.0f)
                close()
                moveTo(96.0f, 180.0f)
                horizontalLineToRelative(12.0f)
                lineTo(108.0f, 156.0f)
                lineTo(84.0f, 156.0f)
                verticalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 96.0f, 180.0f)
                close()
                moveTo(172.0f, 168.0f)
                lineTo(172.0f, 156.0f)
                lineTo(148.0f, 156.0f)
                verticalLineToRelative(24.0f)
                horizontalLineToRelative(12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 172.0f, 168.0f)
                close()
            }
        }
        .build()
        return _subway!!
    }

private var _subway: ImageVector? = null

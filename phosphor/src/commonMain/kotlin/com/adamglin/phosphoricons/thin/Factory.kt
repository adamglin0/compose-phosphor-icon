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

public val ThinGroup.Factory: ImageVector
    get() {
        if (_factory != null) {
            return _factory!!
        }
        _factory = Builder(name = "Factory", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(112.0f, 176.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(80.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                horizontalLineToRelative(28.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 112.0f, 176.0f)
                close()
                moveTo(176.0f, 172.0f)
                lineTo(148.0f, 172.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                horizontalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                close()
                moveTo(236.0f, 216.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                lineTo(24.0f, 220.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.0f, -8.0f)
                lineTo(36.0f, 212.0f)
                lineTo(36.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, -3.2f)
                lineTo(100.0f, 128.0f)
                lineTo(100.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 6.4f, -3.2f)
                lineToRelative(44.14f, 33.11f)
                lineTo(163.06f, 30.3f)
                arcTo(12.06f, 12.06f, 0.0f, false, true, 174.94f, 20.0f)
                horizontalLineToRelative(18.12f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, true, 11.88f, 10.3f)
                lineToRelative(15.0f, 105.13f)
                arcToRelative(3.64f, 3.64f, 0.0f, false, true, 0.0f, 0.57f)
                verticalLineToRelative(76.0f)
                horizontalLineToRelative(12.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 236.0f, 216.0f)
                close()
                moveTo(157.84f, 123.38f)
                lineTo(169.33f, 132.0f)
                horizontalLineToRelative(42.06f)
                lineTo(197.0f, 31.43f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -3.43f)
                lineTo(174.94f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 3.43f)
                close()
                moveTo(44.0f, 212.0f)
                lineTo(212.0f, 212.0f)
                lineTo(212.0f, 140.0f)
                lineTo(168.0f, 140.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.4f, -0.8f)
                lineTo(108.0f, 96.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -6.4f, 3.2f)
                lineTo(44.0f, 96.0f)
                close()
            }
        }
        .build()
        return _factory!!
    }

private var _factory: ImageVector? = null
